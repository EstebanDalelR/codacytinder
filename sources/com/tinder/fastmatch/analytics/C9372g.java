package com.tinder.fastmatch.analytics;

import com.tinder.common.provider.C8550g;
import com.tinder.fastmatch.p245c.C9378a;
import com.tinder.scope.ActivityScope;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\u0006H\u0007J\b\u0010'\u001a\u00020\u0006H\u0007J\b\u0010\u0011\u001a\u00020(H\u0007J\u0012\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010+\u001a\u00020,H\u0007J\b\u0010-\u001a\u00020\u0014H\u0007J\b\u0010.\u001a\u00020,H\u0007J\b\u0010/\u001a\u00020,H\u0007J\b\u00100\u001a\u00020,H\u0007J\b\u00101\u001a\u00020,H\u0007J\b\u00102\u001a\u00020,H\u0007J\b\u00103\u001a\u00020,H\u0007J\u0010\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u0006H\u0007J\u0010\u00106\u001a\u00020,2\u0006\u00105\u001a\u00020\u0006H\u0007J\b\u00107\u001a\u00020,H\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR$\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR\u0010\u0010%\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;", "", "timeProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "(Lcom/tinder/common/provider/TodayDateProvider;)V", "curNavCount", "", "getCurNavCount$Tinder_release", "()I", "setCurNavCount$Tinder_release", "(I)V", "curPillCount", "getCurPillCount$Tinder_release", "setCurPillCount$Tinder_release", "currentPillDelta", "getCurrentPillDelta$Tinder_release", "setCurrentPillDelta$Tinder_release", "currentPillStartTime", "Lorg/joda/time/DateTime;", "fastMatchSession", "Lcom/tinder/fastmatch/model/FastMatchSession;", "isStarted", "", "pillUpdateCount", "getPillUpdateCount$Tinder_release", "setPillUpdateCount$Tinder_release", "preNavCount", "getPreNavCount$Tinder_release", "setPreNavCount$Tinder_release", "previousPillUpdateTime", "<set-?>", "screenPageCount", "getScreenPageCount", "setScreenPageCount", "sessionPageCount", "getSessionPageCount", "setSessionPageCount", "startTime", "currentPillDuration", "currentPillDurationDelta", "", "duration", "start", "endSession", "", "getCurrentSession", "recordExit", "recordLike", "recordSwipe", "resetCurrentPillSession", "resetScreenPagecount", "startSession", "updateCurrentPillCount", "count", "updateNavCount", "updatePageCount", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ActivityScope
/* renamed from: com.tinder.fastmatch.analytics.g */
public final class C9372g {
    /* renamed from: a */
    private boolean f31443a;
    /* renamed from: b */
    private C9378a f31444b = new C9378a(0, 0, 0, 7, null);
    /* renamed from: c */
    private DateTime f31445c;
    /* renamed from: d */
    private DateTime f31446d;
    /* renamed from: e */
    private DateTime f31447e;
    /* renamed from: f */
    private int f31448f;
    /* renamed from: g */
    private int f31449g;
    /* renamed from: h */
    private int f31450h;
    /* renamed from: i */
    private int f31451i;
    /* renamed from: j */
    private int f31452j;
    /* renamed from: k */
    private int f31453k;
    /* renamed from: l */
    private int f31454l;
    /* renamed from: m */
    private final C8550g f31455m;

    @Inject
    public C9372g(@NotNull C8550g c8550g) {
        C2668g.b(c8550g, "timeProvider");
        this.f31455m = c8550g;
    }

    /* renamed from: a */
    public final int m39247a() {
        return this.f31448f;
    }

    /* renamed from: b */
    public final int m39249b() {
        return this.f31449g;
    }

    /* renamed from: c */
    public final int m39251c() {
        return this.f31450h;
    }

    /* renamed from: d */
    public final int m39252d() {
        return this.f31451i;
    }

    /* renamed from: e */
    public final int m39253e() {
        return this.f31452j;
    }

    /* renamed from: f */
    public final int m39254f() {
        return this.f31453k;
    }

    /* renamed from: g */
    public final int m39255g() {
        return this.f31454l;
    }

    @NotNull
    /* renamed from: h */
    public final synchronized C9378a m39256h() {
        return this.f31444b;
    }

    /* renamed from: i */
    public final synchronized void m39257i() {
        this.f31446d = this.f31455m.m36535b();
        this.f31447e = this.f31455m.m36535b();
        this.f31445c = this.f31455m.m36535b();
        this.f31443a = true;
    }

    /* renamed from: j */
    public final synchronized void m39258j() {
        this.f31443a = false;
        this.f31454l = 0;
    }

    /* renamed from: k */
    public final synchronized void m39259k() {
        if (this.f31443a) {
            C9378a c9378a = this.f31444b;
            this.f31444b = C9378a.m39272a(this.f31444b, c9378a.m39277d() + 1, c9378a.m39278e() + 1, 0, 4, null);
        }
    }

    /* renamed from: l */
    public final synchronized void m39260l() {
        if (this.f31443a) {
            this.f31444b = C9378a.m39272a(this.f31444b, this.f31444b.m39277d() + 1, 0, 0, 6, null);
        }
    }

    /* renamed from: m */
    public final synchronized void m39261m() {
        if (this.f31443a) {
            this.f31444b = C9378a.m39272a(this.f31444b, 0, 0, m39246a(this.f31445c), 3, null);
        }
    }

    /* renamed from: a */
    public final synchronized void m39248a(int i) {
        this.f31448f++;
        this.f31449g = i - this.f31450h;
        this.f31450h = i;
    }

    /* renamed from: b */
    public final synchronized void m39250b(int i) {
        this.f31452j = this.f31451i;
        this.f31451i = i;
    }

    /* renamed from: n */
    public final synchronized void m39262n() {
        this.f31453k++;
        this.f31454l = Math.max(this.f31454l, this.f31453k);
    }

    /* renamed from: o */
    public final synchronized long m39263o() {
        DateTime dateTime;
        dateTime = this.f31446d;
        return dateTime != null ? dateTime.getMillis() : 0;
    }

    /* renamed from: p */
    public final synchronized int m39264p() {
        return m39246a(this.f31446d);
    }

    /* renamed from: q */
    public final synchronized int m39265q() {
        long j;
        j = 0;
        DateTime b = this.f31455m.m36535b();
        DateTime dateTime = this.f31447e;
        if (dateTime != null) {
            C2668g.a(b, "now");
            j = b.getMillis() - dateTime.getMillis();
        }
        this.f31447e = b;
        return (int) j;
    }

    /* renamed from: r */
    public final synchronized void m39266r() {
        this.f31450h = 0;
        this.f31449g = 0;
        this.f31448f = 0;
        this.f31446d = this.f31455m.m36535b();
        this.f31447e = this.f31455m.m36535b();
    }

    /* renamed from: s */
    public final synchronized void m39267s() {
        this.f31453k = 0;
    }

    /* renamed from: a */
    private final int m39246a(DateTime dateTime) {
        long millis;
        if (dateTime != null) {
            DateTime b = this.f31455m.m36535b();
            C2668g.a(b, "timeProvider.dateTime");
            millis = b.getMillis() - dateTime.getMillis();
        } else {
            millis = 0;
        }
        return (int) millis;
    }
}
