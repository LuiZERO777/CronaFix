package service;

import dao.VerTipos;
import java.util.ArrayList;
import modelo.TipoCita;

public class VerTiposService{
    private final VerTipos verTipos=new VerTipos();

    public ArrayList<TipoCita> mostrar(){
        return verTipos.mostrar();
    }
}