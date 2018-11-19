package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequest.OnProgressCallback;

/* renamed from: com.facebook.l */
class C1753l {
    /* renamed from: a */
    private final GraphRequest f4836a;
    /* renamed from: b */
    private final Handler f4837b;
    /* renamed from: c */
    private final long f4838c = FacebookSdk.m3997h();
    /* renamed from: d */
    private long f4839d;
    /* renamed from: e */
    private long f4840e;
    /* renamed from: f */
    private long f4841f;

    C1753l(Handler handler, GraphRequest graphRequest) {
        this.f4836a = graphRequest;
        this.f4837b = handler;
    }

    /* renamed from: a */
    void m6077a(long j) {
        this.f4839d += j;
        if (this.f4839d >= this.f4840e + this.f4838c || this.f4839d >= this.f4841f) {
            m6076a();
        }
    }

    /* renamed from: b */
    void m6078b(long j) {
        this.f4841f += j;
    }

    /* renamed from: a */
    void m6076a() {
        if (this.f4839d > this.f4840e) {
            Callback g = this.f4836a.m4063g();
            if (this.f4841f > 0 && (g instanceof OnProgressCallback)) {
                final long j = this.f4839d;
                final long j2 = this.f4841f;
                final OnProgressCallback onProgressCallback = (OnProgressCallback) g;
                if (this.f4837b == null) {
                    onProgressCallback.onProgress(j, j2);
                } else {
                    this.f4837b.post(new Runnable(this) {
                        /* renamed from: d */
                        final /* synthetic */ C1753l f4835d;

                        public void run() {
                            onProgressCallback.onProgress(j, j2);
                        }
                    });
                }
                this.f4840e = this.f4839d;
            }
        }
    }
}
