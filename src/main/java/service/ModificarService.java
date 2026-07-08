package service;

import dao.ModificarDAO;
import modelo.ModificarCita;

public class ModificarService {

    private final ModificarDAO dao;

    public ModificarService() {

        dao = new ModificarDAO();
    }

    public boolean modificar(ModificarCita cita) {

        return dao.modificar(cita);
    }

}