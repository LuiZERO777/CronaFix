package service;

import dao.ConsultaDAO;
import java.util.ArrayList;
import modelo.Cita;
import repository.ConsultaRepository;

public class ConsultaService {

    private final ConsultaRepository dao;

    public ConsultaService() {
        dao = new ConsultaDAO();
    }

    public ArrayList<Cita> listarTodas() {
        return dao.listarTodas();
    }

    public ArrayList<Cita> buscar(
            String codigo) {

        return dao.buscarPorCodigo(
                codigo);
    }
}