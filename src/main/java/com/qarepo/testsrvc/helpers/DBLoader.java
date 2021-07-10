package com.qarepo.testsrvc.helpers;

import com.qarepo.testsrvc.data.TestConfig;
import com.qarepo.testsrvc.data.TestConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBLoader implements CommandLineRunner {
    private final TestConfigRepository configRepository;

    @Autowired
    public DBLoader(TestConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        TestConfig config = new TestConfig();
        config.setSuiteName("Suite Name");
        config.setTestName("Test Name");
        config.setGroups(new String[]{"Group1", "Group2"});
        configRepository.save(config);
    }
}
