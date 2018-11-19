package com.tinder.api;

public class BuildConfigEnvironmentProvider implements EnvironmentProvider {
    private final String base = "https://api.staging1.gotinder.com";
    private final String imageBase = "https://api.staging1.gotinder.com";

    public String getUrlBase() {
        return this.base;
    }

    public String getUrlBaseImage() {
        return this.imageBase;
    }
}
