package com.tinder.profiletab.view;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class ProfileTabView$b implements Runnable {
    /* renamed from: a */
    final /* synthetic */ ProfileTabView f45856a;

    ProfileTabView$b(ProfileTabView profileTabView) {
        this.f45856a = profileTabView;
    }

    public final void run() {
        this.f45856a.resetEditButtonToOriginalUi();
    }
}
