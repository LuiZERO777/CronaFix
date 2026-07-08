package service;

import dao.CambiarTipo;
import modelo.TipoCita;

public class CambiarTipoService{
    private final CambiarTipo cambiarTipo=new CambiarTipo();

    public boolean cambiar(TipoCita t){
        return cambiarTipo.cambiar(t);
    }
}