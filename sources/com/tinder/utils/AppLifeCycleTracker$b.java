package com.tinder.utils;

import java.util.Timer;
import java.util.TimerTask;

class AppLifeCycleTracker$b {
    /* renamed from: a */
    private boolean f47593a = false;
    /* renamed from: b */
    private AppLifeCycleTracker$a f47594b;
    /* renamed from: c */
    private Timer f47595c;
    /* renamed from: d */
    private TimerTask f47596d;

    /* renamed from: com.tinder.utils.AppLifeCycleTracker$b$1 */
    class C153501 extends TimerTask {
        /* renamed from: a */
        final /* synthetic */ AppLifeCycleTracker$b f47592a;

        C153501(AppLifeCycleTracker$b appLifeCycleTracker$b) {
            this.f47592a = appLifeCycleTracker$b;
        }

        public void run() {
            this.f47592a.f47594b.mo12684a();
        }
    }

    AppLifeCycleTracker$b(AppLifeCycleTracker$a appLifeCycleTracker$a) {
        this.f47594b = appLifeCycleTracker$a;
    }

    /* renamed from: c */
    private void m57569c() {
        this.f47595c = new Timer();
        this.f47596d = new C153501(this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting timer timertask=");
        stringBuilder.append(this.f47596d.toString());
        stringBuilder.append(", timer=");
        stringBuilder.append(this.f47595c.toString());
        ad.a(stringBuilder.toString());
        this.f47595c.schedule(this.f47596d, 600);
        this.f47593a = true;
    }

    /* renamed from: a */
    synchronized void m57571a() {
        if (!this.f47593a) {
            m57569c();
        }
    }

    /* renamed from: b */
    synchronized void m57572b() {
        this.f47593a = false;
        m57570d();
    }

    /* renamed from: d */
    private void m57570d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cancelling timer? timer = ");
        stringBuilder.append(this.f47595c);
        stringBuilder.append(", and timer task=");
        stringBuilder.append(this.f47596d);
        ad.a(stringBuilder.toString());
        if (this.f47595c != null && this.f47596d != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cancelling the timer. timertask=");
            stringBuilder.append(this.f47596d.toString());
            stringBuilder.append(", timer=");
            stringBuilder.append(this.f47595c.toString());
            ad.a(stringBuilder.toString());
            this.f47596d.cancel();
            this.f47595c.cancel();
        }
    }
}
