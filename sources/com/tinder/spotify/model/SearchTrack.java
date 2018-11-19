package com.tinder.spotify.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.tinder.utils.ad;
import java.util.Arrays;
import java.util.List;

public class SearchTrack implements Parcelable {
    public static final Creator<SearchTrack> CREATOR = new C150501();
    private static final Gson GSON = new Gson();
    public static final String LEGACY_SPOTIFY_IMAGE_MAP_URL_KEY = "url";
    @Keep
    @SerializedName("album")
    private Album mAlbum;
    @Keep
    @SerializedName("artists")
    private List<Artist> mArtist;
    @Keep
    @SerializedName("id")
    @NonNull
    private String mId;
    @Keep
    @SerializedName("is_playable")
    private boolean mIsPlayable;
    @Keep
    @SerializedName("name")
    private String mName;
    private String mPlayToken;
    @Keep
    @SerializedName("popularity")
    private int mPopularity;
    @Keep
    @Nullable
    @SerializedName("preview_url")
    private String mPreviewUrl;
    @Keep
    @SerializedName("uri")
    private String mSpotifyUri;

    /* renamed from: com.tinder.spotify.model.SearchTrack$1 */
    static class C150501 implements Creator<SearchTrack> {
        C150501() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m56715a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m56716a(i);
        }

        /* renamed from: a */
        public SearchTrack m56715a(Parcel parcel) {
            return new SearchTrack(parcel);
        }

        /* renamed from: a */
        public SearchTrack[] m56716a(int i) {
            return new SearchTrack[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public SearchTrack(String str, String str2, Album album, List<Artist> list, boolean z, int i, @Nullable String str3, String str4) {
        this.mId = str;
        this.mAlbum = album;
        this.mArtist = list;
        this.mIsPlayable = z;
        this.mName = str2;
        this.mPopularity = i;
        this.mPreviewUrl = str3;
        this.mSpotifyUri = str4;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    public Album getAlbum() {
        return this.mAlbum;
    }

    public List<Artist> getArtist() {
        return this.mArtist;
    }

    public int getPopularity() {
        return this.mPopularity;
    }

    @Nullable
    public String getPreviewUrl() {
        return this.mPreviewUrl;
    }

    public String getSpotifyUri() {
        return this.mSpotifyUri;
    }

    public String getName() {
        return this.mName;
    }

    public void setArtists(List<Artist> list) {
        this.mArtist = list;
    }

    public SearchTrack(Parcel parcel) {
        this.mId = parcel.readString();
        this.mName = parcel.readString();
        this.mAlbum = (Album) parcel.readParcelable(Album.class.getClassLoader());
        this.mArtist = parcel.readArrayList(Artist.class.getClassLoader());
        this.mIsPlayable = parcel.readByte() != (byte) 0;
        this.mPopularity = parcel.readInt();
        this.mPreviewUrl = parcel.readString();
        this.mSpotifyUri = parcel.readString();
        this.mPlayToken = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mName);
        parcel.writeParcelable(this.mAlbum, 0);
        parcel.writeList(this.mArtist);
        parcel.writeByte((byte) this.mIsPlayable);
        parcel.writeInt(this.mPopularity);
        parcel.writeString(this.mPreviewUrl);
        parcel.writeString(this.mSpotifyUri);
        parcel.writeString(this.mPlayToken);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("artist: ");
        stringBuilder2.append(getArtist());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("name: ");
        stringBuilder2.append(getName());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("id: ");
        stringBuilder2.append(getId());
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.mId});
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (obj instanceof SearchTrack) {
                SearchTrack searchTrack = (SearchTrack) obj;
                Object obj2 = (this.mPlayToken == null || !this.mPlayToken.equals(searchTrack.getPlayToken())) ? null : 1;
                if (!(obj2 == null || searchTrack.getId().equals(this.mId) == null)) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    public String toJsonString() {
        return GSON.toJson(this);
    }

    public static SearchTrack fromString(String str) {
        try {
            return (SearchTrack) GSON.fromJson(str, SearchTrack.class);
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" : the json string : ");
            stringBuilder.append(str);
            ad.a("SearcTrackParsingError", stringBuilder.toString(), e);
            return null;
        }
    }

    private String getPlayToken() {
        return this.mPlayToken;
    }

    public void setPlayToken(String str) {
        this.mPlayToken = str;
    }
}
