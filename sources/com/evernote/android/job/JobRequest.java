package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.evernote.android.job.util.C1149d;
import com.evernote.android.job.util.C3142c;
import com.evernote.android.job.util.support.C1152b;
import com.google.android.exoplayer2.Format;
import com.tinder.api.ManagerWebServices;
import java.util.concurrent.TimeUnit;

public final class JobRequest {
    /* renamed from: a */
    public static final BackoffPolicy f2954a = BackoffPolicy.EXPONENTIAL;
    /* renamed from: b */
    public static final NetworkType f2955b = NetworkType.ANY;
    /* renamed from: c */
    public static final long f2956c = TimeUnit.MINUTES.toMillis(15);
    /* renamed from: d */
    public static final long f2957d = TimeUnit.MINUTES.toMillis(5);
    /* renamed from: e */
    private static final C3142c f2958e = new C3142c("JobRequest");
    /* renamed from: f */
    private final C1129a f2959f;
    /* renamed from: g */
    private int f2960g;
    /* renamed from: h */
    private long f2961h;
    /* renamed from: i */
    private boolean f2962i;
    /* renamed from: j */
    private boolean f2963j;
    /* renamed from: k */
    private long f2964k;

    public enum BackoffPolicy {
        LINEAR,
        EXPONENTIAL
    }

    public enum NetworkType {
        ANY,
        CONNECTED,
        UNMETERED,
        NOT_ROAMING,
        METERED
    }

    /* renamed from: com.evernote.android.job.JobRequest$a */
    public static final class C1129a {
        /* renamed from: a */
        final String f2934a;
        /* renamed from: b */
        private int f2935b;
        /* renamed from: c */
        private long f2936c;
        /* renamed from: d */
        private long f2937d;
        /* renamed from: e */
        private long f2938e;
        /* renamed from: f */
        private BackoffPolicy f2939f;
        /* renamed from: g */
        private long f2940g;
        /* renamed from: h */
        private long f2941h;
        /* renamed from: i */
        private boolean f2942i;
        /* renamed from: j */
        private boolean f2943j;
        /* renamed from: k */
        private boolean f2944k;
        /* renamed from: l */
        private boolean f2945l;
        /* renamed from: m */
        private boolean f2946m;
        /* renamed from: n */
        private boolean f2947n;
        /* renamed from: o */
        private NetworkType f2948o;
        /* renamed from: p */
        private C1152b f2949p;
        /* renamed from: q */
        private String f2950q;
        /* renamed from: r */
        private boolean f2951r;
        /* renamed from: s */
        private boolean f2952s;
        /* renamed from: t */
        private Bundle f2953t;

        public C1129a(@NonNull String str) {
            this.f2953t = Bundle.EMPTY;
            this.f2934a = (String) C1149d.m3887a((CharSequence) str);
            this.f2935b = -8765;
            this.f2936c = -1;
            this.f2937d = -1;
            this.f2938e = 30000;
            this.f2939f = JobRequest.f2954a;
            this.f2948o = JobRequest.f2955b;
        }

        private C1129a(Cursor cursor) throws Exception {
            this.f2953t = Bundle.EMPTY;
            this.f2935b = cursor.getInt(cursor.getColumnIndex(ManagerWebServices.PARAM_ID_UNDERSCORE));
            this.f2934a = cursor.getString(cursor.getColumnIndex("tag"));
            this.f2936c = cursor.getLong(cursor.getColumnIndex("startMs"));
            this.f2937d = cursor.getLong(cursor.getColumnIndex("endMs"));
            this.f2938e = cursor.getLong(cursor.getColumnIndex("backoffMs"));
            try {
                this.f2939f = BackoffPolicy.valueOf(cursor.getString(cursor.getColumnIndex("backoffPolicy")));
            } catch (Throwable th) {
                JobRequest.f2958e.m12117a(th);
                this.f2939f = JobRequest.f2954a;
            }
            this.f2940g = cursor.getLong(cursor.getColumnIndex("intervalMs"));
            this.f2941h = cursor.getLong(cursor.getColumnIndex("flexMs"));
            boolean z = false;
            this.f2942i = cursor.getInt(cursor.getColumnIndex("requirementsEnforced")) > 0;
            this.f2943j = cursor.getInt(cursor.getColumnIndex("requiresCharging")) > 0;
            this.f2944k = cursor.getInt(cursor.getColumnIndex("requiresDeviceIdle")) > 0;
            this.f2945l = cursor.getInt(cursor.getColumnIndex("requiresBatteryNotLow")) > 0;
            this.f2946m = cursor.getInt(cursor.getColumnIndex("requiresStorageNotLow")) > 0;
            this.f2947n = cursor.getInt(cursor.getColumnIndex("exact")) > 0;
            try {
                this.f2948o = NetworkType.valueOf(cursor.getString(cursor.getColumnIndex("networkType")));
            } catch (Throwable th2) {
                JobRequest.f2958e.m12117a(th2);
                this.f2948o = JobRequest.f2955b;
            }
            this.f2950q = cursor.getString(cursor.getColumnIndex("extras"));
            if (cursor.getInt(cursor.getColumnIndex("transient")) > null) {
                z = true;
            }
            this.f2952s = z;
        }

