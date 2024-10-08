package ndpro.domain;

import ndpro.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "feedings", path = "feedings")
public interface FeedingRepository
    extends PagingAndSortingRepository<Feeding, Long> {}
