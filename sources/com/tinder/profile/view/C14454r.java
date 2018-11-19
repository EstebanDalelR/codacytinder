package com.tinder.profile.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.base.view.ProgressImageView;
import com.tinder.profile.view.ProfilePhotosView.C16152a;

/* renamed from: com.tinder.profile.view.r */
final /* synthetic */ class C14454r implements OnClickListener {
    /* renamed from: a */
    private final C16152a f45801a;
    /* renamed from: b */
    private final ProgressImageView f45802b;
    /* renamed from: c */
    private final int f45803c;

    C14454r(C16152a c16152a, ProgressImageView progressImageView, int i) {
        this.f45801a = c16152a;
        this.f45802b = progressImageView;
        this.f45803c = i;
    }

    public void onClick(View view) {
        this.f45801a.m61024a(this.f45802b, this.f45803c, view);
    }
}
