package com.example.surveyApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.surveyApp.entity.SurveyDetails;
import com.example.surveyApp.repository.SurveyDetailsRepository;

@Service
public class SurveyDetailsService {
	

	    @Autowired
	    private SurveyDetailsRepository repository;

	    public SurveyDetails saveSurvey(SurveyDetails survey) {
	        return repository.save(survey);
	    }

	    public List<SurveyDetails> getAllSurveys() {
	        return repository.findAll();
	    }

	    public SurveyDetails getSurveyById(Long id) {
	        return repository.findById(id).orElse(null);
	    }

	    public void deleteSurvey(Long id) {
	        repository.deleteById(id);
	    }
	}



