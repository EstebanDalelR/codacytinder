package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.exceptions.InvalidMarkerPositionException;
import com.mapbox.mapboxsdk.geometry.LatLng;

public final class MarkerOptions extends BaseMarkerOptions<Marker, MarkerOptions> implements Parcelable {
    public static final Creator<MarkerOptions> CREATOR = new C58151();

    /* renamed from: com.mapbox.mapboxsdk.annotations.MarkerOptions$1 */
    static class C58151 implements Creator<MarkerOptions> {
        C58151() {
        }

        public MarkerOptions createFromParcel(Parcel parcel) {
            return new MarkerOptions(parcel);
        }

        public MarkerOptions[] newArray(int i) {
            return new MarkerOptions[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public MarkerOptions getThis() {
        return this;
    }

    protected MarkerOptions(Parcel parcel) {
        position((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
        snippet(parcel.readString());
        title(parcel.readString());
        if (parcel.readByte() != (byte) 0) {
            icon(new Icon(parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader())));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getPosition(), i);
        parcel.writeString(getSnippet());
        parcel.writeString(getTitle());
        Icon icon = getIcon();
        parcel.writeByte((byte) (icon != null ? 1 : 0));
        if (icon != null) {
            parcel.writeString(getIcon().getId());
            parcel.writeParcelable(getIcon().getBitmap(), i);
        }
    }

    public Marker getMarker() {
        if (this.position != null) {
            return new Marker(this.position, this.icon, this.title, this.snippet);
        }
        throw new InvalidMarkerPositionException();
    }

    public LatLng getPosition() {
        return this.position;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public String getTitle() {
        return this.title;
    }

    public Icon getIcon() {
        return this.icon;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x0087;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0013;
    L_0x0011:
        goto L_0x0087;
    L_0x0013:
        r5 = (com.mapbox.mapboxsdk.annotations.MarkerOptions) r5;
        r2 = r4.getPosition();
        if (r2 == 0) goto L_0x002a;
    L_0x001b:
        r2 = r4.getPosition();
        r3 = r5.getPosition();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0031;
    L_0x0029:
        goto L_0x0030;
    L_0x002a:
        r2 = r5.getPosition();
        if (r2 == 0) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r2 = r4.getSnippet();
        if (r2 == 0) goto L_0x0046;
    L_0x0037:
        r2 = r4.getSnippet();
        r3 = r5.getSnippet();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x004d;
    L_0x0045:
        goto L_0x004c;
    L_0x0046:
        r2 = r5.getSnippet();
        if (r2 == 0) goto L_0x004d;
    L_0x004c:
        return r1;
    L_0x004d:
        r2 = r4.getIcon();
        if (r2 == 0) goto L_0x0062;
    L_0x0053:
        r2 = r4.getIcon();
        r3 = r5.getIcon();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0069;
    L_0x0061:
        goto L_0x0068;
    L_0x0062:
        r2 = r5.getIcon();
        if (r2 == 0) goto L_0x0069;
    L_0x0068:
        return r1;
    L_0x0069:
        r2 = r4.getTitle();
        if (r2 == 0) goto L_0x007e;
    L_0x006f:
        r2 = r4.getTitle();
        r5 = r5.getTitle();
        r5 = r2.equals(r5);
        if (r5 != 0) goto L_0x0086;
    L_0x007d:
        goto L_0x0085;
    L_0x007e:
        r5 = r5.getTitle();
        if (r5 != 0) goto L_0x0085;
    L_0x0084:
        goto L_0x0086;
    L_0x0085:
        r0 = 0;
    L_0x0086:
        return r0;
    L_0x0087:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.annotations.MarkerOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((getPosition() != null ? getPosition().hashCode() : 0) + 31) * 31) + (getSnippet() != null ? getSnippet().hashCode() : 0)) * 31) + (getIcon() != null ? getIcon().hashCode() : 0)) * 31;
        if (getTitle() != null) {
            i = getTitle().hashCode();
        }
        return hashCode + i;
    }
}
