package com.tinder.recsads.analytics;

import com.tinder.addy.Ad;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/tinder/recsads/analytics/CtaBounceBackTimer;", "", "()V", "adSaved", "Lcom/tinder/addy/Ad;", "listener", "Lcom/tinder/recsads/analytics/CtaBounceBackTimer$Listener;", "getListener", "()Lcom/tinder/recsads/analytics/CtaBounceBackTimer$Listener;", "setListener", "(Lcom/tinder/recsads/analytics/CtaBounceBackTimer$Listener;)V", "timeCtaOpened", "", "Ljava/lang/Long;", "clear", "", "startTimer", "adOpened", "stopTimer", "Listener", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class CtaBounceBackTimer {
    /* renamed from: a */
    private Ad f46306a;
    /* renamed from: b */
    private Long f46307b;
    @Nullable
    /* renamed from: c */
    private Listener f46308c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/recsads/analytics/CtaBounceBackTimer$Listener;", "", "onAdTimerCompleted", "", "ad", "Lcom/tinder/addy/Ad;", "duration", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onAdTimerCompleted(@NotNull Ad ad, long j);
    }

    /* renamed from: a */
    public final void m55990a(@Nullable Listener listener) {
        this.f46308c = listener;
    }

    /* renamed from: a */
    public final void m55989a(@NotNull Ad ad) {
        C2668g.b(ad, "adOpened");
        this.f46306a = ad;
        this.f46307b = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public final void m55988a() {
        Long l = this.f46307b;
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            Ad ad = this.f46306a;
            if (ad != null) {
                Listener listener = this.f46308c;
                if (listener != null) {
                    listener.onAdTimerCompleted(ad, currentTimeMillis);
                }
            }
            m55991b();
        }
    }

    /* renamed from: b */
    public final void m55991b() {
        this.f46306a = (Ad) null;
        this.f46307b = (Long) null;
    }
}
