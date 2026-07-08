package service;

import dao.ApagarTipo;

public class ApagarTipoService{
    private final ApagarTipo apagarTipo=new ApagarTipo();

    public boolean apagar(int id){
        return apagarTipo.apagar(id);
    }
}