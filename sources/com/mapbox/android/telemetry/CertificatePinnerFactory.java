package com.mapbox.android.telemetry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C15890d;
import okhttp3.C15890d.C15888a;

class CertificatePinnerFactory {
    private static final Map<Environment, Map<String, List<String>>> CERTIFICATES_PINS = new C57751();

    /* renamed from: com.mapbox.android.telemetry.CertificatePinnerFactory$1 */
    static class C57751 extends HashMap<Environment, Map<String, List<String>>> {
        C57751() {
            put(Environment.STAGING, StagingCertificatePins.CERTIFICATE_PINS);
            put(Environment.COM, ComCertificatePins.CERTIFICATE_PINS);
            put(Environment.CHINA, ChinaCertificatePins.CERTIFICATE_PINS);
        }
    }

    CertificatePinnerFactory() {
    }

    C15890d provideCertificatePinnerFor(Environment environment) {
        C15888a c15888a = new C15888a();
        addCertificatesPins(provideCertificatesPinsFor(environment), c15888a);
        return c15888a.a();
    }

    Map<String, List<String>> provideCertificatesPinsFor(Environment environment) {
        return (Map) CERTIFICATES_PINS.get(environment);
    }

    private void addCertificatesPins(Map<String, List<String>> map, C15888a c15888a) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            for (String str : (List) entry.getValue()) {
                c15888a.a((String) entry.getKey(), new String[]{str});
            }
        }
    }
}
