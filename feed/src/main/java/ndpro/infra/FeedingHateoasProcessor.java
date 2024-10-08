package ndpro.infra;

import ndpro.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FeedingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Feeding>> {

    @Override
    public EntityModel<Feeding> process(EntityModel<Feeding> model) {
        return model;
    }
}
