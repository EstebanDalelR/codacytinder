package com.tinder.profile.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p417c.C15047a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;

/* renamed from: com.tinder.profile.adapters.o */
public class C14369o {
    /* renamed from: a */
    private final C14368m f45565a;

    @Inject
    C14369o(@NonNull C14368m c14368m) {
        this.f45565a = c14368m;
    }

    @NonNull
    /* renamed from: a */
    public List<C15047a> m54745a(@NonNull List<SpotifyArtist> list) {
        List arrayList = new ArrayList();
        for (SpotifyArtist spotifyArtist : list) {
            Optional.m59121b(spotifyArtist.topTrack()).m59123a(new C16073p(spotifyArtist)).m59125a(new C16074q(this, arrayList));
        }
        return m54744b(arrayList);
    }

    /* renamed from: a */
    final /* synthetic */ void m54746a(List list, SpotifyTrack spotifyTrack) {
        list.add(this.f45565a.m54742a(spotifyTrack));
    }

    @NonNull
    /* renamed from: b */
    private List<C15047a> m54744b(@Nullable List<SearchTrack> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                int min = Math.min(list.size(), 10);
                List<C15047a> arrayList = new ArrayList((min / 2) + (min % 2));
                for (int i = 0; i < min; i += 2) {
                    List arrayList2 = new ArrayList();
                    arrayList2.add(list.get(i));
                    int i2 = i + 1;
                    arrayList2.add(i2 < min ? (SearchTrack) list.get(i2) : null);
                    arrayList.add(C15047a.m56709a(arrayList2));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }
}
