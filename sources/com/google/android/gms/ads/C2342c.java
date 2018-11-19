package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.internal.ake;
import com.google.android.gms.internal.akf;
import java.util.Date;

/* renamed from: com.google.android.gms.ads.c */
public final class C2342c {
    /* renamed from: a */
    private final ake f7032a;

    /* renamed from: com.google.android.gms.ads.c$a */
    public static final class C2341a {
        /* renamed from: a */
        private final akf f7031a = new akf();

        public C2341a() {
            this.f7031a.b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        /* renamed from: a */
        public final C2341a m8552a(int i) {
            this.f7031a.a(i);
            return this;
        }

        /* renamed from: a */
        public final C2341a m8553a(Location location) {
            this.f7031a.a(location);
            return this;
        }

        /* renamed from: a */
        public final C2341a m8554a(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f7031a.a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f7031a.c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        /* renamed from: a */
        public final C2341a m8555a(String str) {
            this.f7031a.a(str);
            return this;
        }

        /* renamed from: a */
        public final C2341a m8556a(Date date) {
            this.f7031a.a(date);
            return this;
        }

        /* renamed from: a */
        public final C2341a m8557a(boolean z) {
            this.f7031a.a(z);
            return this;
        }

        /* renamed from: a */
        public final C2342c m8558a() {
            return new C2342c();
        }

        /* renamed from: b */
        public final C2341a m8559b(String str) {
            this.f7031a.b(str);
            return this;
        }

        /* renamed from: b */
        public final C2341a m8560b(boolean z) {
            this.f7031a.b(z);
            return this;
        }
    }

    private C2342c(C2341a c2341a) {
        this.f7032a = new ake(c2341a.f7031a);
    }

    /* renamed from: a */
    public final ake m8561a() {
        return this.f7032a;
    }
}
