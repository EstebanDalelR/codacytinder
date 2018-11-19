package com.tinder.api.request;

import com.squareup.moshi.Json;
import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010Jl\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006'"}, d2 = {"Lcom/tinder/api/request/SendMessageRequestBody;", "", "message", "", "type", "gifId", "reactionId", "mediaSource", "mediaUrl", "mediaWidth", "", "mediaHeight", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getGifId", "()Ljava/lang/String;", "getMediaHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediaSource", "getMediaUrl", "getMediaWidth", "getMessage", "getReactionId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tinder/api/request/SendMessageRequestBody;", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class SendMessageRequestBody {
    @Nullable
    private final String gifId;
    @Nullable
    private final Integer mediaHeight;
    @Nullable
    private final String mediaSource;
    @Nullable
    private final String mediaUrl;
    @Nullable
    private final Integer mediaWidth;
    @NotNull
    private final String message;
    @Nullable
    private final String reactionId;
    @Nullable
    private final String type;

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str) {
        this(str, null, null, null, null, null, null, null, 254, null);
    }

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str, @Nullable String str2) {
        this(str, str2, null, null, null, null, null, null, 252, null);
    }

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str, @Nullable String str2, @Nullable @Json(name = "gif_id") String str3) {
        this(str, str2, str3, null, null, null, null, null, 248, null);
    }

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str, @Nullable String str2, @Nullable @Json(name = "gif_id") String str3, @Nullable @Json(name = "gesture_id") String str4) {
        this(str, str2, str3, str4, null, null, null, null, 240, null);
    }

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str, @Nullable String str2, @Nullable @Json(name = "gif_id") String str3, @Nullable @Json(name = "gesture_id") String str4, @Nullable @Json(name = "media_source") String str5) {
        this(str, str2, str3, str4, str5, null, null, null, 224, null);
    }

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str, @Nullable String str2, @Nullable @Json(name = "gif_id") String str3, @Nullable @Json(name = "gesture_id") String str4, @Nullable @Json(name = "media_source") String str5, @Nullable @Json(name = "media_url") String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, 192, null);
    }

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str, @Nullable String str2, @Nullable @Json(name = "gif_id") String str3, @Nullable @Json(name = "gesture_id") String str4, @Nullable @Json(name = "media_source") String str5, @Nullable @Json(name = "media_url") String str6, @Nullable @Json(name = "media_width") Integer num) {
        this(str, str2, str3, str4, str5, str6, num, null, ProfileEditingConfig.DEFAULT_MAX_LENGTH, null);
    }

    @NotNull
    public static /* synthetic */ SendMessageRequestBody copy$default(SendMessageRequestBody sendMessageRequestBody, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, int i, Object obj) {
        SendMessageRequestBody sendMessageRequestBody2 = sendMessageRequestBody;
        int i2 = i;
        return sendMessageRequestBody2.copy((i2 & 1) != 0 ? sendMessageRequestBody2.message : str, (i2 & 2) != 0 ? sendMessageRequestBody2.type : str2, (i2 & 4) != 0 ? sendMessageRequestBody2.gifId : str3, (i2 & 8) != 0 ? sendMessageRequestBody2.reactionId : str4, (i2 & 16) != 0 ? sendMessageRequestBody2.mediaSource : str5, (i2 & 32) != 0 ? sendMessageRequestBody2.mediaUrl : str6, (i2 & 64) != 0 ? sendMessageRequestBody2.mediaWidth : num, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? sendMessageRequestBody2.mediaHeight : num2);
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.gifId;
    }

    @Nullable
    public final String component4() {
        return this.reactionId;
    }

    @Nullable
    public final String component5() {
        return this.mediaSource;
    }

    @Nullable
    public final String component6() {
        return this.mediaUrl;
    }

    @Nullable
    public final Integer component7() {
        return this.mediaWidth;
    }

    @Nullable
    public final Integer component8() {
        return this.mediaHeight;
    }

    @NotNull
    public final SendMessageRequestBody copy(@NotNull String str, @Nullable String str2, @Nullable @Json(name = "gif_id") String str3, @Nullable @Json(name = "gesture_id") String str4, @Nullable @Json(name = "media_source") String str5, @Nullable @Json(name = "media_url") String str6, @Nullable @Json(name = "media_width") Integer num, @Nullable @Json(name = "media_height") Integer num2) {
        String str7 = str;
        C2668g.b(str7, "message");
        return new SendMessageRequestBody(str7, str2, str3, str4, str5, str6, num, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SendMessageRequestBody) {
                SendMessageRequestBody sendMessageRequestBody = (SendMessageRequestBody) obj;
                if (C2668g.a(this.message, sendMessageRequestBody.message) && C2668g.a(this.type, sendMessageRequestBody.type) && C2668g.a(this.gifId, sendMessageRequestBody.gifId) && C2668g.a(this.reactionId, sendMessageRequestBody.reactionId) && C2668g.a(this.mediaSource, sendMessageRequestBody.mediaSource) && C2668g.a(this.mediaUrl, sendMessageRequestBody.mediaUrl) && C2668g.a(this.mediaWidth, sendMessageRequestBody.mediaWidth) && C2668g.a(this.mediaHeight, sendMessageRequestBody.mediaHeight)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.gifId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.reactionId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.mediaSource;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.mediaUrl;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.mediaWidth;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        num = this.mediaHeight;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SendMessageRequestBody(message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", gifId=");
        stringBuilder.append(this.gifId);
        stringBuilder.append(", reactionId=");
        stringBuilder.append(this.reactionId);
        stringBuilder.append(", mediaSource=");
        stringBuilder.append(this.mediaSource);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaWidth=");
        stringBuilder.append(this.mediaWidth);
        stringBuilder.append(", mediaHeight=");
        stringBuilder.append(this.mediaHeight);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @JvmOverloads
    public SendMessageRequestBody(@NotNull String str, @Nullable String str2, @Nullable @Json(name = "gif_id") String str3, @Nullable @Json(name = "gesture_id") String str4, @Nullable @Json(name = "media_source") String str5, @Nullable @Json(name = "media_url") String str6, @Nullable @Json(name = "media_width") Integer num, @Nullable @Json(name = "media_height") Integer num2) {
        C2668g.b(str, "message");
        this.message = str;
        this.type = str2;
        this.gifId = str3;
        this.reactionId = str4;
        this.mediaSource = str5;
        this.mediaUrl = str6;
        this.mediaWidth = num;
        this.mediaHeight = num2;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @JvmOverloads
    public /* synthetic */ SendMessageRequestBody(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, int i, C15823e c15823e) {
        int i2 = i;
        this(str, (i2 & 2) != 0 ? (String) null : str2, (i2 & 4) != 0 ? (String) null : str3, (i2 & 8) != 0 ? (String) null : str4, (i2 & 16) != 0 ? (String) null : str5, (i2 & 32) != 0 ? (String) null : str6, (i2 & 64) != 0 ? (Integer) null : num, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (Integer) null : num2);
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getGifId() {
        return this.gifId;
    }

    @Nullable
    public final String getReactionId() {
        return this.reactionId;
    }

    @Nullable
    public final String getMediaSource() {
        return this.mediaSource;
    }

    @Nullable
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Nullable
    public final Integer getMediaWidth() {
        return this.mediaWidth;
    }

    @Nullable
    public final Integer getMediaHeight() {
        return this.mediaHeight;
    }
}
