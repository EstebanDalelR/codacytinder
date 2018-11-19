package com.tinder.presenters;

import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.presenters.n */
final /* synthetic */ class C16059n implements Consumer {
    /* renamed from: a */
    private final C17744d f49924a;
    /* renamed from: b */
    private final String f49925b;

    C16059n(C17744d c17744d, String str) {
        this.f49924a = c17744d;
        this.f49925b = str;
    }

    public void accept(Object obj) {
        this.f49924a.m64723a(this.f49925b, (EditProfileUpdateStatus) obj);
    }
}
