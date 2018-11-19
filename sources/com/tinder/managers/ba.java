package com.tinder.managers;

import com.tinder.listeners.ListenerPhoto;
import com.tinder.model.ProfilePhoto;
import io.reactivex.functions.Consumer;
import java.util.List;

final /* synthetic */ class ba implements Consumer {
    /* renamed from: a */
    private final ManagerProfile f39049a;
    /* renamed from: b */
    private final ProfilePhoto f39050b;
    /* renamed from: c */
    private final ProfilePhoto f39051c;
    /* renamed from: d */
    private final String f39052d;
    /* renamed from: e */
    private final int f39053e;
    /* renamed from: f */
    private final int f39054f;
    /* renamed from: g */
    private final ListenerPhoto f39055g;
    /* renamed from: h */
    private final boolean f39056h;
    /* renamed from: i */
    private final int f39057i;

    ba(ManagerProfile managerProfile, ProfilePhoto profilePhoto, ProfilePhoto profilePhoto2, String str, int i, int i2, ListenerPhoto listenerPhoto, boolean z, int i3) {
        this.f39049a = managerProfile;
        this.f39050b = profilePhoto;
        this.f39051c = profilePhoto2;
        this.f39052d = str;
        this.f39053e = i;
        this.f39054f = i2;
        this.f39055g = listenerPhoto;
        this.f39056h = z;
        this.f39057i = i3;
    }

    public void accept(Object obj) {
        this.f39049a.a(this.f39050b, this.f39051c, this.f39052d, this.f39053e, this.f39054f, this.f39055g, this.f39056h, this.f39057i, (List) obj);
    }
}
