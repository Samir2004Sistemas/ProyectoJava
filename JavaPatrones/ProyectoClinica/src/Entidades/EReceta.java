
package Entidades;

public class EReceta {
    private int IdAtencion;
    private int IdMedicamento;
    private int IdReceta;
    private int cantidad;
    private String instrucciones;

    public int getIdAtencion() {
        return IdAtencion;
    }

    public void setIdAtencion(int IdAtencion) {
        this.IdAtencion = IdAtencion;
    }

    public int getIdMedicamento() {
        return IdMedicamento;
    }

    public void setIdMedicamento(int IdMedicamento) {
        this.IdMedicamento = IdMedicamento;
    }

    public int getIdReceta() {
        return IdReceta;
    }

    public void setIdReceta(int IdReceta) {
        this.IdReceta = IdReceta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public EReceta() {
    }

    public EReceta(int IdAtencion, int IdMedicamento, int IdReceta, int cantidad, String instrucciones) {
        this.IdAtencion = IdAtencion;
        this.IdMedicamento = IdMedicamento;
        this.IdReceta = IdReceta;
        this.cantidad = cantidad;
        this.instrucciones = instrucciones;
    }

    @Override
    public String toString() {
        return "EReceta{" + "IdAtencion=" + IdAtencion + ", IdMedicamento=" + IdMedicamento + ", IdReceta=" + IdReceta + ", cantidad=" + cantidad + ", instrucciones=" + instrucciones + '}';
    }
       
}
