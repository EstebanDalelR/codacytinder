package com.tinder.feed.analytics.session;

import com.tinder.common.p078c.C2642a;
import com.tinder.domain.injection.qualifiers.FeedRequestFirstItemPosition;
import com.tinder.domain.injection.qualifiers.FeedRequestLastItemPosition;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedSessionPositionTrackerExecutor;", "", "feedSessionPositionTracker", "Lcom/tinder/feed/analytics/session/FeedSessionPositionTracker;", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "requestFirstItemPositionBarrier", "Ljava/util/concurrent/CyclicBarrier;", "requestLastItemPositionBarrier", "(Lcom/tinder/feed/analytics/session/FeedSessionPositionTracker;Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;Ljava/util/concurrent/CyclicBarrier;Ljava/util/concurrent/CyclicBarrier;)V", "resetBarrier", "", "barrier", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setFirstItemPositionOnStartWithBarrier", "firstItemPositionOnStart", "", "setFirstItemPositionWithNoBarrier", "setLastItemPositionOnEndWithBarrier", "lastItemPositionOnEnd", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.k */
public final class C9454k {
    /* renamed from: a */
    private final C9453j f31685a;
    /* renamed from: b */
    private final C2642a f31686b;
    /* renamed from: c */
    private final CyclicBarrier f31687c;
    /* renamed from: d */
    private final CyclicBarrier f31688d;

    @Inject
    public C9454k(@NotNull C9453j c9453j, @NotNull C2642a c2642a, @NotNull @FeedRequestFirstItemPosition CyclicBarrier cyclicBarrier, @NotNull @FeedRequestLastItemPosition CyclicBarrier cyclicBarrier2) {
        C2668g.b(c9453j, "feedSessionPositionTracker");
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        C2668g.b(cyclicBarrier, "requestFirstItemPositionBarrier");
        C2668g.b(cyclicBarrier2, "requestLastItemPositionBarrier");
        this.f31685a = c9453j;
        this.f31686b = c2642a;
        this.f31687c = cyclicBarrier;
        this.f31688d = cyclicBarrier2;
    }

    /* renamed from: a */
    public final void m39523a(int i) {
        this.f31686b.a();
        this.f31685a.m39519a(i);
        try {
            this.f31687c.await(1, TimeUnit.MILLISECONDS);
        } catch (int i2) {
            m39522a(this.f31687c, (Exception) i2);
        } catch (int i22) {
            m39522a(this.f31687c, (Exception) i22);
        } catch (int i222) {
            m39522a(this.f31687c, (Exception) i222);
        }
    }

    /* renamed from: b */
    public final void m39524b(int i) {
        this.f31686b.a();
        this.f31685a.m39521b(i);
        try {
            this.f31688d.await(1, TimeUnit.MILLISECONDS);
        } catch (int i2) {
            m39522a(this.f31688d, (Exception) i2);
        } catch (int i22) {
            m39522a(this.f31688d, (Exception) i22);
        } catch (int i222) {
            m39522a(this.f31687c, (Exception) i222);
        }
    }

    /* renamed from: c */
    public final void m39525c(int i) {
        this.f31685a.m39519a(i);
    }

    /* renamed from: a */
    private final void m39522a(CyclicBarrier cyclicBarrier, Exception exception) {
        cyclicBarrier.reset();
        Throwable th = exception;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Caught an exception in FeedSessionPositionTrackerExecutor due to ");
        stringBuilder.append(exception.getMessage());
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
    }
}
