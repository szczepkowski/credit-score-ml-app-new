package com.goreit.scoring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScoringRequestEntity {

    @Id
    private String id;
    private String userId;

    private float loanAmount;
    private float loanTermMonths;
    private float interestRate;

    private float income;
    private float expenses;

    private Integer age;
    private Integer numberOfDependants;

    private LocalDateTime creationDate;
}
//            "age": 35,
//            "employment_status": "full_time",
//            "income": 7500,
//            "monthly_expenses": 3000,
//            "loan_amount": 15000,
//            "loan_term_months": 36,
//            "loan_purpose": "car",
//            "existing_loans": 1,
//            "existing_credit_cards": 2,
//            "credit_history_length": 48,
//            "previous_defaults": 0,
//            "delinquencies_last_12_months": 0,
//            "credit_utilization": 0.35,
//            "education_level": "bachelor",
//            "marital_status": "married",
//            "number_of_dependents": 2
//    }

