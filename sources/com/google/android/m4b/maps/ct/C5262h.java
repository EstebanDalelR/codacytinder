package com.google.android.m4b.maps.ct;

import com.google.android.m4b.maps.ct.C8085j.C6651g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.ct.h */
public final class C5262h {
    /* renamed from: a */
    private static volatile boolean f19564a = false;
    /* renamed from: c */
    private static final C5262h f19565c = new C5262h((byte) 0);
    /* renamed from: b */
    private final Map<C5261a, C6651g<?, ?>> f19566b;

    /* renamed from: com.google.android.m4b.maps.ct.h$a */
    static final class C5261a {
        /* renamed from: a */
        private final Object f19562a;
        /* renamed from: b */
        private final int f19563b;

        C5261a(Object obj, int i) {
            this.f19562a = obj;
            this.f19563b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f19562a) * 65535) + this.f19563b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5261a)) {
                return false;
            }
            C5261a c5261a = (C5261a) obj;
            if (this.f19562a == c5261a.f19562a && this.f19563b == c5261a.f19563b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static C5262h m23371a() {
        return f19565c;
    }

    /* renamed from: a */
    public final <ContainingType extends C6656q> C6651g<ContainingType, ?> m23372a(ContainingType containingType, int i) {
        return (C6651g) this.f19566b.get(new C5261a(containingType, i));
    }

    C5262h() {
        this.f19566b = new HashMap();
    }

    private C5262h(byte b) {
        this.f19566b = Collections.emptyMap();
    }
}
