package com.mapbox.android.core.location;

import java.util.HashMap;

class AndroidLocationEngine$1 extends HashMap<LocationEnginePriority, C5763h> {
    /* renamed from: a */
    final /* synthetic */ C7071a f21502a;

    /* renamed from: com.mapbox.android.core.location.AndroidLocationEngine$1$1 */
    class C70631 implements C5763h {
        /* renamed from: a */
        final /* synthetic */ AndroidLocationEngine$1 f25670a;

        C70631(AndroidLocationEngine$1 androidLocationEngine$1) {
            this.f25670a = androidLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6220a() {
            this.f25670a.f21502a.f25680h = "passive";
        }
    }

    /* renamed from: com.mapbox.android.core.location.AndroidLocationEngine$1$2 */
    class C70642 implements C5763h {
        /* renamed from: a */
        final /* synthetic */ AndroidLocationEngine$1 f25671a;

        C70642(AndroidLocationEngine$1 androidLocationEngine$1) {
            this.f25671a = androidLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6220a() {
            this.f25671a.f21502a.f25680h = "network";
        }
    }

    /* renamed from: com.mapbox.android.core.location.AndroidLocationEngine$1$3 */
    class C70653 implements C5763h {
        /* renamed from: a */
        final /* synthetic */ AndroidLocationEngine$1 f25672a;

        C70653(AndroidLocationEngine$1 androidLocationEngine$1) {
            this.f25672a = androidLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6220a() {
            this.f25672a.f21502a.f25680h = "network";
        }
    }

    /* renamed from: com.mapbox.android.core.location.AndroidLocationEngine$1$4 */
    class C70664 implements C5763h {
        /* renamed from: a */
        final /* synthetic */ AndroidLocationEngine$1 f25673a;

        C70664(AndroidLocationEngine$1 androidLocationEngine$1) {
            this.f25673a = androidLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6220a() {
            this.f25673a.f21502a.f25680h = "gps";
        }
    }

    AndroidLocationEngine$1(C7071a c7071a) {
        this.f21502a = c7071a;
        put(LocationEnginePriority.NO_POWER, new C70631(this));
        put(LocationEnginePriority.LOW_POWER, new C70642(this));
        put(LocationEnginePriority.BALANCED_POWER_ACCURACY, new C70653(this));
        put(LocationEnginePriority.HIGH_ACCURACY, new C70664(this));
    }
}