        private C1129a(@NonNull C1129a c1129a) {
            this(c1129a, false);
        }

        private C1129a(@NonNull C1129a c1129a, boolean z) {
            this.f2953t = Bundle.EMPTY;
            this.f2935b = z ? true : c1129a.f2935b;
            this.f2934a = c1129a.f2934a;
            this.f2936c = c1129a.f2936c;
            this.f2937d = c1129a.f2937d;
            this.f2938e = c1129a.f2938e;
            this.f2939f = c1129a.f2939f;
            this.f2940g = c1129a.f2940g;
            this.f2941h = c1129a.f2941h;
            this.f2942i = c1129a.f2942i;
            this.f2943j = c1129a.f2943j;
            this.f2944k = c1129a.f2944k;
            this.f2945l = c1129a.f2945l;
            this.f2946m = c1129a.f2946m;
            this.f2947n = c1129a.f2947n;
            this.f2948o = c1129a.f2948o;
            this.f2949p = c1129a.f2949p;
            this.f2950q = c1129a.f2950q;
            this.f2951r = c1129a.f2951r;
            this.f2952s = c1129a.f2952s;
            this.f2953t = c1129a.f2953t;
        }

        /* renamed from: a */
        private void m3717a(ContentValues contentValues) {
            contentValues.put(ManagerWebServices.PARAM_ID_UNDERSCORE, Integer.valueOf(this.f2935b));
            contentValues.put("tag", this.f2934a);
            contentValues.put("startMs", Long.valueOf(this.f2936c));
            contentValues.put("endMs", Long.valueOf(this.f2937d));
            contentValues.put("backoffMs", Long.valueOf(this.f2938e));
            contentValues.put("backoffPolicy", this.f2939f.toString());
            contentValues.put("intervalMs", Long.valueOf(this.f2940g));
            contentValues.put("flexMs", Long.valueOf(this.f2941h));
            contentValues.put("requirementsEnforced", Boolean.valueOf(this.f2942i));
            contentValues.put("requiresCharging", Boolean.valueOf(this.f2943j));
            contentValues.put("requiresDeviceIdle", Boolean.valueOf(this.f2944k));
            contentValues.put("requiresBatteryNotLow", Boolean.valueOf(this.f2945l));
            contentValues.put("requiresStorageNotLow", Boolean.valueOf(this.f2946m));
            contentValues.put("exact", Boolean.valueOf(this.f2947n));
            contentValues.put("networkType", this.f2948o.toString());
            if (this.f2949p != null) {
                contentValues.put("extras", this.f2949p.m3931a());
            } else if (!TextUtils.isEmpty(this.f2950q)) {
                contentValues.put("extras", this.f2950q);
            }
            contentValues.put("transient", Boolean.valueOf(this.f2952s));
        }

