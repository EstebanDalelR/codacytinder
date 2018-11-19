package com.tinder.reactions.gestures.p393a;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.gestures.common.GestureEvent;
import com.tinder.reactions.gestures.common.ReactionEvent;
import com.tinder.reactions.gestures.p395c.C16346c;
import com.tinder.reactions.gestures.p395c.C16348h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "", "gestureEventProvider", "Lcom/tinder/reactions/gestures/provider/GestureEventProvider;", "reactionEventProvider", "Lcom/tinder/reactions/gestures/provider/ReactionEventProvider;", "(Lcom/tinder/reactions/gestures/provider/GestureEventProvider;Lcom/tinder/reactions/gestures/provider/ReactionEventProvider;)V", "reactionInProgress", "", "gestureActivated", "", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "getGestureEventObservable", "Lrx/Observable;", "Lcom/tinder/reactions/gestures/common/GestureEvent;", "getReactionEventObservable", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "reactionCompleted", "reactionStarted", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.gestures.a.a */
public final class C14641a {
    /* renamed from: a */
    private boolean f46169a;
    /* renamed from: b */
    private final C16346c f46170b;
    /* renamed from: c */
    private final C16348h f46171c;

    @Inject
    public C14641a(@NotNull C16346c c16346c, @NotNull C16348h c16348h) {
        C2668g.b(c16346c, "gestureEventProvider");
        C2668g.b(c16348h, "reactionEventProvider");
        this.f46170b = c16346c;
        this.f46171c = c16348h;
    }

    /* renamed from: a */
    public final synchronized void m55831a(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        if (!this.f46169a) {
            this.f46170b.onGestureActivated(grandGestureType);
        }
    }

    /* renamed from: b */
    public final synchronized void m55833b(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        if (!this.f46169a) {
            this.f46171c.onReactionStarted(grandGestureType);
            this.f46169a = true;
        }
    }

    /* renamed from: c */
    public final synchronized void m55834c(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        this.f46171c.onReactionComplete(grandGestureType);
        this.f46169a = null;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<GestureEvent> m55830a() {
        return this.f46170b.m61656a();
    }

    @NotNull
    /* renamed from: b */
    public final Observable<ReactionEvent> m55832b() {
        return this.f46171c.m61665a();
    }
}
