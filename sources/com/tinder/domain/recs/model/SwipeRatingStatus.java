package com.tinder.domain.recs.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "", "()V", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "Ended", "InProgress", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$InProgress;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "engine_release"}, k = 1, mv = {1, 1, 9})
public abstract class SwipeRatingStatus {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "ratingResult", "Lcom/tinder/domain/recs/model/RatingResult;", "(Lcom/tinder/domain/recs/model/Swipe;Lcom/tinder/domain/recs/model/RatingResult;)V", "getRatingResult", "()Lcom/tinder/domain/recs/model/RatingResult;", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Ended extends SwipeRatingStatus {
        @NotNull
        private final RatingResult ratingResult;
        @NotNull
        private final Swipe swipe;

        public Ended(@NotNull Swipe swipe, @NotNull RatingResult ratingResult) {
            C2668g.b(swipe, "swipe");
            C2668g.b(ratingResult, "ratingResult");
            super();
            this.swipe = swipe;
            this.ratingResult = ratingResult;
        }

        @NotNull
        public final RatingResult getRatingResult() {
            return this.ratingResult;
        }

        @NotNull
        public Swipe getSwipe() {
            return this.swipe;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/model/SwipeRatingStatus$InProgress;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "(Lcom/tinder/domain/recs/model/Swipe;)V", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class InProgress extends SwipeRatingStatus {
        @NotNull
        private final Swipe swipe;

        @NotNull
        public static /* synthetic */ InProgress copy$default(InProgress inProgress, Swipe swipe, int i, Object obj) {
            if ((i & 1) != 0) {
                swipe = inProgress.getSwipe();
            }
            return inProgress.copy(swipe);
        }

        @NotNull
        public final Swipe component1() {
            return getSwipe();
        }

        @NotNull
        public final InProgress copy(@NotNull Swipe swipe) {
            C2668g.b(swipe, "swipe");
            return new InProgress(swipe);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InProgress) {
                    if (C2668g.a(getSwipe(), ((InProgress) obj).getSwipe())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Swipe swipe = getSwipe();
            return swipe != null ? swipe.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("InProgress(swipe=");
            stringBuilder.append(getSwipe());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public InProgress(@NotNull Swipe swipe) {
            C2668g.b(swipe, "swipe");
            super();
            this.swipe = swipe;
        }

        @NotNull
        public Swipe getSwipe() {
            return this.swipe;
        }
    }

    @NotNull
    public abstract Swipe getSwipe();

    private SwipeRatingStatus() {
    }
}
