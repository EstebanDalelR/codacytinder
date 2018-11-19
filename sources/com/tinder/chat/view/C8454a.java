package com.tinder.chat.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.domain.match.model.Match;

/* renamed from: com.tinder.chat.view.a */
final /* synthetic */ class C8454a implements OnClickListener {
    /* renamed from: a */
    private final CensorOverflowMenu f30100a;
    /* renamed from: b */
    private final Match f30101b;

    C8454a(CensorOverflowMenu censorOverflowMenu, Match match) {
        this.f30100a = censorOverflowMenu;
        this.f30101b = match;
    }

    public void onClick(View view) {
        this.f30100a.m50126a(this.f30101b, view);
    }
}
