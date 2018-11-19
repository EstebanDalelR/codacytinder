package io.fabric.sdk.android;

public interface InitializationCallback<T> {
    /* renamed from: d */
    public static final InitializationCallback f48296d = new C17320a();

    /* renamed from: io.fabric.sdk.android.InitializationCallback$a */
    public static class C17320a implements InitializationCallback<Object> {
        public void failure(Exception exception) {
        }

        public void success(Object obj) {
        }

        private C17320a() {
        }
    }

    void failure(Exception exception);

    void success(T t);
}
