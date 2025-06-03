package TZ.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ElephantService {
    
@Autowired

  private  ElephantRepository elephantRepository;
    
public  Object getAllElephants() {
    return elephantRepository.findAll();
  }

public Elephant getElephantById(@PathVariable long animalID) {
    return elephantRepository.findById(animalID).orElse(null);
  }


public Object getElephantsByName(String name) {
    return elephantRepository.getElephantsByName(name);
  }

public Object getElephantsByHabitat(String habitat) {
    return elephantRepository.getElephantsByHabitat(habitat);
  }

public Elephant addElephant(Elephant elephant) {
    return elephantRepository.save(elephant);
  }

public Elephant updateElephant(Long animalID, Elephant elephant) {
    return elephantRepository.save(elephant);
  }

public void deleteElephant(Long animalID) {
    elephantRepository.deleteById(animalID);
  }


}
