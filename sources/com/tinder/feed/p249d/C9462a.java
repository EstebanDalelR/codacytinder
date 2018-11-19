package com.tinder.feed.p249d;

import android.support.annotation.UiThread;
import com.tinder.common.p078c.C2642a;
import com.tinder.domain.feed.FeedCarouselItemSelected;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "getMainThreadExecutionVerifier", "()Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "subject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.d.a */
public final class C9462a {
    /* renamed from: a */
    private final C19785a<FeedCarouselItemSelected> f31720a = C19785a.w();
    @NotNull
    /* renamed from: b */
    private final C2642a f31721b;

    @Inject
    public C9462a(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f31721b = c2642a;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<FeedCarouselItemSelected> m39565a() {
        Observable<FeedCarouselItemSelected> g = this.f31720a.e().g();
        C2668g.a(g, "subject.asObservable().distinctUntilChanged()");
        return g;
    }

    @UiThread
    /* renamed from: a */
    public final void m39566a(@NotNull FeedCarouselItemSelected feedCarouselItemSelected) {
        C2668g.b(feedCarouselItemSelected, "viewModel");
        this.f31721b.a();
        this.f31720a.onNext(feedCarouselItemSelected);
    }
}
