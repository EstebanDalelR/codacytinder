package com.tinder.places.map.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.DrawableRes;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/places/map/view/PlaceMarkerViewOptions;", "Lcom/mapbox/mapboxsdk/annotations/BaseMarkerViewOptions;", "Lcom/tinder/places/map/view/PlaceMarkerView;", "placeId", "", "pinResource", "", "radarResource", "iconResource", "location", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "(Ljava/lang/String;IIILcom/mapbox/mapboxsdk/geometry/LatLng;)V", "getPlaceId", "()Ljava/lang/String;", "describeContents", "getMarker", "getThis", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceMarkerViewOptions extends BaseMarkerViewOptions<C14216b, PlaceMarkerViewOptions> {
    @NotNull
    private static final Creator<PlaceMarkerViewOptions> CREATOR = new C10232b();
    public static final C10231a Companion = new C10231a();
    private final int iconResource;
    private final LatLng location;
    private final int pinResource;
    @NotNull
    private final String placeId;
    private final int radarResource;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/places/map/view/PlaceMarkerViewOptions$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tinder/places/map/view/PlaceMarkerViewOptions;", "CREATOR$annotations", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.PlaceMarkerViewOptions$a */
    public static final class C10231a {
        private C10231a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/tinder/places/map/view/PlaceMarkerViewOptions$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/tinder/places/map/view/PlaceMarkerViewOptions;", "()V", "createFromParcel", "parcelIn", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/tinder/places/map/view/PlaceMarkerViewOptions;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.PlaceMarkerViewOptions$b */
    public static final class C10232b implements Creator<PlaceMarkerViewOptions> {
        C10232b() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41620a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m41621a(i);
        }

        @NotNull
        /* renamed from: a */
        public PlaceMarkerViewOptions m41620a(@NotNull Parcel parcel) {
            C2668g.b(parcel, "parcelIn");
            String readString = parcel.readString();
            C2668g.a(readString, "parcelIn.readString()");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            parcel = parcel.readParcelable(LatLng.class.getClassLoader());
            C2668g.a(parcel, "parcelIn.readParcelable(…::class.java.classLoader)");
            return new PlaceMarkerViewOptions(readString, readInt, readInt2, readInt3, (LatLng) parcel);
        }

        @NotNull
        /* renamed from: a */
        public PlaceMarkerViewOptions[] m41621a(int i) {
            return new PlaceMarkerViewOptions[i];
        }
    }

    @NotNull
    public static final Creator<PlaceMarkerViewOptions> getCREATOR() {
        C10231a c10231a = Companion;
        return CREATOR;
    }

    public int describeContents() {
        return 0;
    }

    @NotNull
    public PlaceMarkerViewOptions getThis() {
        return this;
    }

    @NotNull
    public final String getPlaceId() {
        return this.placeId;
    }

    public PlaceMarkerViewOptions(@NotNull String str, @DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3, @NotNull LatLng latLng) {
        C2668g.b(str, "placeId");
        C2668g.b(latLng, "location");
        this.placeId = str;
        this.pinResource = i;
        this.radarResource = i2;
        this.iconResource = i3;
        this.location = latLng;
        position(this.location);
        anchor(0.5f, 0.5f);
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C2668g.b(parcel, "dest");
        parcel.writeString(this.placeId);
        parcel.writeInt(this.pinResource);
        parcel.writeInt(this.radarResource);
        parcel.writeInt(this.iconResource);
        parcel.writeParcelable(this.location, i);
    }

    @NotNull
    public C14216b getMarker() {
        return new C14216b(this, this.pinResource, this.radarResource, this.iconResource, this.placeId, this.location);
    }
}
