package com.tinder.reactions.gestures.p395c;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.gestures.animation.ReactionAnimationListener;
import com.tinder.reactions.gestures.common.ReactionEvent;
import com.tinder.reactions.gestures.common.ReactionEvent.State;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/reactions/gestures/provider/ReactionEventProvider;", "Lcom/tinder/reactions/gestures/animation/ReactionAnimationListener;", "()V", "reactionEventSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "onReactionComplete", "", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "onReactionStarted", "update", "reactionEvent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.gestures.c.h */
public final class C16348h implements ReactionAnimationListener {
    /* renamed from: a */
    private final PublishSubject<ReactionEvent> f50854a = PublishSubject.w();

    public void onReactionStarted(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        m61664a(new ReactionEvent(State.REACTION_STARTED, grandGestureType));
    }

    public void onReactionComplete(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        m61664a(new ReactionEvent(State.REACTION_COMPLETED, grandGestureType));
    }

    @NotNull
    /* renamed from: a */
    public final Observable<ReactionEvent> m61665a() {
        Observable<ReactionEvent> e = this.f50854a.e();
        C2668g.a(e, "reactionEventSubject.asObservable()");
        return e;
    }

    /* renamed from: a */
    private final void m61664a(ReactionEvent reactionEvent) {
        this.f50854a.onNext(reactionEvent);
    }
}
