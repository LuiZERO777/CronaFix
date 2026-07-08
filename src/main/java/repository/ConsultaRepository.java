package repository;

import java.util.ArrayList;
import modelo.Cita;

public interface ConsultaRepository {

    ArrayList<Cita> listarTodas();

    ArrayList<Cita> buscarPorCodigo(String codigo);

}