import java.util.ArrayList;

public class Mercader extends Vendedor {

    public Mercader(String nombreVendedor, String ubiCiudad) {
        super(nombreVendedor, ubiCiudad, 0.4);
    }

    @Override
    public void addItem(Item item) {
        super.addItem(item);
    }
}
