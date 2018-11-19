package com.tinder.analytics.performance;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.analytics.performance.m */
public class C6242m {
    /* renamed from: a */
    private Map<String, Object> f22818a;

    /* renamed from: com.tinder.analytics.performance.m$a */
    public static class C6241a {
        @NonNull
        /* renamed from: a */
        private final Map<String, Object> f22817a = new HashMap();

        /* renamed from: a */
        public final C6241a m26949a(boolean z) {
            this.f22817a.put("hasCompleted", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: a */
        public final C6241a m26947a(int i) {
            this.f22817a.put("numRecs", Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C6241a m26946a(float f) {
            this.f22817a.put("distance", Float.valueOf(f));
            return this;
        }

        /* renamed from: b */
        public final C6241a m26951b(int i) {
            this.f22817a.put("ageMax", Integer.valueOf(i));
            return this;
        }

        /* renamed from: c */
        public final C6241a m26953c(int i) {
            this.f22817a.put("ageMin", Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C6241a m26948a(String str) {
            this.f22817a.put(InstrumentationConstantsKt.FIELD_UID, str);
            return this;
        }

        /* renamed from: b */
        public final C6241a m26952b(String str) {
            this.f22817a.put(ManagerWebServices.PARAM_LOCALE, str);
            return this;
        }

        /* renamed from: d */
        public final C6241a m26955d(int i) {
            this.f22817a.put("numResults", Integer.valueOf(i));
            return this;
        }

        /* renamed from: c */
        public final C6241a m26954c(String str) {
            this.f22817a.put("apiMessage", str);
            return this;
        }

        /* renamed from: a */
        public C6242m m26950a() {
            return new C6242m();
        }
    }

    private C6242m(@NonNull C6241a c6241a) {
        this.f22818a = c6241a.f22817a;
    }

    public C6242m(Map<String, Object> map) {
        this.f22818a = map;
    }

    /* renamed from: a */
    public static C6241a m26956a() {
        return new C6241a();
    }

    @NonNull
    /* renamed from: b */
    public Map<String, Object> m26957b() {
        return this.f22818a;
    }
}
