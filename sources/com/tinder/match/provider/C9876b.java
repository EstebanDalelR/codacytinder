package com.tinder.match.provider;

import android.support.annotation.UiThread;
import com.tinder.common.p078c.C2642a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/match/provider/FeedTabReselectedProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "subject", "Lrx/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "event", "(Lkotlin/Unit;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.provider.b */
public final class C9876b {
    /* renamed from: a */
    private final C19785a<C15813i> f32698a = C19785a.w();
    /* renamed from: b */
    private final C2642a f32699b;

    @Inject
    public C9876b(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f32699b = c2642a;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C15813i> m40635a() {
        Observable<C15813i> e = this.f32698a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    @UiThread
    /* renamed from: a */
    public final void m40636a(@NotNull C15813i c15813i) {
        C2668g.b(c15813i, "event");
        this.f32699b.a();
        this.f32698a.onNext(c15813i);
    }
}
