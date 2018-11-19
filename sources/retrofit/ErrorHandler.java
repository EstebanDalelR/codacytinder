package retrofit;

public interface ErrorHandler {
    /* renamed from: a */
    public static final ErrorHandler f60419a = new C195101();

    /* renamed from: retrofit.ErrorHandler$1 */
    static class C195101 implements ErrorHandler {
        public Throwable handleError(RetrofitError retrofitError) {
            return retrofitError;
        }

        C195101() {
        }
    }

    Throwable handleError(RetrofitError retrofitError);
}
