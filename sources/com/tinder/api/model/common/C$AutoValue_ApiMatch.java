package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.ApiMatch.Person;
import com.tinder.api.model.common.ApiMatch.Place;
import java.util.List;

/* renamed from: com.tinder.api.model.common.$AutoValue_ApiMatch */
abstract class C$AutoValue_ApiMatch extends ApiMatch {
    private final String _id;
    private final Boolean closed;
    private final Integer commonFriendCount;
    private final Integer commonLikeCount;
    private final String createdDate;
    private final Boolean following;
    private final String id;
    private final Boolean isBoostMatch;
    private final Boolean isFastMatch;
    private final Boolean isNewMessage;
    private final Boolean isPlaceMatch;
    private final Boolean isSuperLike;
    private final Boolean isTopPick;
    private final String lastActivityDate;
    private final Integer messageCount;
    private final List<ApiMessage> messages;
    private final Boolean muted;
    private final List<String> participants;
    private final Boolean pending;
    private final Person person;
    private final Place place;
    private final ApiSeenStatus seenStatus;
    private final String superLiker;
    private final String updateTime;

    C$AutoValue_ApiMatch(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3, @Nullable List<ApiMessage> list, @Nullable List<String> list2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Person person, @Nullable Place place, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool10, @Nullable ApiSeenStatus apiSeenStatus) {
        this._id = str;
        this.id = str2;
        this.closed = bool;
        this.commonFriendCount = num;
        this.commonLikeCount = num2;
        this.createdDate = str3;
        this.lastActivityDate = str4;
        this.messageCount = num3;
        this.messages = list;
        this.participants = list2;
        this.muted = bool2;
        this.pending = bool3;
        this.isSuperLike = bool4;
        this.isBoostMatch = bool5;
        this.isFastMatch = bool6;
        this.isPlaceMatch = bool7;
        this.isTopPick = bool8;
        this.following = bool9;
        this.person = person;
        this.place = place;
        this.updateTime = str5;
        this.superLiker = str6;
        this.isNewMessage = bool10;
        this.seenStatus = apiSeenStatus;
    }

