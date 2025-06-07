package com.goreit.scoring.service.mappers;

import com.goreit.scoring.api.ScoringResultView;
import com.goreit.scoring.model.ScoringResultEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface  ScoringMapper {
     ScoringResultView toResponse(ScoringResultEntity result);
}
