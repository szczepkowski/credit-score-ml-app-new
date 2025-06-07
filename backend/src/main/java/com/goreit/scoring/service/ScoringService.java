package com.goreit.scoring.service;

import com.goreit.scoring.api.ScoringRequest;
import com.goreit.scoring.api.ScoringResultView;
import com.goreit.scoring.model.Decision;
import com.goreit.scoring.model.ScoringResultEntity;
import com.goreit.scoring.repository.ScoringRepository;
import com.goreit.scoring.service.mappers.ScoringMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ScoringService {

    private ScoringRepository scoringRepository;
    private ScoringMapper scoringMapper;

    public List<ScoringResultView> getScorings(){
       return this.scoringRepository.findAll().stream()
                .map( scoringResultEntity -> scoringMapper.toResponse(scoringResultEntity))
                .collect(Collectors.toList());
    }

    public ScoringResultView createScoring(ScoringRequest scoringRequest) {
        //@FIXME add real FAST API ML
        ScoringResultEntity scoringResultEntity = ScoringResultEntity.builder()
                .score(1.0f)
                .decision(Decision.APPROVED)
                .threshold(0.7f)
                .modelVersion("ML-0.0.1")
                .creationDate(LocalDateTime.now())
                .build();

        return scoringMapper.toResponse( this.scoringRepository.save(scoringResultEntity) );
    }
}
