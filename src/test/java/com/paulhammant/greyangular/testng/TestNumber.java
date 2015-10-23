package com.paulhammant.greyangular.testng;

public class TestNumber {

    private int testNum = 0;

    public int nextTestNum() {
        return testNum++;
    }

    /**
     * devd.io is always up. All subdomains always point to 127.0.0.1
     * It's a DNS trick registration, super useful for testing.
     * @return
     */
    public String makeTestSiteUrl() {
        return "http://t" + this.nextTestNum() + ".devd.io:8080";
    }

}
