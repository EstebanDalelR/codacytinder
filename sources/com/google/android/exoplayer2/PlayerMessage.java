package com.google.android.exoplayer2;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2289a;

public final class PlayerMessage {
    /* renamed from: a */
    private final Target f5457a;
    /* renamed from: b */
    private final Sender f5458b;
    /* renamed from: c */
    private final C2165q f5459c;
    /* renamed from: d */
    private int f5460d;
    /* renamed from: e */
    private Object f5461e;
    /* renamed from: f */
    private Handler f5462f;
    /* renamed from: g */
    private int f5463g;
    /* renamed from: h */
    private long f5464h = 1;
    /* renamed from: i */
    private boolean f5465i = true;
    /* renamed from: j */
    private boolean f5466j;
    /* renamed from: k */
    private boolean f5467k;
    /* renamed from: l */
    private boolean f5468l;
    /* renamed from: m */
    private boolean f5469m;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, C2165q c2165q, int i, Handler handler) {
        this.f5458b = sender;
        this.f5457a = target;
        this.f5459c = c2165q;
        this.f5462f = handler;
        this.f5463g = i;
    }

    /* renamed from: a */
    public C2165q m7224a() {
        return this.f5459c;
    }

    /* renamed from: b */
    public Target m7226b() {
        return this.f5457a;
    }

    /* renamed from: a */
    public PlayerMessage m7222a(int i) {
        C2289a.m8313b(this.f5466j ^ 1);
        this.f5460d = i;
        return this;
    }

    /* renamed from: c */
    public int m7227c() {
        return this.f5460d;
    }

    /* renamed from: a */
    public PlayerMessage m7223a(@Nullable Object obj) {
        C2289a.m8313b(this.f5466j ^ 1);
        this.f5461e = obj;
        return this;
    }

    /* renamed from: d */
    public Object m7228d() {
        return this.f5461e;
    }

    /* renamed from: e */
    public Handler m7229e() {
        return this.f5462f;
    }

    /* renamed from: f */
    public long m7230f() {
        return this.f5464h;
    }

    /* renamed from: g */
    public int m7231g() {
        return this.f5463g;
    }

    /* renamed from: h */
    public boolean m7232h() {
        return this.f5465i;
    }

    /* renamed from: i */
    public PlayerMessage m7233i() {
        C2289a.m8313b(this.f5466j ^ true);
        if (this.f5464h == -9223372036854775807L) {
            C2289a.m8311a(this.f5465i);
        }
        this.f5466j = true;
        this.f5458b.sendMessage(this);
        return this;
    }

    /* renamed from: j */
    public synchronized boolean m7234j() {
        return this.f5469m;
    }

    /* renamed from: k */
    public synchronized boolean m7235k() throws InterruptedException {
        C2289a.m8313b(this.f5466j);
        C2289a.m8313b(this.f5462f.getLooper().getThread() != Thread.currentThread());
        while (!this.f5468l) {
            wait();
        }
        return this.f5467k;
    }

    /* renamed from: a */
    public synchronized void m7225a(boolean z) {
        this.f5467k = z | this.f5467k;
        this.f5468l = true;
        notifyAll();
    }
}
