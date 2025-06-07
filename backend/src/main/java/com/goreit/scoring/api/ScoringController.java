package com.goreit.scoring.api;

import com.goreit.scoring.service.ScoringService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score")
@AllArgsConstructor
public class ScoringController {

    private ScoringService scoringService;

    @GetMapping
    public List<ScoringResultView> getScorings(){
        return this.scoringService.getScorings();
    }

    @PostMapping
    public ScoringResultView createScoring(@RequestBody ScoringRequest scoringRequest){
        return this.scoringService.createScoring(scoringRequest);
    }
}
