package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedSong;", "", "id", "", "name", "url", "album", "Lcom/tinder/domain/feed/ActivityFeedAlbum;", "artists", "", "Lcom/tinder/domain/feed/ActivityFeedArtist;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/domain/feed/ActivityFeedAlbum;Ljava/util/List;)V", "getAlbum", "()Lcom/tinder/domain/feed/ActivityFeedAlbum;", "getArtists", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedSong {
    @Nullable
    private final ActivityFeedAlbum album;
    @NotNull
    private final List<ActivityFeedArtist> artists;
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String url;

    @NotNull
    public static /* synthetic */ ActivityFeedSong copy$default(ActivityFeedSong activityFeedSong, String str, String str2, String str3, ActivityFeedAlbum activityFeedAlbum, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedSong.id;
        }
        if ((i & 2) != 0) {
            str2 = activityFeedSong.name;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = activityFeedSong.url;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            activityFeedAlbum = activityFeedSong.album;
        }
        ActivityFeedAlbum activityFeedAlbum2 = activityFeedAlbum;
        if ((i & 16) != 0) {
            list = activityFeedSong.artists;
        }
        return activityFeedSong.copy(str, str4, str5, activityFeedAlbum2, list);
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
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final ActivityFeedAlbum component4() {
        return this.album;
    }

    @NotNull
    public final List<ActivityFeedArtist> component5() {
        return this.artists;
    }

    @NotNull
    public final ActivityFeedSong copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable ActivityFeedAlbum activityFeedAlbum, @NotNull List<ActivityFeedArtist> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(str3, "url");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_ARTISTS);
        return new ActivityFeedSong(str, str2, str3, activityFeedAlbum, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedSong) {
                ActivityFeedSong activityFeedSong = (ActivityFeedSong) obj;
                if (C2668g.a(this.id, activityFeedSong.id) && C2668g.a(this.name, activityFeedSong.name) && C2668g.a(this.url, activityFeedSong.url) && C2668g.a(this.album, activityFeedSong.album) && C2668g.a(this.artists, activityFeedSong.artists)) {
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
        str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ActivityFeedAlbum activityFeedAlbum = this.album;
        hashCode = (hashCode + (activityFeedAlbum != null ? activityFeedAlbum.hashCode() : 0)) * 31;
        List list = this.artists;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedSong(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", album=");
        stringBuilder.append(this.album);
        stringBuilder.append(", artists=");
        stringBuilder.append(this.artists);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedSong(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable ActivityFeedAlbum activityFeedAlbum, @NotNull List<ActivityFeedArtist> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(str3, "url");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_ARTISTS);
        this.id = str;
        this.name = str2;
        this.url = str3;
        this.album = activityFeedAlbum;
        this.artists = list;
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
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final ActivityFeedAlbum getAlbum() {
        return this.album;
    }

    public /* synthetic */ ActivityFeedSong(String str, String str2, String str3, ActivityFeedAlbum activityFeedAlbum, List list, int i, C15823e c15823e) {
        if ((i & 16) != 0) {
            list = C19301m.a();
        }
        this(str, str2, str3, activityFeedAlbum, list);
    }

    @NotNull
    public final List<ActivityFeedArtist> getArtists() {
        return this.artists;
    }
}
