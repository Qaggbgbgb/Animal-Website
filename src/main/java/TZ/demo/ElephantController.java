package TZ.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class ElephantController {
@Autowired
 private ElephantService elephantService;   

@GetMapping("/elephants")
  public Object getAllElephants(Model model) {
    model.addAttribute("elephantList",elephantService.getAllElephants());
    model.addAttribute("title", "All Elephants");
    return "elephants-list";
  }

@GetMapping("/elephants/{id}")
  public Object getElephantById(@PathVariable long animalID,Model model) {
    model.addAttribute("elephant", elephantService.getElephantById(animalID));
    model.addAttribute("title", "elephant#:" + animalID);

    return "elephant-details";
  }

@GetMapping("/elephants/name")
  public Object getElephantsByName(@RequestParam String key,Model model) {
    if(key!=null){
      model.addAttribute("elephantList",elephantService.getElephantsByName(key));
      model.addAttribute("title", "Elephants by Name" + key);
      return "elephants-list";
    }
    else {
    return "redirect:/elephants/";
  }

  }

@GetMapping("/elephants/habitat/{habitat}")
  public Object getElephantsByhabitat(@PathVariable String habitat, Model model) {
    model.addAttribute("elephantsList", elephantService.getElephantsByHabitat(habitat));
    model.addAttribute("title", "Elephants by Habitat" + habitat );
    return "elephants-list";
  }

@PostMapping("/elephants")
  public Object addElephant( Elephant elephant) {
    //return elephantService.addElephant(elephant);
    Elephant newElephant= elephantService.addElephant(elephant);
    return "redirect:/elephants/" + newElephant.getAnimalID();
  }

//@PutMapping("/elephants/{id}")
@PostMapping("/elephants/update/{id}")
  public Object updateElephant(@PathVariable Long animalId, Elephant elephant) {
    elephantService.updateElephant(animalId, elephant);
    return "redirect:/elephants/" +animalId;
  }

@DeleteMapping("/elephants/{id}")
  public Object deleteElephant(@PathVariable Long animalID) {
    elephantService.deleteElephant(animalID);
    return elephantService.getAllElephants();
  }   
@GetMapping("/elephants/createForm")
  public Object showCreateForm(Model model) {
    Elephant elephant = new Elephant();
    model.addAttribute("elephant", elephant);
    model.addAttribute("title", "Create New Elephant");
    return "elephants-create";
  }

@GetMapping("/elephants/updateForm/{id}")
  public Object showUpdateForm(@PathVariable Long animalId, Model model) {
    Elephant elephant = elephantService.getElephantById(animalId);
    model.addAttribute("elephant", elephant);
    model.addAttribute("title", "Update Elephant: " + animalId);
    return "elephants-update";
  }




}
