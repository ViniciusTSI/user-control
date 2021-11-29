package com.dio.usercontrol.controller;

import com.dio.usercontrol.model.WorkingDay;
import com.dio.usercontrol.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workingDay")
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.saveWorkDay(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getJornadaList(){
        return workingDayService.findAll();
    }

    @GetMapping("/{idWorkingDay}")
    public ResponseEntity<WorkingDay>  getJornadaByID(@PathVariable("idWorkingDay") Long idWorkingDay) throws Exception {
        return  ResponseEntity.ok(workingDayService.getById(idWorkingDay).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

}
