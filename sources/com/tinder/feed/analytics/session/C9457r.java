package com.tinder.feed.analytics.session;

import com.tinder.feed.analytics.SessionDestination;
import com.tinder.feed.analytics.SessionSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b+\b\b\u0018\u00002\u00020\u0001B\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u0016HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u000bHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lcom/tinder/feed/analytics/session/Session;", "", "feedSessionId", "", "source", "Lcom/tinder/feed/analytics/SessionSource;", "destination", "Lcom/tinder/feed/analytics/SessionDestination;", "unseenActivityBadge", "", "numActivitiesViewed", "", "numActivitiesTotal", "numFetches", "numActivitiesFetched", "numOtherIdInActivitiesFetched", "numOtherIdInActivitiesViewed", "positionStart", "positionEnd", "positionMin", "positionMax", "durationInMillis", "", "(Ljava/lang/String;Lcom/tinder/feed/analytics/SessionSource;Lcom/tinder/feed/analytics/SessionDestination;ZIIIIIIIIIIJ)V", "getDestination", "()Lcom/tinder/feed/analytics/SessionDestination;", "getDurationInMillis", "()J", "getFeedSessionId", "()Ljava/lang/String;", "getNumActivitiesFetched", "()I", "getNumActivitiesTotal", "getNumActivitiesViewed", "getNumFetches", "getNumOtherIdInActivitiesFetched", "getNumOtherIdInActivitiesViewed", "getPositionEnd", "getPositionMax", "getPositionMin", "getPositionStart", "getSource", "()Lcom/tinder/feed/analytics/SessionSource;", "getUnseenActivityBadge", "()Z", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.r */
public final class C9457r {
    @NotNull
    /* renamed from: a */
    private final String f31700a;
    @NotNull
    /* renamed from: b */
    private final SessionSource f31701b;
    @NotNull
    /* renamed from: c */
    private final SessionDestination f31702c;
    /* renamed from: d */
    private final boolean f31703d;
    /* renamed from: e */
    private final int f31704e;
    /* renamed from: f */
    private final int f31705f;
    /* renamed from: g */
    private final int f31706g;
    /* renamed from: h */
    private final int f31707h;
    /* renamed from: i */
    private final int f31708i;
    /* renamed from: j */
    private final int f31709j;
    /* renamed from: k */
    private final int f31710k;
    /* renamed from: l */
    private final int f31711l;
    /* renamed from: m */
    private final int f31712m;
    /* renamed from: n */
    private final int f31713n;
    /* renamed from: o */
    private final long f31714o;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9457r) {
            C9457r c9457r = (C9457r) obj;
            if (C2668g.a(this.f31700a, c9457r.f31700a) && C2668g.a(this.f31701b, c9457r.f31701b) && C2668g.a(this.f31702c, c9457r.f31702c)) {
                if ((this.f31703d == c9457r.f31703d ? 1 : null) != null) {
                    if ((this.f31704e == c9457r.f31704e ? 1 : null) != null) {
                        if ((this.f31705f == c9457r.f31705f ? 1 : null) != null) {
                            if ((this.f31706g == c9457r.f31706g ? 1 : null) != null) {
                                if ((this.f31707h == c9457r.f31707h ? 1 : null) != null) {
                                    if ((this.f31708i == c9457r.f31708i ? 1 : null) != null) {
                                        if ((this.f31709j == c9457r.f31709j ? 1 : null) != null) {
                                            if ((this.f31710k == c9457r.f31710k ? 1 : null) != null) {
                                                if ((this.f31711l == c9457r.f31711l ? 1 : null) != null) {
                                                    if ((this.f31712m == c9457r.f31712m ? 1 : null) != null) {
                                                        if ((this.f31713n == c9457r.f31713n ? 1 : null) != null) {
                                                            if ((this.f31714o == c9457r.f31714o ? 1 : null) != null) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f31700a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SessionSource sessionSource = this.f31701b;
        hashCode = (hashCode + (sessionSource != null ? sessionSource.hashCode() : 0)) * 31;
        SessionDestination sessionDestination = this.f31702c;
        if (sessionDestination != null) {
            i = sessionDestination.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.f31703d;
        if (i != 0) {
            i = 1;
        }
        hashCode = (((((((((((((((((((((hashCode + i) * 31) + this.f31704e) * 31) + this.f31705f) * 31) + this.f31706g) * 31) + this.f31707h) * 31) + this.f31708i) * 31) + this.f31709j) * 31) + this.f31710k) * 31) + this.f31711l) * 31) + this.f31712m) * 31) + this.f31713n) * 31;
        long j = this.f31714o;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Session(feedSessionId=");
        stringBuilder.append(this.f31700a);
        stringBuilder.append(", source=");
        stringBuilder.append(this.f31701b);
        stringBuilder.append(", destination=");
        stringBuilder.append(this.f31702c);
        stringBuilder.append(", unseenActivityBadge=");
        stringBuilder.append(this.f31703d);
        stringBuilder.append(", numActivitiesViewed=");
        stringBuilder.append(this.f31704e);
        stringBuilder.append(", numActivitiesTotal=");
        stringBuilder.append(this.f31705f);
        stringBuilder.append(", numFetches=");
        stringBuilder.append(this.f31706g);
        stringBuilder.append(", numActivitiesFetched=");
        stringBuilder.append(this.f31707h);
        stringBuilder.append(", numOtherIdInActivitiesFetched=");
        stringBuilder.append(this.f31708i);
        stringBuilder.append(", numOtherIdInActivitiesViewed=");
        stringBuilder.append(this.f31709j);
        stringBuilder.append(", positionStart=");
        stringBuilder.append(this.f31710k);
        stringBuilder.append(", positionEnd=");
        stringBuilder.append(this.f31711l);
        stringBuilder.append(", positionMin=");
        stringBuilder.append(this.f31712m);
        stringBuilder.append(", positionMax=");
        stringBuilder.append(this.f31713n);
        stringBuilder.append(", durationInMillis=");
        stringBuilder.append(this.f31714o);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9457r(@NotNull String str, @NotNull SessionSource sessionSource, @NotNull SessionDestination sessionDestination, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j) {
        String str2 = str;
        SessionSource sessionSource2 = sessionSource;
        SessionDestination sessionDestination2 = sessionDestination;
        C2668g.b(str2, "feedSessionId");
        C2668g.b(sessionSource2, "source");
        C2668g.b(sessionDestination2, "destination");
        this.f31700a = str2;
        this.f31701b = sessionSource2;
        this.f31702c = sessionDestination2;
        this.f31703d = z;
        this.f31704e = i;
        this.f31705f = i2;
        this.f31706g = i3;
        this.f31707h = i4;
        this.f31708i = i5;
        this.f31709j = i6;
        this.f31710k = i7;
        this.f31711l = i8;
        this.f31712m = i9;
        this.f31713n = i10;
        this.f31714o = j;
    }

    @NotNull
    /* renamed from: a */
    public final String m39534a() {
        return this.f31700a;
    }

    @NotNull
    /* renamed from: b */
    public final SessionSource m39535b() {
        return this.f31701b;
    }

    @NotNull
    /* renamed from: c */
    public final SessionDestination m39536c() {
        return this.f31702c;
    }

    /* renamed from: d */
    public final boolean m39537d() {
        return this.f31703d;
    }

    /* renamed from: e */
    public final int m39538e() {
        return this.f31704e;
    }

    /* renamed from: f */
    public final int m39539f() {
        return this.f31705f;
    }

    /* renamed from: g */
    public final int m39540g() {
        return this.f31706g;
    }

    /* renamed from: h */
    public final int m39541h() {
        return this.f31707h;
    }

    /* renamed from: i */
    public final int m39542i() {
        return this.f31708i;
    }

    /* renamed from: j */
    public final int m39543j() {
        return this.f31709j;
    }

    /* renamed from: k */
    public final int m39544k() {
        return this.f31710k;
    }

    /* renamed from: l */
    public final int m39545l() {
        return this.f31711l;
    }

    /* renamed from: m */
    public final int m39546m() {
        return this.f31712m;
    }

    /* renamed from: n */
    public final int m39547n() {
        return this.f31713n;
    }

    /* renamed from: o */
    public final long m39548o() {
        return this.f31714o;
    }
}
