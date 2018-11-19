package com.mapbox.android.telemetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ChinaCertificatePins {
    static final Map<String, List<String>> CERTIFICATE_PINS = new C57771();

    /* renamed from: com.mapbox.android.telemetry.ChinaCertificatePins$1 */
    static class C57771 extends HashMap<String, List<String>> {

        /* renamed from: com.mapbox.android.telemetry.ChinaCertificatePins$1$1 */
        class C57761 extends ArrayList<String> {
            C57761() {
                add("sha256/gakY+fylqW6kp6piqnaQNLZFzT8HlhzP5lsGJk5WguE=");
                add("sha256/5kJvNEMw0KjrCAu7eXY5HZdvyCS13BbA0VJG1RSP91w=");
                add("sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=");
                add("sha256/3coVlMAEAYhOEJHgXwloiPDGaF+ZfxHZbVoK8AYYWVg=");
                add("sha256/5kJvNEMw0KjrCAu7eXY5HZdvyCS13BbA0VJG1RSP91w=");
                add("sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=");
                add("sha256/+O+QJCmvoB/FkTd0/5FvmMSvFbMqjYU+Txrw1lyGkUQ=");
                add("sha256/zUIraRNo+4JoAYA7ROeWjARtIoN4rIEbCpfCRQT6N6A=");
                add("sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=");
            }
        }

        C57771() {
            put("events.mapbox.cn", new C57761());
        }
    }

    ChinaCertificatePins() {
    }
}
