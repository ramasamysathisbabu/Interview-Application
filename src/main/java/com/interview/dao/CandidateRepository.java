package com.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interview.domain.Candidate;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
