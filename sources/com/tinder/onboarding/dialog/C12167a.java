package com.tinder.onboarding.dialog;

import com.tinder.onboarding.presenter.gl;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.dialog.a */
public final class C12167a implements MembersInjector<PhotoSourceSelectorSheetDialog> {
    /* renamed from: a */
    private final Provider<gl> f39438a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48312a((PhotoSourceSelectorSheetDialog) obj);
    }

    /* renamed from: a */
    public void m48312a(PhotoSourceSelectorSheetDialog photoSourceSelectorSheetDialog) {
        C12167a.m48311a(photoSourceSelectorSheetDialog, (gl) this.f39438a.get());
    }

    /* renamed from: a */
    public static void m48311a(PhotoSourceSelectorSheetDialog photoSourceSelectorSheetDialog, gl glVar) {
        photoSourceSelectorSheetDialog.f44628b = glVar;
    }
}
