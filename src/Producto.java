
public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro; // Representa la Categoría / Rubro del producto

    // Constructor para el Ejercicio 1 (recibe Categoria como rubro)
    public Producto(String descripcion, String categoria, double precio) {
        this.codigo = 0;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = 0;
        this.rubro = categoria; // Guarda la categoría en el atributo rubro
    }

    // Constructor completo para el Ejercicio 2
    public Producto(int codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    // Getters y Setters
    public String getDescripcion() { return descripcion; }
    public String getRubro() { return rubro; }
    public double getPrecio() { return precio; }
    public int getCodigo() { return codigo; }
    public int getStock() { return stock; }
    
    // Setters
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }
    public void setRubro(String rubro) { this.rubro = rubro; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.codigo, o.codigo);
    }
}
