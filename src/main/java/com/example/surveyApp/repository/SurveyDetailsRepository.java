package com.example.surveyApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.surveyApp.entity.SurveyDetails;

@Repository
public interface SurveyDetailsRepository extends JpaRepository<SurveyDetails,Long>{

}
