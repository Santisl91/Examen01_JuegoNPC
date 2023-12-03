import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Item implements List<Item> {

    private String nombre;
    private String tipo;
    private double precio;
    private double vidaUtil = 100;


    public Item(String nombre, String tipo, double precio, double vidaUtil) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.vidaUtil = vidaUtil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(double vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Item item) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Item> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Item> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Item get(int index) {
        return null;
    }

    @Override
    public Item set(int index, Item element) {
        return null;
    }

    @Override
    public void add(int index, Item element) {

    }

    @Override
    public Item remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Item> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Item> listIterator(int index) {
        return null;
    }

    @Override
    public List<Item> subList(int fromIndex, int toIndex) {
        return null;
    }
}
