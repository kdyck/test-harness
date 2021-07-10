package com.qarepo.testsrvc.api;

import com.qarepo.testsrvc.data.TestConfig;
import com.qarepo.testsrvc.service.TestConfigService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test-configs")
public class TestConfigController {

    private final TestConfigService service;

    public TestConfigController(TestConfigService service) {
        this.service = service;
    }

    @GetMapping
    public List<TestConfig> getTestConfigs() {
        return service.getTestConfigs();
    }

    @PostMapping
    public void postTestConfigs(@RequestBody TestConfig config) {
        service.add(config);
    }

    @GetMapping("/{id}")
    public TestConfig getById(@PathVariable(required = true) long id) {
        return service.getTestConfigById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}
