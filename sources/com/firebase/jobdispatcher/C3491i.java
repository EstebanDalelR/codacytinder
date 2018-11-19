package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: com.firebase.jobdispatcher.i */
public final class C3491i implements JobParameters {
    /* renamed from: a */
    private final String f10544a;
    /* renamed from: b */
    private final String f10545b;
    /* renamed from: c */
    private final C1885m f10546c;
    /* renamed from: d */
    private final RetryStrategy f10547d;
    /* renamed from: e */
    private final int f10548e;
    /* renamed from: f */
    private final boolean f10549f;
    /* renamed from: g */
    private final int[] f10550g;
    /* renamed from: h */
    private final boolean f10551h;
    /* renamed from: i */
    private final Bundle f10552i;

    /* renamed from: com.firebase.jobdispatcher.i$a */
    public static final class C3490a implements JobParameters {
        /* renamed from: a */
        private final ValidationEnforcer f10534a;
        /* renamed from: b */
        private String f10535b;
        /* renamed from: c */
        private Bundle f10536c;
        /* renamed from: d */
        private String f10537d;
        /* renamed from: e */
        private C1885m f10538e = C1886n.f5129a;
        /* renamed from: f */
        private int f10539f = 1;
        /* renamed from: g */
        private int[] f10540g;
        /* renamed from: h */
        private RetryStrategy f10541h = RetryStrategy.f5100a;
        /* renamed from: i */
        private boolean f10542i = false;
        /* renamed from: j */
        private boolean f10543j = false;

        @Nullable
        public C1887o getTriggerReason() {
            return null;
        }

        C3490a(ValidationEnforcer validationEnforcer) {
            this.f10534a = validationEnforcer;
        }

        C3490a(ValidationEnforcer validationEnforcer, JobParameters jobParameters) {
            this.f10534a = validationEnforcer;
            this.f10537d = jobParameters.getTag();
            this.f10535b = jobParameters.getService();
            this.f10538e = jobParameters.getTrigger();
            this.f10543j = jobParameters.isRecurring();
            this.f10539f = jobParameters.getLifetime();
            this.f10540g = jobParameters.getConstraints();
            this.f10536c = jobParameters.getExtras();
            this.f10541h = jobParameters.getRetryStrategy();
        }

        /* renamed from: a */
        public C3490a m13268a(boolean z) {
            this.f10542i = z;
            return this;
        }

        /* renamed from: a */
        public C3491i m13270a() {
            this.f10534a.m13236a((JobParameters) this);
            return new C3491i();
        }

        @NonNull
        public String getService() {
            return this.f10535b;
        }

        /* renamed from: a */
        public C3490a m13266a(Class<? extends JobService> cls) {
            this.f10535b = cls == null ? null : cls.getName();
            return this;
        }

        @NonNull
        public String getTag() {
            return this.f10537d;
        }

        /* renamed from: a */
        public C3490a m13267a(String str) {
            this.f10537d = str;
            return this;
        }

        @NonNull
        public C1885m getTrigger() {
            return this.f10538e;
        }

        /* renamed from: a */
        public C3490a m13265a(C1885m c1885m) {
            this.f10538e = c1885m;
            return this;
        }

        public int getLifetime() {
            return this.f10539f;
        }

        /* renamed from: a */
        public C3490a m13262a(int i) {
            this.f10539f = i;
            return this;
        }

        public boolean isRecurring() {
            return this.f10543j;
        }

        /* renamed from: b */
        public C3490a m13271b(boolean z) {
            this.f10543j = z;
            return this;
        }

        public int[] getConstraints() {
            return this.f10540g == null ? new int[0] : this.f10540g;
        }

        /* renamed from: a */
        public C3490a m13269a(int... iArr) {
            this.f10540g = iArr;
            return this;
        }

        @Nullable
        public Bundle getExtras() {
            return this.f10536c;
        }

        /* renamed from: a */
        public C3490a m13263a(Bundle bundle) {
            this.f10536c = bundle;
            return this;
        }

        @NonNull
        public RetryStrategy getRetryStrategy() {
            return this.f10541h;
        }

        /* renamed from: a */
        public C3490a m13264a(RetryStrategy retryStrategy) {
            this.f10541h = retryStrategy;
            return this;
        }

        public boolean shouldReplaceCurrent() {
            return this.f10542i;
        }
    }

    @Nullable
    public C1887o getTriggerReason() {
        return null;
    }

    private C3491i(C3490a c3490a) {
        this.f10544a = c3490a.f10535b;
        this.f10552i = c3490a.f10536c == null ? null : new Bundle(c3490a.f10536c);
        this.f10545b = c3490a.f10537d;
        this.f10546c = c3490a.f10538e;
        this.f10547d = c3490a.f10541h;
        this.f10548e = c3490a.f10539f;
        this.f10549f = c3490a.f10543j;
        this.f10550g = c3490a.f10540g != null ? c3490a.f10540g : new int[0];
        this.f10551h = c3490a.f10542i;
    }

    @NonNull
    public int[] getConstraints() {
        return this.f10550g;
    }

    @Nullable
    public Bundle getExtras() {
        return this.f10552i;
    }

    @NonNull
    public RetryStrategy getRetryStrategy() {
        return this.f10547d;
    }

    public boolean shouldReplaceCurrent() {
        return this.f10551h;
    }

    @NonNull
    public String getTag() {
        return this.f10545b;
    }

    @NonNull
    public C1885m getTrigger() {
        return this.f10546c;
    }

    public int getLifetime() {
        return this.f10548e;
    }

    public boolean isRecurring() {
        return this.f10549f;
    }

    @NonNull
    public String getService() {
        return this.f10544a;
    }
}
