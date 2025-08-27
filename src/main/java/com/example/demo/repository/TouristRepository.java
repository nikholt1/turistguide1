package com.example.demo.repository;

import com.example.demo.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    List<TouristAttraction> attractions = new ArrayList<>();

    public void populateTouristAttraction() {
        attractions.add(new TouristAttraction("Tivoli", "Verdens ældste tivoli"));
        attractions.add(new TouristAttraction("Tivoli2", "Verdens ældste tivoli2"));
        attractions.add(new TouristAttraction("Tivoli3", "Verdens ældste tivoli3"));


    }

    public List<TouristAttraction> getTouristAttractions() {
        return attractions;
    }

    public void addTouristAttraction(TouristAttraction touristAttraction) {
        attractions.add(touristAttraction);
    }

    public void removeTouristAttraction(String name) {
        for (TouristAttraction t : attractions) {
            if (name.equals(t.getName())) {
                attractions.remove(t);
            }
        }
    }


}



