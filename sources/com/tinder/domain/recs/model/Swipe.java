package com.tinder.domain.recs.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/tinder/domain/recs/model/Swipe;", "", "rec", "Lcom/tinder/domain/recs/model/Rec;", "type", "Lcom/tinder/domain/recs/model/Swipe$Type;", "actionContext", "Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "(Lcom/tinder/domain/recs/model/Rec;Lcom/tinder/domain/recs/model/Swipe$Type;Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;)V", "getActionContext", "()Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "getRec", "()Lcom/tinder/domain/recs/model/Rec;", "timestamp", "", "getTimestamp", "()J", "getType", "()Lcom/tinder/domain/recs/model/Swipe$Type;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Method", "Origin", "SwipeActionContext", "Type", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class Swipe {
    @NotNull
    private final SwipeActionContext actionContext;
    @NotNull
    private final Rec rec;
    private final long timestamp = System.currentTimeMillis();
    @NotNull
    private final Type type;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tinder/domain/recs/model/Swipe$Method;", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public interface Method {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tinder/domain/recs/model/Swipe$Origin;", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public interface Origin {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0012\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\u0013J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "", "origin", "Lcom/tinder/domain/recs/model/Swipe$Origin;", "method", "Lcom/tinder/domain/recs/model/Swipe$Method;", "(Lcom/tinder/domain/recs/model/Swipe$Origin;Lcom/tinder/domain/recs/model/Swipe$Method;)V", "swipedPosition", "", "(Lcom/tinder/domain/recs/model/Swipe$Origin;Lcom/tinder/domain/recs/model/Swipe$Method;I)V", "getMethod", "()Lcom/tinder/domain/recs/model/Swipe$Method;", "getOrigin", "()Lcom/tinder/domain/recs/model/Swipe$Origin;", "getSwipedPosition$engine_release", "()I", "component1", "component2", "component3", "component3$engine_release", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class SwipeActionContext {
        @Deprecated
        public static final Companion Companion = new Companion();
        private static final int DEFAULT_SWIPED_POSITION = 0;
        @NotNull
        private final Method method;
        @NotNull
        private final Origin origin;
        private final int swipedPosition;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext$Companion;", "", "()V", "DEFAULT_SWIPED_POSITION", "", "engine_release"}, k = 1, mv = {1, 1, 9})
        private static final class Companion {
            private Companion() {
            }
        }

        @NotNull
        public static /* synthetic */ SwipeActionContext copy$default(SwipeActionContext swipeActionContext, Origin origin, Method method, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                origin = swipeActionContext.origin;
            }
            if ((i2 & 2) != 0) {
                method = swipeActionContext.method;
            }
            if ((i2 & 4) != 0) {
                i = swipeActionContext.swipedPosition;
            }
            return swipeActionContext.copy(origin, method, i);
        }

        @NotNull
        public final Origin component1() {
            return this.origin;
        }

        @NotNull
        public final Method component2() {
            return this.method;
        }

        public final int component3$engine_release() {
            return this.swipedPosition;
        }

        @NotNull
        public final SwipeActionContext copy(@NotNull Origin origin, @NotNull Method method, int i) {
            C2668g.b(origin, "origin");
            C2668g.b(method, "method");
            return new SwipeActionContext(origin, method, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SwipeActionContext) {
                SwipeActionContext swipeActionContext = (SwipeActionContext) obj;
                if (C2668g.a(this.origin, swipeActionContext.origin) && C2668g.a(this.method, swipeActionContext.method)) {
                    if ((this.swipedPosition == swipeActionContext.swipedPosition ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Origin origin = this.origin;
            int i = 0;
            int hashCode = (origin != null ? origin.hashCode() : 0) * 31;
            Method method = this.method;
            if (method != null) {
                i = method.hashCode();
            }
            return ((hashCode + i) * 31) + this.swipedPosition;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SwipeActionContext(origin=");
            stringBuilder.append(this.origin);
            stringBuilder.append(", method=");
            stringBuilder.append(this.method);
            stringBuilder.append(", swipedPosition=");
            stringBuilder.append(this.swipedPosition);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public SwipeActionContext(@NotNull Origin origin, @NotNull Method method, int i) {
            C2668g.b(origin, "origin");
            C2668g.b(method, "method");
            this.origin = origin;
            this.method = method;
            this.swipedPosition = i;
        }

        @NotNull
        public final Method getMethod() {
            return this.method;
        }

        @NotNull
        public final Origin getOrigin() {
            return this.origin;
        }

        public final int getSwipedPosition$engine_release() {
            return this.swipedPosition;
        }

        public SwipeActionContext(@NotNull Origin origin, @NotNull Method method) {
            C2668g.b(origin, "origin");
            C2668g.b(method, "method");
            this(origin, method, 0);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/recs/model/Swipe$Type;", "", "(Ljava/lang/String;I)V", "LIKE", "PASS", "SUPERLIKE", "engine_release"}, k = 1, mv = {1, 1, 9})
    public enum Type {
    }

    @NotNull
    public static /* synthetic */ Swipe copy$default(Swipe swipe, Rec rec, Type type, SwipeActionContext swipeActionContext, int i, Object obj) {
        if ((i & 1) != 0) {
            rec = swipe.rec;
        }
        if ((i & 2) != 0) {
            type = swipe.type;
        }
        if ((i & 4) != 0) {
            swipeActionContext = swipe.actionContext;
        }
        return swipe.copy(rec, type, swipeActionContext);
    }

    @NotNull
    public final Rec component1() {
        return this.rec;
    }

    @NotNull
    public final Type component2() {
        return this.type;
    }

    @NotNull
    public final SwipeActionContext component3() {
        return this.actionContext;
    }

    @NotNull
    public final Swipe copy(@NotNull Rec rec, @NotNull Type type, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(type, "type");
        C2668g.b(swipeActionContext, "actionContext");
        return new Swipe(rec, type, swipeActionContext);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Swipe) {
                Swipe swipe = (Swipe) obj;
                if (C2668g.a(this.rec, swipe.rec) && C2668g.a(this.type, swipe.type) && C2668g.a(this.actionContext, swipe.actionContext)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Rec rec = this.rec;
        int i = 0;
        int hashCode = (rec != null ? rec.hashCode() : 0) * 31;
        Type type = this.type;
        hashCode = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        SwipeActionContext swipeActionContext = this.actionContext;
        if (swipeActionContext != null) {
            i = swipeActionContext.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Swipe(rec=");
        stringBuilder.append(this.rec);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", actionContext=");
        stringBuilder.append(this.actionContext);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Swipe(@NotNull Rec rec, @NotNull Type type, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(type, "type");
        C2668g.b(swipeActionContext, "actionContext");
        this.rec = rec;
        this.type = type;
        this.actionContext = swipeActionContext;
    }

    @NotNull
    public final Rec getRec() {
        return this.rec;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    @NotNull
    public final SwipeActionContext getActionContext() {
        return this.actionContext;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
