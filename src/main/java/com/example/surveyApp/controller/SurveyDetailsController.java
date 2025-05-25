package com.example.surveyApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.surveyApp.entity.SurveyDetails;
import com.example.surveyApp.service.SurveyDetailsService;



@RestController
@RequestMapping("/api")
public class SurveyDetailsController {

    @Autowired
    private SurveyDetailsService service;

    @PostMapping("/save")
    public SurveyDetails saveSurvey(@RequestBody SurveyDetails survey) {
        return service.saveSurvey(survey);
    }

    @GetMapping("/fetchAll")
    public List<SurveyDetails> getAllSurveys() {
        return service.getAllSurveys();
    }

    @GetMapping("/fetch/{id}")
    public SurveyDetails getSurveyById(@PathVariable Long id) {
        return service.getSurveyById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        service.deleteSurvey(id);
    }
}

