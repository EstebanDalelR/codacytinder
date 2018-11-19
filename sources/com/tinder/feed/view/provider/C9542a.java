package com.tinder.feed.view.provider;

import android.support.annotation.UiThread;
import com.tinder.common.p078c.C2642a;
import com.tinder.feed.view.message.C9533a;
import com.tinder.module.ViewScope;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/feed/view/provider/FeedComposerProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "subject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/feed/view/message/ComposerStatus;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "", "status", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.feed.view.provider.a */
public final class C9542a {
    /* renamed from: a */
    private final PublishSubject<C9533a> f31923a = PublishSubject.w();
    /* renamed from: b */
    private final C2642a f31924b;

    @Inject
    public C9542a(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f31924b = c2642a;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C9533a> m39817a() {
        Observable<C9533a> e = this.f31923a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    @UiThread
    /* renamed from: a */
    public final void m39818a(@NotNull C9533a c9533a) {
        C2668g.b(c9533a, "status");
        this.f31924b.a();
        this.f31923a.onNext(c9533a);
    }
}