        /* renamed from: a */
        public C1129a m3739a(long j, long j2) {
            this.f2936c = C1149d.m3890b(j, "startInMs must be greater than 0");
            this.f2937d = C1149d.m3885a(j2, j, Format.OFFSET_SAMPLE_RELATIVE, "endInMs");
            if (this.f2936c > 6148914691236517204L) {
                JobRequest.f2958e.m12116a("startInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.f2936c)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.f2936c = 6148914691236517204L;
            }
            if (this.f2937d > 6148914691236517204L) {
                JobRequest.f2958e.m12116a("endInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.f2937d)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.f2937d = 6148914691236517204L;
            }
            return this;
        }

        /* renamed from: a */
        public C1129a m3741a(@Nullable C1152b c1152b) {
            if (c1152b == null) {
                this.f2949p = null;
                this.f2950q = null;
            } else {
                this.f2949p = new C1152b(c1152b);
            }
            return this;
        }

        /* renamed from: b */
        public C1129a m3745b(@NonNull C1152b c1152b) {
            if (this.f2949p == null) {
                this.f2949p = c1152b;
            } else {
                this.f2949p.m3932a(c1152b);
            }
            this.f2950q = null;
            return this;
        }

        /* renamed from: a */
        public C1129a m3742a(boolean z) {
            this.f2942i = z;
            return this;
        }

        /* renamed from: a */
        public C1129a m3740a(@Nullable NetworkType networkType) {
            this.f2948o = networkType;
            return this;
        }

        /* renamed from: a */
        public C1129a m3738a(long j) {
            this.f2947n = true;
            if (j > 6148914691236517204L) {
                JobRequest.f2958e.m12116a("exactInMs clamped from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(j)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                j = 6148914691236517204L;
            }
            return m3739a(j, j);
        }

        /* renamed from: a */
        public C1129a m3737a() {
            return m3738a(1);
        }

        /* renamed from: b */
        public C1129a m3743b(long j) {
            return m3744b(j, j);
        }

        /* renamed from: b */
        public C1129a m3744b(long j, long j2) {
            this.f2940g = C1149d.m3885a(j, JobRequest.m3750a(), Format.OFFSET_SAMPLE_RELATIVE, "intervalMs");
            this.f2941h = C1149d.m3885a(j2, JobRequest.m3752b(), this.f2940g, "flexMs");
            return this;
        }

        /* renamed from: b */
        public C1129a m3746b(boolean z) {
            this.f2951r = z;
            return this;
        }

        /* renamed from: b */
        public JobRequest m3747b() {
            C1149d.m3887a(this.f2934a);
            C1149d.m3890b(this.f2938e, "backoffMs must be > 0");
            C1149d.m3888a(this.f2939f);
            C1149d.m3888a(this.f2948o);
            if (this.f2940g > 0) {
                C1149d.m3885a(r0.f2940g, JobRequest.m3750a(), Format.OFFSET_SAMPLE_RELATIVE, "intervalMs");
                C1149d.m3885a(r0.f2941h, JobRequest.m3752b(), r0.f2940g, "flexMs");
                if (r0.f2940g < JobRequest.f2956c || r0.f2941h < JobRequest.f2957d) {
                    JobRequest.f2958e.m12123c("AllowSmallerIntervals enabled, this will crash on Android N and later, interval %d (minimum is %d), flex %d (minimum is %d)", Long.valueOf(r0.f2940g), Long.valueOf(JobRequest.f2956c), Long.valueOf(r0.f2941h), Long.valueOf(JobRequest.f2957d));
                }
            }
            if (r0.f2947n && r0.f2940g > 0) {
                throw new IllegalArgumentException("Can't call setExact() on a periodic job.");
            } else if (r0.f2947n && r0.f2936c != r0.f2937d) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() for an exact job.");
            } else if (r0.f2947n && (r0.f2942i || r0.f2944k || r0.f2943j || !JobRequest.f2955b.equals(r0.f2948o) || r0.f2945l || r0.f2946m)) {
                throw new IllegalArgumentException("Can't require any condition for an exact job.");
            } else if (r0.f2940g <= 0 && (r0.f2936c == -1 || r0.f2937d == -1)) {
                throw new IllegalArgumentException("You're trying to build a job with no constraints, this is not allowed.");
            } else if (r0.f2940g > 0 && (r0.f2936c != -1 || r0.f2937d != -1)) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() on a periodic job.");
            } else if (r0.f2940g <= 0 || (r0.f2938e == 30000 && JobRequest.f2954a.equals(r0.f2939f))) {
                if (r0.f2940g <= 0 && (r0.f2936c > 3074457345618258602L || r0.f2937d > 3074457345618258602L)) {
                    JobRequest.f2958e.m12122c("Attention: your execution window is too large. This could result in undesired behavior, see https://github.com/evernote/android-job/wiki/FAQ");
                }
                if (r0.f2940g <= 0 && r0.f2936c > TimeUnit.DAYS.toMillis(365)) {
                    JobRequest.f2958e.m12123c("Warning: job with tag %s scheduled over a year in the future", r0.f2934a);
                }
                if (r0.f2935b != -8765) {
                    C1149d.m3884a(r0.f2935b, "id can't be negative");
                }
                C1129a c1129a = new C1129a(r0);
                if (r0.f2935b == -8765) {
                    c1129a.f2935b = C1139e.m3819a().m3837c().m3862a();
                    C1149d.m3884a(c1129a.f2935b, "id can't be negative");
                }
                return new JobRequest(c1129a);
            } else {
                throw new IllegalArgumentException("A periodic job will not respect any back-off policy, so calling setBackoffCriteria() with setPeriodic() is an error.");
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    if (this.f2935b != ((C1129a) obj).f2935b) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f2935b;
        }
    }

    /* renamed from: a */
    static long m3750a() {
        return C1133b.m3793a() ? TimeUnit.MINUTES.toMillis(1) : f2956c;
    }

    /* renamed from: b */
    static long m3752b() {
        return C1133b.m3793a() ? TimeUnit.SECONDS.toMillis(30) : f2957d;
    }

    /* renamed from: I */
    private static Context m3749I() {
        return C1139e.m3819a().m3841f();
    }

    private JobRequest(C1129a c1129a) {
        this.f2959f = c1129a;
    }

    /* renamed from: c */
    public int m3765c() {
        return this.f2959f.f2935b;
    }

    @NonNull
    /* renamed from: d */
    public String m3766d() {
        return this.f2959f.f2934a;
    }

    /* renamed from: e */
    public long m3767e() {
        return this.f2959f.f2936c;
    }

    /* renamed from: f */
    public long m3768f() {
        return this.f2959f.f2937d;
    }

    /* renamed from: g */
    public BackoffPolicy m3769g() {
        return this.f2959f.f2939f;
    }

    /* renamed from: h */
    public long m3770h() {
        return this.f2959f.f2938e;
    }

    /* renamed from: i */
    public boolean m3771i() {
        return m3772j() > 0;
    }

    /* renamed from: j */
    public long m3772j() {
        return this.f2959f.f2940g;
    }

    /* renamed from: k */
    public long m3773k() {
        return this.f2959f.f2941h;
    }

    /* renamed from: l */
    public boolean m3774l() {
        return this.f2959f.f2942i;
    }

    /* renamed from: m */
    public boolean m3775m() {
        return this.f2959f.f2943j;
    }

    /* renamed from: n */
    public boolean m3776n() {
        return this.f2959f.f2944k;
    }

    /* renamed from: o */
    public boolean m3777o() {
        return this.f2959f.f2945l;
    }

    /* renamed from: p */
    public boolean m3778p() {
        return this.f2959f.f2946m;
    }

    /* renamed from: q */
    public NetworkType m3779q() {
        return this.f2959f.f2948o;
    }

    /* renamed from: r */
    public boolean m3780r() {
        if (!(m3775m() || m3776n() || m3777o() || m3778p())) {
            if (m3779q() == f2955b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public C1152b m3781s() {
        if (this.f2959f.f2949p == null && !TextUtils.isEmpty(this.f2959f.f2950q)) {
            this.f2959f.f2949p = C1152b.m3930b(this.f2959f.f2950q);
        }
        return this.f2959f.f2949p;
    }

    /* renamed from: t */
    public boolean m3782t() {
        return this.f2959f.f2951r;
    }

    /* renamed from: u */
    public boolean m3783u() {
        return this.f2959f.f2947n;
    }

    /* renamed from: v */
    long m3784v() {
        long j = 0;
        if (m3771i()) {
            return 0;
        }
        switch (m3769g()) {
            case LINEAR:
                j = ((long) this.f2960g) * m3770h();
                break;
            case EXPONENTIAL:
                if (this.f2960g != 0) {
                    j = (long) (((double) m3770h()) * Math.pow(2.0d, (double) (this.f2960g - 1)));
                    break;
                }
                break;
            default:
                throw new IllegalStateException("not implemented");
        }
        return Math.min(j, TimeUnit.HOURS.toMillis(5));
    }

    /* renamed from: w */
    JobApi m3785w() {
        return this.f2959f.f2947n ? JobApi.V_14 : JobApi.getDefault(m3749I());
    }

    /* renamed from: a */
    void m3761a(long j) {
        this.f2961h = j;
    }

    /* renamed from: x */
    public long m3786x() {
        return this.f2961h;
    }

    /* renamed from: y */
    public int m3787y() {
        return this.f2960g;
    }

    /* renamed from: z */
    boolean m3788z() {
        return this.f2962i;
    }

    /* renamed from: A */
    boolean m3753A() {
        return this.f2963j;
    }

    /* renamed from: a */
    void m3762a(boolean z) {
        this.f2963j = z;
    }

    /* renamed from: B */
    public boolean m3754B() {
        return this.f2959f.f2952s;
    }

    @NonNull
    /* renamed from: C */
    public Bundle m3755C() {
        return this.f2959f.f2953t;
    }

    /* renamed from: D */
    public int m3756D() {
        C1139e.m3819a().m3832a(this);
        return m3765c();
    }

    /* renamed from: E */
    public C1129a m3757E() {
        long j = this.f2961h;
        C1139e.m3819a().m3838c(m3765c());
        C1129a c1129a = new C1129a(this.f2959f);
        this.f2962i = false;
        if (!m3771i()) {
            long currentTimeMillis = C1133b.m3801g().currentTimeMillis() - j;
            c1129a.m3739a(Math.max(1, m3767e() - currentTimeMillis), Math.max(1, m3768f() - currentTimeMillis));
        }
        return c1129a;
    }

    /* renamed from: F */
    C1129a m3758F() {
        return new C1129a(this.f2959f, true);
    }

    /* renamed from: a */
    JobRequest m3760a(boolean z, boolean z2) {
        z2 = new C1129a(this.f2959f, z2).m3747b();
        if (z) {
            z2.f2960g = this.f2960g + 1;
        }
        try {
            z2.m3756D();
        } catch (Throwable e) {
            f2958e.m12117a(e);
        }
        return z2;
    }

    /* renamed from: b */
    void m3764b(boolean z, boolean z2) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            this.f2960g++;
            contentValues.put("numFailures", Integer.valueOf(this.f2960g));
        }
        if (z2) {
            this.f2964k = C1133b.m3801g().currentTimeMillis();
            contentValues.put("lastRun", Long.valueOf(this.f2964k));
        }
        C1139e.m3819a().m3837c().m3866a(this, contentValues);
    }

    /* renamed from: b */
    void m3763b(boolean z) {
        this.f2962i = z;
        ContentValues contentValues = new ContentValues();
        contentValues.put("started", Boolean.valueOf(this.f2962i));
        C1139e.m3819a().m3837c().m3866a(this, contentValues);
    }

    /* renamed from: G */
    ContentValues m3759G() {
        ContentValues contentValues = new ContentValues();
        this.f2959f.m3717a(contentValues);
        contentValues.put("numFailures", Integer.valueOf(this.f2960g));
        contentValues.put("scheduledAt", Long.valueOf(this.f2961h));
        contentValues.put("started", Boolean.valueOf(this.f2962i));
        contentValues.put("flexSupport", Boolean.valueOf(this.f2963j));
        contentValues.put("lastRun", Long.valueOf(this.f2964k));
        return contentValues;
    }

    /* renamed from: a */
    static JobRequest m3751a(Cursor cursor) throws Exception {
        JobRequest b = new C1129a(cursor).m3747b();
        b.f2960g = cursor.getInt(cursor.getColumnIndex("numFailures"));
        b.f2961h = cursor.getLong(cursor.getColumnIndex("scheduledAt"));
        boolean z = false;
        b.f2962i = cursor.getInt(cursor.getColumnIndex("started")) > 0;
        if (cursor.getInt(cursor.getColumnIndex("flexSupport")) > 0) {
            z = true;
        }
        b.f2963j = z;
        b.f2964k = cursor.getLong(cursor.getColumnIndex("lastRun"));
        C1149d.m3884a(b.f2960g, "failure count can't be negative");
        C1149d.m3886a(b.f2961h, "scheduled at can't be negative");
        return b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.f2959f.equals(((JobRequest) obj).f2959f);
            }
        }
        return null;
    }

    public int hashCode() {
        return this.f2959f.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("request{id=");
        stringBuilder.append(m3765c());
        stringBuilder.append(", tag=");
        stringBuilder.append(m3766d());
        stringBuilder.append(", transient=");
        stringBuilder.append(m3754B());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
