package sut.se.team08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sut.se.team08.entity.HealthLab;
import sut.se.team08.repository.HealthLabRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HealthLabController {
    @Autowired
    public HealthLabRepository healthLabRepository;

    @GetMapping("/Health-Lab")
    public List<HealthLab> getHealthLab(){
        return healthLabRepository.findAll().stream().collect(Collectors.toList());
    }
}
