package ndpro.domain;

import ndpro.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "statics", path = "statics")
public interface StaticRepository
    extends PagingAndSortingRepository<Static, Long> {}
