package com.tinder.tinderplus.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.passport.p300a.C10032a;
import com.tinder.passport.p300a.C10032a.C10031a;
import com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl.PassportViewHolder;

/* renamed from: com.tinder.tinderplus.adapters.b */
final /* synthetic */ class C15199b implements OnClickListener {
    /* renamed from: a */
    private final RecyclerAdapterTPlusControl f47267a;
    /* renamed from: b */
    private final PassportViewHolder f47268b;
    /* renamed from: c */
    private final C10032a f47269c;
    /* renamed from: d */
    private final C10031a f47270d;

    C15199b(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, PassportViewHolder passportViewHolder, C10032a c10032a, C10031a c10031a) {
        this.f47267a = recyclerAdapterTPlusControl;
        this.f47268b = passportViewHolder;
        this.f47269c = c10032a;
        this.f47270d = c10031a;
    }

    public void onClick(View view) {
        this.f47267a.m62602a(this.f47268b, this.f47269c, this.f47270d, view);
    }
}
