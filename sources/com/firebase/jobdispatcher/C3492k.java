package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.firebase.jobdispatcher.k */
final class C3492k implements JobParameters {
    @NonNull
    /* renamed from: a */
    private final String f10553a;
    @NonNull
    /* renamed from: b */
    private final String f10554b;
    @NonNull
    /* renamed from: c */
    private final C1885m f10555c;
    /* renamed from: d */
    private final boolean f10556d;
    /* renamed from: e */
    private final int f10557e;
    @NonNull
    /* renamed from: f */
    private final int[] f10558f;
    @NonNull
    /* renamed from: g */
    private final Bundle f10559g;
    /* renamed from: h */
    private final RetryStrategy f10560h;
    /* renamed from: i */
    private final boolean f10561i;
    /* renamed from: j */
    private final C1887o f10562j;

    /* renamed from: com.firebase.jobdispatcher.k$a */
    static final class C1883a {
        @NonNull
        /* renamed from: a */
        private String f5114a;
        @NonNull
        /* renamed from: b */
        private String f5115b;
        @NonNull
        /* renamed from: c */
        private C1885m f5116c;
        /* renamed from: d */
        private boolean f5117d;
        /* renamed from: e */
        private int f5118e;
        @NonNull
        /* renamed from: f */
        private int[] f5119f;
        @NonNull
        /* renamed from: g */
        private final Bundle f5120g = new Bundle();
        /* renamed from: h */
        private RetryStrategy f5121h;
        /* renamed from: i */
        private boolean f5122i;
        /* renamed from: j */
        private C1887o f5123j;

        C1883a() {
        }

        /* renamed from: a */
        C3492k m6630a() {
            if (!(this.f5114a == null || this.f5115b == null)) {
                if (this.f5116c != null) {
                    return new C3492k();
                }
            }
            throw new IllegalArgumentException("Required fields were not populated.");
        }

        /* renamed from: a */
        public C1883a m6627a(@NonNull String str) {
            this.f5114a = str;
            return this;
        }

        /* renamed from: b */
        public C1883a m6631b(@NonNull String str) {
            this.f5115b = str;
            return this;
        }

        /* renamed from: a */
        public C1883a m6625a(@NonNull C1885m c1885m) {
            this.f5116c = c1885m;
            return this;
        }

        /* renamed from: a */
        public C1883a m6628a(boolean z) {
            this.f5117d = z;
            return this;
        }

        /* renamed from: a */
        public C1883a m6622a(int i) {
            this.f5118e = i;
            return this;
        }

        /* renamed from: a */
        public C1883a m6629a(@NonNull int[] iArr) {
            this.f5119f = iArr;
            return this;
        }

        /* renamed from: a */
        public C1883a m6623a(Bundle bundle) {
            if (bundle != null) {
                this.f5120g.putAll(bundle);
            }
            return this;
        }

        /* renamed from: a */
        public C1883a m6624a(RetryStrategy retryStrategy) {
            this.f5121h = retryStrategy;
            return this;
        }

        /* renamed from: b */
        public C1883a m6632b(boolean z) {
            this.f5122i = z;
            return this;
        }

        /* renamed from: a */
        public C1883a m6626a(C1887o c1887o) {
            this.f5123j = c1887o;
            return this;
        }
    }

    private C3492k(C1883a c1883a) {
        this.f10553a = c1883a.f5114a;
        this.f10554b = c1883a.f5115b;
        this.f10555c = c1883a.f5116c;
        this.f10560h = c1883a.f5121h;
        this.f10556d = c1883a.f5117d;
        this.f10557e = c1883a.f5118e;
        this.f10558f = c1883a.f5119f;
        this.f10559g = c1883a.f5120g;
        this.f10561i = c1883a.f5122i;
        this.f10562j = c1883a.f5123j;
    }

    @NonNull
    public String getService() {
        return this.f10554b;
    }

    @NonNull
    public String getTag() {
        return this.f10553a;
    }

    @NonNull
    public C1885m getTrigger() {
        return this.f10555c;
    }

    public int getLifetime() {
        return this.f10557e;
    }

    public boolean isRecurring() {
        return this.f10556d;
    }

    @NonNull
    public int[] getConstraints() {
        return this.f10558f;
    }

    @NonNull
    public Bundle getExtras() {
        return this.f10559g;
    }

    @NonNull
    public RetryStrategy getRetryStrategy() {
        return this.f10560h;
    }

    public boolean shouldReplaceCurrent() {
        return this.f10561i;
    }

    public C1887o getTriggerReason() {
        return this.f10562j;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass().equals(obj.getClass())) {
                C3492k c3492k = (C3492k) obj;
                if (!this.f10553a.equals(c3492k.f10553a) || this.f10554b.equals(c3492k.f10554b) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f10553a.hashCode() * 31) + this.f10554b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JobInvocation{tag='");
        stringBuilder.append(JSONObject.quote(this.f10553a));
        stringBuilder.append('\'');
        stringBuilder.append(", service='");
        stringBuilder.append(this.f10554b);
        stringBuilder.append('\'');
        stringBuilder.append(", trigger=");
        stringBuilder.append(this.f10555c);
        stringBuilder.append(", recurring=");
        stringBuilder.append(this.f10556d);
        stringBuilder.append(", lifetime=");
        stringBuilder.append(this.f10557e);
        stringBuilder.append(", constraints=");
        stringBuilder.append(Arrays.toString(this.f10558f));
        stringBuilder.append(", extras=");
        stringBuilder.append(this.f10559g);
        stringBuilder.append(", retryStrategy=");
        stringBuilder.append(this.f10560h);
        stringBuilder.append(", replaceCurrent=");
        stringBuilder.append(this.f10561i);
        stringBuilder.append(", triggerReason=");
        stringBuilder.append(this.f10562j);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
