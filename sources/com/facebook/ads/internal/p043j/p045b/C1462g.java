package com.facebook.ads.internal.p043j.p045b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.p043j.p045b.p046a.C3304b;
import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.j.b.g */
final class C1462g {
    /* renamed from: a */
    private final AtomicInteger f4016a = new AtomicInteger(0);
    /* renamed from: b */
    private final String f4017b;
    /* renamed from: c */
    private volatile C3307e f4018c;
    /* renamed from: d */
    private final List<C1452b> f4019d = new CopyOnWriteArrayList();
    /* renamed from: e */
    private final C1452b f4020e;
    /* renamed from: f */
    private final C1453c f4021f;

    /* renamed from: com.facebook.ads.internal.j.b.g$a */
    private static final class C3308a extends Handler implements C1452b {
        /* renamed from: a */
        private final String f10089a;
        /* renamed from: b */
        private final List<C1452b> f10090b;

        public C3308a(String str, List<C1452b> list) {
            super(Looper.getMainLooper());
            this.f10089a = str;
            this.f10090b = list;
        }

        /* renamed from: a */
        public void mo1776a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        public void handleMessage(Message message) {
            for (C1452b a : this.f10090b) {
                a.mo1776a((File) message.obj, this.f10089a, message.arg1);
            }
        }
    }

    public C1462g(String str, C1453c c1453c) {
        this.f4017b = (String) C1463j.m5119a(str);
        this.f4021f = (C1453c) C1463j.m5119a(c1453c);
        this.f4020e = new C3308a(str, this.f4019d);
    }

    /* renamed from: c */
    private synchronized void m5113c() {
        this.f4018c = this.f4018c == null ? m5115e() : this.f4018c;
    }

    /* renamed from: d */
    private synchronized void m5114d() {
        if (this.f4016a.decrementAndGet() <= 0) {
            this.f4018c.m5132a();
            this.f4018c = null;
        }
    }

    /* renamed from: e */
    private C3307e m5115e() {
        C3307e c3307e = new C3307e(new C3309h(this.f4017b), new C3304b(this.f4021f.m5083a(this.f4017b), this.f4021f.f3992c));
        c3307e.m12763a(this.f4020e);
        return c3307e;
    }

    /* renamed from: a */
    public void m5116a() {
        this.f4019d.clear();
        if (this.f4018c != null) {
            this.f4018c.m12763a(null);
            this.f4018c.m5132a();
            this.f4018c = null;
        }
        this.f4016a.set(0);
    }

    /* renamed from: a */
    public void m5117a(C1454d c1454d, Socket socket) {
        m5113c();
        try {
            this.f4016a.incrementAndGet();
            this.f4018c.m12764a(c1454d, socket);
        } finally {
            m5114d();
        }
    }

    /* renamed from: b */
    public int m5118b() {
        return this.f4016a.get();
    }
}
