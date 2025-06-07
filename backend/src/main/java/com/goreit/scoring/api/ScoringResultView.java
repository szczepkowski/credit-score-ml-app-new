package com.goreit.scoring.api;

import com.goreit.scoring.model.Decision;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScoringResultView {
    private String id;
    private String userId;

    private float score;
    private float threshold;

    private Decision decision;
    private String modelVersion;
    private LocalDateTime creationDate;
}
