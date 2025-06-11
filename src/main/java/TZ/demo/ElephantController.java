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
