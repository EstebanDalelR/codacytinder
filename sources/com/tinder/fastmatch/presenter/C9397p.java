package com.tinder.fastmatch.presenter;

import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.analytics.AddRecsViewEvent;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchUserRecCardPresenter;", "", "addRecsViewEvent", "Lcom/tinder/recs/analytics/AddRecsViewEvent;", "(Lcom/tinder/recs/analytics/AddRecsViewEvent;)V", "handleBindUserRec", "", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.p */
public final class C9397p {
    /* renamed from: a */
    private final AddRecsViewEvent f31508a;

    @Inject
    public C9397p(@NotNull AddRecsViewEvent addRecsViewEvent) {
        C2668g.b(addRecsViewEvent, "addRecsViewEvent");
        this.f31508a = addRecsViewEvent;
    }

    /* renamed from: a */
    public final void m39321a(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        this.f31508a.execute(userRec).b(Schedulers.io()).b(RxUtils.b());
    }
}
