package com.tinder.spotify.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.tinder.utils.ad;
import java.util.List;

public class Artist implements Parcelable {
    public static final Creator<Artist> CREATOR = new C150492();
    static final Gson GSON = new Gson();
    @Keep
    @SerializedName("id")
    private String mId;
    @Keep
    @SerializedName("selected")
    private boolean mIsSelected;
    @Keep
    @SerializedName("name")
    private String mName;
    @Keep
    @SerializedName("top_track")
    private SearchTrack mTopTrack;

    /* renamed from: com.tinder.spotify.model.Artist$2 */
    static class C150492 implements Creator<Artist> {
        C150492() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m56713a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m56714a(i);
        }

        /* renamed from: a */
        public Artist m56713a(Parcel parcel) {
            return new Artist(parcel);
        }

        /* renamed from: a */
        public Artist[] m56714a(int i) {
            return new Artist[i];
        }
    }

    /* renamed from: com.tinder.spotify.model.Artist$1 */
    static class C168551 extends TypeToken<List<Artist>> {
        C168551() {
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public SearchTrack getTopTrack() {
        return this.mTopTrack;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public void setSelected(boolean z) {
        this.mIsSelected = z;
    }

    public Artist(String str, String str2, SearchTrack searchTrack, boolean z) {
        this.mId = str;
        this.mName = str2;
        this.mTopTrack = searchTrack;
        this.mIsSelected = z;
    }

    public Artist(Parcel parcel) {
        this.mId = parcel.readString();
        this.mName = parcel.readString();
        this.mTopTrack = (SearchTrack) parcel.readParcelable(SearchTrack.class.getClassLoader());
        this.mIsSelected = parcel.readByte() != null ? true : null;
    }

    public void setTopTrack(SearchTrack searchTrack) {
        this.mTopTrack = searchTrack;
    }

    public String toString() {
        return GSON.toJson(this);
    }

    public static Artist fromString(String str) {
        return (Artist) GSON.fromJson(str, Artist.class);
    }

    public static List<Artist> fromStringToListTracks(String str) {
        try {
            return (List) GSON.fromJson(str, new C168551().getType());
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" : the json string : ");
            stringBuilder.append(str);
            ad.a("ArtistParsingError", stringBuilder.toString(), e);
            return null;
        }
    }

    public static String toListString(List<Artist> list) {
        return GSON.toJson(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mName);
        parcel.writeParcelable(this.mTopTrack, i);
        parcel.writeByte((byte) this.mIsSelected);
    }
}
