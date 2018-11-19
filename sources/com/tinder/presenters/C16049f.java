package com.tinder.presenters;

import android.util.Pair;
import com.tinder.targets.FragmentViewProfileTarget;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.presenters.f */
final /* synthetic */ class C16049f implements Consumer {
    /* renamed from: a */
    private final FragmentViewProfileTarget f49897a;

    C16049f(FragmentViewProfileTarget fragmentViewProfileTarget) {
        this.f49897a = fragmentViewProfileTarget;
    }

    public void accept(Object obj) {
        C17744d.m64692a(this.f49897a, (Pair) obj);
    }
}
