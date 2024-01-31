package meucci.tpsit.jpah2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import meucci.tpsit.jpah2.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
