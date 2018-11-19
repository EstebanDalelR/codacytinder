package com.tinder.chat.presenter;

import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.feed.view.model.C9541g;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.chat.presenter.e */
final /* synthetic */ class C10548e implements Consumer {
    /* renamed from: a */
    private final C8442a f34293a;
    /* renamed from: b */
    private final String f34294b;
    /* renamed from: c */
    private final String f34295c;
    /* renamed from: d */
    private final String f34296d;
    /* renamed from: e */
    private final Attribution f34297e;
    /* renamed from: f */
    private final String f34298f;

    C10548e(C8442a c8442a, String str, String str2, String str3, Attribution attribution, String str4) {
        this.f34293a = c8442a;
        this.f34294b = str;
        this.f34295c = str2;
        this.f34296d = str3;
        this.f34297e = attribution;
        this.f34298f = str4;
    }

    public void accept(Object obj) {
        this.f34293a.m36056a(this.f34294b, this.f34295c, this.f34296d, this.f34297e, this.f34298f, (C9541g) obj);
    }
}
