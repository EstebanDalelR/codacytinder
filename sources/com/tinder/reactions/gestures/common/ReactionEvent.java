package com.tinder.reactions.gestures.common;

import com.tinder.domain.reactions.model.GrandGestureType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/reactions/gestures/common/ReactionEvent;", "", "state", "Lcom/tinder/reactions/gestures/common/ReactionEvent$State;", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "(Lcom/tinder/reactions/gestures/common/ReactionEvent$State;Lcom/tinder/domain/reactions/model/GrandGestureType;)V", "getGrandGestureType", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "getState", "()Lcom/tinder/reactions/gestures/common/ReactionEvent$State;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "State", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ReactionEvent {
    @NotNull
    /* renamed from: a */
    private final State f46226a;
    @NotNull
    /* renamed from: b */
    private final GrandGestureType f46227b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/reactions/gestures/common/ReactionEvent$State;", "", "(Ljava/lang/String;I)V", "REACTION_STARTED", "REACTION_COMPLETED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    @NotNull
    /* renamed from: a */
    public final State m55892a() {
        return this.f46226a;
    }

    @NotNull
    /* renamed from: b */
    public final GrandGestureType m55893b() {
        return this.f46227b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReactionEvent) {
                ReactionEvent reactionEvent = (ReactionEvent) obj;
                if (C2668g.a(this.f46226a, reactionEvent.f46226a) && C2668g.a(this.f46227b, reactionEvent.f46227b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        State state = this.f46226a;
        int i = 0;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        GrandGestureType grandGestureType = this.f46227b;
        if (grandGestureType != null) {
            i = grandGestureType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ReactionEvent(state=");
        stringBuilder.append(this.f46226a);
        stringBuilder.append(", grandGestureType=");
        stringBuilder.append(this.f46227b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ReactionEvent(@NotNull State state, @NotNull GrandGestureType grandGestureType) {
        C2668g.b(state, "state");
        C2668g.b(grandGestureType, "grandGestureType");
        this.f46226a = state;
        this.f46227b = grandGestureType;
    }
}
