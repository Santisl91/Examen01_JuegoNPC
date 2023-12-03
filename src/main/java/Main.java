import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vendedor> vendedores = new ArrayList<>();
        List<Comprador> compradores = new ArrayList<>();

        // Ejemplo de uso
        Campesino campesino1 = new Campesino("Campesino Juan", "Ciudad A");
        campesino1.addItem(new Item("Herraduras", "Equipo", 20.0, 100));
        campesino1.addItem(new Item("Trigo", "Comida", 5.0, 90));

        Ladron ladron1 = new Ladron("Ladrón Pablo", "Ciudad B");
        ladron1.addItem(new Item("Daga", "Arma", 50.0, 90));

        Mercader mercader1 = new Mercader("Mercader Carlos", "Ciudad A");
        mercader1.addItem(new Item("Pergamino", "Misceláneo", 10.0, 100));
        mercader1.addItem(new Item("Tela fina", "Material", 15.0, 60));

        vendedores.add(mercader1);
        vendedores.add(ladron1);
        vendedores.add(campesino1);

        Comprador comprador1 = new Comprador("Comprador Ana", "Ciudad A");
        compradores.add(comprador1);
        comprador1.purchaseItem(mercader1, mercader1.getInventario().get(0));

        // Mostrar ítems comprados por un Comprador
        List<Item> checkCompras = comprador1.getCompras();
        System.out.println("Ítems comprados por " + comprador1.getNombreComprador()+ ":");
        checkCompras.forEach(item -> System.out.println(item.getNombre()));

        // Consultar ítems de un Vendedor
        Vendedor vendedorToCheck = mercader1;
        System.out.println("Ítems en inventario de " + vendedorToCheck.getNombreVendedor() + ":");
        vendedorToCheck.getInventario().forEach(item -> System.out.println(item.getNombre()));

        // Mostrar ítems más baratos de todos los vendedores en una ciudad
        String cityToCheck = "Ciudad A";
        List<Item> cheapestItems = vendedores.stream()
                .filter(v -> v.getUbiCiudad().equals(cityToCheck))
                .flatMap(v -> v.getInventario().stream())
                .min(Comparator.comparing(item -> item.getPrecio() * (1)))
                .orElse(null);

        System.out.println("Ítem más barato en " + cityToCheck + ": " + cheapestItems);
    }
}



  /*  Scanner entrada = new Scanner(System.in);
        List<Vendedor> vendedores = new ArrayList<>();
        List<Comprador> compradores = new ArrayList<>();

        int option;

        do {
            System.out.println("------ OPTIONS MENU ------ " +
                    "\nChoose one option: "
                    + "\n1. Crear Vendedor."
                    + "\n2. Crear Comprador."
                    + "\n3. Añadir item a vendedor."
                    + "\n4. Mostrar item barato."
                    + "\n5. Mostrar items vendedor."
                    + "\n6. Comprar item."
                    + "\n7. Mostrar Item comprador."
                    + "\n4. Mostrar vendedores."
                    + "\n4. Mostar compradores."
                    + "\n4. Consultar Items."
                    + "\n0. Exit. ");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    String nomVen;
                    String tipo;
                    String ciudadVen;

                    System.out.println("NUEVO VENDEDOR.");
                    System.out.println("Ingrese tipo de vendedor:");
                    tipo = entrada.nextLine();

                    int optionTipo;
                    do {
                        System.out.println("------ OPTIONS MENU ------ " +
                                "\nChoose one option: "
                                + "\n1. Campesino."
                                + "\n2. Ladron."
                                + "\n3. Mercader.");

                        optionTipo = entrada.nextInt();

                        switch (optionTipo) {
                            case 1:
                                System.out.println("Ingrese nombre:");
                                nomVen = entrada.nextLine();
                                System.out.println("Ingrese ciudad del vendedor:");
                                ciudadVen = entrada.nextLine();
                                Vendedor vendedor1 = new Vendedor(nomVen, ciudadVen, optionTipo, 0);
                                vendedores.add(vendedor1);
                                break;
                        }
                        while (optionTipo != 0) ;
                    }

                case 2:
                    String nomCom;
                    String ciudadCom;

                    System.out.println("NUEVO COMPRADOR.");
                    System.out.println("Ingrese nombre:");
                    nomCom = entrada.nextLine();
                    System.out.println("Ingrese ciudad del comprador:");
                    ciudadCom = entrada.nextLine();
                    Comprador comprador1 = new Comprador(nomCom, ciudadCom);
                    compradores.add(comprador1);
                    break;
                case 3:
                    String vendElegido;
                    System.out.println("Elegir vendedor:");
                    vendElegido = entrada.nextLine();
                    Vendedor vendedorEncontrado = Vendedor.buscarVendedorPorNombre(vendedores, vendElegido);
                    if (vendedorEncontrado != null) {

                        Item itemNuevo1 = new Item("Espada", "Arma", 100.0, 0.1);
                        Item itemNuevo2 = new Item("Poción de curación", "Poción", 20.0, 0.0);

                        vendedorEncontrado.addItem(itemNuevo1);
                        vendedorEncontrado.addItem(itemNuevo2);

                        System.out.println("Inventario actualizado del vendedor " + vendedorEncontrado.getNombreVendedor() + ":");
                        for (Item item : vendedorEncontrado.getInventario()) {
                            System.out.println(item.getNombre());
                        }
                    } else {
                        System.out.println("Vendedor no encontrado.");
                    }

                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (option != 0);*/