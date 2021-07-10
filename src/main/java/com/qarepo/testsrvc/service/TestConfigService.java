package com.qarepo.testsrvc.service;

import com.qarepo.testsrvc.data.TestConfig;
import com.qarepo.testsrvc.data.TestConfigRepository;
import com.qarepo.testsrvc.exceptions.TestConfigNotFoundException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TestConfigService {
    private final TestConfigRepository configRepository;

    @Autowired
    public TestConfigService(TestConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public void add(TestConfig config) {
        configRepository.save(config);
    }

    public void delete(long id) {
        configRepository.deleteById(id);
    }

    public List<TestConfig> getTestConfigs() {
        return (List<TestConfig>) configRepository.findAll();
    }

    @SneakyThrows
    public TestConfig getTestConfigById(long id) {
        Optional<TestConfig> optionalConf = configRepository.findById(id);
        return optionalConf.orElseThrow(()-> new TestConfigNotFoundException("Couldn't find Test Config with id: " + id));
    }

    private TestConfig toEntity(TestConfig testConfig) {
        TestConfig entity = new TestConfig();
        entity.setSuiteName(testConfig.getSuiteName());
        entity.setTestName(testConfig.getTestName());
        // TODO: Add rest of fields
        return entity;
    }
}
