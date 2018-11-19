package com.tinder.profile.adapters;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.tinder.profile.adapters.b */
final /* synthetic */ class C14361b implements OnClickListener {
    /* renamed from: a */
    private final InstagramPhotoGridAdapter f45560a;
    /* renamed from: b */
    private final int f45561b;

    C14361b(InstagramPhotoGridAdapter instagramPhotoGridAdapter, int i) {
        this.f45560a = instagramPhotoGridAdapter;
        this.f45561b = i;
    }

    public void onClick(View view) {
        this.f45560a.m60837a(this.f45561b, view);
    }
}
