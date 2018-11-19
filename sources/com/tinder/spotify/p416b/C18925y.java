package com.tinder.spotify.p416b;

import com.tinder.spotify.model.SearchTrack;
import retrofit2.Response;
import rx.functions.Action1;

/* renamed from: com.tinder.spotify.b.y */
final /* synthetic */ class C18925y implements Action1 {
    /* renamed from: a */
    private final C18170x f58577a;
    /* renamed from: b */
    private final SearchTrack f58578b;

    C18925y(C18170x c18170x, SearchTrack searchTrack) {
        this.f58577a = c18170x;
        this.f58578b = searchTrack;
    }

    public void call(Object obj) {
        this.f58577a.m65924a(this.f58578b, (Response) obj);
    }
}
