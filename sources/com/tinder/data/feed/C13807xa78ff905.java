package com.tinder.data.feed;

import com.tinder.api.model.activityfeed.ApiActivityEventSpotifyArtist;
import com.tinder.api.model.activityfeed.ApiActivityEventSpotifyTrack;
import java.util.List;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C19285g;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyTrack;", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyArtist;", "apiSpotifyArtist", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.FeedApiToDomainExtentionsKt$reverseMapSpotifyTracksFromSpotifyArtistsToArtists$1 */
final class C13807xa78ff905 extends Lambda implements Function1<ApiActivityEventSpotifyArtist, Sequence<? extends Pair<? extends ApiActivityEventSpotifyTrack, ? extends ApiActivityEventSpotifyArtist>>> {
    /* renamed from: a */
    public static final C13807xa78ff905 f43814a = new C13807xa78ff905();

    C13807xa78ff905() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53378a((ApiActivityEventSpotifyArtist) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Sequence<Pair<ApiActivityEventSpotifyTrack, ApiActivityEventSpotifyArtist>> m53378a(@NotNull final ApiActivityEventSpotifyArtist apiActivityEventSpotifyArtist) {
        C2668g.b(apiActivityEventSpotifyArtist, "apiSpotifyArtist");
        List tracks = apiActivityEventSpotifyArtist.getTracks();
        if (tracks == null) {
            tracks = C19301m.a();
        }
        return C19285g.e(C19301m.r(tracks), new Function1<ApiActivityEventSpotifyTrack, Pair<? extends ApiActivityEventSpotifyTrack, ? extends ApiActivityEventSpotifyArtist>>() {
            public /* synthetic */ Object invoke(Object obj) {
                return m53377a((ApiActivityEventSpotifyTrack) obj);
            }

            @NotNull
            /* renamed from: a */
            public final Pair<ApiActivityEventSpotifyTrack, ApiActivityEventSpotifyArtist> m53377a(@NotNull ApiActivityEventSpotifyTrack apiActivityEventSpotifyTrack) {
                C2668g.b(apiActivityEventSpotifyTrack, "apiSpotifyTrack");
                return C15811g.a(apiActivityEventSpotifyTrack, apiActivityEventSpotifyArtist);
            }
        });
    }
}
