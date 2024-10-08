package ndpro.infra;

import ndpro.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PetHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Pet>> {

    @Override
    public EntityModel<Pet> process(EntityModel<Pet> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "//registerpet")
                .withRel("/registerpet")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "//modifypet")
                .withRel("/modifypet")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "//deletepet")
                .withRel("/deletepet")
        );

        return model;
    }
}
