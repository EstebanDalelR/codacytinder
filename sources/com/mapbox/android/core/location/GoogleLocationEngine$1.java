package com.mapbox.android.core.location;

import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;

class GoogleLocationEngine$1 extends HashMap<LocationEnginePriority, C5764i> {
    /* renamed from: a */
    final /* synthetic */ C7073d f21503a;

    /* renamed from: com.mapbox.android.core.location.GoogleLocationEngine$1$1 */
    class C70671 implements C5764i {
        /* renamed from: a */
        final /* synthetic */ GoogleLocationEngine$1 f25674a;

        C70671(GoogleLocationEngine$1 googleLocationEngine$1) {
            this.f25674a = googleLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6221a(LocationRequest locationRequest) {
            locationRequest.setPriority(105);
        }
    }

    /* renamed from: com.mapbox.android.core.location.GoogleLocationEngine$1$2 */
    class C70682 implements C5764i {
        /* renamed from: a */
        final /* synthetic */ GoogleLocationEngine$1 f25675a;

        C70682(GoogleLocationEngine$1 googleLocationEngine$1) {
            this.f25675a = googleLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6221a(LocationRequest locationRequest) {
            locationRequest.setPriority(104);
        }
    }

    /* renamed from: com.mapbox.android.core.location.GoogleLocationEngine$1$3 */
    class C70693 implements C5764i {
        /* renamed from: a */
        final /* synthetic */ GoogleLocationEngine$1 f25676a;

        C70693(GoogleLocationEngine$1 googleLocationEngine$1) {
            this.f25676a = googleLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6221a(LocationRequest locationRequest) {
            locationRequest.setPriority(102);
        }
    }

    /* renamed from: com.mapbox.android.core.location.GoogleLocationEngine$1$4 */
    class C70704 implements C5764i {
        /* renamed from: a */
        final /* synthetic */ GoogleLocationEngine$1 f25677a;

        C70704(GoogleLocationEngine$1 googleLocationEngine$1) {
            this.f25677a = googleLocationEngine$1;
        }

        /* renamed from: a */
        public void mo6221a(LocationRequest locationRequest) {
            locationRequest.setPriority(100);
        }
    }

    GoogleLocationEngine$1(C7073d c7073d) {
        this.f21503a = c7073d;
        put(LocationEnginePriority.NO_POWER, new C70671(this));
        put(LocationEnginePriority.LOW_POWER, new C70682(this));
        put(LocationEnginePriority.BALANCED_POWER_ACCURACY, new C70693(this));
        put(LocationEnginePriority.HIGH_ACCURACY, new C70704(this));
    }
}
