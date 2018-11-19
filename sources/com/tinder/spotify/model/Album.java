package com.tinder.spotify.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class Album implements Parcelable {
    public static final Creator<Album> CREATOR = new C150481();
    @SerializedName("id")
    private String mId;
    @SerializedName("images")
    private List<Map<String, String>> mImages;
    @SerializedName("name")
    private String mName;
    @SerializedName("uri")
    private String mUri;

    /* renamed from: com.tinder.spotify.model.Album$1 */
    static class C150481 implements Creator<Album> {
        C150481() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m56711a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m56712a(i);
        }

        /* renamed from: a */
        public Album m56711a(Parcel parcel) {
            return new Album(parcel);
        }

        /* renamed from: a */
        public Album[] m56712a(int i) {
            return new Album[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    Album() {
    }

    public Album(String str, String str2, String str3, List<Map<String, String>> list) {
        this.mId = str;
        this.mImages = list;
        this.mName = str3;
        this.mUri = str2;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public String getUri() {
        return this.mUri;
    }

    public List<Map<String, String>> getImages() {
        return this.mImages;
    }

    private Album(Parcel parcel) {
        this.mId = parcel.readString();
        this.mName = parcel.readString();
        this.mUri = parcel.readString();
        this.mImages = parcel.readArrayList(Map.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mUri);
        parcel.writeList(this.mImages);
    }
}
