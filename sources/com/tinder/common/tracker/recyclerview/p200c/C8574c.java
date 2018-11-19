package com.tinder.common.tracker.recyclerview.p200c;

import android.support.annotation.UiThread;
import com.tinder.common.p078c.C2642a;
import com.tinder.common.tracker.recyclerview.p199b.C8568g;
import com.tinder.module.ViewScope;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000RJ\u0010\u0006\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \t*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\b \t*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \t*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\b\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/provider/ListPlayableItemStateProvider;", "T", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "subject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/common/tracker/recyclerview/model/ListPlayableItemUpdate;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.common.tracker.recyclerview.c.c */
public final class C8574c<T> {
    /* renamed from: a */
    private final PublishSubject<C8568g<T>> f30333a = PublishSubject.w();
    /* renamed from: b */
    private final C2642a f30334b;

    @Inject
    public C8574c(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f30334b = c2642a;
    }

    @UiThread
    /* renamed from: a */
    public final void m36589a(@NotNull C8568g<T> c8568g) {
        C2668g.b(c8568g, "update");
        this.f30334b.a();
        this.f30333a.onNext(c8568g);
    }
}
