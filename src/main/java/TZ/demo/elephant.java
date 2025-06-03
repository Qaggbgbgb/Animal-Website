package TZ.demo;

import jakarta.persistence.Entity;

@Entity
public class elephant {
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



}
