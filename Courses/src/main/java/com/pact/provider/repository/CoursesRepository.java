package com.pact.provider.repository;

import com.pact.provider.controller.AllCourseData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<AllCourseData, String> {

}
