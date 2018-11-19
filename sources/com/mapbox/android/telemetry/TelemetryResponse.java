package com.mapbox.android.telemetry;

import com.google.gson.annotations.SerializedName;

class TelemetryResponse {
    @SerializedName("message")
    private final String message;

    TelemetryResponse(String str) {
        this.message = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                TelemetryResponse telemetryResponse = (TelemetryResponse) obj;
                if (this.message != null) {
                    z = this.message.equals(telemetryResponse.message);
                } else if (telemetryResponse.message != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.message != null ? this.message.hashCode() : 0;
    }
}
