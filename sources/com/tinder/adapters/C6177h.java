package com.tinder.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.adapters.SchoolsAdapter.SchoolItemViewHolder;
import com.tinder.profile.p366e.C14415f;

/* renamed from: com.tinder.adapters.h */
final /* synthetic */ class C6177h implements OnClickListener {
    /* renamed from: a */
    private final SchoolItemViewHolder f22705a;
    /* renamed from: b */
    private final C14415f f22706b;

    C6177h(SchoolItemViewHolder schoolItemViewHolder, C14415f c14415f) {
        this.f22705a = schoolItemViewHolder;
        this.f22706b = c14415f;
    }

    public void onClick(View view) {
        this.f22705a.m31172a(this.f22706b, view);
    }
}
