package com.goreit.scoring.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "scorings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScoringResultEntity {

    @Id
    private String id;
    private String userId;

    private float score;
    private float threshold;

    private Decision decision;
    private String modelVersion;
    private LocalDateTime creationDate;
}