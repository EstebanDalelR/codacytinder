package com.tinder.reactions.gestures.view;

import com.tinder.reactions.gestures.p394b.C14651a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.view.a */
public final class C16355a implements MembersInjector<FlingableLottieAnimationView> {
    /* renamed from: a */
    private final Provider<C14651a> f50882a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61705a((FlingableLottieAnimationView) obj);
    }

    /* renamed from: a */
    public void m61705a(FlingableLottieAnimationView flingableLottieAnimationView) {
        C16355a.m61704a(flingableLottieAnimationView, (C14651a) this.f50882a.get());
    }

    /* renamed from: a */
    public static void m61704a(FlingableLottieAnimationView flingableLottieAnimationView, C14651a c14651a) {
        flingableLottieAnimationView.f58238a = c14651a;
    }
}
