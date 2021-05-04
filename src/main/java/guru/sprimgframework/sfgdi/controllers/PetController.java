package guru.sprimgframework.sfgdi.controllers;

import com.springframwork.pets.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichisTheBest() {
        return petService.getPetType();
    }
}
