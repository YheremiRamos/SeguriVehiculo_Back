package cibertec.edu.pe.sistema_vehicular.service;

import java.util.List;
import cibertec.edu.pe.sistema_vehicular.entity.Parqueos;


public interface ParqueosService {

    // Listar todos los parqueos
    List<Parqueos> listarTodos();

    // Buscar parqueo por ID
    Parqueos buscarPorId(int idParqueo);

    // Registrar un nuevo parqueo
    Parqueos registrarParqueo(Parqueos parqueos);

    // Actualizar un parqueo existente
    Parqueos actualizarParqueo(Parqueos parqueos);

    // Eliminar un parqueo por ID
    void eliminarParqueo(int idParqueo);

    // Listar parqueos por estado
    List<Parqueos> listarPorEstado(String estado_espacios);

    // Listar parqueos por tipo
    List<Parqueos> listarPorTipo(String tipo_parqueo);

    /*
    List<Parqueos> listarParqueosPorUbicacionYEstado(int idUbicacion, String estado);*/

    /*--------------------LISTADO Y AGRUPACION DE PARQUEOS EN UBICACIONES------------------*/
 

    
}
