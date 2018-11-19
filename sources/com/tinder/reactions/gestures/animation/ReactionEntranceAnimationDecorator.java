package com.tinder.reactions.gestures.animation;

import com.tinder.reactions.gestures.view.GrandGestureReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;", "", "()V", "state", "Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator$State;", "getState", "()Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator$State;", "setState", "(Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator$State;)V", "animate", "", "grandGestureReactionView", "Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "State", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class ReactionEntranceAnimationDecorator {
    @NotNull
    /* renamed from: a */
    private State f46172a = State.INITIALIZED;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator$State;", "", "(Ljava/lang/String;I)V", "INITIALIZED", "RUNNING", "FINISHED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    /* renamed from: a */
    public abstract void mo11965a(@NotNull GrandGestureReactionView grandGestureReactionView);

    @NotNull
    /* renamed from: a */
    public final State m55835a() {
        return this.f46172a;
    }

    /* renamed from: a */
    public final void m55836a(@NotNull State state) {
        C2668g.b(state, "<set-?>");
        this.f46172a = state;
    }
}
