package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;

import jakarta.persistence.Entity;

@Entity
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
