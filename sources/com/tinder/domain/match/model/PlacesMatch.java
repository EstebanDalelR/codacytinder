package com.tinder.domain.match.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.User;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.Match.Visitor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u00013BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J!\u0010\u001f\u001a\u0002H \"\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"H\u0016¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u00064"}, d2 = {"Lcom/tinder/domain/match/model/PlacesMatch;", "Lcom/tinder/domain/match/model/Match;", "id", "", "creationDate", "Lorg/joda/time/DateTime;", "lastActivityDate", "attribution", "Lcom/tinder/domain/match/model/Match$Attribution;", "muted", "", "touched", "person", "Lcom/tinder/domain/common/model/User;", "place", "Lcom/tinder/domain/match/model/PlacesMatch$PlaceInfo;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/tinder/domain/match/model/Match$Attribution;ZZLcom/tinder/domain/common/model/User;Lcom/tinder/domain/match/model/PlacesMatch$PlaceInfo;)V", "getAttribution", "()Lcom/tinder/domain/match/model/Match$Attribution;", "getCreationDate", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getLastActivityDate", "getMuted", "()Z", "getPerson", "()Lcom/tinder/domain/common/model/User;", "getPlace", "()Lcom/tinder/domain/match/model/PlacesMatch$PlaceInfo;", "getTouched", "accept", "T", "visitor", "Lcom/tinder/domain/match/model/Match$Visitor;", "(Lcom/tinder/domain/match/model/Match$Visitor;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "PlaceInfo", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesMatch extends Match {
    @NotNull
    private final Attribution attribution;
    @NotNull
    private final DateTime creationDate;
    @NotNull
    private final String id;
    @NotNull
    private final DateTime lastActivityDate;
    private final boolean muted;
    @NotNull
    private final User person;
    @NotNull
    private final PlaceInfo place;
    private final boolean touched;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/match/model/PlacesMatch$PlaceInfo;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PlaceInfo {
        @NotNull
        private final String id;
        @NotNull
        private final String name;

        @NotNull
        public static /* synthetic */ PlaceInfo copy$default(PlaceInfo placeInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = placeInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = placeInfo.name;
            }
            return placeInfo.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final PlaceInfo copy(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "id");
            C2668g.b(str2, "name");
            return new PlaceInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PlaceInfo) {
                    PlaceInfo placeInfo = (PlaceInfo) obj;
                    if (C2668g.a(this.id, placeInfo.id) && C2668g.a(this.name, placeInfo.name)) {
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
            String str2 = this.name;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlaceInfo(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", name=");
            stringBuilder.append(this.name);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public PlaceInfo(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "id");
            C2668g.b(str2, "name");
            this.id = str;
            this.name = str2;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    @NotNull
    public static /* synthetic */ PlacesMatch copy$default(PlacesMatch placesMatch, String str, DateTime dateTime, DateTime dateTime2, Attribution attribution, boolean z, boolean z2, User user, PlaceInfo placeInfo, int i, Object obj) {
        PlacesMatch placesMatch2 = placesMatch;
        int i2 = i;
        return placesMatch2.copy((i2 & 1) != 0 ? placesMatch2.getId() : str, (i2 & 2) != 0 ? placesMatch2.getCreationDate() : dateTime, (i2 & 4) != 0 ? placesMatch2.getLastActivityDate() : dateTime2, (i2 & 8) != 0 ? placesMatch2.getAttribution() : attribution, (i2 & 16) != 0 ? placesMatch2.getMuted() : z, (i2 & 32) != 0 ? placesMatch2.getTouched() : z2, (i2 & 64) != 0 ? placesMatch2.person : user, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? placesMatch2.place : placeInfo);
    }

    @NotNull
    public final String component1() {
        return getId();
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
    public final User component7() {
        return this.person;
    }

    @NotNull
    public final PlaceInfo component8() {
        return this.place;
    }

    @NotNull
    public final PlacesMatch copy(@NotNull String str, @NotNull DateTime dateTime, @NotNull DateTime dateTime2, @NotNull Attribution attribution, boolean z, boolean z2, @NotNull User user, @NotNull PlaceInfo placeInfo) {
        String str2 = str;
        C2668g.b(str2, "id");
        DateTime dateTime3 = dateTime;
        C2668g.b(dateTime3, "creationDate");
        DateTime dateTime4 = dateTime2;
        C2668g.b(dateTime4, "lastActivityDate");
        Attribution attribution2 = attribution;
        C2668g.b(attribution2, "attribution");
        User user2 = user;
        C2668g.b(user2, ManagerWebServices.PARAM_PERSON);
        PlaceInfo placeInfo2 = placeInfo;
        C2668g.b(placeInfo2, "place");
        return new PlacesMatch(str2, dateTime3, dateTime4, attribution2, z, z2, user2, placeInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacesMatch) {
            PlacesMatch placesMatch = (PlacesMatch) obj;
            if (C2668g.a(getId(), placesMatch.getId()) && C2668g.a(getCreationDate(), placesMatch.getCreationDate()) && C2668g.a(getLastActivityDate(), placesMatch.getLastActivityDate()) && C2668g.a(getAttribution(), placesMatch.getAttribution())) {
                if ((getMuted() == placesMatch.getMuted() ? 1 : null) != null) {
                    return (getTouched() == placesMatch.getTouched() ? 1 : null) != null && C2668g.a(this.person, placesMatch.person) && C2668g.a(this.place, placesMatch.place);
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
        User user = this.person;
        hashCode = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        PlaceInfo placeInfo = this.place;
        if (placeInfo != null) {
            i = placeInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesMatch(id=");
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
        stringBuilder.append(", person=");
        stringBuilder.append(this.person);
        stringBuilder.append(", place=");
        stringBuilder.append(this.place);
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
    public final User getPerson() {
        return this.person;
    }

    @NotNull
    public final PlaceInfo getPlace() {
        return this.place;
    }

    public PlacesMatch(@NotNull String str, @NotNull DateTime dateTime, @NotNull DateTime dateTime2, @NotNull Attribution attribution, boolean z, boolean z2, @NotNull User user, @NotNull PlaceInfo placeInfo) {
        C2668g.b(str, "id");
        C2668g.b(dateTime, "creationDate");
        C2668g.b(dateTime2, "lastActivityDate");
        C2668g.b(attribution, "attribution");
        C2668g.b(user, ManagerWebServices.PARAM_PERSON);
        C2668g.b(placeInfo, "place");
        super();
        this.id = str;
        this.creationDate = dateTime;
        this.lastActivityDate = dateTime2;
        this.attribution = attribution;
        this.muted = z;
        this.touched = z2;
        this.person = user;
        this.place = placeInfo;
    }

    public <T> T accept(@NotNull Visitor<? extends T> visitor) {
        C2668g.b(visitor, "visitor");
        return visitor.visit(this);
    }
}
