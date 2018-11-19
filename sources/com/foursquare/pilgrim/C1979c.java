package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry;

/* renamed from: com.foursquare.pilgrim.c */
abstract class C1979c {
    /* renamed from: a */
    protected static boolean f5383a = false;
    /* renamed from: b */
    private final Object f5384b = new Object();

    /* renamed from: com.foursquare.pilgrim.c$a */
    static class C1978a {
        /* renamed from: a */
        private boolean f5382a;

        C1978a() {
        }

        /* renamed from: a */
        void m7158a(boolean z) {
            if (z) {
                this.f5382a = true;
            }
        }

        /* renamed from: a */
        boolean m7159a() {
            return this.f5382a;
        }
    }

    /* renamed from: a */
    private static void m7160a(Context context, PilgrimLogEntry pilgrimLogEntry) {
    }

    /* renamed from: a */
    static void m7161a(PilgrimLogEntry pilgrimLogEntry, FoursquareLocation foursquareLocation, String str, BaseSpeedStrategy baseSpeedStrategy, int i) {
    }

    /* renamed from: a */
    static void m7162a(Exception exception, PilgrimLogEntry pilgrimLogEntry) {
    }

    /* renamed from: a */
    static void m7163a(String str) {
    }

    /* renamed from: a */
    protected abstract void mo2050a(Context context, FoursquareLocation foursquareLocation, C1978a c1978a, PilgrimLogEntry pilgrimLogEntry, @NonNull BackgroundWakeupSource backgroundWakeupSource) throws Exception;

    C1979c() {
    }

    @WorkerThread
    /* renamed from: a */
    void m7164a(Context context, FoursquareLocation foursquareLocation, @NonNull BackgroundWakeupSource backgroundWakeupSource) throws Exception {
        PilgrimLogEntry a = aj.m6921a().f5299d.mo2018a();
        C1978a c1978a = new C1978a();
        C1979c.m7160a(context, a);
        if (aj.m6921a().f5298c.mo2046a()) {
            try {
                synchronized (this.f5384b) {
                    mo2050a(context, foursquareLocation, c1978a, a, backgroundWakeupSource);
                }
            } catch (FoursquareLocation foursquareLocation2) {
                new RealExceptionReporter().reportException(foursquareLocation2);
            }
        } else {
            aj.m6923a(context, null);
        }
        if (c1978a.m7159a() != null) {
            try {
                aj.m6922a(context);
            } catch (Context context2) {
                new RealExceptionReporter().reportException(context2);
                foursquareLocation2 = new StringBuilder();
                foursquareLocation2.append("Error restarting service: ");
                foursquareLocation2.append(context2.getMessage());
                C1979c.m7163a(foursquareLocation2.toString());
            }
        }
    }
}
