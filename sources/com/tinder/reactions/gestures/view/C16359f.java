package com.tinder.reactions.gestures.view;

import com.tinder.reactions.gestures.p394b.C14657g;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.view.f */
public final class C16359f implements MembersInjector<SelectableGrandGestureView> {
    /* renamed from: a */
    private final Provider<C14657g> f50891a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61716a((SelectableGrandGestureView) obj);
    }

    /* renamed from: a */
    public void m61716a(SelectableGrandGestureView selectableGrandGestureView) {
        C16359f.m61715a(selectableGrandGestureView, (C14657g) this.f50891a.get());
    }

    /* renamed from: a */
    public static void m61715a(SelectableGrandGestureView selectableGrandGestureView, C14657g c14657g) {
        selectableGrandGestureView.f50878a = c14657g;
    }
}
