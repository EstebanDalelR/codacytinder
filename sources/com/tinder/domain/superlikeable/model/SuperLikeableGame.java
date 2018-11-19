package com.tinder.domain.superlikeable.model;

import com.tinder.domain.recs.model.UserRec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0015J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "", "tokenId", "", "injectionSwipeThreshold", "", "superLikeableRecs", "", "Lcom/tinder/domain/recs/model/UserRec;", "(Ljava/lang/String;ILjava/util/List;)V", "getInjectionSwipeThreshold", "()I", "getSuperLikeableRecs", "()Ljava/util/List;", "getTokenId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "isPlayable", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGame {
    private final int injectionSwipeThreshold;
    @NotNull
    private final List<UserRec> superLikeableRecs;
    @NotNull
    private final String tokenId;

    @NotNull
    public static /* synthetic */ SuperLikeableGame copy$default(SuperLikeableGame superLikeableGame, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = superLikeableGame.tokenId;
        }
        if ((i2 & 2) != 0) {
            i = superLikeableGame.injectionSwipeThreshold;
        }
        if ((i2 & 4) != 0) {
            list = superLikeableGame.superLikeableRecs;
        }
        return superLikeableGame.copy(str, i, list);
    }

    @NotNull
    public final String component1() {
        return this.tokenId;
    }

    public final int component2() {
        return this.injectionSwipeThreshold;
    }

    @NotNull
    public final List<UserRec> component3() {
        return this.superLikeableRecs;
    }

    @NotNull
    public final SuperLikeableGame copy(@NotNull String str, int i, @NotNull List<? extends UserRec> list) {
        C2668g.b(str, "tokenId");
        C2668g.b(list, "superLikeableRecs");
        return new SuperLikeableGame(str, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuperLikeableGame) {
            SuperLikeableGame superLikeableGame = (SuperLikeableGame) obj;
            if (C2668g.a(this.tokenId, superLikeableGame.tokenId)) {
                return (this.injectionSwipeThreshold == superLikeableGame.injectionSwipeThreshold ? 1 : null) != null && C2668g.a(this.superLikeableRecs, superLikeableGame.superLikeableRecs);
            }
        }
    }

    public int hashCode() {
        String str = this.tokenId;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.injectionSwipeThreshold) * 31;
        List list = this.superLikeableRecs;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikeableGame(tokenId=");
        stringBuilder.append(this.tokenId);
        stringBuilder.append(", injectionSwipeThreshold=");
        stringBuilder.append(this.injectionSwipeThreshold);
        stringBuilder.append(", superLikeableRecs=");
        stringBuilder.append(this.superLikeableRecs);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SuperLikeableGame(@NotNull String str, int i, @NotNull List<? extends UserRec> list) {
        C2668g.b(str, "tokenId");
        C2668g.b(list, "superLikeableRecs");
        this.tokenId = str;
        this.injectionSwipeThreshold = i;
        this.superLikeableRecs = list;
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    public final int getInjectionSwipeThreshold() {
        return this.injectionSwipeThreshold;
    }

    @NotNull
    public final List<UserRec> getSuperLikeableRecs() {
        return this.superLikeableRecs;
    }

    public final boolean isPlayable() {
        return this.superLikeableRecs.size() >= 4;
    }
}
