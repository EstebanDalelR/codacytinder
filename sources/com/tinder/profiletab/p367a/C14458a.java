package com.tinder.profiletab.p367a;

import android.support.annotation.UiThread;
import com.tinder.common.p078c.C2642a;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import io.reactivex.C3959e;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/profiletab/provider/MainPageScrollStateChangedProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "subject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Observable;", "update", "", "state", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profiletab.a.a */
public final class C14458a {
    /* renamed from: a */
    private final PublishSubject<ScrollState> f45806a = PublishSubject.m67682a();
    /* renamed from: b */
    private final C2642a f45807b;

    @Inject
    public C14458a(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f45807b = c2642a;
    }

    @UiThread
    /* renamed from: a */
    public final void m55188a(@NotNull ScrollState scrollState) {
        C2668g.b(scrollState, "state");
        this.f45807b.a();
        this.f45806a.onNext(scrollState);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<ScrollState> m55187a() {
        C3959e<ScrollState> distinctUntilChanged = this.f45806a.hide().distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "subject.hide().distinctUntilChanged()");
        return distinctUntilChanged;
    }
}
