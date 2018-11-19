package com.tinder.domain.recs.model;

import com.tinder.domain.recs.rule.SwipeProcessingRule;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/domain/recs/model/SwipeTerminationEvent;", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "type", "Lcom/tinder/domain/recs/model/SwipeTerminationEvent$Type;", "rule", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule;", "(Lcom/tinder/domain/recs/model/Swipe;Lcom/tinder/domain/recs/model/SwipeTerminationEvent$Type;Lcom/tinder/domain/recs/rule/SwipeProcessingRule;)V", "getRule", "()Lcom/tinder/domain/recs/rule/SwipeProcessingRule;", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "getType", "()Lcom/tinder/domain/recs/model/SwipeTerminationEvent$Type;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Type", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class SwipeTerminationEvent {
    @Nullable
    private final SwipeProcessingRule rule;
    @NotNull
    private final Swipe swipe;
    @NotNull
    private final Type type;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/domain/recs/model/SwipeTerminationEvent$Type;", "", "(Ljava/lang/String;I)V", "COMPLETED", "LEGALLY_INTERRUPTED_FREEZE", "LEGALLY_INTERRUPTED_REVERT_PRE_CONSUMPTION", "LEGALLY_INTERRUPTED_REVERT_POST_CONSUMPTION", "ILLEGALLY_INTERRUPTED_PRE_CONSUMPTION", "ILLEGALLY_INTERRUPTED_POST_CONSUMPTION", "engine_release"}, k = 1, mv = {1, 1, 9})
    public enum Type {
    }

    @NotNull
    public static /* synthetic */ SwipeTerminationEvent copy$default(SwipeTerminationEvent swipeTerminationEvent, Swipe swipe, Type type, SwipeProcessingRule swipeProcessingRule, int i, Object obj) {
        if ((i & 1) != 0) {
            swipe = swipeTerminationEvent.swipe;
        }
        if ((i & 2) != 0) {
            type = swipeTerminationEvent.type;
        }
        if ((i & 4) != 0) {
            swipeProcessingRule = swipeTerminationEvent.rule;
        }
        return swipeTerminationEvent.copy(swipe, type, swipeProcessingRule);
    }

    @NotNull
    public final Swipe component1() {
        return this.swipe;
    }

    @NotNull
    public final Type component2() {
        return this.type;
    }

    @Nullable
    public final SwipeProcessingRule component3() {
        return this.rule;
    }

    @NotNull
    public final SwipeTerminationEvent copy(@NotNull Swipe swipe, @NotNull Type type, @Nullable SwipeProcessingRule swipeProcessingRule) {
        C2668g.b(swipe, "swipe");
        C2668g.b(type, "type");
        return new SwipeTerminationEvent(swipe, type, swipeProcessingRule);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SwipeTerminationEvent) {
                SwipeTerminationEvent swipeTerminationEvent = (SwipeTerminationEvent) obj;
                if (C2668g.a(this.swipe, swipeTerminationEvent.swipe) && C2668g.a(this.type, swipeTerminationEvent.type) && C2668g.a(this.rule, swipeTerminationEvent.rule)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Swipe swipe = this.swipe;
        int i = 0;
        int hashCode = (swipe != null ? swipe.hashCode() : 0) * 31;
        Type type = this.type;
        hashCode = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        SwipeProcessingRule swipeProcessingRule = this.rule;
        if (swipeProcessingRule != null) {
            i = swipeProcessingRule.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SwipeTerminationEvent(swipe=");
        stringBuilder.append(this.swipe);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", rule=");
        stringBuilder.append(this.rule);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SwipeTerminationEvent(@NotNull Swipe swipe, @NotNull Type type, @Nullable SwipeProcessingRule swipeProcessingRule) {
        C2668g.b(swipe, "swipe");
        C2668g.b(type, "type");
        this.swipe = swipe;
        this.type = type;
        this.rule = swipeProcessingRule;
    }

    @NotNull
    public final Swipe getSwipe() {
        return this.swipe;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public /* synthetic */ SwipeTerminationEvent(Swipe swipe, Type type, SwipeProcessingRule swipeProcessingRule, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            swipeProcessingRule = null;
        }
        this(swipe, type, swipeProcessingRule);
    }

    @Nullable
    public final SwipeProcessingRule getRule() {
        return this.rule;
    }
}
