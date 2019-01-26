package sut.se.team08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sut.se.team08.entity.StaffPosition;
import sut.se.team08.repository.StaffPositionRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StaffPositionController {
    @Autowired
    public StaffPositionRepository staffPositionRepository;

    @GetMapping("/StaffPosition")
    public List<StaffPosition> getStaffPosition(){
        return staffPositionRepository.findAll().stream().collect(Collectors.toList());
    }
}
