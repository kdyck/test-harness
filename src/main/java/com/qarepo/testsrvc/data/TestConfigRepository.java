package com.qarepo.testsrvc.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "configs", path = "configs")
public interface TestConfigRepository extends PagingAndSortingRepository<TestConfig, Long> {

    List<TestConfig> findBySuiteName(@Param("suiteName") String suiteName);
}
