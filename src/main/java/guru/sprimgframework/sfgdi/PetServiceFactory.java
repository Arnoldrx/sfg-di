package guru.sprimgframework.sfgdi;

import com.springframwork.pets.CatPetService;
import com.springframwork.pets.DogPetService;
import com.springframwork.pets.PetService;


public class PetServiceFactory {

    public PetService getPetService(String petType){
        switch(petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
