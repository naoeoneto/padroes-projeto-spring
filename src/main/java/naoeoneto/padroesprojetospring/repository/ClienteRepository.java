package naoeoneto.padroesprojetospring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import naoeoneto.padroesprojetospring.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {}
