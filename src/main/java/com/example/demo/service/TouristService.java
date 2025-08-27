package com.example.demo.service;

import com.example.demo.model.TouristAttraction;
import com.example.demo.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }
    public void populateTouristAttraction() {
        touristRepository.populateTouristAttraction();
    }

    public List<TouristAttraction> getTouristAttractions() {
        return touristRepository.getTouristAttractions();
    }

    public void addTouristAttraction(TouristAttraction touristAttraction) {
        touristRepository.addTouristAttraction(touristAttraction);
    }
    public void removeTouristAttraction(String name) {
        touristRepository.removeTouristAttraction(name);
    }
}
