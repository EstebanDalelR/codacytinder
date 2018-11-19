package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import com.google.android.gms.internal.ake;
import com.google.android.gms.internal.akf;

/* renamed from: com.google.android.gms.ads.doubleclick.a */
public final class C2345a {
    /* renamed from: a */
    private final ake f7047a;

    /* renamed from: com.google.android.gms.ads.doubleclick.a$a */
    public static final class C2344a {
        /* renamed from: a */
        private final akf f7046a = new akf();

        /* renamed from: a */
        public final C2344a m8568a(Location location) {
            this.f7046a.a(location);
            return this;
        }

        /* renamed from: a */
        public final C2344a m8569a(String str) {
            this.f7046a.b(str);
            return this;
        }

        /* renamed from: a */
        public final C2344a m8570a(String str, String str2) {
            this.f7046a.a(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C2345a m8571a() {
            return new C2345a();
        }
    }

    private C2345a(C2344a c2344a) {
        this.f7047a = new ake(c2344a.f7046a);
    }

    /* renamed from: a */
    public final ake m8572a() {
        return this.f7047a;
    }
}
