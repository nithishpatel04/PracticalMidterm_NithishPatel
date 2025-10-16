package com.npv.week6.Service;



import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.npv.week6.Repository.CheckingRepository;
import com.npv.week6.model.Checking;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service @RequiredArgsConstructor
public class CheckingService {
	private final CheckingRepository repo;
	
	public CheckingService(CheckingRepository repo) {
        this.repo = repo;
    }
public Mono<Checking> create(Checking c){ return repo.save(c); }
public Flux<Checking> getAll(){ return repo.findAll(); }
}

