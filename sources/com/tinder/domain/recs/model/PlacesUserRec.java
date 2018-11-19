package com.tinder.domain.recs.model;

import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.recs.model.UserRec.Teaser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000104H\u0002J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0007H\u0016R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0013\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0012\u0010\u0015\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0012\u0010\u0016\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0012\u0010\u0017\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0012\u0010\u0019\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0012\u0010\u001a\u001a\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u0012\u0010\u001d\u001a\u00020\u001eX\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00068"}, d2 = {"Lcom/tinder/domain/recs/model/PlacesUserRec;", "Lcom/tinder/domain/recs/model/UserRec;", "defaultUserRec", "Lcom/tinder/domain/recs/model/DefaultUserRec;", "isNew", "", "placeId", "", "(Lcom/tinder/domain/recs/model/DefaultUserRec;ZLjava/lang/String;)V", "age", "getAge", "()Ljava/lang/String;", "contentHash", "getContentHash", "id", "getId", "isAlreadyMatched", "()Z", "isBoost", "isBranded", "isFastMatch", "isRewindable", "isSelectMember", "isSuperLike", "isTopPick", "isTraveling", "name", "getName", "getPlaceId", "sNumber", "", "getSNumber", "()J", "source", "Lcom/tinder/domain/recs/model/Rec$Source;", "getSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "teasers", "", "Lcom/tinder/domain/recs/model/UserRec$Teaser;", "getTeasers", "()Ljava/util/List;", "type", "Lcom/tinder/domain/recs/model/RecType;", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "user", "Lcom/tinder/domain/common/model/PerspectableUser;", "getUser", "()Lcom/tinder/domain/common/model/PerspectableUser;", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesUserRec implements UserRec {
    private final /* synthetic */ DefaultUserRec $$delegate_0;
    private final boolean isFastMatch;
    private final boolean isNew;
    private final boolean isTopPick;
    @NotNull
    private final String placeId;
    @NotNull
    private final RecType type = RecType.USER;

    @Nullable
    public String getAge() {
        return this.$$delegate_0.getAge();
    }

    @Nullable
    public String getContentHash() {
        return this.$$delegate_0.getContentHash();
    }

    @NotNull
    public String getId() {
        return this.$$delegate_0.getId();
    }

    @NotNull
    public String getName() {
        return this.$$delegate_0.getName();
    }

    public long getSNumber() {
        return this.$$delegate_0.getSNumber();
    }

    @NotNull
    public Rec$Source getSource() {
        return this.$$delegate_0.getSource();
    }

    @NotNull
    public List<Teaser> getTeasers() {
        return this.$$delegate_0.getTeasers();
    }

    @NotNull
    public PerspectableUser getUser() {
        return this.$$delegate_0.getUser();
    }

    public boolean isAlreadyMatched() {
        return this.$$delegate_0.isAlreadyMatched();
    }

    public boolean isBoost() {
        return this.$$delegate_0.isBoost();
    }

    public boolean isBranded() {
        return this.$$delegate_0.isBranded();
    }

    public boolean isRewindable() {
        return this.$$delegate_0.isRewindable();
    }

    public boolean isSelectMember() {
        return this.$$delegate_0.isSelectMember();
    }

    public boolean isSuperLike() {
        return this.$$delegate_0.isSuperLike();
    }

    public boolean isTraveling() {
        return this.$$delegate_0.isTraveling();
    }

    public PlacesUserRec(@NotNull DefaultUserRec defaultUserRec, boolean z, @NotNull String str) {
        C2668g.b(defaultUserRec, "defaultUserRec");
        C2668g.b(str, "placeId");
        this.$$delegate_0 = defaultUserRec;
        this.isNew = z;
        this.placeId = str;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    @NotNull
    public final String getPlaceId() {
        return this.placeId;
    }

    @NotNull
    public RecType getType() {
        return this.type;
    }

    public boolean isTopPick() {
        return this.isTopPick;
    }

    public boolean isFastMatch() {
        return this.isFastMatch;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacesUserRec) {
            return C2668g.a(getId(), ((PlacesUserRec) obj).getId());
        }
        return null;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesUserRec{id=");
        stringBuilder.append(getId());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
