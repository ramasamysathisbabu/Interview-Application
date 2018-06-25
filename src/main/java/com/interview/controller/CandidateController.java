package com.interview.controller;

import com.interview.domain.Candidate;
import com.interview.service.CandidateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @RequestMapping(value="/")
    public String candidateList(Model model) {
        model.addAttribute("candidateList", candidateService.findAll());
        return "candidateList";
    }

    @RequestMapping(value={"/candidateEdit","/candidateEdit/{id}"}, method = RequestMethod.GET)
    public String candidateEditForm(Model model, @PathVariable(required = false, name = "id") Long id) {
        if (null != id) {
            model.addAttribute("candidate", candidateService.findOne(id));
        } else {
            model.addAttribute("candidate", new Candidate());
        }
        return "candidateEdit";
    }

    @RequestMapping(value="/candidateEdit", method = RequestMethod.POST)
    public String candidateEdit(Model model, Candidate candidate) {
    	candidateService.saveCandidate(candidate);
        model.addAttribute("candidateList", candidateService.findAll());
        return "candidateList";
    }

    @RequestMapping(value="/candidateDelete/{id}", method = RequestMethod.GET)
    public String candidateDelete(Model model, @PathVariable(required = true, name = "id") Long id) {
    	candidateService.deleteCandidate(id);
        model.addAttribute("candidateList", candidateService.findAll());
        return "candidateList";
    }

}
