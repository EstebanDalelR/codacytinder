package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import com.tinder.api.model.activityfeed.ApiActivityFeedItem;
import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u00108\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018¨\u0006?"}, d2 = {"Lcom/tinder/api/model/common/ApiMessage;", "", "id", "", "type", "matchId", "to", "from", "message", "sentDate", "fixedHeightUrl", "reactionId", "activityFeed", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedItem;", "media", "Lcom/tinder/api/model/common/ApiMessageMedia;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/api/model/activityfeed/ApiActivityFeedItem;Lcom/tinder/api/model/common/ApiMessageMedia;)V", "getActivityFeed", "()Lcom/tinder/api/model/activityfeed/ApiActivityFeedItem;", "setActivityFeed", "(Lcom/tinder/api/model/activityfeed/ApiActivityFeedItem;)V", "getFixedHeightUrl", "()Ljava/lang/String;", "setFixedHeightUrl", "(Ljava/lang/String;)V", "getFrom", "setFrom", "getId", "setId", "getMatchId", "setMatchId", "getMedia", "()Lcom/tinder/api/model/common/ApiMessageMedia;", "setMedia", "(Lcom/tinder/api/model/common/ApiMessageMedia;)V", "getMessage", "setMessage", "getReactionId", "setReactionId", "getSentDate", "setSentDate", "getTo", "setTo", "getType", "setType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiMessage {
    @Nullable
    private ApiActivityFeedItem activityFeed;
    @Nullable
    private String fixedHeightUrl;
    @Nullable
    private String from;
    @Nullable
    private String id;
    @Nullable
    private String matchId;
    @Nullable
    private ApiMessageMedia media;
    @Nullable
    private String message;
    @Nullable
    private String reactionId;
    @Nullable
    private String sentDate;
    @Nullable
    private String to;
    @Nullable
    private String type;

    @NotNull
    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ApiActivityFeedItem apiActivityFeedItem, ApiMessageMedia apiMessageMedia, int i, Object obj) {
        ApiMessage apiMessage2 = apiMessage;
        int i2 = i;
        return apiMessage2.copy((i2 & 1) != 0 ? apiMessage2.id : str, (i2 & 2) != 0 ? apiMessage2.type : str2, (i2 & 4) != 0 ? apiMessage2.matchId : str3, (i2 & 8) != 0 ? apiMessage2.to : str4, (i2 & 16) != 0 ? apiMessage2.from : str5, (i2 & 32) != 0 ? apiMessage2.message : str6, (i2 & 64) != 0 ? apiMessage2.sentDate : str7, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? apiMessage2.fixedHeightUrl : str8, (i2 & 256) != 0 ? apiMessage2.reactionId : str9, (i2 & 512) != 0 ? apiMessage2.activityFeed : apiActivityFeedItem, (i2 & 1024) != 0 ? apiMessage2.media : apiMessageMedia);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final ApiActivityFeedItem component10() {
        return this.activityFeed;
    }

    @Nullable
    public final ApiMessageMedia component11() {
        return this.media;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.matchId;
    }

    @Nullable
    public final String component4() {
        return this.to;
    }

    @Nullable
    public final String component5() {
        return this.from;
    }

    @Nullable
    public final String component6() {
        return this.message;
    }

    @Nullable
    public final String component7() {
        return this.sentDate;
    }

    @Nullable
    public final String component8() {
        return this.fixedHeightUrl;
    }

    @Nullable
    public final String component9() {
        return this.reactionId;
    }

    @NotNull
    public final ApiMessage copy(@Nullable @Json(name = "_id") String str, @Nullable String str2, @Nullable @Json(name = "match_id") String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable @Json(name = "sent_date") String str7, @Nullable @Json(name = "fixed_height") String str8, @Nullable @Json(name = "gesture_id") String str9, @Nullable @Json(name = "activity_feed_item") ApiActivityFeedItem apiActivityFeedItem, @Nullable @Json(name = "media") ApiMessageMedia apiMessageMedia) {
        return new ApiMessage(str, str2, str3, str4, str5, str6, str7, str8, str9, apiActivityFeedItem, apiMessageMedia);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiMessage) {
                ApiMessage apiMessage = (ApiMessage) obj;
                if (C2668g.a(this.id, apiMessage.id) && C2668g.a(this.type, apiMessage.type) && C2668g.a(this.matchId, apiMessage.matchId) && C2668g.a(this.to, apiMessage.to) && C2668g.a(this.from, apiMessage.from) && C2668g.a(this.message, apiMessage.message) && C2668g.a(this.sentDate, apiMessage.sentDate) && C2668g.a(this.fixedHeightUrl, apiMessage.fixedHeightUrl) && C2668g.a(this.reactionId, apiMessage.reactionId) && C2668g.a(this.activityFeed, apiMessage.activityFeed) && C2668g.a(this.media, apiMessage.media)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.matchId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.to;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.from;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.message;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.sentDate;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.fixedHeightUrl;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.reactionId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ApiActivityFeedItem apiActivityFeedItem = this.activityFeed;
        hashCode = (hashCode + (apiActivityFeedItem != null ? apiActivityFeedItem.hashCode() : 0)) * 31;
        ApiMessageMedia apiMessageMedia = this.media;
        if (apiMessageMedia != null) {
            i = apiMessageMedia.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiMessage(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.matchId);
        stringBuilder.append(", to=");
        stringBuilder.append(this.to);
        stringBuilder.append(", from=");
        stringBuilder.append(this.from);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", sentDate=");
        stringBuilder.append(this.sentDate);
        stringBuilder.append(", fixedHeightUrl=");
        stringBuilder.append(this.fixedHeightUrl);
        stringBuilder.append(", reactionId=");
        stringBuilder.append(this.reactionId);
        stringBuilder.append(", activityFeed=");
        stringBuilder.append(this.activityFeed);
        stringBuilder.append(", media=");
        stringBuilder.append(this.media);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiMessage(@Nullable @Json(name = "_id") String str, @Nullable String str2, @Nullable @Json(name = "match_id") String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable @Json(name = "sent_date") String str7, @Nullable @Json(name = "fixed_height") String str8, @Nullable @Json(name = "gesture_id") String str9, @Nullable @Json(name = "activity_feed_item") ApiActivityFeedItem apiActivityFeedItem, @Nullable @Json(name = "media") ApiMessageMedia apiMessageMedia) {
        this.id = str;
        this.type = str2;
        this.matchId = str3;
        this.to = str4;
        this.from = str5;
        this.message = str6;
        this.sentDate = str7;
        this.fixedHeightUrl = str8;
        this.reactionId = str9;
        this.activityFeed = apiActivityFeedItem;
        this.media = apiMessageMedia;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @Nullable
    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(@Nullable String str) {
        this.matchId = str;
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }

    public final void setTo(@Nullable String str) {
        this.to = str;
    }

    @Nullable
    public final String getFrom() {
        return this.from;
    }

    public final void setFrom(@Nullable String str) {
        this.from = str;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    @Nullable
    public final String getSentDate() {
        return this.sentDate;
    }

    public final void setSentDate(@Nullable String str) {
        this.sentDate = str;
    }

    @Nullable
    public final String getFixedHeightUrl() {
        return this.fixedHeightUrl;
    }

    public final void setFixedHeightUrl(@Nullable String str) {
        this.fixedHeightUrl = str;
    }

    @Nullable
    public final String getReactionId() {
        return this.reactionId;
    }

    public final void setReactionId(@Nullable String str) {
        this.reactionId = str;
    }

    @Nullable
    public final ApiActivityFeedItem getActivityFeed() {
        return this.activityFeed;
    }

    public final void setActivityFeed(@Nullable ApiActivityFeedItem apiActivityFeedItem) {
        this.activityFeed = apiActivityFeedItem;
    }

    @Nullable
    public final ApiMessageMedia getMedia() {
        return this.media;
    }

    public final void setMedia(@Nullable ApiMessageMedia apiMessageMedia) {
        this.media = apiMessageMedia;
    }
}
