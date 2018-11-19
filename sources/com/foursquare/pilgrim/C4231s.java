package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.evernote.android.job.DailyJob;
import com.evernote.android.job.DailyJob.DailyJobResult;
import com.evernote.android.job.Job.C1125a;
import com.evernote.android.job.JobRequest.C1129a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.pilgrim.s */
final class C4231s extends DailyJob {
    /* renamed from: a */
    private static final long f13526a = TimeUnit.HOURS.toMillis(3);
    /* renamed from: b */
    private static final int f13527b = ((int) TimeUnit.HOURS.toMillis(4));

    C4231s() {
    }

    /* renamed from: a */
    static int m16805a() {
        long a = (long) af.m6905a(0, f13527b);
        return DailyJob.schedule(new C1129a("EvernotePilgrimReportDailyJob"), a, a + f13526a);
    }

    @NonNull
    protected DailyJobResult onRunDailyJob(@NonNull C1125a c1125a) {
        aq.m6962a(true);
        return DailyJobResult.SUCCESS;
    }
}
