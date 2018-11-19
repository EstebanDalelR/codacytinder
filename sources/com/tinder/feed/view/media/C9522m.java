package com.tinder.feed.view.media;

import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C10636b;
import com.tinder.common.feed.view.SpotifyTrackPlayerView.TrackType;
import com.tinder.spotify.model.SearchTrack;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/tinder/feed/view/media/FeedSpotifyViewModel;", "", "feedItemId", "", "searchTrack", "Lcom/tinder/spotify/model/SearchTrack;", "trackType", "Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;", "images", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "(Ljava/lang/String;Lcom/tinder/spotify/model/SearchTrack;Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;Ljava/util/List;)V", "getFeedItemId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getSearchTrack", "()Lcom/tinder/spotify/model/SearchTrack;", "getTrackType", "()Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.m */
public final class C9522m {
    @NotNull
    /* renamed from: a */
    private final String f31881a;
    @NotNull
    /* renamed from: b */
    private final SearchTrack f31882b;
    @NotNull
    /* renamed from: c */
    private final TrackType f31883c;
    @NotNull
    /* renamed from: d */
    private final List<C10636b> f31884d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9522m) {
                C9522m c9522m = (C9522m) obj;
                if (C2668g.a(this.f31881a, c9522m.f31881a) && C2668g.a(this.f31882b, c9522m.f31882b) && C2668g.a(this.f31883c, c9522m.f31883c) && C2668g.a(this.f31884d, c9522m.f31884d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31881a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SearchTrack searchTrack = this.f31882b;
        hashCode = (hashCode + (searchTrack != null ? searchTrack.hashCode() : 0)) * 31;
        TrackType trackType = this.f31883c;
        hashCode = (hashCode + (trackType != null ? trackType.hashCode() : 0)) * 31;
        List list = this.f31884d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedSpotifyViewModel(feedItemId=");
        stringBuilder.append(this.f31881a);
        stringBuilder.append(", searchTrack=");
        stringBuilder.append(this.f31882b);
        stringBuilder.append(", trackType=");
        stringBuilder.append(this.f31883c);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f31884d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9522m(@NotNull String str, @NotNull SearchTrack searchTrack, @NotNull TrackType trackType, @NotNull List<C10636b> list) {
        C2668g.b(str, "feedItemId");
        C2668g.b(searchTrack, "searchTrack");
        C2668g.b(trackType, "trackType");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        this.f31881a = str;
        this.f31882b = searchTrack;
        this.f31883c = trackType;
        this.f31884d = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m39784a() {
        return this.f31881a;
    }

    @NotNull
    /* renamed from: b */
    public final SearchTrack m39785b() {
        return this.f31882b;
    }

    @NotNull
    /* renamed from: c */
    public final TrackType m39786c() {
        return this.f31883c;
    }

    @NotNull
    /* renamed from: d */
    public final List<C10636b> m39787d() {
        return this.f31884d;
    }
}
