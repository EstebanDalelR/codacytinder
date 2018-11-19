package com.tinder.tinderplus.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl.PassportViewHolder;

/* renamed from: com.tinder.tinderplus.adapters.a */
final /* synthetic */ class C15198a implements OnClickListener {
    /* renamed from: a */
    private final RecyclerAdapterTPlusControl f47265a;
    /* renamed from: b */
    private final PassportViewHolder f47266b;

    C15198a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, PassportViewHolder passportViewHolder) {
        this.f47265a = recyclerAdapterTPlusControl;
        this.f47266b = passportViewHolder;
    }

    public void onClick(View view) {
        this.f47265a.m62601a(this.f47266b, view);
    }
}
