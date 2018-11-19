package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.squareup.picasso.s */
class C6110s {
    /* renamed from: a */
    final HandlerThread f22465a = new HandlerThread("Picasso-Stats", 10);
    /* renamed from: b */
    final Cache f22466b;
    /* renamed from: c */
    final Handler f22467c;
    /* renamed from: d */
    long f22468d;
    /* renamed from: e */
    long f22469e;
    /* renamed from: f */
    long f22470f;
    /* renamed from: g */
    long f22471g;
    /* renamed from: h */
    long f22472h;
    /* renamed from: i */
    long f22473i;
    /* renamed from: j */
    long f22474j;
    /* renamed from: k */
    long f22475k;
    /* renamed from: l */
    int f22476l;
    /* renamed from: m */
    int f22477m;
    /* renamed from: n */
    int f22478n;

    /* renamed from: com.squareup.picasso.s$a */
    private static class C6109a extends Handler {
        /* renamed from: a */
        private final C6110s f22464a;

        public C6109a(Looper looper, C6110s c6110s) {
            super(looper);
            this.f22464a = c6110s;
        }

        public void handleMessage(final Message message) {
            switch (message.what) {
                case 0:
                    this.f22464a.m26553c();
                    return;
                case 1:
                    this.f22464a.m26555d();
                    return;
                case 2:
                    this.f22464a.m26551b((long) message.arg1);
                    return;
                case 3:
                    this.f22464a.m26554c((long) message.arg1);
                    return;
                case 4:
                    this.f22464a.m26549a((Long) message.obj);
                    return;
                default:
                    Picasso.f22316a.post(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C6109a f22463b;

                        public void run() {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unhandled stats message.");
                            stringBuilder.append(message.what);
                            throw new AssertionError(stringBuilder.toString());
                        }
                    });
                    return;
            }
        }
    }

    C6110s(Cache cache) {
        this.f22466b = cache;
        this.f22465a.start();
        C6120v.m26576a(this.f22465a.getLooper());
        this.f22467c = new C6109a(this.f22465a.getLooper(), this);
    }

    /* renamed from: a */
    void m26548a(Bitmap bitmap) {
        m26545a(bitmap, 2);
    }

    /* renamed from: b */
    void m26552b(Bitmap bitmap) {
        m26545a(bitmap, 3);
    }

    /* renamed from: a */
    void m26547a(long j) {
        this.f22467c.sendMessage(this.f22467c.obtainMessage(4, Long.valueOf(j)));
    }

    /* renamed from: a */
    void m26546a() {
        this.f22467c.sendEmptyMessage(0);
    }

    /* renamed from: b */
    void m26550b() {
        this.f22467c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    void m26553c() {
        this.f22468d++;
    }

    /* renamed from: d */
    void m26555d() {
        this.f22469e++;
    }

    /* renamed from: a */
    void m26549a(Long l) {
        this.f22476l++;
        this.f22470f += l.longValue();
        this.f22473i = C6110s.m26544a(this.f22476l, this.f22470f);
    }

    /* renamed from: b */
    void m26551b(long j) {
        this.f22477m++;
        this.f22471g += j;
        this.f22474j = C6110s.m26544a(this.f22477m, this.f22471g);
    }

    /* renamed from: c */
    void m26554c(long j) {
        this.f22478n++;
        this.f22472h += j;
        this.f22475k = C6110s.m26544a(this.f22477m, this.f22472h);
    }

    /* renamed from: e */
    C6111t m26556e() {
        int maxSize = this.f22466b.maxSize();
        int size = this.f22466b.size();
        long j = this.f22468d;
        long j2 = this.f22469e;
        long j3 = this.f22470f;
        long j4 = this.f22471g;
        long j5 = this.f22472h;
        long j6 = this.f22473i;
        long j7 = this.f22474j;
        long j8 = this.f22475k;
        int i = this.f22476l;
        long j9 = j8;
        int i2 = this.f22477m;
        int i3 = i2;
        return new C6111t(maxSize, size, j, j2, j3, j4, j5, j6, j7, j9, i, i3, this.f22478n, System.currentTimeMillis());
    }

    /* renamed from: a */
    private void m26545a(Bitmap bitmap, int i) {
        this.f22467c.sendMessage(this.f22467c.obtainMessage(i, C6120v.m26565a(bitmap), 0));
    }

    /* renamed from: a */
    private static long m26544a(int i, long j) {
        return j / ((long) i);
    }
}
