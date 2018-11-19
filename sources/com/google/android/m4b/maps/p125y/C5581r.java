package com.google.android.m4b.maps.p125y;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.y.r */
public final class C5581r {

    /* renamed from: com.google.android.m4b.maps.y.r$a */
    static class C6858a<T> implements C5580q<T>, Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private T f25417a;

        C6858a(T t) {
            this.f25417a = t;
        }

        /* renamed from: a */
        public final T mo5823a() {
            return this.f25417a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6858a)) {
                return null;
            }
            return C5569h.m24284a(this.f25417a, ((C6858a) obj).f25417a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f25417a});
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Suppliers.ofInstance(");
            stringBuilder.append(this.f25417a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static <T> C5580q<T> m24321a(T t) {
        return new C6858a(t);
    }
}
