package service;

import dao.CitaDAO;
import modelo.Cita;

public class CitaService {

    private final CitaDAO citaDAO;

    public CitaService() {
        citaDAO = new CitaDAO();
    }

    public boolean registrar(Cita cita) {
        return citaDAO.registrar(cita);
    }
}