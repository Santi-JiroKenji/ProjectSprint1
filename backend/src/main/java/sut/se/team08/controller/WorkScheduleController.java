package sut.se.team08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sut.se.team08.entity.Staff;
import sut.se.team08.entity.WorkSchedule;
import sut.se.team08.entity.HealthLab;
import sut.se.team08.entity.StaffPosition;
import sut.se.team08.repository.StaffRepository;
import sut.se.team08.repository.WorkScheduleRepository;
import sut.se.team08.repository.HealthLabRepository;
import sut.se.team08.repository.StaffPositionRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class WorkScheduleController {
    @Autowired
    public StaffPositionRepository staffPositionRepository;
    @Autowired
    public HealthLabRepository healthLabRepository;
    @Autowired
    public WorkScheduleRepository workScheduleRepository;
    @Autowired
    public StaffRepository staffRepository;

    @GetMapping("/WorkSchedule")
    public List<WorkSchedule> getWorkSchedules(){
        return workScheduleRepository.findAll().stream().collect(Collectors.toList());
    }

    @PostMapping("/Register")
    public WorkSchedule newReg(@RequestBody WorkSchedule workSchedule){
        workSchedule.setDate(new Date());
        System.out.println("in newReg = " + workSchedule);
        return workScheduleRepository.save(workSchedule);
    }
}