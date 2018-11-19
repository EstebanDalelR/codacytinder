package com.tinder.domain.match.model;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.Match.Visitor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001IB\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0002\u0010\u0018J!\u0010.\u001a\u0002H/\"\u0004\b\u0000\u0010/2\f\u00100\u001a\b\u0012\u0004\u0012\u0002H/01H\u0016¢\u0006\u0002\u00102J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0014HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J§\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001J\u0013\u0010C\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(¨\u0006J"}, d2 = {"Lcom/tinder/domain/match/model/MessageAdMatch;", "Lcom/tinder/domain/match/model/Match;", "id", "", "creationDate", "Lorg/joda/time/DateTime;", "lastActivityDate", "attribution", "Lcom/tinder/domain/match/model/Match$Attribution;", "muted", "", "touched", "templateId", "title", "logoUrl", "body", "clickthroughUrl", "clickthroughText", "endDate", "messageAdType", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "photos", "", "Lcom/tinder/domain/common/model/Photo;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/tinder/domain/match/model/Match$Attribution;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/tinder/domain/match/model/MessageAdMatch$Type;Ljava/util/List;)V", "getAttribution", "()Lcom/tinder/domain/match/model/Match$Attribution;", "getBody", "()Ljava/lang/String;", "getClickthroughText", "getClickthroughUrl", "getCreationDate", "()Lorg/joda/time/DateTime;", "getEndDate", "getId", "getLastActivityDate", "getLogoUrl", "getMessageAdType", "()Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "getMuted", "()Z", "getPhotos", "()Ljava/util/List;", "getTemplateId", "getTitle", "getTouched", "accept", "T", "visitor", "Lcom/tinder/domain/match/model/Match$Visitor;", "(Lcom/tinder/domain/match/model/Match$Visitor;)Ljava/lang/Object;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "Type", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class MessageAdMatch extends Match {
    @NotNull
    private final Attribution attribution;
    @NotNull
    private final String body;
    @NotNull
    private final String clickthroughText;
    @NotNull
    private final String clickthroughUrl;
    @NotNull
    private final DateTime creationDate;
    @NotNull
    private final DateTime endDate;
    @NotNull
    private final String id;
    @NotNull
    private final DateTime lastActivityDate;
    @NotNull
    private final String logoUrl;
    @NotNull
    private final Type messageAdType;
    private final boolean muted;
    @Nullable
    private final List<Photo> photos;
    @NotNull
    private final String templateId;
    @NotNull
    private final String title;
    private final boolean touched;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "", "(Ljava/lang/String;I)V", "SPONSORED", "BRANDED_PROFILE_CARD", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
    }

    @NotNull
    public static /* synthetic */ MessageAdMatch copy$default(MessageAdMatch messageAdMatch, String str, DateTime dateTime, DateTime dateTime2, Attribution attribution, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, DateTime dateTime3, Type type, List list, int i, Object obj) {
        MessageAdMatch messageAdMatch2 = messageAdMatch;
        int i2 = i;
        return messageAdMatch2.copy((i2 & 1) != 0 ? messageAdMatch.getId() : str, (i2 & 2) != 0 ? messageAdMatch.getCreationDate() : dateTime, (i2 & 4) != 0 ? messageAdMatch.getLastActivityDate() : dateTime2, (i2 & 8) != 0 ? messageAdMatch.getAttribution() : attribution, (i2 & 16) != 0 ? messageAdMatch.getMuted() : z, (i2 & 32) != 0 ? messageAdMatch.getTouched() : z2, (i2 & 64) != 0 ? messageAdMatch2.templateId : str2, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? messageAdMatch2.title : str3, (i2 & 256) != 0 ? messageAdMatch2.logoUrl : str4, (i2 & 512) != 0 ? messageAdMatch2.body : str5, (i2 & 1024) != 0 ? messageAdMatch2.clickthroughUrl : str6, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? messageAdMatch2.clickthroughText : str7, (i2 & 4096) != 0 ? messageAdMatch2.endDate : dateTime3, (i2 & 8192) != 0 ? messageAdMatch2.messageAdType : type, (i2 & 16384) != 0 ? messageAdMatch2.photos : list);
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    @NotNull
    public final String component10() {
        return this.body;
    }

    @NotNull
    public final String component11() {
        return this.clickthroughUrl;
    }

    @NotNull
    public final String component12() {
        return this.clickthroughText;
    }

    @NotNull
    public final DateTime component13() {
        return this.endDate;
    }

    @NotNull
    public final Type component14() {
        return this.messageAdType;
    }

    @Nullable
    public final List<Photo> component15() {
        return this.photos;
    }

    @NotNull
    public final DateTime component2() {
        return getCreationDate();
    }

    @NotNull
    public final DateTime component3() {
        return getLastActivityDate();
    }

    @NotNull
    public final Attribution component4() {
        return getAttribution();
    }

    public final boolean component5() {
        return getMuted();
    }

    public final boolean component6() {
        return getTouched();
    }

    @NotNull
    public final String component7() {
        return this.templateId;
    }

    @NotNull
    public final String component8() {
        return this.title;
    }

    @NotNull
    public final String component9() {
        return this.logoUrl;
    }

    @NotNull
    public final MessageAdMatch copy(@NotNull String str, @NotNull DateTime dateTime, @NotNull DateTime dateTime2, @NotNull Attribution attribution, boolean z, boolean z2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull DateTime dateTime3, @NotNull Type type, @Nullable List<? extends Photo> list) {
        String str8 = str;
        C2668g.b(str8, "id");
        DateTime dateTime4 = dateTime;
        C2668g.b(dateTime4, "creationDate");
        DateTime dateTime5 = dateTime2;
        C2668g.b(dateTime5, "lastActivityDate");
        Attribution attribution2 = attribution;
        C2668g.b(attribution2, "attribution");
        String str9 = str2;
        C2668g.b(str9, "templateId");
        String str10 = str3;
        C2668g.b(str10, ManagerWebServices.PARAM_JOB_TITLE);
        String str11 = str4;
        C2668g.b(str11, "logoUrl");
        String str12 = str5;
        C2668g.b(str12, "body");
        String str13 = str6;
        C2668g.b(str13, "clickthroughUrl");
        String str14 = str7;
        C2668g.b(str14, "clickthroughText");
        DateTime dateTime6 = dateTime3;
        C2668g.b(dateTime6, "endDate");
        Type type2 = type;
        C2668g.b(type2, "messageAdType");
        return new MessageAdMatch(str8, dateTime4, dateTime5, attribution2, z, z2, str9, str10, str11, str12, str13, str14, dateTime6, type2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageAdMatch) {
            MessageAdMatch messageAdMatch = (MessageAdMatch) obj;
            if (C2668g.a(getId(), messageAdMatch.getId()) && C2668g.a(getCreationDate(), messageAdMatch.getCreationDate()) && C2668g.a(getLastActivityDate(), messageAdMatch.getLastActivityDate()) && C2668g.a(getAttribution(), messageAdMatch.getAttribution())) {
                if ((getMuted() == messageAdMatch.getMuted() ? 1 : null) != null) {
                    return (getTouched() == messageAdMatch.getTouched() ? 1 : null) != null && C2668g.a(this.templateId, messageAdMatch.templateId) && C2668g.a(this.title, messageAdMatch.title) && C2668g.a(this.logoUrl, messageAdMatch.logoUrl) && C2668g.a(this.body, messageAdMatch.body) && C2668g.a(this.clickthroughUrl, messageAdMatch.clickthroughUrl) && C2668g.a(this.clickthroughText, messageAdMatch.clickthroughText) && C2668g.a(this.endDate, messageAdMatch.endDate) && C2668g.a(this.messageAdType, messageAdMatch.messageAdType) && C2668g.a(this.photos, messageAdMatch.photos);
                }
            }
        }
    }

    public int hashCode() {
        String id = getId();
        int i = 0;
        int hashCode = (id != null ? id.hashCode() : 0) * 31;
        DateTime creationDate = getCreationDate();
        hashCode = (hashCode + (creationDate != null ? creationDate.hashCode() : 0)) * 31;
        creationDate = getLastActivityDate();
        hashCode = (hashCode + (creationDate != null ? creationDate.hashCode() : 0)) * 31;
        Attribution attribution = getAttribution();
        hashCode = (hashCode + (attribution != null ? attribution.hashCode() : 0)) * 31;
        int muted = getMuted();
        if (muted != 0) {
            muted = 1;
        }
        hashCode = (hashCode + muted) * 31;
        muted = getTouched();
        if (muted != 0) {
            muted = 1;
        }
        hashCode = (hashCode + muted) * 31;
        String str = this.templateId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.title;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.logoUrl;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.body;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.clickthroughUrl;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.clickthroughText;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        creationDate = this.endDate;
        hashCode = (hashCode + (creationDate != null ? creationDate.hashCode() : 0)) * 31;
        Type type = this.messageAdType;
        hashCode = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        List list = this.photos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageAdMatch(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", creationDate=");
        stringBuilder.append(getCreationDate());
        stringBuilder.append(", lastActivityDate=");
        stringBuilder.append(getLastActivityDate());
        stringBuilder.append(", attribution=");
        stringBuilder.append(getAttribution());
        stringBuilder.append(", muted=");
        stringBuilder.append(getMuted());
        stringBuilder.append(", touched=");
        stringBuilder.append(getTouched());
        stringBuilder.append(", templateId=");
        stringBuilder.append(this.templateId);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", logoUrl=");
        stringBuilder.append(this.logoUrl);
        stringBuilder.append(", body=");
        stringBuilder.append(this.body);
        stringBuilder.append(", clickthroughUrl=");
        stringBuilder.append(this.clickthroughUrl);
        stringBuilder.append(", clickthroughText=");
        stringBuilder.append(this.clickthroughText);
        stringBuilder.append(", endDate=");
        stringBuilder.append(this.endDate);
        stringBuilder.append(", messageAdType=");
        stringBuilder.append(this.messageAdType);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public DateTime getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    public DateTime getLastActivityDate() {
        return this.lastActivityDate;
    }

    @NotNull
    public Attribution getAttribution() {
        return this.attribution;
    }

    public boolean getMuted() {
        return this.muted;
    }

    public boolean getTouched() {
        return this.touched;
    }

    @NotNull
    public final String getTemplateId() {
        return this.templateId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getClickthroughUrl() {
        return this.clickthroughUrl;
    }

    @NotNull
    public final String getClickthroughText() {
        return this.clickthroughText;
    }

    @NotNull
    public final DateTime getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final Type getMessageAdType() {
        return this.messageAdType;
    }

    public /* synthetic */ MessageAdMatch(String str, DateTime dateTime, DateTime dateTime2, Attribution attribution, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, DateTime dateTime3, Type type, List list, int i, C15823e c15823e) {
        int i2 = i;
        this(str, dateTime, dateTime2, attribution, z, z2, str2, str3, str4, str5, (i2 & 1024) != 0 ? "" : str6, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? "" : str7, dateTime3, type, (i2 & 16384) != 0 ? (List) null : list);
    }

    @Nullable
    public final List<Photo> getPhotos() {
        return this.photos;
    }

    public MessageAdMatch(@NotNull String str, @NotNull DateTime dateTime, @NotNull DateTime dateTime2, @NotNull Attribution attribution, boolean z, boolean z2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull DateTime dateTime3, @NotNull Type type, @Nullable List<? extends Photo> list) {
        String str8 = str;
        DateTime dateTime4 = dateTime;
        DateTime dateTime5 = dateTime2;
        Attribution attribution2 = attribution;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        DateTime dateTime6 = dateTime3;
        Type type2 = type;
        C2668g.b(str8, "id");
        C2668g.b(dateTime4, "creationDate");
        C2668g.b(dateTime5, "lastActivityDate");
        C2668g.b(attribution2, "attribution");
        C2668g.b(str9, "templateId");
        C2668g.b(str10, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str11, "logoUrl");
        C2668g.b(str12, "body");
        C2668g.b(str13, "clickthroughUrl");
        C2668g.b(str14, "clickthroughText");
        C2668g.b(dateTime6, "endDate");
        C2668g.b(type2, "messageAdType");
        super();
        this.id = str8;
        this.creationDate = dateTime4;
        this.lastActivityDate = dateTime5;
        this.attribution = attribution2;
        this.muted = z;
        this.touched = z2;
        this.templateId = str9;
        this.title = str10;
        this.logoUrl = str11;
        this.body = str12;
        this.clickthroughUrl = str13;
        this.clickthroughText = str14;
        this.endDate = dateTime6;
        this.messageAdType = type2;
        this.photos = list;
    }

    public <T> T accept(@NotNull Visitor<? extends T> visitor) {
        C2668g.b(visitor, "visitor");
        return visitor.visit(this);
    }
}
