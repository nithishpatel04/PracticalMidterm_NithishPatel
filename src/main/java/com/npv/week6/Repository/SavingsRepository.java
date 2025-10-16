package com.npv.week6.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.npv.week6.model.Savings;

@Repository
public interface SavingsRepository extends ReactiveMongoRepository<Savings, String> { }
