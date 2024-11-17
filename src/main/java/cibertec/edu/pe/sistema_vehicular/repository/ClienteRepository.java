package cibertec.edu.pe.sistema_vehicular.repository;

import cibertec.edu.pe.sistema_vehicular.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    @Query("SELECT t FROM Cliente  t")
    public abstract List<Cliente> listarClientes();


    @Query("SELECT c FROM Cliente c WHERE c.identificador = :dni")
    Optional<Cliente> findByDni(@Param("dni") String dni);


    //Búsqueda por DNI
    @Query("select u from Cliente u where u.identificador like ?1")
    public abstract List<Cliente> traerClientePorDni(String identificador);


}


