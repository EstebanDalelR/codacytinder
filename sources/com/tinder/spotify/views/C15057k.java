package com.tinder.spotify.views;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.tinder.spotify.views.k */
final /* synthetic */ class C15057k implements OnClickListener {
    /* renamed from: a */
    private final AppCompatActivity f46886a;

    C15057k(AppCompatActivity appCompatActivity) {
        this.f46886a = appCompatActivity;
    }

    public void onClick(View view) {
        this.f46886a.onBackPressed();
    }
}
