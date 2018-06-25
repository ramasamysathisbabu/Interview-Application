package com.interview.service;

import com.interview.dao.CandidateRepository;
import com.interview.domain.Candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository notesRepository;

    @Override
    public List<Candidate> findAll() {
        return notesRepository.findAll();
    }

    @Override
    public Candidate findOne(Long id) {
        return notesRepository.findOne(id);
    }

    @Override
    public Candidate saveCandidate(Candidate notes) {
        return notesRepository.save(notes);
    }

    @Override
    public void deleteCandidate(Long id) {
        notesRepository.delete(id);
    }
}
