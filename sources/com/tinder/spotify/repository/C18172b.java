package com.tinder.spotify.repository;

import com.tinder.spotify.model.SearchTrack;
import retrofit2.Response;
import rx.functions.Func1;

/* renamed from: com.tinder.spotify.repository.b */
final /* synthetic */ class C18172b implements Func1 {
    /* renamed from: a */
    private final C16860a f56365a;
    /* renamed from: b */
    private final SearchTrack f56366b;

    C18172b(C16860a c16860a, SearchTrack searchTrack) {
        this.f56365a = c16860a;
        this.f56366b = searchTrack;
    }

    public Object call(Object obj) {
        return this.f56365a.m62422a(this.f56366b, (Response) obj);
    }
}
