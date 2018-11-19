package com.tinder.managers;

import com.tinder.events.EventLoggedIn;
import com.tinder.events.EventUnregisterManagers;
import com.tinder.utils.ad;
import de.greenrobot.event.C2664c;

public class bj {
    /* renamed from: a */
    private final bk f8337a;
    /* renamed from: b */
    private final C2664c f8338b;
    /* renamed from: c */
    private boolean f8339c = this.f8337a.m14919C();
    /* renamed from: d */
    private boolean f8340d = this.f8337a.m14915A();
    /* renamed from: e */
    private boolean f8341e = this.f8337a.m14976h();
    /* renamed from: f */
    private boolean f8342f = this.f8337a.m14980i();
    /* renamed from: g */
    private float f8343g = this.f8337a.m14924F();
    /* renamed from: h */
    private int f8344h = this.f8337a.m14920D();
    /* renamed from: i */
    private int f8345i = this.f8337a.m14922E();
    /* renamed from: j */
    private boolean f8346j = this.f8337a.m14927G();
    /* renamed from: k */
    private boolean f8347k = this.f8337a.m14929H();
    /* renamed from: l */
    private boolean f8348l = this.f8337a.m14984k();
    /* renamed from: m */
    private boolean f8349m = this.f8337a.m14986l();
    /* renamed from: n */
    private boolean f8350n = this.f8337a.m14917B();

    public bj(bk bkVar, C2664c c2664c) {
        this.f8337a = bkVar;
        this.f8338b = c2664c;
        this.f8338b.m10254a((Object) this);
    }

    public void onEvent(EventLoggedIn eventLoggedIn) {
        m10135b(true);
    }

    public void onEvent(EventUnregisterManagers eventUnregisterManagers) {
        this.f8338b.m10259c(this);
    }

    /* renamed from: a */
    public boolean m10132a() {
        return this.f8348l;
    }

    /* renamed from: a */
    public void m10131a(boolean z) {
        this.f8348l = z;
        this.f8337a.m14974g(z);
    }

    /* renamed from: b */
    public void m10135b(boolean z) {
        this.f8339c = z;
        this.f8337a.m14987m(z);
    }

    /* renamed from: b */
    public float m10133b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("distance=");
        stringBuilder.append(this.f8343g);
        ad.m10190a(stringBuilder.toString());
        return this.f8343g;
    }

    /* renamed from: a */
    void m10129a(float f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("distanceInMiles=");
        stringBuilder.append(f);
        ad.m10190a(stringBuilder.toString());
        this.f8343g = f;
        this.f8337a.m14954a(f);
    }

    /* renamed from: c */
    public int m10136c() {
        return this.f8344h;
    }

    /* renamed from: a */
    void m10130a(int i) {
        this.f8344h = i;
        this.f8337a.m14962b(this.f8344h);
    }

    /* renamed from: d */
    public int m10138d() {
        return this.f8345i;
    }

    /* renamed from: b */
    void m10134b(int i) {
        this.f8345i = i;
        this.f8337a.m14964c(i);
    }

    /* renamed from: c */
    public void m10137c(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("areFemalesLiked=");
        stringBuilder.append(z);
        ad.m10190a(stringBuilder.toString());
        this.f8346j = z;
        this.f8337a.m14991o(z);
    }

    /* renamed from: e */
    public boolean m10141e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("areFemalesLiked=");
        stringBuilder.append(this.f8346j);
        ad.m10190a(stringBuilder.toString());
        return this.f8346j;
    }

    /* renamed from: d */
    public void m10139d(boolean z) {
        this.f8347k = z;
        this.f8337a.m14994p(z);
    }

    /* renamed from: f */
    public boolean m10143f() {
        return this.f8347k;
    }

    /* renamed from: g */
    public boolean m10145g() {
        return this.f8349m;
    }

    /* renamed from: e */
    void m10140e(boolean z) {
        this.f8349m = z;
        this.f8337a.m14975h(this.f8349m);
    }

    /* renamed from: h */
    public boolean m10146h() {
        return this.f8340d;
    }

    /* renamed from: f */
    public void m10142f(boolean z) {
        this.f8340d = z;
        this.f8337a.m14983k(z);
    }

    /* renamed from: g */
    public void m10144g(boolean z) {
        this.f8350n = z;
        this.f8337a.m14985l(z);
    }
}
