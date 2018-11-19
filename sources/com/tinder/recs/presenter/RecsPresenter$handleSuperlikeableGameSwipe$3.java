package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.UserRec;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$handleSuperlikeableGameSwipe$3<T> implements Action1<Throwable> {
    final /* synthetic */ UserRec $userRec;
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$handleSuperlikeableGameSwipe$3(RecsPresenter recsPresenter, UserRec userRec) {
        this.this$0 = recsPresenter;
        this.$userRec = userRec;
    }

    public final void call(Throwable th) {
        C0001a.c(th);
        RecsPresenter recsPresenter = this.this$0;
        C2668g.a(th, "throwable");
        recsPresenter.onSuperlikeRequestFailed(th, this.$userRec.getName());
    }
}
