package retrofit;

public interface Profiler<T> {

    /* renamed from: retrofit.Profiler$a */
    public static final class C19352a {
        /* renamed from: a */
        private final String f60420a;
        /* renamed from: b */
        private final String f60421b;
        /* renamed from: c */
        private final String f60422c;
        /* renamed from: d */
        private final long f60423d;
        /* renamed from: e */
        private final String f60424e;

        public C19352a(String str, String str2, String str3, long j, String str4) {
            this.f60420a = str;
            this.f60421b = str2;
            this.f60422c = str3;
            this.f60423d = j;
            this.f60424e = str4;
        }
    }

    void afterCall(C19352a c19352a, long j, int i, T t);

    T beforeCall();
}
