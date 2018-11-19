package com.squareup.okhttp.internal.framed;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.squareup.okhttp.internal.framed.h */
public final class C6037h {
    /* renamed from: a */
    private final CountDownLatch f22126a = new CountDownLatch(1);
    /* renamed from: b */
    private long f22127b = -1;
    /* renamed from: c */
    private long f22128c = -1;

    C6037h() {
    }

    /* renamed from: a */
    void m26091a() {
        if (this.f22127b != -1) {
            throw new IllegalStateException();
        }
        this.f22127b = System.nanoTime();
    }

    /* renamed from: b */
    void m26092b() {
        if (this.f22128c == -1) {
            if (this.f22127b != -1) {
                this.f22128c = System.nanoTime();
                this.f22126a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    void m26093c() {
        if (this.f22128c == -1) {
            if (this.f22127b != -1) {
                this.f22128c = this.f22127b - 1;
                this.f22126a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }
}
