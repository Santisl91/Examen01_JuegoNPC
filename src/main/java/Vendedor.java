import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nombreVendedor;
    private String ubiCiudad;
    private ArrayList<Item> inventario;
    private double impuesto;

    public Vendedor(String nombreVendedor, String ubiCiudad, double impuesto) {
        this.nombreVendedor = nombreVendedor;
        this.ubiCiudad = ubiCiudad;
        this.inventario = new ArrayList<>();
        this.impuesto = impuesto;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getUbiCiudad() {
        return ubiCiudad;
    }

    public void setUbiCiudad(String ubiCiudad) {
        this.ubiCiudad = ubiCiudad;
    }

    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Item> inventario) {
        this.inventario = inventario;
    }

    public void addItem(Item item) {
        if (inventario.size() < getMaxInventorySize()) {
            inventario.add(item);
        } else {
            throw new RuntimeException("Inventario lleno!- El vendedor no puede agregar el ítem.");
        }
    }

    public ArrayList<Item> mostrarItems() {
        return inventario;
    }

    public double calcularPrecio(Item item) {
        double nuevoPrecio = item.getPrecio() * (1 + impuesto);
        return nuevoPrecio;
    }

    private int getMaxInventorySize() {
        if (this instanceof Campesino) {
            return 5;
        } else if (this instanceof Ladron) {
            return 3;
        } else if (this instanceof Mercader) {
            return 7;
        } else {
            return 0; // Default size
        }
    }

    public static Vendedor buscarVendedorPorNombre(List<Vendedor> vendedores, String nombre) {
        return vendedores.stream()
                .filter(vendedor -> vendedor.getNombreVendedor().equals(nombre))
                .findFirst()
                .orElse(null);

    }
}


