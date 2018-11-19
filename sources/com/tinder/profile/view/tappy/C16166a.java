package com.tinder.profile.view.tappy;

import com.tinder.profile.presenter.bn;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.tappy.a */
public final class C16166a implements MembersInjector<TappyProfileGamePadView> {
    /* renamed from: a */
    private final Provider<bn> f50357a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61092a((TappyProfileGamePadView) obj);
    }

    /* renamed from: a */
    public void m61092a(TappyProfileGamePadView tappyProfileGamePadView) {
        C16166a.m61091a(tappyProfileGamePadView, (bn) this.f50357a.get());
    }

    /* renamed from: a */
    public static void m61091a(TappyProfileGamePadView tappyProfileGamePadView, bn bnVar) {
        tappyProfileGamePadView.f50349a = bnVar;
    }
}
