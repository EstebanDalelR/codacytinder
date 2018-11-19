package com.tinder.domain.recs.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.recs.DeepLinkReferralInfo;
import com.tinder.domain.recs.model.UserRec.Teaser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u0013\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u000103H\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0003H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0014\u0010\u0018\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010$R\u0014\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010$R\u0014\u0010\u0013\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010$R\u0014\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010$R\u0014\u0010%\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0014\u0010\u0014\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010$R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010$R\u0014\u0010\u0019\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010$R\u0014\u0010\u001a\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010$R\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/tinder/domain/recs/model/DefaultUserRec;", "Lcom/tinder/domain/recs/model/UserRec;", "id", "", "source", "Lcom/tinder/domain/recs/model/RecSource;", "type", "Lcom/tinder/domain/recs/model/RecType;", "user", "Lcom/tinder/domain/common/model/PerspectableUser;", "name", "age", "contentHash", "sNumber", "", "isSuperLike", "", "isBoost", "isFastMatch", "isBranded", "isSelectMember", "teasers", "", "Lcom/tinder/domain/recs/model/UserRec$Teaser;", "isAlreadyMatched", "isTopPick", "isTraveling", "deepLinkReferralInfo", "Lcom/tinder/domain/recs/DeepLinkReferralInfo;", "(Ljava/lang/String;Lcom/tinder/domain/recs/model/RecSource;Lcom/tinder/domain/recs/model/RecType;Lcom/tinder/domain/common/model/PerspectableUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZZZZLjava/util/List;ZZZLcom/tinder/domain/recs/DeepLinkReferralInfo;)V", "getAge", "()Ljava/lang/String;", "getContentHash", "getDeepLinkReferralInfo", "()Lcom/tinder/domain/recs/DeepLinkReferralInfo;", "getId", "()Z", "isRewindable", "getName", "getSNumber", "()J", "getSource", "()Lcom/tinder/domain/recs/model/RecSource;", "getTeasers", "()Ljava/util/List;", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "getUser", "()Lcom/tinder/domain/common/model/PerspectableUser;", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DefaultUserRec implements UserRec {
    @Nullable
    private final String age;
    @Nullable
    private final String contentHash;
    @Nullable
    private final DeepLinkReferralInfo deepLinkReferralInfo;
    @NotNull
    private final String id;
    private final boolean isAlreadyMatched;
    private final boolean isBoost;
    private final boolean isBranded;
    private final boolean isFastMatch;
    private final boolean isRewindable;
    private final boolean isSelectMember;
    private final boolean isSuperLike;
    private final boolean isTopPick;
    private final boolean isTraveling;
    @NotNull
    private final String name;
    private final long sNumber;
    @NotNull
    private final RecSource source;
    @NotNull
    private final List<Teaser> teasers;
    @NotNull
    private final RecType type;
    @NotNull
    private final PerspectableUser user;

    public DefaultUserRec(@NotNull String str, @NotNull RecSource recSource, @NotNull RecType recType, @NotNull PerspectableUser perspectableUser, @NotNull String str2, @Nullable String str3, @Nullable String str4, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull List<Teaser> list, boolean z6, boolean z7, boolean z8, @Nullable DeepLinkReferralInfo deepLinkReferralInfo) {
        String str5 = str;
        RecSource recSource2 = recSource;
        PerspectableUser perspectableUser2 = perspectableUser;
        String str6 = str2;
        List<Teaser> list2 = list;
        C2668g.b(str5, "id");
        C2668g.b(recSource2, "source");
        RecType recType2 = recType;
        C2668g.b(recType2, "type");
        C2668g.b(perspectableUser2, ManagerWebServices.PARAM_USER);
        C2668g.b(str6, "name");
        C2668g.b(list2, "teasers");
        this.id = str5;
        this.source = recSource2;
        this.user = perspectableUser2;
        this.name = str6;
        this.age = str3;
        this.contentHash = str4;
        this.sNumber = j;
        this.isSuperLike = z;
        this.isBoost = z2;
        this.isFastMatch = z3;
        this.isBranded = z4;
        this.isSelectMember = z5;
        this.teasers = list2;
        this.isAlreadyMatched = z6;
        this.isTopPick = z7;
        this.isTraveling = z8;
        this.deepLinkReferralInfo = deepLinkReferralInfo;
        r0.type = isBranded() ? RecType.BRAND : recType2;
        r0.isRewindable = true;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public RecSource getSource() {
        return this.source;
    }

    public /* synthetic */ DefaultUserRec(String str, RecSource recSource, RecType recType, PerspectableUser perspectableUser, String str2, String str3, String str4, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, boolean z6, boolean z7, boolean z8, DeepLinkReferralInfo deepLinkReferralInfo, int i, C15823e c15823e) {
        RecType recType2;
        if ((i & 4) != 0) {
            recType2 = RecType.USER;
        } else {
            recType2 = recType;
        }
        this(str, recSource, recType2, perspectableUser, str2, str3, str4, j, z, z2, z3, z4, z5, list, z6, z7, z8, (i & 131072) != 0 ? (DeepLinkReferralInfo) null : deepLinkReferralInfo);
    }

    @NotNull
    public PerspectableUser getUser() {
        return this.user;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getAge() {
        return this.age;
    }

    @Nullable
    public String getContentHash() {
        return this.contentHash;
    }

    public long getSNumber() {
        return this.sNumber;
    }

    public boolean isSuperLike() {
        return this.isSuperLike;
    }

    public boolean isBoost() {
        return this.isBoost;
    }

    public boolean isFastMatch() {
        return this.isFastMatch;
    }

    public boolean isBranded() {
        return this.isBranded;
    }

    public boolean isSelectMember() {
        return this.isSelectMember;
    }

    @NotNull
    public List<Teaser> getTeasers() {
        return this.teasers;
    }

    public boolean isAlreadyMatched() {
        return this.isAlreadyMatched;
    }

    public boolean isTopPick() {
        return this.isTopPick;
    }

    public boolean isTraveling() {
        return this.isTraveling;
    }

    @Nullable
    public final DeepLinkReferralInfo getDeepLinkReferralInfo() {
        return this.deepLinkReferralInfo;
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
        if (obj instanceof DefaultUserRec) {
            return C2668g.a(getId(), ((DefaultUserRec) obj).getId());
        }
        return null;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultUserRec{id=");
        stringBuilder.append(getId());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
