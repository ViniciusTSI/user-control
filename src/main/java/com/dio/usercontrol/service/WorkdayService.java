package com.dio.usercontrol.service;

import com.dio.usercontrol.model.WorkingDay;
import com.dio.usercontrol.repository.WorkdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkdayService {

    WorkdayRepository workdayRepository;

    @Autowired
    public WorkdayService(WorkdayRepository workdayRepository) {
        this.workdayRepository = workdayRepository;
    }

    public WorkingDay saveWorkday(WorkingDay workingDay) {
        return workdayRepository.save(workingDay);
    }

    public List<WorkingDay> findAll() {
        return workdayRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long idWorkday) {
        return workdayRepository.findById(idWorkday);
    }

    public WorkingDay updateWorkday(WorkingDay workingDay){
        return workdayRepository.save(workingDay);
    }

    public void deleteWorkday(Long idWorkday) {
        workdayRepository.deleteById(idWorkday);
    }

}
