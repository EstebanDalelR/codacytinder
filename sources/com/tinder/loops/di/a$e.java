package com.tinder.loops.di;

import android.arch.lifecycle.ViewModelProvider.Factory;
import com.tinder.loops.activity.C11908b;
import com.tinder.loops.activity.TrimAndCropActivity;

final class a$e implements TrimAndCropActivitySubcomponent {
    /* renamed from: a */
    final /* synthetic */ C3933a f38836a;

    private a$e(C3933a c3933a, a$d a_d) {
        this.f38836a = c3933a;
    }

    public void inject(TrimAndCropActivity trimAndCropActivity) {
        m47938a(trimAndCropActivity);
    }

    /* renamed from: a */
    private TrimAndCropActivity m47938a(TrimAndCropActivity trimAndCropActivity) {
        C11908b.m47911a(trimAndCropActivity, (Factory) C3933a.d(this.f38836a).get());
        return trimAndCropActivity;
    }
}
