package service;

import dao.NuevoTipo;
import modelo.TipoCita;

public class NuevoTipoService{
    private final NuevoTipo nuevoTipo=new NuevoTipo();

    public boolean guardar(TipoCita t){
        return nuevoTipo.guardar(t);
    }
}