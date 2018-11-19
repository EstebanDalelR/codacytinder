package com.tinder.profile.adapters;

import com.tinder.domain.common.model.SpotifyArtist;
import java8.util.function.Predicate;

/* renamed from: com.tinder.profile.adapters.p */
final /* synthetic */ class C16073p implements Predicate {
    /* renamed from: a */
    private final SpotifyArtist f49984a;

    C16073p(SpotifyArtist spotifyArtist) {
        this.f49984a = spotifyArtist;
    }

    public boolean test(Object obj) {
        return this.f49984a.selected();
    }
}
