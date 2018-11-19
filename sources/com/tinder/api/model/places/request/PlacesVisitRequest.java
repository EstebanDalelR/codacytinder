package com.tinder.api.model.places.request;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001:\u0001(BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003J[\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000eHÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/tinder/api/model/places/request/PlacesVisitRequest;", "", "venue", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue;", "arrivalTimestamp", "", "departureTimestamp", "foursquareVisitID", "", "alternatives", "", "isBackfill", "", "locationType", "", "(Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue;JJLjava/lang/String;Ljava/util/List;ZI)V", "getAlternatives", "()Ljava/util/List;", "getArrivalTimestamp", "()J", "getDepartureTimestamp", "getFoursquareVisitID", "()Ljava/lang/String;", "()Z", "getLocationType", "()I", "getVenue", "()Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Venue", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesVisitRequest {
    @Nullable
    private final List<Venue> alternatives;
    private final long arrivalTimestamp;
    private final long departureTimestamp;
    @Nullable
    private final String foursquareVisitID;
    private final boolean isBackfill;
    private final int locationType;
    @Nullable
    private final Venue venue;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0003&'(BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue;", "", "id", "", "name", "probability", "", "location", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Location;", "categories", "", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Category;", "hierarchy", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$VenueParent;", "(Ljava/lang/String;Ljava/lang/String;DLcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Location;Ljava/util/List;Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "getHierarchy", "getId", "()Ljava/lang/String;", "getLocation", "()Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Location;", "getName", "getProbability", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Category", "Location", "VenueParent", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Venue {
        @NotNull
        private final List<Category> categories;
        @Nullable
        private final List<VenueParent> hierarchy;
        @NotNull
        private final String id;
        @NotNull
        private final Location location;
        @NotNull
        private final String name;
        private final double probability;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Category;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
        public static final class Category {
            @NotNull
            private final String id;
            @NotNull
            private final String name;

            @NotNull
            public static /* synthetic */ Category copy$default(Category category, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = category.id;
                }
                if ((i & 2) != 0) {
                    str2 = category.name;
                }
                return category.copy(str, str2);
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
            public final Category copy(@NotNull String str, @NotNull String str2) {
                C2668g.b(str, "id");
                C2668g.b(str2, "name");
                return new Category(str, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Category) {
                        Category category = (Category) obj;
                        if (C2668g.a(this.id, category.id) && C2668g.a(this.name, category.name)) {
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
                stringBuilder.append("Category(id=");
                stringBuilder.append(this.id);
                stringBuilder.append(", name=");
                stringBuilder.append(this.name);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Category(@NotNull String str, @NotNull String str2) {
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

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Location;", "", "lat", "", "lng", "(FF)V", "getLat", "()F", "getLng", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
        public static final class Location {
            private final float lat;
            private final float lng;

            @NotNull
            public static /* synthetic */ Location copy$default(Location location, float f, float f2, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = location.lat;
                }
                if ((i & 2) != 0) {
                    f2 = location.lng;
                }
                return location.copy(f, f2);
            }

            public final float component1() {
                return this.lat;
            }

            public final float component2() {
                return this.lng;
            }

            @NotNull
            public final Location copy(float f, float f2) {
                return new Location(f, f2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Location) {
                        Location location = (Location) obj;
                        if (Float.compare(this.lat, location.lat) == 0 && Float.compare(this.lng, location.lng) == 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.lat) * 31) + Float.floatToIntBits(this.lng);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Location(lat=");
                stringBuilder.append(this.lat);
                stringBuilder.append(", lng=");
                stringBuilder.append(this.lng);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Location(float f, float f2) {
                this.lat = f;
                this.lng = f2;
            }

            public final float getLat() {
                return this.lat;
            }

            public final float getLng() {
                return this.lng;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$VenueParent;", "", "id", "", "name", "categories", "", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Category;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
        public static final class VenueParent {
            @NotNull
            private final List<Category> categories;
            @NotNull
            private final String id;
            @NotNull
            private final String name;

            @NotNull
            public static /* synthetic */ VenueParent copy$default(VenueParent venueParent, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = venueParent.id;
                }
                if ((i & 2) != 0) {
                    str2 = venueParent.name;
                }
                if ((i & 4) != 0) {
                    list = venueParent.categories;
                }
                return venueParent.copy(str, str2, list);
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
            public final List<Category> component3() {
                return this.categories;
            }

            @NotNull
            public final VenueParent copy(@NotNull String str, @NotNull String str2, @NotNull List<Category> list) {
                C2668g.b(str, "id");
                C2668g.b(str2, "name");
                C2668g.b(list, "categories");
                return new VenueParent(str, str2, list);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof VenueParent) {
                        VenueParent venueParent = (VenueParent) obj;
                        if (C2668g.a(this.id, venueParent.id) && C2668g.a(this.name, venueParent.name) && C2668g.a(this.categories, venueParent.categories)) {
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
                hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                List list = this.categories;
                if (list != null) {
                    i = list.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("VenueParent(id=");
                stringBuilder.append(this.id);
                stringBuilder.append(", name=");
                stringBuilder.append(this.name);
                stringBuilder.append(", categories=");
                stringBuilder.append(this.categories);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public VenueParent(@NotNull String str, @NotNull String str2, @NotNull List<Category> list) {
                C2668g.b(str, "id");
                C2668g.b(str2, "name");
                C2668g.b(list, "categories");
                this.id = str;
                this.name = str2;
                this.categories = list;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final List<Category> getCategories() {
                return this.categories;
            }
        }

        @NotNull
        public static /* synthetic */ Venue copy$default(Venue venue, String str, String str2, double d, Location location, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = venue.id;
            }
            if ((i & 2) != 0) {
                str2 = venue.name;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                d = venue.probability;
            }
            double d2 = d;
            if ((i & 8) != 0) {
                location = venue.location;
            }
            Location location2 = location;
            if ((i & 16) != 0) {
                list = venue.categories;
            }
            List list3 = list;
            if ((i & 32) != 0) {
                list2 = venue.hierarchy;
            }
            return venue.copy(str, str3, d2, location2, list3, list2);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        public final double component3() {
            return this.probability;
        }

        @NotNull
        public final Location component4() {
            return this.location;
        }

        @NotNull
        public final List<Category> component5() {
            return this.categories;
        }

        @Nullable
        public final List<VenueParent> component6() {
            return this.hierarchy;
        }

        @NotNull
        public final Venue copy(@NotNull String str, @NotNull String str2, double d, @NotNull Location location, @NotNull List<Category> list, @Nullable List<VenueParent> list2) {
            String str3 = str;
            C2668g.b(str3, "id");
            String str4 = str2;
            C2668g.b(str4, "name");
            Location location2 = location;
            C2668g.b(location2, "location");
            List<Category> list3 = list;
            C2668g.b(list3, "categories");
            return new Venue(str3, str4, d, location2, list3, list2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Venue) {
                    Venue venue = (Venue) obj;
                    if (C2668g.a(this.id, venue.id) && C2668g.a(this.name, venue.name) && Double.compare(this.probability, venue.probability) == 0 && C2668g.a(this.location, venue.location) && C2668g.a(this.categories, venue.categories) && C2668g.a(this.hierarchy, venue.hierarchy)) {
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
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(this.probability);
            hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            Location location = this.location;
            hashCode = (hashCode + (location != null ? location.hashCode() : 0)) * 31;
            List list = this.categories;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            list = this.hierarchy;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Venue(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", name=");
            stringBuilder.append(this.name);
            stringBuilder.append(", probability=");
            stringBuilder.append(this.probability);
            stringBuilder.append(", location=");
            stringBuilder.append(this.location);
            stringBuilder.append(", categories=");
            stringBuilder.append(this.categories);
            stringBuilder.append(", hierarchy=");
            stringBuilder.append(this.hierarchy);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Venue(@NotNull String str, @NotNull String str2, double d, @NotNull Location location, @NotNull List<Category> list, @Nullable List<VenueParent> list2) {
            C2668g.b(str, "id");
            C2668g.b(str2, "name");
            C2668g.b(location, "location");
            C2668g.b(list, "categories");
            this.id = str;
            this.name = str2;
            this.probability = d;
            this.location = location;
            this.categories = list;
            this.hierarchy = list2;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final double getProbability() {
            return this.probability;
        }

        @NotNull
        public final Location getLocation() {
            return this.location;
        }

        @NotNull
        public final List<Category> getCategories() {
            return this.categories;
        }

        public /* synthetic */ Venue(String str, String str2, double d, Location location, List list, List list2, int i, C15823e c15823e) {
            this(str, str2, d, location, list, (i & 32) != 0 ? (List) null : list2);
        }

        @Nullable
        public final List<VenueParent> getHierarchy() {
            return this.hierarchy;
        }
    }

    @NotNull
    public static /* synthetic */ PlacesVisitRequest copy$default(PlacesVisitRequest placesVisitRequest, Venue venue, long j, long j2, String str, List list, boolean z, int i, int i2, Object obj) {
        PlacesVisitRequest placesVisitRequest2 = placesVisitRequest;
        return placesVisitRequest2.copy((i2 & 1) != 0 ? placesVisitRequest2.venue : venue, (i2 & 2) != 0 ? placesVisitRequest2.arrivalTimestamp : j, (i2 & 4) != 0 ? placesVisitRequest2.departureTimestamp : j2, (i2 & 8) != 0 ? placesVisitRequest2.foursquareVisitID : str, (i2 & 16) != 0 ? placesVisitRequest2.alternatives : list, (i2 & 32) != 0 ? placesVisitRequest2.isBackfill : z, (i2 & 64) != 0 ? placesVisitRequest2.locationType : i);
    }

    @Nullable
    public final Venue component1() {
        return this.venue;
    }

    public final long component2() {
        return this.arrivalTimestamp;
    }

    public final long component3() {
        return this.departureTimestamp;
    }

    @Nullable
    public final String component4() {
        return this.foursquareVisitID;
    }

    @Nullable
    public final List<Venue> component5() {
        return this.alternatives;
    }

    public final boolean component6() {
        return this.isBackfill;
    }

    public final int component7() {
        return this.locationType;
    }

    @NotNull
    public final PlacesVisitRequest copy(@Nullable Venue venue, @Json(name = "arrival_ts") long j, @Json(name = "departure_ts") long j2, @Nullable @Json(name = "visit_id") String str, @Nullable List<Venue> list, @Json(name = "is_backfill") boolean z, @Json(name = "location_type") int i) {
        return new PlacesVisitRequest(venue, j, j2, str, list, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacesVisitRequest) {
            PlacesVisitRequest placesVisitRequest = (PlacesVisitRequest) obj;
            if (C2668g.a(this.venue, placesVisitRequest.venue)) {
                if ((this.arrivalTimestamp == placesVisitRequest.arrivalTimestamp ? 1 : null) != null) {
                    if ((this.departureTimestamp == placesVisitRequest.departureTimestamp ? 1 : null) != null && C2668g.a(this.foursquareVisitID, placesVisitRequest.foursquareVisitID) && C2668g.a(this.alternatives, placesVisitRequest.alternatives)) {
                        if ((this.isBackfill == placesVisitRequest.isBackfill ? 1 : null) != null) {
                            if ((this.locationType == placesVisitRequest.locationType ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Venue venue = this.venue;
        int i = 0;
        int hashCode = (venue != null ? venue.hashCode() : 0) * 31;
        long j = this.arrivalTimestamp;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.departureTimestamp;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.foursquareVisitID;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.alternatives;
        if (list != null) {
            i = list.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.isBackfill;
        if (i != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.locationType;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesVisitRequest(venue=");
        stringBuilder.append(this.venue);
        stringBuilder.append(", arrivalTimestamp=");
        stringBuilder.append(this.arrivalTimestamp);
        stringBuilder.append(", departureTimestamp=");
        stringBuilder.append(this.departureTimestamp);
        stringBuilder.append(", foursquareVisitID=");
        stringBuilder.append(this.foursquareVisitID);
        stringBuilder.append(", alternatives=");
        stringBuilder.append(this.alternatives);
        stringBuilder.append(", isBackfill=");
        stringBuilder.append(this.isBackfill);
        stringBuilder.append(", locationType=");
        stringBuilder.append(this.locationType);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesVisitRequest(@Nullable Venue venue, @Json(name = "arrival_ts") long j, @Json(name = "departure_ts") long j2, @Nullable @Json(name = "visit_id") String str, @Nullable List<Venue> list, @Json(name = "is_backfill") boolean z, @Json(name = "location_type") int i) {
        this.venue = venue;
        this.arrivalTimestamp = j;
        this.departureTimestamp = j2;
        this.foursquareVisitID = str;
        this.alternatives = list;
        this.isBackfill = z;
        this.locationType = i;
    }

    @Nullable
    public final Venue getVenue() {
        return this.venue;
    }

    public final long getArrivalTimestamp() {
        return this.arrivalTimestamp;
    }

    public final long getDepartureTimestamp() {
        return this.departureTimestamp;
    }

    @Nullable
    public final String getFoursquareVisitID() {
        return this.foursquareVisitID;
    }

    @Nullable
    public final List<Venue> getAlternatives() {
        return this.alternatives;
    }

    public final boolean isBackfill() {
        return this.isBackfill;
    }

    public final int getLocationType() {
        return this.locationType;
    }
}
