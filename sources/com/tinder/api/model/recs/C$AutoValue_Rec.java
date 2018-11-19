package com.tinder.api.model.recs;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.Instagram;
import com.tinder.api.model.common.Teaser;
import com.tinder.api.model.profile.Facebook;
import com.tinder.api.model.recs.Rec.Spotify;
import com.tinder.api.model.recs.Rec.User;
import com.tinder.api.model.toppicks.Tagging;
import java.util.List;

/* renamed from: com.tinder.api.model.recs.$AutoValue_Rec */
abstract class C$AutoValue_Rec extends Rec {
    private final String contentHash;
    private final Integer distanceMi;
    private final Long expirationTime;
    private final Facebook facebook;
    private final Instagram instagram;
    private final Boolean isAlreadyMatched;
    private final Boolean isBoost;
    private final Boolean isFastMatch;
    private final Boolean isGroupMatched;
    private final Boolean isNew;
    private final Boolean isSuperLike;
    private final Boolean isTopPick;
    private final Long sNumber;
    private final Spotify spotify;
    private final Tagging tagging;
    private final List<Teaser> teasers;
    private final Integer topPickType;
    private final String type;
    private final User user;

    C$AutoValue_Rec(@Nullable String str, @Nullable User user, @Nullable Instagram instagram, @Nullable Facebook facebook, @Nullable Spotify spotify, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable Long l, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable List<Teaser> list, @Nullable Integer num2, @Nullable Tagging tagging, @Nullable Long l2, @Nullable Boolean bool7) {
        this.type = str;
        this.user = user;
        this.instagram = instagram;
        this.facebook = facebook;
        this.spotify = spotify;
        this.isGroupMatched = bool;
        this.distanceMi = num;
        this.contentHash = str2;
        this.sNumber = l;
        this.isBoost = bool2;
        this.isFastMatch = bool3;
        this.isTopPick = bool4;
        this.isSuperLike = bool5;
        this.isAlreadyMatched = bool6;
        this.teasers = list;
        this.topPickType = num2;
        this.tagging = tagging;
        this.expirationTime = l2;
        this.isNew = bool7;
    }

    @Nullable
    public String type() {
        return this.type;
    }

    @Nullable
    public User user() {
        return this.user;
    }

    @Nullable
    public Instagram instagram() {
        return this.instagram;
    }

    @Nullable
    public Facebook facebook() {
        return this.facebook;
    }

    @Nullable
    public Spotify spotify() {
        return this.spotify;
    }

    @Nullable
    @Json(name = "group_matched")
    public Boolean isGroupMatched() {
        return this.isGroupMatched;
    }

    @Nullable
    @Json(name = "distance_mi")
    public Integer distanceMi() {
        return this.distanceMi;
    }

    @Nullable
    @Json(name = "content_hash")
    public String contentHash() {
        return this.contentHash;
    }

    @Nullable
    @Json(name = "s_number")
    public Long sNumber() {
        return this.sNumber;
    }

    @Nullable
    @Json(name = "is_boost")
    public Boolean isBoost() {
        return this.isBoost;
    }

    @Nullable
    @Json(name = "is_fast_match")
    public Boolean isFastMatch() {
        return this.isFastMatch;
    }

    @Nullable
    @Json(name = "is_top_pick")
    public Boolean isTopPick() {
        return this.isTopPick;
    }

    @Nullable
    @Json(name = "is_super_like")
    public Boolean isSuperLike() {
        return this.isSuperLike;
    }

    @Nullable
    @Json(name = "already_matched")
    public Boolean isAlreadyMatched() {
        return this.isAlreadyMatched;
    }

    @Nullable
    public List<Teaser> teasers() {
        return this.teasers;
    }

    @Nullable
    @Json(name = "tp_type")
    public Integer topPickType() {
        return this.topPickType;
    }

    @Nullable
    @Json(name = "tagging")
    public Tagging tagging() {
        return this.tagging;
    }

    @Nullable
    @Json(name = "expire_time")
    public Long expirationTime() {
        return this.expirationTime;
    }

