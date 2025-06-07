package com.goreit.scoring.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScoringRequest {

    private String id;

    private float loanAmount;
    private float loanTermMonths;
    private float interestRate;

    private float income;
    private float expenses;

    private Integer age;
    private Integer numberOfDependants;

    private LocalDateTime creationDate;
}
