package com.dio.usercontrol.repository;

import com.dio.usercontrol.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkdayRepository extends JpaRepository<WorkingDay, Long> {
}
