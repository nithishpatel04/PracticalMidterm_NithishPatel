package com.npv.week6;



import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import com.npv.week6.Service.CheckingService;
import com.npv.week6.Service.SavingsService;
import com.npv.week6.model.Checking;
import com.npv.week6.model.Savings;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {
	
    private final CheckingService checkingService;
    private final SavingsService savingsService;
    
    public AccountController(CheckingService checkingService, SavingsService savingsService) {
        this.checkingService = checkingService;
        this.savingsService  = savingsService;
    }

    @PostMapping("/checking")
    public Mono<Checking> createChecking(@RequestBody Checking checking) {
        return checkingService.create(checking);
    }

    @GetMapping("/checking")
    public Flux<Checking> getAllChecking() {
        return checkingService.getAll();
    }

    @PostMapping("/savings")
    public Mono<Savings> createSavings(@RequestBody Savings savings) {
        return savingsService.create(savings);
    }

    @GetMapping("/savings")
    public Flux<Savings> getAllSavings() {
        return savingsService.getAll();
    }
}

