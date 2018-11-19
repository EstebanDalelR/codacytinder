package com.tinder.toppicks.presenter;

import android.support.annotation.UiThread;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.analytics.AddRecsViewEvent;
import com.tinder.toppicks.target.TopPicksUserRecCardTarget;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tinder/toppicks/presenter/TopPicksUserRecCardPresenter;", "", "addRecsViewEvent", "Lcom/tinder/recs/analytics/AddRecsViewEvent;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "(Lcom/tinder/recs/analytics/AddRecsViewEvent;Lcom/tinder/domain/recs/RecsEngineRegistry;)V", "target", "Lcom/tinder/toppicks/target/TopPicksUserRecCardTarget;", "getTarget$Tinder_release", "()Lcom/tinder/toppicks/target/TopPicksUserRecCardTarget;", "setTarget$Tinder_release", "(Lcom/tinder/toppicks/target/TopPicksUserRecCardTarget;)V", "handleBindUserRec", "", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "onSuperLikeButtonClick", "rec", "Lcom/tinder/domain/recs/model/Rec;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.q */
public final class C15295q {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TopPicksUserRecCardTarget f47449a;
    /* renamed from: b */
    private final AddRecsViewEvent f47450b;
    /* renamed from: c */
    private final RecsEngineRegistry f47451c;

    @Inject
    public C15295q(@NotNull AddRecsViewEvent addRecsViewEvent, @NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(addRecsViewEvent, "addRecsViewEvent");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        this.f47450b = addRecsViewEvent;
        this.f47451c = recsEngineRegistry;
    }

    @UiThread
    /* renamed from: a */
    public final void m57426a(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        TopPicksUserRecCardTarget topPicksUserRecCardTarget = this.f47449a;
        if (topPicksUserRecCardTarget == null) {
            C2668g.b("target");
        }
        topPicksUserRecCardTarget.animateSuperLikeStamp();
        RecsEngine engine = this.f47451c.getEngine(TopPicks.INSTANCE);
        if (engine != null) {
            engine.processSuperlikeOnRec(rec, new SwipeActionContext(SwipeOrigin.GRID, SwipeMethod.TOP_PICKS_GRID));
        }
    }

    /* renamed from: a */
    public final void m57427a(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        this.f47450b.execute(userRec).b(Schedulers.io()).b(RxUtils.b());
    }
}
