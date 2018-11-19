package retrofit;

/* renamed from: retrofit.b */
public final class C19363b {

    /* renamed from: retrofit.b$a */
    private static class C19522a implements Endpoint {
        /* renamed from: a */
        private final String f61025a;
        /* renamed from: b */
        private final String f61026b;

        C19522a(String str, String str2) {
            this.f61025a = str;
            this.f61026b = str2;
        }

        public String getUrl() {
            return this.f61025a;
        }

        public String getName() {
            return this.f61026b;
        }
    }

    /* renamed from: a */
    public static Endpoint m69542a(String str) {
        return new C19522a(str, "default");
    }
}
