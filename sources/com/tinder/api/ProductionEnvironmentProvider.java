package com.tinder.api;

public class ProductionEnvironmentProvider implements EnvironmentProvider {
    private static final String URL_BASE = "https://api.gotinder.com";
    private static final String URL_BASE_IMAGE = "https://imageupload.gotinder.com";

    public String getUrlBase() {
        return URL_BASE;
    }

    public String getUrlBaseImage() {
        return URL_BASE_IMAGE;
    }
}
