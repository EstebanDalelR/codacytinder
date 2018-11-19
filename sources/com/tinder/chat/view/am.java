package com.tinder.chat.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.domain.match.model.Match;

final /* synthetic */ class am implements OnClickListener {
    /* renamed from: a */
    private final ChatToolbar f30145a;
    /* renamed from: b */
    private final Match f30146b;

    am(ChatToolbar chatToolbar, Match match) {
        this.f30145a = chatToolbar;
        this.f30146b = match;
    }

    public void onClick(View view) {
        this.f30145a.m42657a(this.f30146b, view);
    }
}
