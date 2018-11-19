package com.google.android.m4b.maps.p109i;

/* renamed from: com.google.android.m4b.maps.i.a */
public abstract class C5435a<T> {
    /* renamed from: c */
    private static final Object f20383c = new Object();
    /* renamed from: d */
    private static C5434a f20384d = null;
    /* renamed from: e */
    private static int f20385e = 0;
    /* renamed from: f */
    private static String f20386f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    /* renamed from: a */
    protected final String f20387a;
    /* renamed from: b */
    protected final T f20388b;
    /* renamed from: g */
    private T f20389g = null;

    /* renamed from: com.google.android.m4b.maps.i.a$a */
    interface C5434a {
        /* renamed from: a */
        Boolean m23649a();

        /* renamed from: b */
        Long m23650b();

        /* renamed from: c */
        Integer m23651c();

        /* renamed from: d */
        String m23652d();
    }

    /* renamed from: com.google.android.m4b.maps.i.a$1 */
    class C66941 extends C5435a<Boolean> {
        C66941(String str, Boolean bool) {
            super(str, bool);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5426a(String str) {
            str = null;
            return str.m23649a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.i.a$2 */
    class C66952 extends C5435a<Long> {
        C66952(String str, Long l) {
            super(str, l);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5426a(String str) {
            str = null;
            return str.m23650b();
        }
    }

    /* renamed from: com.google.android.m4b.maps.i.a$3 */
    class C66963 extends C5435a<Integer> {
        C66963(String str, Integer num) {
            super(str, num);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5426a(String str) {
            str = null;
            return str.m23651c();
        }
    }

    /* renamed from: com.google.android.m4b.maps.i.a$4 */
    class C66974 extends C5435a<String> {
        C66974(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5426a(String str) {
            str = null;
            return str.m23652d();
        }
    }

    /* renamed from: a */
    public static int m23653a() {
        return 0;
    }

    /* renamed from: b */
    public static boolean m23658b() {
        return false;
    }

    /* renamed from: a */
    protected abstract T mo5426a(String str);

    protected C5435a(String str, T t) {
        this.f20387a = str;
        this.f20388b = t;
    }

    /* renamed from: c */
    public final T m23660c() {
        return mo5426a(this.f20387a);
    }

    /* renamed from: a */
    public static C5435a<Boolean> m23657a(String str, boolean z) {
        return new C66941(str, Boolean.valueOf(false));
    }

    /* renamed from: a */
    public static C5435a<Long> m23655a(String str, Long l) {
        return new C66952(str, l);
    }

    /* renamed from: a */
    public static C5435a<Integer> m23654a(String str, Integer num) {
        return new C66963(str, num);
    }

    /* renamed from: a */
    public static C5435a<String> m23656a(String str, String str2) {
        return new C66974(str, str2);
    }
}
