package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Photo implements Parcelable, FoursquareType {
    static final int[] CATEGORY_ICON_SIZES = new int[]{32, 44, 64, 88};
    public static final Creator<Photo> CREATOR = new C19021();
    private long createdAt;
    private int height = 0;
    private String id;
    private String name;
    private String prefix;
    private int[] sizes;
    private String suffix;
    private String url;
    private int width = 0;

    /* renamed from: com.foursquare.api.types.Photo$1 */
    class C19021 implements Creator<Photo> {
        C19021() {
        }

        public Photo createFromParcel(Parcel parcel) {
            return new Photo(parcel);
        }

        public Photo[] newArray(int i) {
            return new Photo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[, Prefix: ");
        stringBuilder.append(this.prefix);
        stringBuilder.append(", Suffix: ");
        stringBuilder.append(this.suffix);
        stringBuilder.append(", Url: ");
        stringBuilder.append(this.url);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected Photo(Parcel parcel) {
        this.id = parcel.readString();
        this.createdAt = parcel.readLong();
        this.prefix = parcel.readString();
        this.suffix = parcel.readString();
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.name = parcel.readString();
        this.sizes = parcel.createIntArray();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String str) {
        this.suffix = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int[] getSizes() {
        return this.sizes;
    }

    public void setSizes(int[] iArr) {
        this.sizes = iArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.prefix);
        parcel.writeString(this.suffix);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.name);
        parcel.writeIntArray(this.sizes);
    }
}
