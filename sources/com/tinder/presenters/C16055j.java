package com.tinder.presenters;

import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.presenters.j */
final /* synthetic */ class C16055j implements Consumer {
    /* renamed from: a */
    private final C17744d f49919a;
    /* renamed from: b */
    private final boolean f49920b;

    C16055j(C17744d c17744d, boolean z) {
        this.f49919a = c17744d;
        this.f49920b = z;
    }

    public void accept(Object obj) {
        this.f49919a.m64728a(this.f49920b, (EditProfileUpdateStatus) obj);
    }
}
