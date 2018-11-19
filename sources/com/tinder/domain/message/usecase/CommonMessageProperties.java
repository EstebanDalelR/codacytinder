package com.tinder.domain.message.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.message.DeliveryStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u0006*"}, d2 = {"Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "", "id", "", "matchId", "toId", "fromId", "text", "sentDate", "Lorg/joda/time/DateTime;", "isLiked", "", "isSeen", "deliveryStatus", "Lcom/tinder/domain/message/DeliveryStatus;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ZZLcom/tinder/domain/message/DeliveryStatus;)V", "getDeliveryStatus", "()Lcom/tinder/domain/message/DeliveryStatus;", "getFromId", "()Ljava/lang/String;", "getId", "()Z", "getMatchId", "getSentDate", "()Lorg/joda/time/DateTime;", "getText", "getToId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CommonMessageProperties {
    @NotNull
    private final DeliveryStatus deliveryStatus;
    @NotNull
    private final String fromId;
    @NotNull
    private final String id;
    private final boolean isLiked;
    private final boolean isSeen;
    @NotNull
    private final String matchId;
    @NotNull
    private final DateTime sentDate;
    @NotNull
    private final String text;
    @NotNull
    private final String toId;

    @NotNull
    public static /* synthetic */ CommonMessageProperties copy$default(CommonMessageProperties commonMessageProperties, String str, String str2, String str3, String str4, String str5, DateTime dateTime, boolean z, boolean z2, DeliveryStatus deliveryStatus, int i, Object obj) {
        CommonMessageProperties commonMessageProperties2 = commonMessageProperties;
        int i2 = i;
        return commonMessageProperties2.copy((i2 & 1) != 0 ? commonMessageProperties2.id : str, (i2 & 2) != 0 ? commonMessageProperties2.matchId : str2, (i2 & 4) != 0 ? commonMessageProperties2.toId : str3, (i2 & 8) != 0 ? commonMessageProperties2.fromId : str4, (i2 & 16) != 0 ? commonMessageProperties2.text : str5, (i2 & 32) != 0 ? commonMessageProperties2.sentDate : dateTime, (i2 & 64) != 0 ? commonMessageProperties2.isLiked : z, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? commonMessageProperties2.isSeen : z2, (i2 & 256) != 0 ? commonMessageProperties2.deliveryStatus : deliveryStatus);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.matchId;
    }

    @NotNull
    public final String component3() {
        return this.toId;
    }

    @NotNull
    public final String component4() {
        return this.fromId;
    }

    @NotNull
    public final String component5() {
        return this.text;
    }

    @NotNull
    public final DateTime component6() {
        return this.sentDate;
    }

    public final boolean component7() {
        return this.isLiked;
    }

    public final boolean component8() {
        return this.isSeen;
    }

    @NotNull
    public final DeliveryStatus component9() {
        return this.deliveryStatus;
    }

    @NotNull
    public final CommonMessageProperties copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull DeliveryStatus deliveryStatus) {
        String str6 = str;
        C2668g.b(str6, "id");
        String str7 = str2;
        C2668g.b(str7, "matchId");
        String str8 = str3;
        C2668g.b(str8, "toId");
        String str9 = str4;
        C2668g.b(str9, "fromId");
        String str10 = str5;
        C2668g.b(str10, ManagerWebServices.PARAM_TEXT);
        DateTime dateTime2 = dateTime;
        C2668g.b(dateTime2, "sentDate");
        DeliveryStatus deliveryStatus2 = deliveryStatus;
        C2668g.b(deliveryStatus2, "deliveryStatus");
        return new CommonMessageProperties(str6, str7, str8, str9, str10, dateTime2, z, z2, deliveryStatus2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonMessageProperties) {
            CommonMessageProperties commonMessageProperties = (CommonMessageProperties) obj;
            if (C2668g.a(this.id, commonMessageProperties.id) && C2668g.a(this.matchId, commonMessageProperties.matchId) && C2668g.a(this.toId, commonMessageProperties.toId) && C2668g.a(this.fromId, commonMessageProperties.fromId) && C2668g.a(this.text, commonMessageProperties.text) && C2668g.a(this.sentDate, commonMessageProperties.sentDate)) {
                if ((this.isLiked == commonMessageProperties.isLiked ? 1 : null) != null) {
                    return (this.isSeen == commonMessageProperties.isSeen ? 1 : null) != null && C2668g.a(this.deliveryStatus, commonMessageProperties.deliveryStatus);
                }
            }
        }
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.matchId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.toId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.fromId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.text;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DateTime dateTime = this.sentDate;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        int i2 = this.isLiked;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.isSeen;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        DeliveryStatus deliveryStatus = this.deliveryStatus;
        if (deliveryStatus != null) {
            i = deliveryStatus.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommonMessageProperties(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.matchId);
        stringBuilder.append(", toId=");
        stringBuilder.append(this.toId);
        stringBuilder.append(", fromId=");
        stringBuilder.append(this.fromId);
        stringBuilder.append(", text=");
        stringBuilder.append(this.text);
        stringBuilder.append(", sentDate=");
        stringBuilder.append(this.sentDate);
        stringBuilder.append(", isLiked=");
        stringBuilder.append(this.isLiked);
        stringBuilder.append(", isSeen=");
        stringBuilder.append(this.isSeen);
        stringBuilder.append(", deliveryStatus=");
        stringBuilder.append(this.deliveryStatus);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CommonMessageProperties(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull DeliveryStatus deliveryStatus) {
        C2668g.b(str, "id");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "toId");
        C2668g.b(str4, "fromId");
        C2668g.b(str5, ManagerWebServices.PARAM_TEXT);
        C2668g.b(dateTime, "sentDate");
        C2668g.b(deliveryStatus, "deliveryStatus");
        this.id = str;
        this.matchId = str2;
        this.toId = str3;
        this.fromId = str4;
        this.text = str5;
        this.sentDate = dateTime;
        this.isLiked = z;
        this.isSeen = z2;
        this.deliveryStatus = deliveryStatus;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMatchId() {
        return this.matchId;
    }

    @NotNull
    public final String getToId() {
        return this.toId;
    }

    @NotNull
    public final String getFromId() {
        return this.fromId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final DateTime getSentDate() {
        return this.sentDate;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final boolean isSeen() {
        return this.isSeen;
    }

    @NotNull
    public final DeliveryStatus getDeliveryStatus() {
        return this.deliveryStatus;
    }
}
