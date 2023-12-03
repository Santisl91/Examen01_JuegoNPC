import java.util.ArrayList;

public class Comprador{
    private String nombreComprador;
    private ArrayList<Item> compras;
    private String ubicacion;

    public Comprador(String nombreComprador, String ubicacion) {
        this.nombreComprador = nombreComprador;
        this.compras = new ArrayList<>();
        this.ubicacion = ubicacion;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public ArrayList<Item> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Item> compras) {
        this.compras = compras;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void purchaseItem(Vendedor vendedor, Item item) {
        double precio = vendedor.calcularPrecio(item);
        compras.add(item);
        vendedor.getInventario().remove(item);
        System.out.println(vendedor.getNombreVendedor() + " ha vendido " + item.getNombre() + " por $" + precio);
    }

    public ArrayList<Item> getPurchasedItems() {
        return compras;
    }

}
