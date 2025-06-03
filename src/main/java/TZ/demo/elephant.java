package TZ.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "elephants")

public class Elephant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long animalID;
    private String name;
    private String description;
    private String habitat;
    private String species;

public long getAnimalID(){
    return this.animalID;
}
public String getName(){
    return this.name;
}

public String getDescription(){
    return this.description;

}

public String getHabitat(){
    return this.habitat;
}

public String getSpecies(){
    return this.species;
}

public Elephant(){

}
public Elephant(long animalID, String name,String description, String habitat, String species){
    this.animalID=animalID;
    this.name=name;
    this.description=description;
    this.habitat=habitat;
    this.species=species;
}
public Elephant(String name,String description, String habitat, String species){
    this.name=name;
    this.description=description;
    this.habitat=habitat;
    this.species=species;
}

}
