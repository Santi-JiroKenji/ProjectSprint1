package sut.se.team08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sut.se.team08.entity.Staff;
import sut.se.team08.repository.StaffRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StaffController {
    @Autowired
    public StaffRepository staffRepository;

    @PostMapping("/Staff")
    public Staff newStaff(@RequestBody Staff staff){
        System.out.println("this result = " + staff);
        return  staffRepository.save(staff);
    }

    @GetMapping("/Staff")
    public List<Staff> getStaff(){
        return staffRepository.findAll().stream().collect(Collectors.toList());
    }
}
