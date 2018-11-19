package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.evernote.android.job.Job;
import com.evernote.android.job.Job.C1125a;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.C1129a;
import com.foursquare.api.types.NotificationConfig;
import com.foursquare.api.types.PilgrimConfig;
import com.foursquare.internal.network.C1928e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.pilgrim.u */
final class C3568u extends Job {
    C3568u() {
    }

    @NonNull
    /* renamed from: a */
    static JobRequest m13416a() {
        return new C1129a("EvernoteStillSailingImmediateJob").m3739a(TimeUnit.MINUTES.toMillis(1), TimeUnit.MINUTES.toMillis(5)).m3747b();
    }

    @WorkerThread
    /* renamed from: b */
    private void m13417b() {
        C3549d c3549d = (C3549d) C1928e.m6757a().m6763b(bf.m7089a().m7102e()).m6774c();
        if (c3549d != null) {
            PilgrimConfig c = c3549d.m13377c();
            if (c != null && ax.m7003a().m7027a(getContext(), c)) {
                aj.m6922a(getContext());
            }
            NotificationConfig d = c3549d.m13378d();
            if (d != null) {
                ag.m6911a(getContext()).m6913a(getContext(), d);
            }
        }
    }

    @NonNull
    protected Result onRunJob(@NonNull C1125a c1125a) {
        try {
            bh.m7121c(System.currentTimeMillis());
            m13417b();
        } catch (C1125a c1125a2) {
            new RealExceptionReporter().reportException(c1125a2);
        }
        return Result.SUCCESS;
    }
}
