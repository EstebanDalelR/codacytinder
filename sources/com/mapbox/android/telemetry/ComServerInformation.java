package com.mapbox.android.telemetry;

import android.os.Bundle;

class ComServerInformation implements EnvironmentResolver {
    public void nextChain(EnvironmentResolver environmentResolver) {
    }

    ComServerInformation() {
    }

    public ServerInformation obtainServerInformation(Bundle bundle) {
        return new ServerInformation(Environment.COM);
    }
}
