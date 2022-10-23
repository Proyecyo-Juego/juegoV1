package personajes;

public abstract class equipamiento {
    int valor;
    String nombre;
    String descripcion;

    public equipamiento(int valor, String nombre, String descripcion) {
        this.valor = valor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
