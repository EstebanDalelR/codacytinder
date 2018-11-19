package com.google.android.m4b.maps.p125y;

/* renamed from: com.google.android.m4b.maps.y.h */
public final class C5569h {

    /* renamed from: com.google.android.m4b.maps.y.h$a */
    public static final class C5568a {
        /* renamed from: a */
        private final String f20566a;
        /* renamed from: b */
        private C5567a f20567b;
        /* renamed from: c */
        private C5567a f20568c;
        /* renamed from: d */
        private boolean f20569d;

        /* renamed from: com.google.android.m4b.maps.y.h$a$a */
        static final class C5567a {
            /* renamed from: a */
            String f20563a;
            /* renamed from: b */
            Object f20564b;
            /* renamed from: c */
            C5567a f20565c;

            private C5567a() {
            }
        }

        private C5568a(String str) {
            this.f20567b = new C5567a();
            this.f20568c = this.f20567b;
            this.f20569d = false;
            this.f20566a = (String) C5571j.m24292a((Object) str);
        }

        /* renamed from: a */
        public final C5568a m24281a(String str, Object obj) {
            return m24276b(str, obj);
        }

        /* renamed from: a */
        public final C5568a m24282a(String str, boolean z) {
            return m24276b(str, String.valueOf(z));
        }

        /* renamed from: a */
        public final C5568a m24278a(String str, float f) {
            return m24276b(str, String.valueOf(f));
        }

        /* renamed from: a */
        public final C5568a m24279a(String str, int i) {
            return m24276b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C5568a m24280a(String str, long j) {
            return m24276b(str, String.valueOf(j));
        }

        public final String toString() {
            String str = "";
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.f20566a);
            stringBuilder.append('{');
            for (C5567a c5567a = this.f20567b.f20565c; c5567a != null; c5567a = c5567a.f20565c) {
                stringBuilder.append(str);
                str = ", ";
                if (c5567a.f20563a != null) {
                    stringBuilder.append(c5567a.f20563a);
                    stringBuilder.append('=');
                }
                stringBuilder.append(c5567a.f20564b);
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        /* renamed from: a */
        private C5567a m24275a() {
            C5567a c5567a = new C5567a();
            this.f20568c.f20565c = c5567a;
            this.f20568c = c5567a;
            return c5567a;
        }

        /* renamed from: b */
        private C5568a m24276b(String str, Object obj) {
            C5567a a = m24275a();
            a.f20564b = obj;
            a.f20563a = (String) C5571j.m24292a((Object) str);
            return this;
        }

        /* renamed from: a */
        public final C5568a m24277a(Object obj) {
            m24275a().f20564b = obj;
            return this;
        }
    }

    /* renamed from: a */
    public static boolean m24284a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C5568a m24283a(Object obj) {
        obj = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = obj.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = obj.lastIndexOf(46);
        }
        return new C5568a(obj.substring(lastIndexOf + 1));
    }

    /* renamed from: b */
    public static <T> T m24285b(T t, T t2) {
        return t != null ? t : C5571j.m24292a((Object) t2);
    }
}
