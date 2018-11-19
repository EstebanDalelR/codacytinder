package io.fabric.sdk.android;

public interface Logger {
    /* renamed from: d */
    void mo12791d(String str, String str2);

    /* renamed from: d */
    void mo12792d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo12793e(String str, String str2);

    /* renamed from: e */
    void mo12794e(String str, String str2, Throwable th);

    int getLogLevel();

    /* renamed from: i */
    void mo12796i(String str, String str2);

    /* renamed from: i */
    void mo12797i(String str, String str2, Throwable th);

    boolean isLoggable(String str, int i);

    void log(int i, String str, String str2);

    void log(int i, String str, String str2, boolean z);

    void setLogLevel(int i);

    /* renamed from: v */
    void mo12802v(String str, String str2);

    /* renamed from: v */
    void mo12803v(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo12804w(String str, String str2);

    /* renamed from: w */
    void mo12805w(String str, String str2, Throwable th);
}
