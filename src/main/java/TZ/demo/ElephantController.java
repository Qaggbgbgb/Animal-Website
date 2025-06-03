package TZ.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElephantController {
@Autowired
 private ElephantService elephantService;   

@GetMapping("/elephants")
  public Object getAllElephants() {
    return elephantService.getAllElephants();
  }

@GetMapping("/elephants/{id}")
  public Elephant getElephantById(@PathVariable long animalID) {
    return elephantService.getElephantById(animalID);
  }

@GetMapping("/elephants/name")
  public Object getElephantsByName(@RequestParam String key) {
    return elephantService.getElephantsByName(key);
  }

@GetMapping("/elephants/habitat/{habitat}")
  public Object getElephantsByhabitat(@PathVariable String habitat) {
    return elephantService.getElephantsByHabitat(habitat);
  }

@PostMapping("/elephants")
  public Object addElephant(@RequestBody Elephant elephant) {
    return elephantService.addElephant(elephant);
  }

@PutMapping("/elephants/{id}")
  public Elephant updateElephant(@PathVariable Long animalID, @RequestBody Elephant elephant) {
    elephantService.updateElephant(animalID, elephant);
    return elephantService.getElephantById(animalID);
  }

@DeleteMapping("/elephants/{id}")
  public Object deleteElephant(@PathVariable Long animalID) {
    elephantService.deleteElephant(animalID);
    return elephantService.getAllElephants();
  }




}
