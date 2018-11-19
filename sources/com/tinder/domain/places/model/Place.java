package com.tinder.domain.places.model;

import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.meta.model.Location;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.model.analytics.AnalyticsConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b'\b\b\u0018\u0000 :2\u00020\u0001:\u00029:Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0014HÆ\u0003J\t\u0010+\u001a\u00020\u0014HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fHÆ\u0003J\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001J\u0013\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0014HÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006;"}, d2 = {"Lcom/tinder/domain/places/model/Place;", "", "id", "", "name", "", "location", "Lcom/tinder/domain/meta/model/Location;", "icon", "expirationTime", "Lorg/joda/time/DateTime;", "viewed", "", "corrected", "alternatives", "", "Lcom/tinder/domain/places/model/Place$Alternative;", "recs", "Lcom/tinder/domain/recs/model/UserRec;", "newVisitors", "", "totalVisitors", "(JLjava/lang/String;Lcom/tinder/domain/meta/model/Location;Ljava/lang/String;Lorg/joda/time/DateTime;ZZLjava/util/List;Ljava/util/List;II)V", "getAlternatives", "()Ljava/util/List;", "getCorrected", "()Z", "getExpirationTime", "()Lorg/joda/time/DateTime;", "getIcon", "()Ljava/lang/String;", "getId", "()J", "getLocation", "()Lcom/tinder/domain/meta/model/Location;", "getName", "getNewVisitors", "()I", "getRecs", "getTotalVisitors", "getViewed", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Alternative", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Place {
    private static final boolean CORRECTED = true;
    public static final Companion Companion = new Companion();
    public static final int INVALID_VISITORS = -1;
    @NotNull
    private final List<Alternative> alternatives;
    private final boolean corrected;
    @NotNull
    private final DateTime expirationTime;
    @NotNull
    private final String icon;
    private final long id;
    @NotNull
    private final Location location;
    @NotNull
    private final String name;
    private final int newVisitors;
    @NotNull
    private final List<UserRec> recs;
    private final int totalVisitors;
    private final boolean viewed;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/places/model/Place$Alternative;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Alternative {
        @NotNull
        private final String id;
        @NotNull
        private final String name;

        @NotNull
        public static /* synthetic */ Alternative copy$default(Alternative alternative, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alternative.id;
            }
            if ((i & 2) != 0) {
                str2 = alternative.name;
            }
            return alternative.copy(str, str2);
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
        public final Alternative copy(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "id");
            C2668g.b(str2, "name");
            return new Alternative(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Alternative) {
                    Alternative alternative = (Alternative) obj;
                    if (C2668g.a(this.id, alternative.id) && C2668g.a(this.name, alternative.name)) {
                    }
                }
                return false;
            }
            return Place.CORRECTED;
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
            stringBuilder.append("Alternative(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", name=");
            stringBuilder.append(this.name);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Alternative(@NotNull String str, @NotNull String str2) {
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

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/places/model/Place$Companion;", "", "()V", "CORRECTED", "", "getCORRECTED", "()Z", "INVALID_VISITORS", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        public final boolean getCORRECTED() {
            return Place.CORRECTED;
        }
    }

    @NotNull
    public static /* synthetic */ Place copy$default(Place place, long j, String str, Location location, String str2, DateTime dateTime, boolean z, boolean z2, List list, List list2, int i, int i2, int i3, Object obj) {
        Place place2 = place;
        int i4 = i3;
        return place2.copy((i4 & 1) != 0 ? place2.id : j, (i4 & 2) != 0 ? place2.name : str, (i4 & 4) != 0 ? place2.location : location, (i4 & 8) != 0 ? place2.icon : str2, (i4 & 16) != 0 ? place2.expirationTime : dateTime, (i4 & 32) != 0 ? place2.viewed : z, (i4 & 64) != 0 ? place2.corrected : z2, (i4 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? place2.alternatives : list, (i4 & 256) != 0 ? place2.recs : list2, (i4 & 512) != 0 ? place2.newVisitors : i, (i4 & 1024) != 0 ? place2.totalVisitors : i2);
    }

    public final long component1() {
        return this.id;
    }

    public final int component10() {
        return this.newVisitors;
    }

    public final int component11() {
        return this.totalVisitors;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final Location component3() {
        return this.location;
    }

    @NotNull
    public final String component4() {
        return this.icon;
    }

    @NotNull
    public final DateTime component5() {
        return this.expirationTime;
    }

    public final boolean component6() {
        return this.viewed;
    }

    public final boolean component7() {
        return this.corrected;
    }

    @NotNull
    public final List<Alternative> component8() {
        return this.alternatives;
    }

    @NotNull
    public final List<UserRec> component9() {
        return this.recs;
    }

    @NotNull
    public final Place copy(long j, @NotNull String str, @NotNull Location location, @NotNull String str2, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull List<Alternative> list, @NotNull List<? extends UserRec> list2, int i, int i2) {
        String str3 = str;
        C2668g.b(str3, "name");
        Location location2 = location;
        C2668g.b(location2, "location");
        String str4 = str2;
        C2668g.b(str4, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        DateTime dateTime2 = dateTime;
        C2668g.b(dateTime2, "expirationTime");
        List<Alternative> list3 = list;
        C2668g.b(list3, "alternatives");
        List<? extends UserRec> list4 = list2;
        C2668g.b(list4, "recs");
        return new Place(j, str3, location2, str4, dateTime2, z, z2, list3, list4, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return CORRECTED;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            if ((this.id == place.id ? 1 : null) != null && C2668g.a(this.name, place.name) && C2668g.a(this.location, place.location) && C2668g.a(this.icon, place.icon) && C2668g.a(this.expirationTime, place.expirationTime)) {
                if ((this.viewed == place.viewed ? 1 : null) != null) {
                    if ((this.corrected == place.corrected ? 1 : null) != null && C2668g.a(this.alternatives, place.alternatives) && C2668g.a(this.recs, place.recs)) {
                        if ((this.newVisitors == place.newVisitors ? 1 : null) != null) {
                            if ((this.totalVisitors == place.totalVisitors ? 1 : null) != null) {
                                return CORRECTED;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Location location = this.location;
        i = (i + (location != null ? location.hashCode() : 0)) * 31;
        str = this.icon;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        DateTime dateTime = this.expirationTime;
        i = (i + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        int i3 = this.viewed;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.corrected;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        List list = this.alternatives;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.recs;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((((i + i2) * 31) + this.newVisitors) * 31) + this.totalVisitors;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Place(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", location=");
        stringBuilder.append(this.location);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.icon);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", corrected=");
        stringBuilder.append(this.corrected);
        stringBuilder.append(", alternatives=");
        stringBuilder.append(this.alternatives);
        stringBuilder.append(", recs=");
        stringBuilder.append(this.recs);
        stringBuilder.append(", newVisitors=");
        stringBuilder.append(this.newVisitors);
        stringBuilder.append(", totalVisitors=");
        stringBuilder.append(this.totalVisitors);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Place(long j, @NotNull String str, @NotNull Location location, @NotNull String str2, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull List<Alternative> list, @NotNull List<? extends UserRec> list2, int i, int i2) {
        C2668g.b(str, "name");
        C2668g.b(location, "location");
        C2668g.b(str2, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(dateTime, "expirationTime");
        C2668g.b(list, "alternatives");
        C2668g.b(list2, "recs");
        this.id = j;
        this.name = str;
        this.location = location;
        this.icon = str2;
        this.expirationTime = dateTime;
        this.viewed = z;
        this.corrected = z2;
        this.alternatives = list;
        this.recs = list2;
        this.newVisitors = i;
        this.totalVisitors = i2;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Location getLocation() {
        return this.location;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final DateTime getExpirationTime() {
        return this.expirationTime;
    }

    public final boolean getViewed() {
        return this.viewed;
    }

    public final boolean getCorrected() {
        return this.corrected;
    }

    @NotNull
    public final List<Alternative> getAlternatives() {
        return this.alternatives;
    }

    public /* synthetic */ Place(long j, String str, Location location, String str2, DateTime dateTime, boolean z, boolean z2, List list, List list2, int i, int i2, int i3, C15823e c15823e) {
        int i4 = i3;
        this(j, str, location, str2, dateTime, z, z2, list, (i4 & 256) != 0 ? C19301m.a() : list2, (i4 & 512) != 0 ? -1 : i, (i4 & 1024) != 0 ? -1 : i2);
    }

    @NotNull
    public final List<UserRec> getRecs() {
        return this.recs;
    }

    public final int getNewVisitors() {
        return this.newVisitors;
    }

    public final int getTotalVisitors() {
        return this.totalVisitors;
    }
}
