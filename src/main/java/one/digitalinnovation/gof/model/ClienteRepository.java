package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
}
