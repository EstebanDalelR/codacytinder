package io.fabric.sdk.android;

import android.util.Log;

/* renamed from: io.fabric.sdk.android.b */
public class C17321b implements Logger {
    /* renamed from: a */
    private int f53023a;

    public C17321b(int i) {
        this.f53023a = i;
    }

    public C17321b() {
        this.f53023a = 4;
    }

    public boolean isLoggable(String str, int i) {
        return this.f53023a <= i ? true : null;
    }

    public int getLogLevel() {
        return this.f53023a;
    }

    public void setLogLevel(int i) {
        this.f53023a = i;
    }

    /* renamed from: d */
    public void mo12792d(String str, String str2, Throwable th) {
        if (isLoggable(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: v */
    public void mo12803v(String str, String str2, Throwable th) {
        if (isLoggable(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: i */
    public void mo12797i(String str, String str2, Throwable th) {
        if (isLoggable(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: w */
    public void mo12805w(String str, String str2, Throwable th) {
        if (isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo12794e(String str, String str2, Throwable th) {
        if (isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo12791d(String str, String str2) {
        mo12792d(str, str2, null);
    }

    /* renamed from: v */
    public void mo12802v(String str, String str2) {
        mo12803v(str, str2, null);
    }

    /* renamed from: i */
    public void mo12796i(String str, String str2) {
        mo12797i(str, str2, null);
    }

    /* renamed from: w */
    public void mo12804w(String str, String str2) {
        mo12805w(str, str2, null);
    }

    /* renamed from: e */
    public void mo12793e(String str, String str2) {
        mo12794e(str, str2, null);
    }

    public void log(int i, String str, String str2) {
        log(i, str, str2, false);
    }

    public void log(int i, String str, String str2, boolean z) {
        if (z || isLoggable(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
