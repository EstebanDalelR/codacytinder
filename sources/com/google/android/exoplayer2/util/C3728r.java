package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.exoplayer2.util.r */
final class C3728r implements HandlerWrapper {
    /* renamed from: a */
    private final Handler f11769a;

    public C3728r(Handler handler) {
        this.f11769a = handler;
    }

    public Looper getLooper() {
        return this.f11769a.getLooper();
    }

    public Message obtainMessage(int i) {
        return this.f11769a.obtainMessage(i);
    }

    public Message obtainMessage(int i, Object obj) {
        return this.f11769a.obtainMessage(i, obj);
    }

    public Message obtainMessage(int i, int i2, int i3) {
        return this.f11769a.obtainMessage(i, i2, i3);
    }

    public Message obtainMessage(int i, int i2, int i3, Object obj) {
        return this.f11769a.obtainMessage(i, i2, i3, obj);
    }

    public boolean sendEmptyMessage(int i) {
        return this.f11769a.sendEmptyMessage(i);
    }

    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.f11769a.sendEmptyMessageAtTime(i, j);
    }

    public void removeMessages(int i) {
        this.f11769a.removeMessages(i);
    }

    public void removeCallbacksAndMessages(Object obj) {
        this.f11769a.removeCallbacksAndMessages(obj);
    }

    public boolean post(Runnable runnable) {
        return this.f11769a.post(runnable);
    }

    public boolean postDelayed(Runnable runnable, long j) {
        return this.f11769a.postDelayed(runnable, j);
    }
}
