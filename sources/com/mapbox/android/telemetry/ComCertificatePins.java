package com.mapbox.android.telemetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ComCertificatePins {
    static final Map<String, List<String>> CERTIFICATE_PINS = new C57791();

    /* renamed from: com.mapbox.android.telemetry.ComCertificatePins$1 */
    static class C57791 extends HashMap<String, List<String>> {

        /* renamed from: com.mapbox.android.telemetry.ComCertificatePins$1$1 */
        class C57781 extends ArrayList<String> {
            C57781() {
                add("sha256/BhynraKizavqoC5U26qgYuxLZst6pCu9J5stfL6RSYY=");
                add("sha256/owrR9U9FWDWtrFF+myoRIu75JwU4sJwzvhCNLZoY37g=");
                add("sha256/SQVGZiOrQXi+kqxcvWWE96HhfydlLVqFr4lQTqI5qqo=");
                add("sha256/yJLOJQLNTPNSOh3Btyg9UA1icIoZZssWzG0UmVEJFfA=");
                add("sha256/Tb0uHZ/KQjWh8N9+CZFLc4zx36LONQ55l6laDi1qtT4=");
                add("sha256/RRM1dGqnDFsCJXBTHky16vi1obOlCgFFn/yOhI/y+ho=");
                add("sha256/WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=");
                add("sha256/yGp2XoimPmIK24X3bNV1IaK+HqvbGEgqar5nauDdC5E=");
            }
        }

        C57791() {
            put("events.mapbox.com", new C57781());
        }
    }

    ComCertificatePins() {
    }
}
