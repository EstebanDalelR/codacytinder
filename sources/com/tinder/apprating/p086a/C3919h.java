package com.tinder.apprating.p086a;

import android.os.Looper;
import com.tinder.managers.bk;
import com.tinder.p071a.C3862c;
import com.tinder.p071a.C3865h;
import com.tinder.utils.AppLifeCycleTracker.LifeCycleHelperInterface;
import com.tinder.utils.ad;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Date;

@Deprecated
/* renamed from: com.tinder.apprating.a.h */
public class C3919h implements LifeCycleHelperInterface {
    /* renamed from: a */
    private static C3919h f12209a = new C3919h();
    /* renamed from: b */
    private final int f12210b = 2;
    /* renamed from: c */
    private final int f12211c = 10;
    /* renamed from: d */
    private final int f12212d = 3;
    /* renamed from: e */
    private boolean f12213e;
    /* renamed from: f */
    private boolean f12214f;
    /* renamed from: g */
    private boolean f12215g;
    /* renamed from: h */
    private UncaughtExceptionHandler f12216h;

    private C3919h() {
    }

    /* renamed from: a */
    public static C3919h m14697a() {
        return f12209a;
    }

    /* renamed from: b */
    public void m14699b() {
        Thread thread = Looper.getMainLooper().getThread();
        UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        if (this.f12216h == null || !this.f12216h.equals(uncaughtExceptionHandler)) {
            this.f12216h = new h$a(this, uncaughtExceptionHandler, null);
            thread.setUncaughtExceptionHandler(this.f12216h);
        }
    }

    /* renamed from: c */
    public void m14700c() {
        this.f12215g = true;
    }

    /* renamed from: d */
    public void m14701d() {
        this.f12213e = true;
    }

    /* renamed from: e */
    public void m14702e() {
        Looper.getMainLooper().getThread().setUncaughtExceptionHandler(null);
    }

    /* renamed from: f */
    public boolean m14703f() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - 600000;
        int a = new C3862c().m14573a(j, currentTimeMillis);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("check crashes between ");
        stringBuilder.append(new Date(j));
        stringBuilder.append(" and ");
        stringBuilder.append(new Date(currentTimeMillis));
        stringBuilder.append(" : ");
        stringBuilder.append(a);
        ad.m10190a(stringBuilder.toString());
        return a >= 2;
    }

    /* renamed from: g */
    public boolean m14704g() {
        return bk.m14908b();
    }

    /* renamed from: h */
    public boolean m14705h() {
        return bk.m14910c();
    }

    /* renamed from: i */
    public boolean m14706i() {
        return bk.m14912d();
    }

    /* renamed from: j */
    public boolean m14707j() {
        if (!m14706i()) {
            return false;
        }
        StringBuilder stringBuilder;
        boolean z = new C3865h().m14593e() >= 3;
        boolean g = m14704g();
        boolean h = m14705h();
        boolean f = m14703f();
        boolean z2 = this.f12215g;
        if (m14706i() && !g) {
            if (!h) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("\n********\nRATING CHECK \n********\nhasRated ");
                stringBuilder2.append(g);
                stringBuilder2.append('\n');
                stringBuilder2.append("backFromMatch ");
                stringBuilder2.append(this.f12213e);
                stringBuilder2.append('\n');
                stringBuilder2.append("backFromMessage ");
                stringBuilder2.append(this.f12214f);
                stringBuilder2.append('\n');
                stringBuilder2.append("hasSentFeedback ");
                stringBuilder2.append(h);
                stringBuilder2.append('\n');
                stringBuilder2.append("hasEnoughDays ");
                stringBuilder2.append(z);
                stringBuilder2.append('\n');
                stringBuilder2.append("hasCrashes ");
                stringBuilder2.append(f);
                stringBuilder2.append('\n');
                stringBuilder2.append("hasBounced ");
                stringBuilder2.append(z2);
                stringBuilder2.append('\n');
                ad.m10190a(stringBuilder2.toString());
                if (f) {
                    ad.m10190a("true because version is rateable & not rated before & has met crash criteria");
                    m14698k();
                    return true;
                }
                if (z) {
                    if (!this.f12213e) {
                        if (!this.f12214f) {
                            if (this.f12215g) {
                                ad.m10190a("true because version is rateable & not rated before & has met session count & has just been bounced");
                                m14698k();
                                return true;
                            }
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("true because version is rateable & not rated before & has met session count, & new match ");
                    stringBuilder.append(this.f12213e);
                    stringBuilder.append(", hasReadNewMessage ");
                    stringBuilder.append(this.f12214f);
                    ad.m10190a(stringBuilder.toString());
                    m14698k();
                    return true;
                }
                m14698k();
                return false;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No op versionRateable?");
        stringBuilder.append(m14706i());
        stringBuilder.append(" hasRatedBefore? ");
        stringBuilder.append(g);
        ad.m10190a(stringBuilder.toString());
        return false;
    }

    /* renamed from: k */
    private void m14698k() {
        this.f12215g = false;
        this.f12214f = false;
        this.f12213e = false;
    }

    public void onAppOpen() {
        m14699b();
        new C3865h().m14594f();
    }

    public void onAppClosed() {
        m14702e();
    }
}
