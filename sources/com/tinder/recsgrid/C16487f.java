package com.tinder.recsgrid;

import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0016R>\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/tinder/recsgrid/ScrollStatusProviderAndNotifier;", "Lcom/tinder/recsgrid/ScrollStatusProvider;", "Lcom/tinder/recsgrid/ScrollStatusNotifier;", "()V", "subject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/tinder/recsgrid/ScrollStatus;", "kotlin.jvm.PlatformType", "getSubject", "()Lio/reactivex/subjects/PublishSubject;", "setSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "notify", "", "scrollStatus", "observe", "Lio/reactivex/Flowable;", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsgrid.f */
public final class C16487f implements ScrollStatusNotifier, ScrollStatusProvider {
    /* renamed from: a */
    private PublishSubject<C14783e> f51163a = PublishSubject.m67682a();

    @NotNull
    public C3957b<C14783e> observe() {
        C3957b<C14783e> toFlowable = this.f51163a.toFlowable(BackpressureStrategy.LATEST);
        C2668g.a(toFlowable, "subject.toFlowable(BackpressureStrategy.LATEST)");
        return toFlowable;
    }

    public void notify(@NotNull C14783e c14783e) {
        C2668g.b(c14783e, "scrollStatus");
        this.f51163a.onNext(c14783e);
    }
}
