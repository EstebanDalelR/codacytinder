package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.C10883c;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.C8733a;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.Creator;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.Select_profile_spotify_top_artistCreator;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.Select_profile_spotify_top_artistModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"profileSpotifyTopArtistByActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel$Select_profile_spotify_top_artistModel;", "getProfileSpotifyTopArtistByActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "profileSpotifyTopArtistModelFactory", "Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel$Factory;", "Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel;", "getProfileSpotifyTopArtistModelFactory", "()Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class ca {
    @NotNull
    /* renamed from: a */
    private static final C8733a<ProfileSpotifyTopArtistModel> f30607a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_profile_spotify_top_artistModel> f30608b;

    @NotNull
    /* renamed from: a */
    public static final C8733a<ProfileSpotifyTopArtistModel> m37067a() {
        return f30607a;
    }

    static {
        Function4 function4 = C14304xfadb8373.f45312a;
        if (function4 != null) {
            function4 = new cb(function4);
        }
        f30607a = new C8733a((Creator) function4);
        C8733a c8733a = f30607a;
        Function2 function2 = C14303xdb47d16c.f45311a;
        if (function2 != null) {
            function2 = new cc(function2);
        }
        C10883c a = c8733a.m37232a((Select_profile_spotify_top_artistCreator) function2);
        C2668g.a(a, "profileSpotifyTopArtistM…tistByActivityFeedItemId)");
        f30608b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_profile_spotify_top_artistModel> m37068b() {
        return f30608b;
    }
}
