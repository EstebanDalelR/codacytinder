package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class Category implements Parcelable, FoursquareType {
    public static final Creator<Category> CREATOR = new C18911();
    private ArrayList<Category> categories;
    private Photo icon;
    private String id;
    private String name;
    private String pluralName;
    private boolean primary;
    private String shortName;

    /* renamed from: com.foursquare.api.types.Category$1 */
    class C18911 implements Creator<Category> {
        C18911() {
        }

        public Category createFromParcel(Parcel parcel) {
            return new Category(parcel);
        }

        public Category[] newArray(int i) {
            return new Category[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Category() {
        this.categories = new ArrayList();
    }

    public Category(String str, String str2, String str3, String str4, Photo photo) {
        this();
        this.id = str;
        this.name = str2;
        this.shortName = str3;
        this.pluralName = str4;
        this.icon = photo;
    }

    private Category(Parcel parcel) {
        this.categories = parcel.createTypedArrayList(CREATOR);
        this.icon = (Photo) parcel.readParcelable(Photo.class.getClassLoader());
        this.id = parcel.readString();
        this.name = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.primary = z;
        this.pluralName = parcel.readString();
        this.shortName = parcel.readString();
    }

    public String getPluralName() {
        return this.pluralName;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Photo getImage() {
        if (this.icon != null && this.icon.getSizes() == null) {
            this.icon.setSizes(Photo.CATEGORY_ICON_SIZES);
        }
        return this.icon;
    }

    public boolean isPrimary() {
        return this.primary;
    }

    public boolean hasChildren() {
        return (this.categories == null || this.categories.isEmpty()) ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.categories);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.primary);
        parcel.writeString(this.pluralName);
        parcel.writeString(this.shortName);
    }

    public String getShortName() {
        return this.shortName;
    }
}
