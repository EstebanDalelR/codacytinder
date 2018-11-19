package retrofit;

public interface RequestInterceptor {
    /* renamed from: a */
    public static final RequestInterceptor f60425a = new C195111();

    public interface RequestFacade {
        void addEncodedPathParam(String str, String str2);

        void addEncodedQueryParam(String str, String str2);

        void addHeader(String str, String str2);

        void addPathParam(String str, String str2);

        void addQueryParam(String str, String str2);
    }

    /* renamed from: retrofit.RequestInterceptor$1 */
    static class C195111 implements RequestInterceptor {
        public void intercept(RequestFacade requestFacade) {
        }

        C195111() {
        }
    }

    void intercept(RequestFacade requestFacade);
}
