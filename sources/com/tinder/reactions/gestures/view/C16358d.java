package com.tinder.reactions.gestures.view;

import com.tinder.reactions.audio.C14589a;
import com.tinder.reactions.gestures.p394b.C14655e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.view.d */
public final class C16358d implements MembersInjector<GrandGestureSelectorView> {
    /* renamed from: a */
    private final Provider<C14655e> f50889a;
    /* renamed from: b */
    private final Provider<C14589a> f50890b;

    public /* synthetic */ void injectMembers(Object obj) {
        m61714a((GrandGestureSelectorView) obj);
    }

    /* renamed from: a */
    public void m61714a(GrandGestureSelectorView grandGestureSelectorView) {
        C16358d.m61713a(grandGestureSelectorView, (C14655e) this.f50889a.get());
        C16358d.m61712a(grandGestureSelectorView, (C14589a) this.f50890b.get());
    }

    /* renamed from: a */
    public static void m61713a(GrandGestureSelectorView grandGestureSelectorView, C14655e c14655e) {
        grandGestureSelectorView.f50873a = c14655e;
    }

    /* renamed from: a */
    public static void m61712a(GrandGestureSelectorView grandGestureSelectorView, C14589a c14589a) {
        grandGestureSelectorView.f50874b = c14589a;
    }
}
