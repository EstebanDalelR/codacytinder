package com.tinder.domain.message;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010!\u001a\u00020\u0010HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003Jt\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u00062"}, d2 = {"Lcom/tinder/domain/message/SystemMessage;", "Lcom/tinder/domain/message/Message;", "clientSequentialId", "", "id", "", "matchId", "toId", "fromId", "text", "sentDate", "Lorg/joda/time/DateTime;", "isLiked", "", "isSeen", "deliveryStatus", "Lcom/tinder/domain/message/DeliveryStatus;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ZZLcom/tinder/domain/message/DeliveryStatus;)V", "getClientSequentialId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeliveryStatus", "()Lcom/tinder/domain/message/DeliveryStatus;", "getFromId", "()Ljava/lang/String;", "getId", "()Z", "getMatchId", "getSentDate", "()Lorg/joda/time/DateTime;", "getText", "getToId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ZZLcom/tinder/domain/message/DeliveryStatus;)Lcom/tinder/domain/message/SystemMessage;", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SystemMessage extends Message {
    @Nullable
    private final Long clientSequentialId;
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

    @JvmOverloads
    public SystemMessage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull DeliveryStatus deliveryStatus) {
        this(null, str, str2, str3, str4, str5, dateTime, z, z2, deliveryStatus, 1, null);
    }

    @NotNull
    public static /* synthetic */ SystemMessage copy$default(SystemMessage systemMessage, Long l, String str, String str2, String str3, String str4, String str5, DateTime dateTime, boolean z, boolean z2, DeliveryStatus deliveryStatus, int i, Object obj) {
        int i2 = i;
        return systemMessage.copy((i2 & 1) != 0 ? systemMessage.getClientSequentialId() : l, (i2 & 2) != 0 ? systemMessage.getId() : str, (i2 & 4) != 0 ? systemMessage.getMatchId() : str2, (i2 & 8) != 0 ? systemMessage.getToId() : str3, (i2 & 16) != 0 ? systemMessage.getFromId() : str4, (i2 & 32) != 0 ? systemMessage.getText() : str5, (i2 & 64) != 0 ? systemMessage.getSentDate() : dateTime, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? systemMessage.isLiked() : z, (i2 & 256) != 0 ? systemMessage.isSeen() : z2, (i2 & 512) != 0 ? systemMessage.getDeliveryStatus() : deliveryStatus);
    }

    @Nullable
    public final Long component1() {
        return getClientSequentialId();
    }

    @NotNull
    public final DeliveryStatus component10() {
        return getDeliveryStatus();
    }

    @NotNull
    public final String component2() {
        return getId();
    }

    @NotNull
    public final String component3() {
        return getMatchId();
    }

    @NotNull
    public final String component4() {
        return getToId();
    }

    @NotNull
    public final String component5() {
        return getFromId();
    }

    @NotNull
    public final String component6() {
        return getText();
    }

    @NotNull
    public final DateTime component7() {
        return getSentDate();
    }

    public final boolean component8() {
        return isLiked();
    }

    public final boolean component9() {
        return isSeen();
    }

    @NotNull
    public final SystemMessage copy(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull DeliveryStatus deliveryStatus) {
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
        return new SystemMessage(l, str6, str7, str8, str9, str10, dateTime2, z, z2, deliveryStatus2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SystemMessage) {
            SystemMessage systemMessage = (SystemMessage) obj;
            if (C2668g.a(getClientSequentialId(), systemMessage.getClientSequentialId()) && C2668g.a(getId(), systemMessage.getId()) && C2668g.a(getMatchId(), systemMessage.getMatchId()) && C2668g.a(getToId(), systemMessage.getToId()) && C2668g.a(getFromId(), systemMessage.getFromId()) && C2668g.a(getText(), systemMessage.getText()) && C2668g.a(getSentDate(), systemMessage.getSentDate())) {
                if ((isLiked() == systemMessage.isLiked() ? 1 : null) != null) {
                    return (isSeen() == systemMessage.isSeen() ? 1 : null) != null && C2668g.a(getDeliveryStatus(), systemMessage.getDeliveryStatus());
                }
            }
        }
    }

    public int hashCode() {
        Long clientSequentialId = getClientSequentialId();
        int i = 0;
        int hashCode = (clientSequentialId != null ? clientSequentialId.hashCode() : 0) * 31;
        String id = getId();
        hashCode = (hashCode + (id != null ? id.hashCode() : 0)) * 31;
        id = getMatchId();
        hashCode = (hashCode + (id != null ? id.hashCode() : 0)) * 31;
        id = getToId();
        hashCode = (hashCode + (id != null ? id.hashCode() : 0)) * 31;
        id = getFromId();
        hashCode = (hashCode + (id != null ? id.hashCode() : 0)) * 31;
        id = getText();
        hashCode = (hashCode + (id != null ? id.hashCode() : 0)) * 31;
        DateTime sentDate = getSentDate();
        hashCode = (hashCode + (sentDate != null ? sentDate.hashCode() : 0)) * 31;
        int isLiked = isLiked();
        if (isLiked != 0) {
            isLiked = 1;
        }
        hashCode = (hashCode + isLiked) * 31;
        isLiked = isSeen();
        if (isLiked != 0) {
            isLiked = 1;
        }
        hashCode = (hashCode + isLiked) * 31;
        DeliveryStatus deliveryStatus = getDeliveryStatus();
        if (deliveryStatus != null) {
            i = deliveryStatus.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SystemMessage(clientSequentialId=");
        stringBuilder.append(getClientSequentialId());
        stringBuilder.append(", id=");
        stringBuilder.append(getId());
        stringBuilder.append(", matchId=");
        stringBuilder.append(getMatchId());
        stringBuilder.append(", toId=");
        stringBuilder.append(getToId());
        stringBuilder.append(", fromId=");
        stringBuilder.append(getFromId());
        stringBuilder.append(", text=");
        stringBuilder.append(getText());
        stringBuilder.append(", sentDate=");
        stringBuilder.append(getSentDate());
        stringBuilder.append(", isLiked=");
        stringBuilder.append(isLiked());
        stringBuilder.append(", isSeen=");
        stringBuilder.append(isSeen());
        stringBuilder.append(", deliveryStatus=");
        stringBuilder.append(getDeliveryStatus());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @JvmOverloads
    public /* synthetic */ SystemMessage(Long l, String str, String str2, String str3, String str4, String str5, DateTime dateTime, boolean z, boolean z2, DeliveryStatus deliveryStatus, int i, C15823e c15823e) {
        this((i & 1) != 0 ? (Long) null : l, str, str2, str3, str4, str5, dateTime, z, z2, deliveryStatus);
    }

    @Nullable
    public Long getClientSequentialId() {
        return this.clientSequentialId;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public String getMatchId() {
        return this.matchId;
    }

    @NotNull
    public String getToId() {
        return this.toId;
    }

    @NotNull
    public String getFromId() {
        return this.fromId;
    }

    @NotNull
    public String getText() {
        return this.text;
    }

    @NotNull
    public DateTime getSentDate() {
        return this.sentDate;
    }

    public boolean isLiked() {
        return this.isLiked;
    }

    public boolean isSeen() {
        return this.isSeen;
    }

    @NotNull
    public DeliveryStatus getDeliveryStatus() {
        return this.deliveryStatus;
    }

    @JvmOverloads
    public SystemMessage(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull DeliveryStatus deliveryStatus) {
        C2668g.b(str, "id");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "toId");
        C2668g.b(str4, "fromId");
        C2668g.b(str5, ManagerWebServices.PARAM_TEXT);
        C2668g.b(dateTime, "sentDate");
        C2668g.b(deliveryStatus, "deliveryStatus");
        super();
        this.clientSequentialId = l;
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
}
