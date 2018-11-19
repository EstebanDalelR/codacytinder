package com.tinder.data.message;

import android.database.Cursor;
import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.Select_profile_spotify_top_artistModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel$Select_profile_spotify_top_artistModel;", "p1", "Landroid/database/Cursor;", "Lkotlin/ParameterName;", "name", "p0", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedItemDataStore$queryProfileSpotifyTopArtist$2$1 extends FunctionReference implements Function1<Cursor, Select_profile_spotify_top_artistModel> {
    ActivityFeedItemDataStore$queryProfileSpotifyTopArtist$2$1(RowMapper rowMapper) {
        super(1, rowMapper);
    }

    public final String getName() {
        return "map";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(RowMapper.class);
    }

    public final String getSignature() {
        return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54349a((Cursor) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Select_profile_spotify_top_artistModel m54349a(@NotNull Cursor cursor) {
        C2668g.b(cursor, "p1");
        return (Select_profile_spotify_top_artistModel) ((RowMapper) this.receiver).map(cursor);
    }
}
