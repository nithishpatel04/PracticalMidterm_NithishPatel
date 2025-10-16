package com.npv.week6.Service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.npv.week6.Repository.SavingsRepository;
import com.npv.week6.model.Savings;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service @RequiredArgsConstructor
public class SavingsService {
	private final SavingsRepository repo;

    public SavingsService(SavingsRepository repo) {
        this.repo = repo;
    }
public Mono<Savings> create(Savings s){ return repo.save(s); }
public Flux<Savings> getAll(){ return repo.findAll(); }
}

