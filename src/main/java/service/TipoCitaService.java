package service;

import dao.TipoCitaDAO;
import java.util.ArrayList;
import modelo.TipoCita;

public class TipoCitaService {

    private final TipoCitaDAO dao =
            new TipoCitaDAO();

    public ArrayList<TipoCita> listar() {
        return dao.listar();
    }
}