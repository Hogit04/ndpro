package ndpro.infra;

import ndpro.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StaticHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Static>> {

    @Override
    public EntityModel<Static> process(EntityModel<Static> model) {
        return model;
    }
}
