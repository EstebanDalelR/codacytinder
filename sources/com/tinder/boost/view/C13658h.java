package com.tinder.boost.view;

import android.content.Context;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.tinder.boost.view.BoostEmitterView.C12641a;
import com.tinder.common.p192e.p193a.C10659a.C8531a;

/* renamed from: com.tinder.boost.view.h */
public class C13658h extends C12641a {
    /* renamed from: a */
    private final int f43501a = 80;
    /* renamed from: b */
    private final String f43502b;

    public int getTargetHeight() {
        return 80;
    }

    public int getTargetWidth() {
        return 80;
    }

    public C13658h(Context context, String str) {
        super(context);
        this.f43502b = str;
    }

    /* renamed from: a */
    public void mo11308a() {
        C0994i.b(getContext()).a(this.f43502b).a(new Transformation[]{new C8531a(getContext()).m36496a().m36499b()}).a(this);
    }
}