    @Nullable
    public String _id() {
        return this._id;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public Boolean closed() {
        return this.closed;
    }

    @Nullable
    @Json(name = "common_friend_count")
    public Integer commonFriendCount() {
        return this.commonFriendCount;
    }

    @Nullable
    @Json(name = "common_like_count")
    public Integer commonLikeCount() {
        return this.commonLikeCount;
    }

    @Nullable
    @Json(name = "created_date")
    public String createdDate() {
        return this.createdDate;
    }

    @Nullable
    @Json(name = "last_activity_date")
    public String lastActivityDate() {
        return this.lastActivityDate;
    }

    @Nullable
    @Json(name = "message_count")
    public Integer messageCount() {
        return this.messageCount;
    }

    @Nullable
    public List<ApiMessage> messages() {
        return this.messages;
    }

    @Nullable
    public List<String> participants() {
        return this.participants;
    }

    @Nullable
    public Boolean muted() {
        return this.muted;
    }

    @Nullable
    public Boolean pending() {
        return this.pending;
    }

    @Nullable
    @Json(name = "is_super_like")
    public Boolean isSuperLike() {
        return this.isSuperLike;
    }

    @Nullable
    @Json(name = "is_boost_match")
    public Boolean isBoostMatch() {
        return this.isBoostMatch;
    }

    @Nullable
    @Json(name = "is_fast_match")
    public Boolean isFastMatch() {
        return this.isFastMatch;
    }

    @Nullable
    @Json(name = "is_place_match")
    public Boolean isPlaceMatch() {
        return this.isPlaceMatch;
    }

    @Nullable
    @Json(name = "is_top_pick")
    public Boolean isTopPick() {
        return this.isTopPick;
    }

    @Nullable
    public Boolean following() {
        return this.following;
    }

    @Nullable
    public Person person() {
        return this.person;
    }

    @Nullable
    public Place place() {
        return this.place;
    }

    @Nullable
    @Json(name = "update_time")
    public String updateTime() {
        return this.updateTime;
    }

    @Nullable
    @Json(name = "super_liker")
    public String superLiker() {
        return this.superLiker;
    }

    @Nullable
    @Json(name = "is_new_message")
    public Boolean isNewMessage() {
        return this.isNewMessage;
    }

    @Nullable
    @Json(name = "seen")
    public ApiSeenStatus seenStatus() {
        return this.seenStatus;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiMatch{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", closed=");
        stringBuilder.append(this.closed);
        stringBuilder.append(", commonFriendCount=");
        stringBuilder.append(this.commonFriendCount);
        stringBuilder.append(", commonLikeCount=");
        stringBuilder.append(this.commonLikeCount);
        stringBuilder.append(", createdDate=");
        stringBuilder.append(this.createdDate);
        stringBuilder.append(", lastActivityDate=");
        stringBuilder.append(this.lastActivityDate);
        stringBuilder.append(", messageCount=");
        stringBuilder.append(this.messageCount);
        stringBuilder.append(", messages=");
        stringBuilder.append(this.messages);
        stringBuilder.append(", participants=");
        stringBuilder.append(this.participants);
        stringBuilder.append(", muted=");
        stringBuilder.append(this.muted);
        stringBuilder.append(", pending=");
        stringBuilder.append(this.pending);
        stringBuilder.append(", isSuperLike=");
        stringBuilder.append(this.isSuperLike);
        stringBuilder.append(", isBoostMatch=");
        stringBuilder.append(this.isBoostMatch);
        stringBuilder.append(", isFastMatch=");
        stringBuilder.append(this.isFastMatch);
        stringBuilder.append(", isPlaceMatch=");
        stringBuilder.append(this.isPlaceMatch);
        stringBuilder.append(", isTopPick=");
        stringBuilder.append(this.isTopPick);
        stringBuilder.append(", following=");
        stringBuilder.append(this.following);
        stringBuilder.append(", person=");
        stringBuilder.append(this.person);
        stringBuilder.append(", place=");
        stringBuilder.append(this.place);
        stringBuilder.append(", updateTime=");
        stringBuilder.append(this.updateTime);
        stringBuilder.append(", superLiker=");
        stringBuilder.append(this.superLiker);
        stringBuilder.append(", isNewMessage=");
        stringBuilder.append(this.isNewMessage);
        stringBuilder.append(", seenStatus=");
        stringBuilder.append(this.seenStatus);
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
        r1 = r5 instanceof com.tinder.api.model.common.ApiMatch;
        r2 = 0;
        if (r1 == 0) goto L_0x0236;
    L_0x0009:
        r5 = (com.tinder.api.model.common.ApiMatch) r5;
        r1 = r4._id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5._id();
        if (r1 != 0) goto L_0x0234;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4._id;
        r3 = r5._id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0022:
        r1 = r4.id;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0234;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0039:
        r1 = r4.closed;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.closed();
        if (r1 != 0) goto L_0x0234;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.closed;
        r3 = r5.closed();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0050:
        r1 = r4.commonFriendCount;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.commonFriendCount();
        if (r1 != 0) goto L_0x0234;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.commonFriendCount;
        r3 = r5.commonFriendCount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0067:
        r1 = r4.commonLikeCount;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.commonLikeCount();
        if (r1 != 0) goto L_0x0234;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.commonLikeCount;
        r3 = r5.commonLikeCount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x007e:
        r1 = r4.createdDate;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.createdDate();
        if (r1 != 0) goto L_0x0234;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.createdDate;
        r3 = r5.createdDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0095:
        r1 = r4.lastActivityDate;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.lastActivityDate();
        if (r1 != 0) goto L_0x0234;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.lastActivityDate;
        r3 = r5.lastActivityDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x00ac:
        r1 = r4.messageCount;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r1 = r5.messageCount();
        if (r1 != 0) goto L_0x0234;
    L_0x00b6:
        goto L_0x00c3;
    L_0x00b7:
        r1 = r4.messageCount;
        r3 = r5.messageCount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x00c3:
        r1 = r4.messages;
        if (r1 != 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r5.messages();
        if (r1 != 0) goto L_0x0234;
    L_0x00cd:
        goto L_0x00da;
    L_0x00ce:
        r1 = r4.messages;
        r3 = r5.messages();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x00da:
        r1 = r4.participants;
        if (r1 != 0) goto L_0x00e5;
    L_0x00de:
        r1 = r5.participants();
        if (r1 != 0) goto L_0x0234;
    L_0x00e4:
        goto L_0x00f1;
    L_0x00e5:
        r1 = r4.participants;
        r3 = r5.participants();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x00f1:
        r1 = r4.muted;
        if (r1 != 0) goto L_0x00fc;
    L_0x00f5:
        r1 = r5.muted();
        if (r1 != 0) goto L_0x0234;
    L_0x00fb:
        goto L_0x0108;
    L_0x00fc:
        r1 = r4.muted;
        r3 = r5.muted();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0108:
        r1 = r4.pending;
        if (r1 != 0) goto L_0x0113;
    L_0x010c:
        r1 = r5.pending();
        if (r1 != 0) goto L_0x0234;
    L_0x0112:
        goto L_0x011f;
    L_0x0113:
        r1 = r4.pending;
        r3 = r5.pending();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x011f:
        r1 = r4.isSuperLike;
        if (r1 != 0) goto L_0x012a;
    L_0x0123:
        r1 = r5.isSuperLike();
        if (r1 != 0) goto L_0x0234;
    L_0x0129:
        goto L_0x0136;
    L_0x012a:
        r1 = r4.isSuperLike;
        r3 = r5.isSuperLike();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0136:
        r1 = r4.isBoostMatch;
        if (r1 != 0) goto L_0x0141;
    L_0x013a:
        r1 = r5.isBoostMatch();
        if (r1 != 0) goto L_0x0234;
    L_0x0140:
        goto L_0x014d;
    L_0x0141:
        r1 = r4.isBoostMatch;
        r3 = r5.isBoostMatch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x014d:
        r1 = r4.isFastMatch;
        if (r1 != 0) goto L_0x0158;
    L_0x0151:
        r1 = r5.isFastMatch();
        if (r1 != 0) goto L_0x0234;
    L_0x0157:
        goto L_0x0164;
    L_0x0158:
        r1 = r4.isFastMatch;
        r3 = r5.isFastMatch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0164:
        r1 = r4.isPlaceMatch;
        if (r1 != 0) goto L_0x016f;
    L_0x0168:
        r1 = r5.isPlaceMatch();
        if (r1 != 0) goto L_0x0234;
    L_0x016e:
        goto L_0x017b;
    L_0x016f:
        r1 = r4.isPlaceMatch;
        r3 = r5.isPlaceMatch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x017b:
        r1 = r4.isTopPick;
        if (r1 != 0) goto L_0x0186;
    L_0x017f:
        r1 = r5.isTopPick();
        if (r1 != 0) goto L_0x0234;
    L_0x0185:
        goto L_0x0192;
    L_0x0186:
        r1 = r4.isTopPick;
        r3 = r5.isTopPick();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0192:
        r1 = r4.following;
        if (r1 != 0) goto L_0x019d;
    L_0x0196:
        r1 = r5.following();
        if (r1 != 0) goto L_0x0234;
    L_0x019c:
        goto L_0x01a9;
    L_0x019d:
        r1 = r4.following;
        r3 = r5.following();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x01a9:
        r1 = r4.person;
        if (r1 != 0) goto L_0x01b4;
    L_0x01ad:
        r1 = r5.person();
        if (r1 != 0) goto L_0x0234;
    L_0x01b3:
        goto L_0x01c0;
    L_0x01b4:
        r1 = r4.person;
        r3 = r5.person();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x01c0:
        r1 = r4.place;
        if (r1 != 0) goto L_0x01cb;
    L_0x01c4:
        r1 = r5.place();
        if (r1 != 0) goto L_0x0234;
    L_0x01ca:
        goto L_0x01d7;
    L_0x01cb:
        r1 = r4.place;
        r3 = r5.place();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x01d7:
        r1 = r4.updateTime;
        if (r1 != 0) goto L_0x01e2;
    L_0x01db:
        r1 = r5.updateTime();
        if (r1 != 0) goto L_0x0234;
    L_0x01e1:
        goto L_0x01ee;
    L_0x01e2:
        r1 = r4.updateTime;
        r3 = r5.updateTime();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x01ee:
        r1 = r4.superLiker;
        if (r1 != 0) goto L_0x01f9;
    L_0x01f2:
        r1 = r5.superLiker();
        if (r1 != 0) goto L_0x0234;
    L_0x01f8:
        goto L_0x0205;
    L_0x01f9:
        r1 = r4.superLiker;
        r3 = r5.superLiker();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x0205:
        r1 = r4.isNewMessage;
        if (r1 != 0) goto L_0x0210;
    L_0x0209:
        r1 = r5.isNewMessage();
        if (r1 != 0) goto L_0x0234;
    L_0x020f:
        goto L_0x021c;
    L_0x0210:
        r1 = r4.isNewMessage;
        r3 = r5.isNewMessage();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0234;
    L_0x021c:
        r1 = r4.seenStatus;
        if (r1 != 0) goto L_0x0227;
    L_0x0220:
        r5 = r5.seenStatus();
        if (r5 != 0) goto L_0x0234;
    L_0x0226:
        goto L_0x0235;
    L_0x0227:
        r1 = r4.seenStatus;
        r5 = r5.seenStatus();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0234;
    L_0x0233:
        goto L_0x0235;
    L_0x0234:
        r0 = 0;
    L_0x0235:
        return r0;
    L_0x0236:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_ApiMatch.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((this._id == null ? 0 : this._id.hashCode()) ^ 1000003) * 1000003) ^ (this.id == null ? 0 : this.id.hashCode())) * 1000003) ^ (this.closed == null ? 0 : this.closed.hashCode())) * 1000003) ^ (this.commonFriendCount == null ? 0 : this.commonFriendCount.hashCode())) * 1000003) ^ (this.commonLikeCount == null ? 0 : this.commonLikeCount.hashCode())) * 1000003) ^ (this.createdDate == null ? 0 : this.createdDate.hashCode())) * 1000003) ^ (this.lastActivityDate == null ? 0 : this.lastActivityDate.hashCode())) * 1000003) ^ (this.messageCount == null ? 0 : this.messageCount.hashCode())) * 1000003) ^ (this.messages == null ? 0 : this.messages.hashCode())) * 1000003) ^ (this.participants == null ? 0 : this.participants.hashCode())) * 1000003) ^ (this.muted == null ? 0 : this.muted.hashCode())) * 1000003) ^ (this.pending == null ? 0 : this.pending.hashCode())) * 1000003) ^ (this.isSuperLike == null ? 0 : this.isSuperLike.hashCode())) * 1000003) ^ (this.isBoostMatch == null ? 0 : this.isBoostMatch.hashCode())) * 1000003) ^ (this.isFastMatch == null ? 0 : this.isFastMatch.hashCode())) * 1000003) ^ (this.isPlaceMatch == null ? 0 : this.isPlaceMatch.hashCode())) * 1000003) ^ (this.isTopPick == null ? 0 : this.isTopPick.hashCode())) * 1000003) ^ (this.following == null ? 0 : this.following.hashCode())) * 1000003) ^ (this.person == null ? 0 : this.person.hashCode())) * 1000003) ^ (this.place == null ? 0 : this.place.hashCode())) * 1000003) ^ (this.updateTime == null ? 0 : this.updateTime.hashCode())) * 1000003) ^ (this.superLiker == null ? 0 : this.superLiker.hashCode())) * 1000003) ^ (this.isNewMessage == null ? 0 : this.isNewMessage.hashCode())) * 1000003;
        if (this.seenStatus != null) {
            i = this.seenStatus.hashCode();
        }
        return hashCode ^ i;
    }
}
