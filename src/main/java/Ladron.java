import java.util.ArrayList;

public class Ladron extends Vendedor {


    public Ladron(String nombreVendedor, String ubiCiudad) {
        super(nombreVendedor, ubiCiudad, 0);
    }

    @Override
    public void addItem(Item item) {
        super.addItem(item);
        double nuevaVida = item.getVidaUtil() * 0.75;
        item.setVidaUtil(nuevaVida);
    }
}
