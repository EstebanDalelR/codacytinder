package com.tinder.profile.adapters;

import android.support.annotation.NonNull;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.domain.common.model.SpotifyTrack.Artist;
import com.tinder.spotify.model.Album;
import com.tinder.spotify.model.SearchTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/* renamed from: com.tinder.profile.adapters.m */
public class C14368m {
    @Inject
    C14368m() {
    }

    @NonNull
    /* renamed from: a */
    public SearchTrack m54742a(@NonNull SpotifyTrack spotifyTrack) {
        List<Artist> artists = spotifyTrack.artists();
        List arrayList = new ArrayList();
        for (Artist artist : artists) {
            arrayList.add(new com.tinder.spotify.model.Artist(artist.id(), artist.name(), null, true));
        }
        Map hashMap = new HashMap();
        hashMap.put("url", spotifyTrack.artworkUrl());
        return new SearchTrack(spotifyTrack.id(), spotifyTrack.name(), new Album("", "", "", Collections.singletonList(hashMap)), arrayList, false, spotifyTrack.popularity(), spotifyTrack.previewUrl(), spotifyTrack.uri());
    }
}
