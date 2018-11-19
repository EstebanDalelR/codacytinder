package com.tinder.profile.adapters;

import com.tinder.domain.common.model.SpotifyTrack;
import java.util.List;
import java8.util.function.Consumer;

/* renamed from: com.tinder.profile.adapters.q */
final /* synthetic */ class C16074q implements Consumer {
    /* renamed from: a */
    private final C14369o f49985a;
    /* renamed from: b */
    private final List f49986b;

    C16074q(C14369o c14369o, List list) {
        this.f49985a = c14369o;
        this.f49986b = list;
    }

    public void accept(Object obj) {
        this.f49985a.m54746a(this.f49986b, (SpotifyTrack) obj);
    }
}
