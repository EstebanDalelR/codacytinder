package com.mapbox.android.telemetry;

class EnvironmentChain {
    EnvironmentChain() {
    }

    EnvironmentResolver setup() {
        EnvironmentResolver comServerInformation = new ComServerInformation();
        EnvironmentResolver stagingServerInformation = new StagingServerInformation();
        stagingServerInformation.nextChain(comServerInformation);
        comServerInformation = new ChinaServerInformation();
        comServerInformation.nextChain(stagingServerInformation);
        return comServerInformation;
    }
}
