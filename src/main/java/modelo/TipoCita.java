package modelo;
public class TipoCita{
    private int idTipo;
    private String nombre;
    private String descripcion;
    private boolean estado;

    public TipoCita(){}

    public TipoCita(int idTipo,String nombre){
        this.idTipo=idTipo;
        this.nombre=nombre;
    }

    public int getIdTipo(){return idTipo;}
    public void setIdTipo(int idTipo){this.idTipo=idTipo;}

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}

    public String getDescripcion(){return descripcion;}
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}

    public boolean isEstado(){return estado;}
    public void setEstado(boolean estado){this.estado=estado;}

    @Override
    public String toString(){return nombre;}
}