package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.exceptions.InvalidMarkerPositionException;
import com.mapbox.mapboxsdk.geometry.LatLng;

@Deprecated
public class MarkerViewOptions extends BaseMarkerViewOptions<MarkerView, MarkerViewOptions> {
    public static final Creator<MarkerViewOptions> CREATOR = new C58171();
    private MarkerView marker = new MarkerView();

    /* renamed from: com.mapbox.mapboxsdk.annotations.MarkerViewOptions$1 */
    static class C58171 implements Creator<MarkerViewOptions> {
        C58171() {
        }

        public MarkerViewOptions createFromParcel(Parcel parcel) {
            return new MarkerViewOptions(parcel);
        }

        public MarkerViewOptions[] newArray(int i) {
            return new MarkerViewOptions[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public MarkerViewOptions getThis() {
        return this;
    }

    protected MarkerViewOptions(Parcel parcel) {
        position((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
        snippet(parcel.readString());
        title(parcel.readString());
        boolean z = false;
        flat(parcel.readByte() != (byte) 0);
        anchor(parcel.readFloat(), parcel.readFloat());
        infoWindowAnchor(parcel.readFloat(), parcel.readFloat());
        rotation(parcel.readFloat());
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        visible(z);
        alpha(parcel.readFloat());
        if (parcel.readByte() != (byte) 0) {
            icon(new Icon(parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader())));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getPosition(), i);
        parcel.writeString(getSnippet());
        parcel.writeString(getTitle());
        parcel.writeByte((byte) isFlat());
        parcel.writeFloat(getAnchorU());
        parcel.writeFloat(getAnchorV());
        parcel.writeFloat(getInfoWindowAnchorU());
        parcel.writeFloat(getInfoWindowAnchorV());
        parcel.writeFloat(getRotation());
        parcel.writeByte((byte) isVisible());
        parcel.writeFloat(this.alpha);
        Icon icon = getIcon();
        parcel.writeByte((byte) (icon != null ? 1 : 0));
        if (icon != null) {
            parcel.writeString(getIcon().getId());
            parcel.writeParcelable(getIcon().getBitmap(), i);
        }
    }

    public MarkerView getMarker() {
        if (this.position == null) {
            throw new InvalidMarkerPositionException();
        }
        this.marker.setPosition(this.position);
        this.marker.setSnippet(this.snippet);
        this.marker.setTitle(this.title);
        this.marker.setIcon(this.icon);
        this.marker.setFlat(this.flat);
        this.marker.setAnchor(this.anchorU, this.anchorV);
        this.marker.setInfoWindowAnchor(this.infoWindowAnchorU, this.infoWindowAnchorV);
        this.marker.setRotation(this.rotation);
        this.marker.setVisible(this.visible);
        this.marker.setAlpha(this.alpha);
        return this.marker;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                MarkerViewOptions markerViewOptions = (MarkerViewOptions) obj;
                if (this.marker != null) {
                    z = this.marker.equals(markerViewOptions.marker);
                } else if (markerViewOptions.marker != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.marker != null ? this.marker.hashCode() : 0;
    }
}
