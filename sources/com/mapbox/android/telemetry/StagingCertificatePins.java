package com.mapbox.android.telemetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StagingCertificatePins {
    static final Map<String, List<String>> CERTIFICATE_PINS = new C58051();

    /* renamed from: com.mapbox.android.telemetry.StagingCertificatePins$1 */
    static class C58051 extends HashMap<String, List<String>> {

        /* renamed from: com.mapbox.android.telemetry.StagingCertificatePins$1$1 */
        class C58041 extends ArrayList<String> {
            C58041() {
                add("sha256/3euxrJOrEZI15R4104UsiAkDqe007EPyZ6eTL/XxdAY=");
                add("sha256/5kJvNEMw0KjrCAu7eXY5HZdvyCS13BbA0VJG1RSP91w=");
                add("sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=");
            }
        }

        C58051() {
            put("api-events-staging.tilestream.net", new C58041());
        }
    }

    StagingCertificatePins() {
    }
}
