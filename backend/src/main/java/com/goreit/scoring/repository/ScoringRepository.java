package com.goreit.scoring.repository;

import com.goreit.scoring.model.ScoringResultEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoringRepository extends CrudRepository<ScoringResultEntity, String> {

    List<ScoringResultEntity> findAll();

    List<ScoringResultEntity> findByModelVersion(String modelVersion);

    Page<ScoringResultEntity> findAll(Pageable pageable);

}
