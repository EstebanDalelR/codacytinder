package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.SpotifyThemeTrack;
import com.tinder.api.model.common.SpotifyThemeTrack.Image;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.domain.common.model.SpotifyTrack.Artist;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;

public class an extends C2646o<SpotifyTrack, SpotifyThemeTrack> {
    @NonNull
    /* renamed from: a */
    private final C10734a f35126a = new C10734a();

    /* renamed from: com.tinder.data.adapter.an$a */
    private class C10734a extends C2646o<Artist, SpotifyThemeTrack.Artist> {
        /* renamed from: a */
        final /* synthetic */ an f35125a;

        private C10734a(an anVar) {
            this.f35125a = anVar;
        }

        @Nullable
        /* renamed from: a */
        public Artist m43104a(@NonNull SpotifyThemeTrack.Artist artist) {
            String str = (String) Objects.b(artist.name(), "");
            return Artist.builder().name(str).id((String) Objects.b(artist.id(), "")).build();
        }
    }

    @Nullable
    /* renamed from: a */
    public SpotifyTrack m43108a(@NonNull SpotifyThemeTrack spotifyThemeTrack) {
        String str = (String) Objects.b(spotifyThemeTrack.name(), "");
        String str2 = (String) Objects.b(spotifyThemeTrack.id(), "");
        List b = m43107b((List) Objects.b(spotifyThemeTrack.artists(), Collections.emptyList()));
        boolean booleanValue = ((Boolean) Objects.b(spotifyThemeTrack.isPlayable(), Boolean.valueOf(false))).booleanValue();
        int intValue = ((Integer) Objects.b(spotifyThemeTrack.popularity(), Integer.valueOf(-1))).intValue();
        String str3 = (String) Objects.b(spotifyThemeTrack.previewUrl(), "");
        String str4 = (String) Objects.b(spotifyThemeTrack.uri(), "");
        return SpotifyTrack.builder().name(str).id(str2).artists(b).isPlayable(booleanValue).popularity(intValue).previewUrl(str3).uri(str4).artworkUrl(m43106b(spotifyThemeTrack)).build();
    }

    @NonNull
    /* renamed from: b */
    private String m43106b(@NonNull SpotifyThemeTrack spotifyThemeTrack) {
        spotifyThemeTrack = spotifyThemeTrack.album();
        spotifyThemeTrack = spotifyThemeTrack != null ? spotifyThemeTrack.images() : Collections.emptyList();
        return !C2641a.a(spotifyThemeTrack) ? (String) Objects.b(((Image) spotifyThemeTrack.get(0)).url(), "") : "";
    }

    @NonNull
    /* renamed from: b */
    private List<Artist> m43107b(@Nullable List<SpotifyThemeTrack.Artist> list) {
        return this.f35126a.a((List) Objects.b(list, Collections.emptyList()));
    }
}
