package com.tinder.managers;

import com.tinder.listeners.ListenerPhoto;
import com.tinder.model.ProfilePhoto;
import io.reactivex.functions.Consumer;

final /* synthetic */ class bb implements Consumer {
    /* renamed from: a */
    private final ListenerPhoto f39058a;
    /* renamed from: b */
    private final int f39059b;
    /* renamed from: c */
    private final ProfilePhoto f39060c;

    bb(ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto) {
        this.f39058a = listenerPhoto;
        this.f39059b = i;
        this.f39060c = profilePhoto;
    }

    public void accept(Object obj) {
        ManagerProfile.a(this.f39058a, this.f39059b, this.f39060c, (Throwable) obj);
    }
}
