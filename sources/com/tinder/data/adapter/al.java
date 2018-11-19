package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.SpotifyThemeTrack;
import com.tinder.domain.common.model.SpotifyArtist;
import java8.util.Objects;
import javax.inject.Inject;

public class al extends C2646o<SpotifyArtist, com.tinder.api.model.common.SpotifyArtist> {
    @NonNull
    /* renamed from: a */
    private an f35124a;

    @Inject
    public al(@NonNull an anVar) {
        this.f35124a = anVar;
    }

    @Nullable
    /* renamed from: a */
    public SpotifyArtist m43102a(@NonNull com.tinder.api.model.common.SpotifyArtist spotifyArtist) {
        String str = (String) Objects.b(spotifyArtist.name(), "");
        String str2 = (String) Objects.b(spotifyArtist.id(), "");
        boolean booleanValue = ((Boolean) Objects.b(spotifyArtist.selected(), Boolean.valueOf(false))).booleanValue();
        SpotifyThemeTrack topTrack = spotifyArtist.topTrack();
        return SpotifyArtist.builder().name(str).id(str2).selected(booleanValue).topTrack(topTrack != null ? this.f35124a.m43108a(topTrack) : null).build();
    }
}
