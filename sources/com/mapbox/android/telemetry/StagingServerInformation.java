package com.mapbox.android.telemetry;

import android.os.Bundle;

class StagingServerInformation implements EnvironmentResolver {
    private static final String KEY_META_DATA_STAGING_ACCESS_TOKEN = "com.mapbox.TestEventsAccessToken";
    private static final String KEY_META_DATA_STAGING_SERVER = "com.mapbox.TestEventsServer";
    private EnvironmentResolver chain;

    StagingServerInformation() {
    }

    public void nextChain(EnvironmentResolver environmentResolver) {
        this.chain = environmentResolver;
    }

    public ServerInformation obtainServerInformation(Bundle bundle) {
        String string = bundle.getString(KEY_META_DATA_STAGING_SERVER);
        String string2 = bundle.getString(KEY_META_DATA_STAGING_ACCESS_TOKEN);
        if (TelemetryUtils.isEmpty(string) || TelemetryUtils.isEmpty(string2)) {
            return this.chain.obtainServerInformation(bundle);
        }
        return obtainStagingServerInformation(string, string2);
    }

    private ServerInformation obtainStagingServerInformation(String str, String str2) {
        ServerInformation serverInformation = new ServerInformation(Environment.STAGING);
        serverInformation.setHostname(str);
        serverInformation.setAccessToken(str2);
        return serverInformation;
    }
}
