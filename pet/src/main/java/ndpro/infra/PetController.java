package ndpro.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import ndpro.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/pets")
@Transactional
public class PetController {

    @Autowired
    PetRepository petRepository;

    @RequestMapping(
        value = "/pets/registerpet",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Pet registerPet(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody RegisterPetCommand registerPetCommand
    ) throws Exception {
        System.out.println("##### /pet/registerPet  called #####");
        Pet pet = new Pet();
        pet.registerPet(registerPetCommand);
        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "/pets/modifypet",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Pet modifyPet(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody ModifyPetCommand modifyPetCommand
    ) throws Exception {
        System.out.println("##### /pet/modifyPet  called #####");
        Pet pet = new Pet();
        pet.modifyPet(modifyPetCommand);
        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "/pets/deletepet",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Pet deletePet(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody DeletePetCommand deletePetCommand
    ) throws Exception {
        System.out.println("##### /pet/deletePet  called #####");
        Pet pet = new Pet();
        pet.deletePet(deletePetCommand);
        petRepository.save(pet);
        return pet;
    }
}
//>>> Clean Arch / Inbound Adaptor
