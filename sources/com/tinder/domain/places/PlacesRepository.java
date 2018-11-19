package com.tinder.domain.places;

import com.tinder.domain.places.model.Place;
import com.tinder.domain.recs.RecsEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u001b\u001cJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\t\u001a\u00020\u0006H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0016\u001a\u00020\bH&J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H&¨\u0006\u001d"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository;", "", "addEngineIfAbsent", "Lrx/Single;", "Lcom/tinder/domain/recs/RecsEngine;", "placeId", "", "blacklistPlace", "Lrx/Completable;", "id", "clearPlacesCache", "correctPlace", "newId", "oldId", "deletePlace", "find", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "getCount", "", "getVisitorInfo", "Lrx/Observable;", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "load", "markPlaceRecsViewed", "markPlaceViewed", "observe", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "PlaceUpdate", "PlaceVisitorInfo", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesRepository {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "", "()V", "item", "Lcom/tinder/domain/places/model/Place;", "getItem", "()Lcom/tinder/domain/places/model/Place;", "Corrected", "Created", "Deleted", "Found", "Viewed", "VisitorsUpdated", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Created;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Viewed;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Corrected;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Deleted;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$VisitorsUpdated;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static abstract class PlaceUpdate {
        @Nullable
        private final Place item;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Corrected;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "index", "", "item", "Lcom/tinder/domain/places/model/Place;", "oldItemId", "", "(ILcom/tinder/domain/places/model/Place;Ljava/lang/String;)V", "getIndex", "()I", "getItem", "()Lcom/tinder/domain/places/model/Place;", "getOldItemId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Corrected extends PlaceUpdate {
            private final int index;
            @NotNull
            private final Place item;
            @NotNull
            private final String oldItemId;

            @NotNull
            public static /* synthetic */ Corrected copy$default(Corrected corrected, int i, Place place, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = corrected.index;
                }
                if ((i2 & 2) != 0) {
                    place = corrected.getItem();
                }
                if ((i2 & 4) != 0) {
                    str = corrected.oldItemId;
                }
                return corrected.copy(i, place, str);
            }

            public final int component1() {
                return this.index;
            }

            @NotNull
            public final Place component2() {
                return getItem();
            }

            @NotNull
            public final String component3() {
                return this.oldItemId;
            }

            @NotNull
            public final Corrected copy(int i, @NotNull Place place, @NotNull String str) {
                C2668g.b(place, "item");
                C2668g.b(str, "oldItemId");
                return new Corrected(i, place, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Corrected) {
                    Corrected corrected = (Corrected) obj;
                    return (this.index == corrected.index ? 1 : null) != null && C2668g.a(getItem(), corrected.getItem()) && C2668g.a(this.oldItemId, corrected.oldItemId);
                }
            }

            public int hashCode() {
                int i = this.index * 31;
                Place item = getItem();
                int i2 = 0;
                i = (i + (item != null ? item.hashCode() : 0)) * 31;
                String str = this.oldItemId;
                if (str != null) {
                    i2 = str.hashCode();
                }
                return i + i2;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Corrected(index=");
                stringBuilder.append(this.index);
                stringBuilder.append(", item=");
                stringBuilder.append(getItem());
                stringBuilder.append(", oldItemId=");
                stringBuilder.append(this.oldItemId);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Corrected(int i, @NotNull Place place, @NotNull String str) {
                C2668g.b(place, "item");
                C2668g.b(str, "oldItemId");
                super();
                this.index = i;
                this.item = place;
                this.oldItemId = str;
            }

            public final int getIndex() {
                return this.index;
            }

            @NotNull
            public Place getItem() {
                return this.item;
            }

            @NotNull
            public final String getOldItemId() {
                return this.oldItemId;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Created;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "index", "", "item", "Lcom/tinder/domain/places/model/Place;", "(ILcom/tinder/domain/places/model/Place;)V", "getIndex", "()I", "getItem", "()Lcom/tinder/domain/places/model/Place;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Created extends PlaceUpdate {
            private final int index;
            @NotNull
            private final Place item;

            @NotNull
            public static /* synthetic */ Created copy$default(Created created, int i, Place place, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = created.index;
                }
                if ((i2 & 2) != 0) {
                    place = created.getItem();
                }
                return created.copy(i, place);
            }

            public final int component1() {
                return this.index;
            }

            @NotNull
            public final Place component2() {
                return getItem();
            }

            @NotNull
            public final Created copy(int i, @NotNull Place place) {
                C2668g.b(place, "item");
                return new Created(i, place);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Created) {
                    Created created = (Created) obj;
                    return (this.index == created.index ? 1 : null) != null && C2668g.a(getItem(), created.getItem());
                }
            }

            public int hashCode() {
                int i = this.index * 31;
                Place item = getItem();
                return i + (item != null ? item.hashCode() : 0);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Created(index=");
                stringBuilder.append(this.index);
                stringBuilder.append(", item=");
                stringBuilder.append(getItem());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Created(int i, @NotNull Place place) {
                C2668g.b(place, "item");
                super();
                this.index = i;
                this.item = place;
            }

            public final int getIndex() {
                return this.index;
            }

            @NotNull
            public Place getItem() {
                return this.item;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Deleted;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "item", "Lcom/tinder/domain/places/model/Place;", "(Lcom/tinder/domain/places/model/Place;)V", "getItem", "()Lcom/tinder/domain/places/model/Place;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Deleted extends PlaceUpdate {
            @NotNull
            private final Place item;

            @NotNull
            public static /* synthetic */ Deleted copy$default(Deleted deleted, Place place, int i, Object obj) {
                if ((i & 1) != 0) {
                    place = deleted.getItem();
                }
                return deleted.copy(place);
            }

            @NotNull
            public final Place component1() {
                return getItem();
            }

            @NotNull
            public final Deleted copy(@NotNull Place place) {
                C2668g.b(place, "item");
                return new Deleted(place);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Deleted) {
                        if (C2668g.a(getItem(), ((Deleted) obj).getItem())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Place item = getItem();
                return item != null ? item.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Deleted(item=");
                stringBuilder.append(getItem());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Deleted(@NotNull Place place) {
                C2668g.b(place, "item");
                super();
                this.item = place;
            }

            @NotNull
            public Place getItem() {
                return this.item;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "index", "", "item", "Lcom/tinder/domain/places/model/Place;", "(ILcom/tinder/domain/places/model/Place;)V", "getIndex", "()I", "getItem", "()Lcom/tinder/domain/places/model/Place;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Found extends PlaceUpdate {
            private final int index;
            @Nullable
            private final Place item;

            @NotNull
            public static /* synthetic */ Found copy$default(Found found, int i, Place place, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = found.index;
                }
                if ((i2 & 2) != 0) {
                    place = found.getItem();
                }
                return found.copy(i, place);
            }

            public final int component1() {
                return this.index;
            }

            @Nullable
            public final Place component2() {
                return getItem();
            }

            @NotNull
            public final Found copy(int i, @Nullable Place place) {
                return new Found(i, place);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Found) {
                    Found found = (Found) obj;
                    return (this.index == found.index ? 1 : null) != null && C2668g.a(getItem(), found.getItem());
                }
            }

            public int hashCode() {
                int i = this.index * 31;
                Place item = getItem();
                return i + (item != null ? item.hashCode() : 0);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found(index=");
                stringBuilder.append(this.index);
                stringBuilder.append(", item=");
                stringBuilder.append(getItem());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Found(int i, @Nullable Place place) {
                super();
                this.index = i;
                this.item = place;
            }

            public final int getIndex() {
                return this.index;
            }

            @Nullable
            public Place getItem() {
                return this.item;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Viewed;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "index", "", "item", "Lcom/tinder/domain/places/model/Place;", "(ILcom/tinder/domain/places/model/Place;)V", "getIndex", "()I", "getItem", "()Lcom/tinder/domain/places/model/Place;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Viewed extends PlaceUpdate {
            private final int index;
            @NotNull
            private final Place item;

            @NotNull
            public static /* synthetic */ Viewed copy$default(Viewed viewed, int i, Place place, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = viewed.index;
                }
                if ((i2 & 2) != 0) {
                    place = viewed.getItem();
                }
                return viewed.copy(i, place);
            }

            public final int component1() {
                return this.index;
            }

            @NotNull
            public final Place component2() {
                return getItem();
            }

            @NotNull
            public final Viewed copy(int i, @NotNull Place place) {
                C2668g.b(place, "item");
                return new Viewed(i, place);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Viewed) {
                    Viewed viewed = (Viewed) obj;
                    return (this.index == viewed.index ? 1 : null) != null && C2668g.a(getItem(), viewed.getItem());
                }
            }

            public int hashCode() {
                int i = this.index * 31;
                Place item = getItem();
                return i + (item != null ? item.hashCode() : 0);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Viewed(index=");
                stringBuilder.append(this.index);
                stringBuilder.append(", item=");
                stringBuilder.append(getItem());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Viewed(int i, @NotNull Place place) {
                C2668g.b(place, "item");
                super();
                this.index = i;
                this.item = place;
            }

            public final int getIndex() {
                return this.index;
            }

            @NotNull
            public Place getItem() {
                return this.item;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$VisitorsUpdated;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "item", "Lcom/tinder/domain/places/model/Place;", "(Lcom/tinder/domain/places/model/Place;)V", "getItem", "()Lcom/tinder/domain/places/model/Place;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class VisitorsUpdated extends PlaceUpdate {
            @NotNull
            private final Place item;

            @NotNull
            public static /* synthetic */ VisitorsUpdated copy$default(VisitorsUpdated visitorsUpdated, Place place, int i, Object obj) {
                if ((i & 1) != 0) {
                    place = visitorsUpdated.getItem();
                }
                return visitorsUpdated.copy(place);
            }

            @NotNull
            public final Place component1() {
                return getItem();
            }

            @NotNull
            public final VisitorsUpdated copy(@NotNull Place place) {
                C2668g.b(place, "item");
                return new VisitorsUpdated(place);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof VisitorsUpdated) {
                        if (C2668g.a(getItem(), ((VisitorsUpdated) obj).getItem())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Place item = getItem();
                return item != null ? item.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("VisitorsUpdated(item=");
                stringBuilder.append(getItem());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public VisitorsUpdated(@NotNull Place place) {
                C2668g.b(place, "item");
                super();
                this.item = place;
            }

            @NotNull
            public Place getItem() {
                return this.item;
            }
        }

        private PlaceUpdate() {
        }

        @Nullable
        public Place getItem() {
            return this.item;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u000f\u001a\u00020\rJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "", "totalVisitors", "", "newVisitors", "(II)V", "getNewVisitors", "()I", "getTotalVisitors", "component1", "component2", "copy", "equals", "", "other", "hasValidVisitorInfo", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PlaceVisitorInfo {
        private final int newVisitors;
        private final int totalVisitors;

        @NotNull
        public static /* synthetic */ PlaceVisitorInfo copy$default(PlaceVisitorInfo placeVisitorInfo, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = placeVisitorInfo.totalVisitors;
            }
            if ((i3 & 2) != 0) {
                i2 = placeVisitorInfo.newVisitors;
            }
            return placeVisitorInfo.copy(i, i2);
        }

        public final int component1() {
            return this.totalVisitors;
        }

        public final int component2() {
            return this.newVisitors;
        }

        @NotNull
        public final PlaceVisitorInfo copy(int i, int i2) {
            return new PlaceVisitorInfo(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PlaceVisitorInfo) {
                PlaceVisitorInfo placeVisitorInfo = (PlaceVisitorInfo) obj;
                if ((this.totalVisitors == placeVisitorInfo.totalVisitors ? 1 : null) != null) {
                    if ((this.newVisitors == placeVisitorInfo.newVisitors ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.totalVisitors * 31) + this.newVisitors;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlaceVisitorInfo(totalVisitors=");
            stringBuilder.append(this.totalVisitors);
            stringBuilder.append(", newVisitors=");
            stringBuilder.append(this.newVisitors);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public PlaceVisitorInfo(int i, int i2) {
            this.totalVisitors = i;
            this.newVisitors = i2;
        }

        public final int getNewVisitors() {
            return this.newVisitors;
        }

        public final int getTotalVisitors() {
            return this.totalVisitors;
        }

        public final boolean hasValidVisitorInfo() {
            return (this.totalVisitors == -1 || this.newVisitors == -1) ? false : true;
        }
    }

    @NotNull
    Single<RecsEngine> addEngineIfAbsent(@NotNull String str);

    @NotNull
    Completable blacklistPlace(@NotNull String str);

    @NotNull
    Completable clearPlacesCache();

    @NotNull
    Completable correctPlace(@NotNull String str, @NotNull String str2);

    @NotNull
    Completable deletePlace(@NotNull String str);

    @NotNull
    Single<Found> find(@NotNull String str);

    @NotNull
    Single<Integer> getCount();

    @NotNull
    Observable<PlaceVisitorInfo> getVisitorInfo(@NotNull String str);

    @NotNull
    Completable load();

    @NotNull
    Completable markPlaceRecsViewed(@NotNull String str);

    @NotNull
    Completable markPlaceViewed(@NotNull String str);

    @NotNull
    Observable<PlaceUpdate> observe();
}
