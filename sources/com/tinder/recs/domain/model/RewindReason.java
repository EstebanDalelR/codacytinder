package com.tinder.recs.domain.model;

import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.RecsUpdate.Rewind.Reason;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason;", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "()V", "Companion", "LikeFailed", "ManualUserAction", "OutOfLikesBouncer", "OutOfSuperLikesBouncer", "SuperLikeFailed", "Unknown", "Lcom/tinder/recs/domain/model/RewindReason$ManualUserAction;", "Lcom/tinder/recs/domain/model/RewindReason$OutOfLikesBouncer;", "Lcom/tinder/recs/domain/model/RewindReason$OutOfSuperLikesBouncer;", "Lcom/tinder/recs/domain/model/RewindReason$LikeFailed;", "Lcom/tinder/recs/domain/model/RewindReason$SuperLikeFailed;", "Lcom/tinder/recs/domain/model/RewindReason$Unknown;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class RewindReason implements Reason {
    public static final Companion Companion = new Companion();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason$Companion;", "", "()V", "fromEndedRatingStatus", "Lcom/tinder/recs/domain/model/RewindReason;", "ratingStatus", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {

        @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[RatingResult.values().length];
            public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[RatingResult.values().length];
            public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[Type.values().length];

            static {
                $EnumSwitchMapping$0[RatingResult.BOUNCER.ordinal()] = 1;
                $EnumSwitchMapping$1[RatingResult.BOUNCER.ordinal()] = 1;
                $EnumSwitchMapping$2[Type.LIKE.ordinal()] = 1;
                $EnumSwitchMapping$2[Type.SUPERLIKE.ordinal()] = 2;
                $EnumSwitchMapping$2[Type.PASS.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        @NotNull
        public final RewindReason fromEndedRatingStatus(@NotNull Ended ended) {
            C2668g.b(ended, "ratingStatus");
            if (ended.getRatingResult() == RatingResult.SUCCESSFUL) {
                return (RewindReason) new Unknown("RatingResult.SUCCESSFUL should never cause a rewind.");
            }
            switch (WhenMappings.$EnumSwitchMapping$2[ended.getSwipe().getType().ordinal()]) {
                case 1:
                    if (WhenMappings.$EnumSwitchMapping$0[ended.getRatingResult().ordinal()] == 1) {
                        ended = (RewindReason) OutOfLikesBouncer.INSTANCE;
                        break;
                    }
                    ended = (RewindReason) LikeFailed.INSTANCE;
                    break;
                case 2:
                    if (WhenMappings.$EnumSwitchMapping$1[ended.getRatingResult().ordinal()] == 1) {
                        ended = (RewindReason) OutOfSuperLikesBouncer.INSTANCE;
                        break;
                    }
                    ended = (RewindReason) SuperLikeFailed.INSTANCE;
                    break;
                case 3:
                    ended = (RewindReason) new Unknown("Swipe.Type.PASS should never cause a rewind.");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return ended;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason$LikeFailed;", "Lcom/tinder/recs/domain/model/RewindReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class LikeFailed extends RewindReason {
        public static final LikeFailed INSTANCE = new LikeFailed();

        private LikeFailed() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason$ManualUserAction;", "Lcom/tinder/recs/domain/model/RewindReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ManualUserAction extends RewindReason {
        public static final ManualUserAction INSTANCE = new ManualUserAction();

        private ManualUserAction() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason$OutOfLikesBouncer;", "Lcom/tinder/recs/domain/model/RewindReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class OutOfLikesBouncer extends RewindReason {
        public static final OutOfLikesBouncer INSTANCE = new OutOfLikesBouncer();

        private OutOfLikesBouncer() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason$OutOfSuperLikesBouncer;", "Lcom/tinder/recs/domain/model/RewindReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class OutOfSuperLikesBouncer extends RewindReason {
        public static final OutOfSuperLikesBouncer INSTANCE = new OutOfSuperLikesBouncer();

        private OutOfSuperLikesBouncer() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason$SuperLikeFailed;", "Lcom/tinder/recs/domain/model/RewindReason;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SuperLikeFailed extends RewindReason {
        public static final SuperLikeFailed INSTANCE = new SuperLikeFailed();

        private SuperLikeFailed() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/recs/domain/model/RewindReason$Unknown;", "Lcom/tinder/recs/domain/model/RewindReason;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Unknown extends RewindReason {
        @NotNull
        private final String message;

        @NotNull
        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            return unknown.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final Unknown copy(@NotNull String str) {
            C2668g.b(str, "message");
            return new Unknown(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Unknown) {
                    if (C2668g.a(this.message, ((Unknown) obj).message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.message;
            return str != null ? str.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown(message=");
            stringBuilder.append(this.message);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Unknown(@NotNull String str) {
            C2668g.b(str, "message");
            super();
            this.message = str;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }
    }

    private RewindReason() {
    }
}
