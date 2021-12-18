package usa.sesion15.reto5_grupo31.Modelo;

public class Entidad {

    int imagen;
    String titulo;
    String descripcion;

    public Entidad(int imagen, String titulo, String descripcion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
