package com.tinder.feed.view.p250a;

import com.tinder.chat.view.model.C8496j;
import com.tinder.chat.view.model.ak;
import com.tinder.common.feed.view.SpotifyTrackPlayerView.TrackType;
import com.tinder.feed.view.FeedSpotifyTrackPlayerView.C9477b;
import com.tinder.feed.view.media.C9522m;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0006"}, d2 = {"toFeedSpotifyTrackPlayerViewModel", "Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView$FeedSpotifyTrackPlayerViewModel;", "Lcom/tinder/chat/view/model/SpotifySongViewModel;", "feedItemId", "", "Lcom/tinder/feed/view/media/FeedSpotifyViewModel;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.a.b */
public final class C9479b {
    @NotNull
    /* renamed from: a */
    public static final C9477b m39646a(@NotNull C9522m c9522m) {
        C2668g.b(c9522m, "$receiver");
        String a = c9522m.m39784a();
        String id = c9522m.m39785b().getId();
        C2668g.a(id, "searchTrack.id");
        return new C9477b(a, id, c9522m.m39786c(), c9522m.m39785b());
    }

    @NotNull
    /* renamed from: a */
    public static final C9477b m39645a(@NotNull ak akVar, @NotNull String str) {
        C2668g.b(akVar, "$receiver");
        C2668g.b(str, "feedItemId");
        return new C9477b(str, akVar.m36349a(), TrackType.TOP_ARTISTS, C8496j.m36390a(akVar));
    }
}