    @Nullable
    @Json(name = "is_new")
    public Boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rec{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", user=");
        stringBuilder.append(this.user);
        stringBuilder.append(", instagram=");
        stringBuilder.append(this.instagram);
        stringBuilder.append(", facebook=");
        stringBuilder.append(this.facebook);
        stringBuilder.append(", spotify=");
        stringBuilder.append(this.spotify);
        stringBuilder.append(", isGroupMatched=");
        stringBuilder.append(this.isGroupMatched);
        stringBuilder.append(", distanceMi=");
        stringBuilder.append(this.distanceMi);
        stringBuilder.append(", contentHash=");
        stringBuilder.append(this.contentHash);
        stringBuilder.append(", sNumber=");
        stringBuilder.append(this.sNumber);
        stringBuilder.append(", isBoost=");
        stringBuilder.append(this.isBoost);
        stringBuilder.append(", isFastMatch=");
        stringBuilder.append(this.isFastMatch);
        stringBuilder.append(", isTopPick=");
        stringBuilder.append(this.isTopPick);
        stringBuilder.append(", isSuperLike=");
        stringBuilder.append(this.isSuperLike);
        stringBuilder.append(", isAlreadyMatched=");
        stringBuilder.append(this.isAlreadyMatched);
        stringBuilder.append(", teasers=");
        stringBuilder.append(this.teasers);
        stringBuilder.append(", topPickType=");
        stringBuilder.append(this.topPickType);
        stringBuilder.append(", tagging=");
        stringBuilder.append(this.tagging);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", isNew=");
        stringBuilder.append(this.isNew);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.recs.Rec;
        r2 = 0;
        if (r1 == 0) goto L_0x01c3;
    L_0x0009:
        r5 = (com.tinder.api.model.recs.Rec) r5;
        r1 = r4.type;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.type();
        if (r1 != 0) goto L_0x01c1;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.type;
        r3 = r5.type();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0022:
        r1 = r4.user;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.user();
        if (r1 != 0) goto L_0x01c1;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.user;
        r3 = r5.user();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0039:
        r1 = r4.instagram;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.instagram();
        if (r1 != 0) goto L_0x01c1;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.instagram;
        r3 = r5.instagram();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0050:
        r1 = r4.facebook;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.facebook();
        if (r1 != 0) goto L_0x01c1;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.facebook;
        r3 = r5.facebook();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0067:
        r1 = r4.spotify;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.spotify();
        if (r1 != 0) goto L_0x01c1;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.spotify;
        r3 = r5.spotify();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x007e:
        r1 = r4.isGroupMatched;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.isGroupMatched();
        if (r1 != 0) goto L_0x01c1;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.isGroupMatched;
        r3 = r5.isGroupMatched();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0095:
        r1 = r4.distanceMi;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.distanceMi();
        if (r1 != 0) goto L_0x01c1;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.distanceMi;
        r3 = r5.distanceMi();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x00ac:
        r1 = r4.contentHash;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r1 = r5.contentHash();
        if (r1 != 0) goto L_0x01c1;
    L_0x00b6:
        goto L_0x00c3;
    L_0x00b7:
        r1 = r4.contentHash;
        r3 = r5.contentHash();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x00c3:
        r1 = r4.sNumber;
        if (r1 != 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r5.sNumber();
        if (r1 != 0) goto L_0x01c1;
    L_0x00cd:
        goto L_0x00da;
    L_0x00ce:
        r1 = r4.sNumber;
        r3 = r5.sNumber();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x00da:
        r1 = r4.isBoost;
        if (r1 != 0) goto L_0x00e5;
    L_0x00de:
        r1 = r5.isBoost();
        if (r1 != 0) goto L_0x01c1;
    L_0x00e4:
        goto L_0x00f1;
    L_0x00e5:
        r1 = r4.isBoost;
        r3 = r5.isBoost();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x00f1:
        r1 = r4.isFastMatch;
        if (r1 != 0) goto L_0x00fc;
    L_0x00f5:
        r1 = r5.isFastMatch();
        if (r1 != 0) goto L_0x01c1;
    L_0x00fb:
        goto L_0x0108;
    L_0x00fc:
        r1 = r4.isFastMatch;
        r3 = r5.isFastMatch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0108:
        r1 = r4.isTopPick;
        if (r1 != 0) goto L_0x0113;
    L_0x010c:
        r1 = r5.isTopPick();
        if (r1 != 0) goto L_0x01c1;
    L_0x0112:
        goto L_0x011f;
    L_0x0113:
        r1 = r4.isTopPick;
        r3 = r5.isTopPick();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x011f:
        r1 = r4.isSuperLike;
        if (r1 != 0) goto L_0x012a;
    L_0x0123:
        r1 = r5.isSuperLike();
        if (r1 != 0) goto L_0x01c1;
    L_0x0129:
        goto L_0x0136;
    L_0x012a:
        r1 = r4.isSuperLike;
        r3 = r5.isSuperLike();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0136:
        r1 = r4.isAlreadyMatched;
        if (r1 != 0) goto L_0x0141;
    L_0x013a:
        r1 = r5.isAlreadyMatched();
        if (r1 != 0) goto L_0x01c1;
    L_0x0140:
        goto L_0x014d;
    L_0x0141:
        r1 = r4.isAlreadyMatched;
        r3 = r5.isAlreadyMatched();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x014d:
        r1 = r4.teasers;
        if (r1 != 0) goto L_0x0158;
    L_0x0151:
        r1 = r5.teasers();
        if (r1 != 0) goto L_0x01c1;
    L_0x0157:
        goto L_0x0164;
    L_0x0158:
        r1 = r4.teasers;
        r3 = r5.teasers();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0164:
        r1 = r4.topPickType;
        if (r1 != 0) goto L_0x016f;
    L_0x0168:
        r1 = r5.topPickType();
        if (r1 != 0) goto L_0x01c1;
    L_0x016e:
        goto L_0x017b;
    L_0x016f:
        r1 = r4.topPickType;
        r3 = r5.topPickType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x017b:
        r1 = r4.tagging;
        if (r1 != 0) goto L_0x0186;
    L_0x017f:
        r1 = r5.tagging();
        if (r1 != 0) goto L_0x01c1;
    L_0x0185:
        goto L_0x0192;
    L_0x0186:
        r1 = r4.tagging;
        r3 = r5.tagging();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x0192:
        r1 = r4.expirationTime;
        if (r1 != 0) goto L_0x019d;
    L_0x0196:
        r1 = r5.expirationTime();
        if (r1 != 0) goto L_0x01c1;
    L_0x019c:
        goto L_0x01a9;
    L_0x019d:
        r1 = r4.expirationTime;
        r3 = r5.expirationTime();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x01c1;
    L_0x01a9:
        r1 = r4.isNew;
        if (r1 != 0) goto L_0x01b4;
    L_0x01ad:
        r5 = r5.isNew();
        if (r5 != 0) goto L_0x01c1;
    L_0x01b3:
        goto L_0x01c2;
    L_0x01b4:
        r1 = r4.isNew;
        r5 = r5.isNew();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01c2;
    L_0x01c1:
        r0 = 0;
    L_0x01c2:
        return r0;
    L_0x01c3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.recs.$AutoValue_Rec.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((((((((((((this.type == null ? 0 : this.type.hashCode()) ^ 1000003) * 1000003) ^ (this.user == null ? 0 : this.user.hashCode())) * 1000003) ^ (this.instagram == null ? 0 : this.instagram.hashCode())) * 1000003) ^ (this.facebook == null ? 0 : this.facebook.hashCode())) * 1000003) ^ (this.spotify == null ? 0 : this.spotify.hashCode())) * 1000003) ^ (this.isGroupMatched == null ? 0 : this.isGroupMatched.hashCode())) * 1000003) ^ (this.distanceMi == null ? 0 : this.distanceMi.hashCode())) * 1000003) ^ (this.contentHash == null ? 0 : this.contentHash.hashCode())) * 1000003) ^ (this.sNumber == null ? 0 : this.sNumber.hashCode())) * 1000003) ^ (this.isBoost == null ? 0 : this.isBoost.hashCode())) * 1000003) ^ (this.isFastMatch == null ? 0 : this.isFastMatch.hashCode())) * 1000003) ^ (this.isTopPick == null ? 0 : this.isTopPick.hashCode())) * 1000003) ^ (this.isSuperLike == null ? 0 : this.isSuperLike.hashCode())) * 1000003) ^ (this.isAlreadyMatched == null ? 0 : this.isAlreadyMatched.hashCode())) * 1000003) ^ (this.teasers == null ? 0 : this.teasers.hashCode())) * 1000003) ^ (this.topPickType == null ? 0 : this.topPickType.hashCode())) * 1000003) ^ (this.tagging == null ? 0 : this.tagging.hashCode())) * 1000003) ^ (this.expirationTime == null ? 0 : this.expirationTime.hashCode())) * 1000003;
        if (this.isNew != null) {
            i = this.isNew.hashCode();
        }
        return hashCode ^ i;
    }
}
