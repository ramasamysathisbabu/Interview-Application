package com.interview.service;

import java.util.List;

import com.interview.domain.Candidate;


public interface CandidateService {

    List<Candidate> findAll();

    Candidate findOne(Long id);

    Candidate saveCandidate(Candidate candidate);

    void deleteCandidate(Long id);

}
