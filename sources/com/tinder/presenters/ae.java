package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class ae implements Action1 {
    /* renamed from: a */
    private final String f57858a;

    ae(String str) {
        this.f57858a = str;
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).delegateLegacyLocalPhotoAdded(this.f57858a);
    }
}
