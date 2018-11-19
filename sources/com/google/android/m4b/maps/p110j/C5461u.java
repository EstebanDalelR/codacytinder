package com.google.android.m4b.maps.p110j;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.j.u */
public final class C5461u {

    /* renamed from: com.google.android.m4b.maps.j.u$a */
    public static final class C5460a {
        /* renamed from: a */
        private final List<String> f20447a;
        /* renamed from: b */
        private final Object f20448b;

        private C5460a(Object obj) {
            this.f20448b = C5462v.m23767a(obj);
            this.f20447a = new ArrayList();
        }

        /* renamed from: a */
        public final C5460a m23764a(String str, Object obj) {
            List list = this.f20447a;
            str = (String) C5462v.m23767a((Object) str);
            obj = String.valueOf(String.valueOf(obj));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(obj).length());
            stringBuilder.append(str);
            stringBuilder.append("=");
            stringBuilder.append(obj);
            list.add(stringBuilder.toString());
            return this;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(100);
            stringBuilder.append(this.f20448b.getClass().getSimpleName());
            stringBuilder.append('{');
            int size = this.f20447a.size();
            for (int i = 0; i < size; i++) {
                stringBuilder.append((String) this.f20447a.get(i));
                if (i < size - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static boolean m23766a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C5460a m23765a(Object obj) {
        return new C5460a(obj);
    }
}
