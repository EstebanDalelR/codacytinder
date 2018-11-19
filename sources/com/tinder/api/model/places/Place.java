package com.tinder.api.model.places;

import com.squareup.moshi.Json;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u00013Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/tinder/api/model/places/Place;", "", "id", "", "name", "", "lat", "", "lon", "viewed", "", "icon", "categoryId", "expirationTime", "alternatives", "", "Lcom/tinder/api/model/places/Place$Alternative;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getAlternatives", "()Ljava/util/List;", "getCategoryId", "()Ljava/lang/String;", "getExpirationTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIcon", "getId", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLon", "getName", "getViewed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/tinder/api/model/places/Place;", "equals", "other", "hashCode", "", "toString", "Alternative", "api_release"}, k = 1, mv = {1, 1, 10})
public final class Place {
    @Nullable
    private final List<Alternative> alternatives;
    @Nullable
    private final String categoryId;
    @Nullable
    private final Long expirationTime;
    @Nullable
    private final String icon;
    @Nullable
    private final Long id;
    @Nullable
    private final Double lat;
    @Nullable
    private final Double lon;
    @Nullable
    private final String name;
    @Nullable
    private final Boolean viewed;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/model/places/Place$Alternative;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
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

    @NotNull
    public static /* synthetic */ Place copy$default(Place place, Long l, String str, Double d, Double d2, Boolean bool, String str2, String str3, Long l2, List list, int i, Object obj) {
        Place place2 = place;
        int i2 = i;
        return place2.copy((i2 & 1) != 0 ? place2.id : l, (i2 & 2) != 0 ? place2.name : str, (i2 & 4) != 0 ? place2.lat : d, (i2 & 8) != 0 ? place2.lon : d2, (i2 & 16) != 0 ? place2.viewed : bool, (i2 & 32) != 0 ? place2.icon : str2, (i2 & 64) != 0 ? place2.categoryId : str3, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? place2.expirationTime : l2, (i2 & 256) != 0 ? place2.alternatives : list);
    }

    @Nullable
    public final Long component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Double component3() {
        return this.lat;
    }

    @Nullable
    public final Double component4() {
        return this.lon;
    }

    @Nullable
    public final Boolean component5() {
        return this.viewed;
    }

    @Nullable
    public final String component6() {
        return this.icon;
    }

    @Nullable
    public final String component7() {
        return this.categoryId;
    }

    @Nullable
    public final Long component8() {
        return this.expirationTime;
    }

    @Nullable
    public final List<Alternative> component9() {
        return this.alternatives;
    }

    @NotNull
    public final Place copy(@Nullable Long l, @Nullable String str, @Nullable Double d, @Nullable Double d2, @Nullable Boolean bool, @Nullable String str2, @Nullable @Json(name = "category_id") String str3, @Nullable @Json(name = "expiration_time") Long l2, @Nullable List<Alternative> list) {
        return new Place(l, str, d, d2, bool, str2, str3, l2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Place) {
                Place place = (Place) obj;
                if (C2668g.a(this.id, place.id) && C2668g.a(this.name, place.name) && C2668g.a(this.lat, place.lat) && C2668g.a(this.lon, place.lon) && C2668g.a(this.viewed, place.viewed) && C2668g.a(this.icon, place.icon) && C2668g.a(this.categoryId, place.categoryId) && C2668g.a(this.expirationTime, place.expirationTime) && C2668g.a(this.alternatives, place.alternatives)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Long l = this.id;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.name;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.lat;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.lon;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.viewed;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.icon;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.categoryId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.expirationTime;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        List list = this.alternatives;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Place(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", lat=");
        stringBuilder.append(this.lat);
        stringBuilder.append(", lon=");
        stringBuilder.append(this.lon);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.icon);
        stringBuilder.append(", categoryId=");
        stringBuilder.append(this.categoryId);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", alternatives=");
        stringBuilder.append(this.alternatives);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Place(@Nullable Long l, @Nullable String str, @Nullable Double d, @Nullable Double d2, @Nullable Boolean bool, @Nullable String str2, @Nullable @Json(name = "category_id") String str3, @Nullable @Json(name = "expiration_time") Long l2, @Nullable List<Alternative> list) {
        this.id = l;
        this.name = str;
        this.lat = d;
        this.lon = d2;
        this.viewed = bool;
        this.icon = str2;
        this.categoryId = str3;
        this.expirationTime = l2;
        this.alternatives = list;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    public final Boolean getViewed() {
        return this.viewed;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final Long getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    public final List<Alternative> getAlternatives() {
        return this.alternatives;
    }
}
