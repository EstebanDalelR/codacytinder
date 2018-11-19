package com.mapbox.android.telemetry;

class ServerInformation {
    private String accessToken;
    private Environment environment;
    private String hostname;

    ServerInformation(Environment environment) {
        this.environment = environment;
    }

    Environment getEnvironment() {
        return this.environment;
    }

    String getHostname() {
        return this.hostname;
    }

    void setHostname(String str) {
        this.hostname = str;
    }

    String getAccessToken() {
        return this.accessToken;
    }

    void setAccessToken(String str) {
        this.accessToken = str;
    }
}
