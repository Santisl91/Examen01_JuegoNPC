import java.util.ArrayList;

public class Campesino extends Vendedor {

    public Campesino(String nombreVendedor, String ubiCiudad) {
        super(nombreVendedor, ubiCiudad, 0.2);
    }

    @Override
    public void addItem(Item item) {
        super.addItem(item);
        double nuevaVida = item.getVidaUtil() * 0.85;
        item.setVidaUtil(nuevaVida);
    }
}
