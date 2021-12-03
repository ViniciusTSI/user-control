package com.dio.usercontrol.controller;

import com.dio.usercontrol.model.WorkingDay;
import com.dio.usercontrol.service.WorkdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/workday")
public class WorkdayController {

    @Autowired
    WorkdayService workdayService;

    @PostMapping
    public WorkingDay createWorkday(@RequestBody WorkingDay workingDay) {
        return workdayService.saveWorkday(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getWorkdayList(){
        return workdayService.findAll();
    }

    @GetMapping("/{idWorkday}")
    public ResponseEntity<WorkingDay>  getWorkdayByID(@PathVariable("idWorkday") Long idWorkday) throws Exception {
        return  ResponseEntity.ok(workdayService.getById(idWorkday).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public WorkingDay updateWorkday(@RequestBody WorkingDay workingDay){
        return workdayService.updateWorkday(workingDay);
    }

    @DeleteMapping("/{idWorkday}")
    public ResponseEntity deleteByID(@PathVariable("idWorkday") Long idWorkday) throws Exception {
        try {
            workdayService.deleteWorkday(idWorkday);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();
    }

}
