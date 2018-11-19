package com.tinder.boost.presenter;

import com.tinder.boost.target.BoostPaywallTarget;
import com.tinder.domain.profile.model.TutorialViewStatus;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: com.tinder.boost.presenter.j */
final /* synthetic */ class C10434j implements Consumer {
    /* renamed from: a */
    private final C12628f f34013a;
    /* renamed from: b */
    private final BoostPaywallTarget f34014b;
    /* renamed from: c */
    private final List f34015c;

    C10434j(C12628f c12628f, BoostPaywallTarget boostPaywallTarget, List list) {
        this.f34013a = c12628f;
        this.f34014b = boostPaywallTarget;
        this.f34015c = list;
    }

    public void accept(Object obj) {
        this.f34013a.m49866a(this.f34014b, this.f34015c, (TutorialViewStatus) obj);
    }
}
