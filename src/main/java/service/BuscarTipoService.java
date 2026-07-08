package service;

import dao.BuscarTipo;
import java.util.ArrayList;
import modelo.TipoCita;

public class BuscarTipoService{
    private final BuscarTipo buscarTipo=new BuscarTipo();

    public ArrayList<TipoCita> buscar(String texto){
        return buscarTipo.buscar(texto);
    }
}
