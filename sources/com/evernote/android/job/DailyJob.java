package com.evernote.android.job;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import com.evernote.android.job.Job.C1125a;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.JobRequest.C1129a;
import com.evernote.android.job.util.C3142c;
import com.evernote.android.job.util.support.C1152b;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public abstract class DailyJob extends Job {
    private static final C3142c CAT = new C3142c("DailyJob");
    private static final long DAY = TimeUnit.DAYS.toMillis(1);
    @VisibleForTesting
    static final String EXTRA_END_MS = "EXTRA_END_MS";
    @VisibleForTesting
    private static final String EXTRA_ONCE = "EXTRA_ONCE";
    @VisibleForTesting
    static final String EXTRA_START_MS = "EXTRA_START_MS";

    public enum DailyJobResult {
        SUCCESS,
        CANCEL
    }

    @WorkerThread
    @NonNull
    protected abstract DailyJobResult onRunDailyJob(@NonNull C1125a c1125a);

    public static int schedule(@NonNull C1129a c1129a, long j, long j2) {
        return schedule(c1129a, true, j, j2);
    }

    public static int startNowOnce(@NonNull C1129a c1129a) {
        C1152b c1152b = new C1152b();
        c1152b.m3935a(EXTRA_ONCE, true);
        return c1129a.m3737a().m3745b(c1152b).m3747b().m3756D();
    }

    private static int schedule(@NonNull C1129a c1129a, boolean z, long j, long j2) {
        if (j < DAY && j2 < DAY && j >= 0) {
            if (j2 >= 0) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(C1133b.m3801g().currentTimeMillis());
                int i = instance.get(11);
                int i2 = instance.get(12);
                long toMillis = ((((((TimeUnit.SECONDS.toMillis((long) (60 - instance.get(13))) + TimeUnit.MINUTES.toMillis((long) (60 - i2))) + TimeUnit.HOURS.toMillis((long) ((24 - i) % 24))) - TimeUnit.HOURS.toMillis(1)) - TimeUnit.MINUTES.toMillis(1)) + TimeUnit.DAYS.toMillis(1)) + j) % TimeUnit.DAYS.toMillis(1);
                if (j > j2) {
                    j2 += TimeUnit.DAYS.toMillis(1);
                }
                long j3 = toMillis + (j2 - j);
                C1152b c1152b = new C1152b();
                c1152b.m3933a(EXTRA_START_MS, j);
                c1152b.m3933a(EXTRA_END_MS, j2);
                c1129a.m3745b(c1152b);
                if (z) {
                    j = C1139e.m3819a();
                    for (JobRequest jobRequest : new HashSet(j.m3829a(c1129a.f2934a))) {
                        if (!jobRequest.m3783u() || jobRequest.m3767e() != 1) {
                            j.m3838c(jobRequest.m3765c());
                        }
                    }
                }
                c1129a = c1129a.m3739a(Math.max(1, toMillis), Math.max(1, j3)).m3747b();
                if (!z || (!c1129a.m3783u() && !c1129a.m3771i() && !c1129a.m3754B())) {
                    return c1129a.m3756D();
                }
                throw new IllegalArgumentException("Daily jobs cannot be exact, periodic or transient");
            }
        }
        throw new IllegalArgumentException("startMs or endMs should be less than one day (in milliseconds)");
    }

    @NonNull
    protected final Result onRunJob(@NonNull C1125a c1125a) {
        DailyJobResult onRunDailyJob;
        Throwable th;
        Throwable th2;
        JobRequest f;
        C1152b e = c1125a.m3694e();
        boolean b = e.m3939b(EXTRA_ONCE, false);
        if (b || (e.m3936a(EXTRA_START_MS) && e.m3936a(EXTRA_END_MS))) {
            JobRequest a;
            try {
                if (meetsRequirements()) {
                    onRunDailyJob = onRunDailyJob(c1125a);
                } else {
                    onRunDailyJob = DailyJobResult.SUCCESS;
                    try {
                        CAT.m12115a("Daily job requirements not met, reschedule for the next day");
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        if (onRunDailyJob == null) {
                            onRunDailyJob = DailyJobResult.SUCCESS;
                            CAT.m12124d("Daily job result was null");
                        }
                        if (!b) {
                            f = c1125a.m3695f();
                            if (onRunDailyJob != DailyJobResult.SUCCESS) {
                                CAT.m12116a("Rescheduling daily job %s", f);
                                a = C1139e.m3819a().m3827a(schedule(f.m3758F(), false, e.m3937b(EXTRA_START_MS, 0) % DAY, e.m3937b(EXTRA_END_MS, 0) % DAY));
                                if (a != null) {
                                    a.m3764b(false, true);
                                }
                            } else {
                                CAT.m12116a("Cancel daily job %s", f);
                            }
                        }
                        throw th2;
                    }
                }
                if (onRunDailyJob == null) {
                    onRunDailyJob = DailyJobResult.SUCCESS;
                    CAT.m12124d("Daily job result was null");
                }
                if (!b) {
                    f = c1125a.m3695f();
                    if (onRunDailyJob == DailyJobResult.SUCCESS) {
                        CAT.m12116a("Rescheduling daily job %s", f);
                        a = C1139e.m3819a().m3827a(schedule(f.m3758F(), false, e.m3937b(EXTRA_START_MS, 0) % DAY, e.m3937b(EXTRA_END_MS, 0) % DAY));
                        if (a != null) {
                            a.m3764b(false, true);
                        }
                    } else {
                        CAT.m12116a("Cancel daily job %s", f);
                    }
                }
                return Result.SUCCESS;
            } catch (Throwable th4) {
                th = th4;
                onRunDailyJob = null;
                th2 = th;
                if (onRunDailyJob == null) {
                    onRunDailyJob = DailyJobResult.SUCCESS;
                    CAT.m12124d("Daily job result was null");
                }
                if (b) {
                    f = c1125a.m3695f();
                    if (onRunDailyJob != DailyJobResult.SUCCESS) {
                        CAT.m12116a("Cancel daily job %s", f);
                    } else {
                        CAT.m12116a("Rescheduling daily job %s", f);
                        a = C1139e.m3819a().m3827a(schedule(f.m3758F(), false, e.m3937b(EXTRA_START_MS, 0) % DAY, e.m3937b(EXTRA_END_MS, 0) % DAY));
                        if (a != null) {
                            a.m3764b(false, true);
                        }
                    }
                }
                throw th2;
            }
        }
        CAT.m12124d("Daily job doesn't contain start and end time");
        return Result.FAILURE;
    }
}
