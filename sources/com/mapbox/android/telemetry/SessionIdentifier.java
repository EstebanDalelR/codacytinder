package com.mapbox.android.telemetry;

class SessionIdentifier {
    private static final int DEFAULT_ROTATION_HOURS = 24;
    private static final int HOURS_TO_MILLISECONDS = 3600000;
    private long lastSessionIdUpdate;
    private int rotationInterval = 24;
    private String sessionId = null;

    SessionIdentifier() {
    }

    SessionIdentifier(int i) {
        this.rotationInterval = i;
    }

    String getSessionId() {
        if (System.currentTimeMillis() - this.lastSessionIdUpdate >= ((long) (this.rotationInterval * HOURS_TO_MILLISECONDS)) || this.sessionId == null) {
            this.sessionId = TelemetryUtils.obtainUniversalUniqueIdentifier();
            this.lastSessionIdUpdate = System.currentTimeMillis();
        }
        return this.sessionId;
    }
}
