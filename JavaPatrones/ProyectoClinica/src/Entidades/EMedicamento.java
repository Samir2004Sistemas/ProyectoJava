
package Entidades;

public class EMedicamento {
    private  int IdMedicamento;
    private String nombre;
    private String Descripcion;
    private String Marca;

    public int getIdMedicamento() {
        return IdMedicamento;
    }

    public void setIdMedicamento(int IdMedicamento) {
        this.IdMedicamento = IdMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public EMedicamento() {
    }

    public EMedicamento(int IdMedicamento, String nombre, String Descripcion, String Marca) {
        this.IdMedicamento = IdMedicamento;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "EMedicamento{" + "IdMedicamento=" + IdMedicamento + ", nombre=" + nombre + ", Descripcion=" + Descripcion + ", Marca=" + Marca + '}';
    }
    
}
