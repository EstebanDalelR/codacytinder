package com.tinder.spotify.repository;

import com.tinder.model.network.DataResponse;
import com.tinder.spotify.model.SpotifySearchResponse;
import rx.functions.Func1;

/* renamed from: com.tinder.spotify.repository.h */
final /* synthetic */ class C18178h implements Func1 {
    /* renamed from: a */
    static final Func1 f56373a = new C18178h();

    private C18178h() {
    }

    public Object call(Object obj) {
        return ((SpotifySearchResponse) ((DataResponse) obj).getData()).m56728a().m56730a();
    }
}
