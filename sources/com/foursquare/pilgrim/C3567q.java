package com.foursquare.pilgrim;

import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.Job;
import com.evernote.android.job.Job.C1125a;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.C1129a;
import com.google.android.gms.location.C4486f;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.pilgrim.q */
final class C3567q extends Job {
    C3567q() {
    }

    @NonNull
    /* renamed from: a */
    static JobRequest m13414a() {
        return new C1129a("EvernotePeriodicLocationRefreshJob").m3744b(TimeUnit.MINUTES.toMillis(15), TimeUnit.MINUTES.toMillis(5)).m3746b(true).m3747b();
    }

    @NonNull
    protected Result onRunJob(@NonNull C1125a c1125a) {
        if (C3567q.m13415a(ad.m13305a()) != null) {
            return Result.SUCCESS;
        }
        c1125a = C4486f.a(getContext());
        HandlerThread handlerThread = new HandlerThread("EvernotePeriodicLocationRefreshJob- fused location handler thread");
        handlerThread.start();
        try {
            c1125a = C1971b.m7057a(getContext(), c1125a, handlerThread.getLooper(), LocationRequest.create().setPriority(102).setNumUpdates(1).setExpirationDuration(TimeUnit.SECONDS.toMillis(15)));
            if (((Throwable) c1125a.m7106c()) != null) {
                c1125a = Result.FAILURE;
                return c1125a;
            }
            LocationResult locationResult = (LocationResult) c1125a.m7103a(new NullPointerException());
            if (locationResult == null) {
                c1125a = Result.FAILURE;
                C1971b.m7061a(handlerThread);
                return c1125a;
            }
            c1125a = ao.m6944a().m6947a(locationResult.getLocations(), BackgroundWakeupSource.PERIODIC_JOB_ONE_OFF) != null ? Result.SUCCESS : Result.FAILURE;
            C1971b.m7061a(handlerThread);
            return c1125a;
        } catch (C1125a c1125a2) {
            new RealExceptionReporter().reportException(c1125a2);
            c1125a2 = Result.SUCCESS;
            return c1125a2;
        } finally {
            C1971b.m7061a(handlerThread);
        }
    }

    /* renamed from: a */
    private static boolean m13415a(@Nullable ac acVar) {
        boolean z = false;
        if (acVar == null) {
            return false;
        }
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - acVar.m6895a().getTime()) < 1) {
            z = true;
        }
        return z;
    }
}
