package com.tinder.common.tracker.recyclerview.p200c;

import android.support.annotation.UiThread;
import com.tinder.common.p078c.C2642a;
import com.tinder.common.tracker.recyclerview.p199b.C8567d;
import com.tinder.module.ViewScope;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleItemProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "getMainThreadExecutionVerifier", "()Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "subject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/common/tracker/recyclerview/model/ListItemVisibleUpdate;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.common.tracker.recyclerview.c.e */
public final class C8575e {
    /* renamed from: a */
    private final PublishSubject<C8567d> f30335a = PublishSubject.w();
    @NotNull
    /* renamed from: b */
    private final C2642a f30336b;

    @Inject
    public C8575e(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f30336b = c2642a;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C8567d> m36590a() {
        Observable<C8567d> e = this.f30335a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    @UiThread
    /* renamed from: a */
    public final void m36591a(@NotNull C8567d c8567d) {
        C2668g.b(c8567d, "update");
        this.f30336b.a();
        this.f30335a.onNext(c8567d);
    }
}
