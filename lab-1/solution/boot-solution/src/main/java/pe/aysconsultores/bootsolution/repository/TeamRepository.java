package pe.aysconsultores.bootsolution.repository;


import pe.aysconsultores.bootsolution.domain.Team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long> {

}
