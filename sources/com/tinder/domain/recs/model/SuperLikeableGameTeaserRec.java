package com.tinder.domain.recs.model;

import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/recs/model/SuperLikeableGameTeaserRec;", "Lcom/tinder/domain/recs/model/Rec;", "source", "Lcom/tinder/domain/recs/model/RecSource;", "superLikeableGame", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "(Lcom/tinder/domain/recs/model/RecSource;Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;)V", "id", "", "getId", "()Ljava/lang/String;", "isRewindable", "", "()Z", "getSource", "()Lcom/tinder/domain/recs/model/RecSource;", "getSuperLikeableGame", "()Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "type", "Lcom/tinder/domain/recs/model/RecType;", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGameTeaserRec implements Rec {
    @NotNull
    private final String id = this.superLikeableGame.getTokenId();
    private final boolean isRewindable;
    @NotNull
    private final RecSource source;
    @NotNull
    private final SuperLikeableGame superLikeableGame;
    @NotNull
    private final RecType type = RecType.SUPER_LIKABLE_GAME;

    @NotNull
    public static /* synthetic */ SuperLikeableGameTeaserRec copy$default(SuperLikeableGameTeaserRec superLikeableGameTeaserRec, RecSource recSource, SuperLikeableGame superLikeableGame, int i, Object obj) {
        if ((i & 1) != 0) {
            recSource = superLikeableGameTeaserRec.getSource();
        }
        if ((i & 2) != 0) {
            superLikeableGame = superLikeableGameTeaserRec.superLikeableGame;
        }
        return superLikeableGameTeaserRec.copy(recSource, superLikeableGame);
    }

    @NotNull
    public final RecSource component1() {
        return getSource();
    }

    @NotNull
    public final SuperLikeableGame component2() {
        return this.superLikeableGame;
    }

    @NotNull
    public final SuperLikeableGameTeaserRec copy(@NotNull RecSource recSource, @NotNull SuperLikeableGame superLikeableGame) {
        C2668g.b(recSource, "source");
        C2668g.b(superLikeableGame, "superLikeableGame");
        return new SuperLikeableGameTeaserRec(recSource, superLikeableGame);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikeableGameTeaserRec(source=");
        stringBuilder.append(getSource());
        stringBuilder.append(", superLikeableGame=");
        stringBuilder.append(this.superLikeableGame);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SuperLikeableGameTeaserRec(@NotNull RecSource recSource, @NotNull SuperLikeableGame superLikeableGame) {
        C2668g.b(recSource, "source");
        C2668g.b(superLikeableGame, "superLikeableGame");
        this.source = recSource;
        this.superLikeableGame = superLikeableGame;
    }

    @NotNull
    public RecSource getSource() {
        return this.source;
    }

    @NotNull
    public final SuperLikeableGame getSuperLikeableGame() {
        return this.superLikeableGame;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public RecType getType() {
        return this.type;
    }

    public boolean isRewindable() {
        return this.isRewindable;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuperLikeableGameTeaserRec) {
            return C2668g.a(getId(), ((SuperLikeableGameTeaserRec) obj).getId());
        }
        return null;
    }

    public int hashCode() {
        return getId().hashCode();
    }
}
