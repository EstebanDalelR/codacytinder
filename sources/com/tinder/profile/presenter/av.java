package com.tinder.profile.presenter;

import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.screenshotty.p401a.C14826a;
import io.reactivex.functions.Consumer;

final /* synthetic */ class av implements Consumer {
    /* renamed from: a */
    private final ak f50169a;
    /* renamed from: b */
    private final C14826a f50170b;
    /* renamed from: c */
    private final Profile f50171c;
    /* renamed from: d */
    private final String f50172d;
    /* renamed from: e */
    private final ProfileScreenSource f50173e;

    av(ak akVar, C14826a c14826a, Profile profile, String str, ProfileScreenSource profileScreenSource) {
        this.f50169a = akVar;
        this.f50170b = c14826a;
        this.f50171c = profile;
        this.f50172d = str;
        this.f50173e = profileScreenSource;
    }

    public void accept(Object obj) {
        this.f50169a.m55002a(this.f50170b, this.f50171c, this.f50172d, this.f50173e, (String) obj);
    }
}
