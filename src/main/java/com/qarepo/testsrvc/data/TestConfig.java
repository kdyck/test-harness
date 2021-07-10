package com.qarepo.testsrvc.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class TestConfig {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long suiteId;
    private String suiteName;
    private String testName;
    private String[] classes;
    private String[] packages;
    private String[] groups;

    public long getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(long suiteId) {
        this.suiteId = suiteId;
    }

    public String getSuiteName() {
        return suiteName;
    }

    public void setSuiteName(String suiteName) {
        this.suiteName = suiteName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public String[] getPackages() {
        return packages;
    }

    public void setPackages(String[] packages) {
        this.packages = packages;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "TestConfig{" +
                "suiteName='" + suiteName + '\'' +
                ", testName='" + testName + '\'' +
                ", classes=" + Arrays.toString(classes) +
                ", packages=" + Arrays.toString(packages) +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
