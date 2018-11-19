package com.tinder.recsgrid;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recsgrid.b */
final class C14781b implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ Function1 f46353a;

    C14781b(Function1 function1) {
        this.f46353a = function1;
    }

    public final /* synthetic */ void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2668g.a(this.f46353a.invoke(valueAnimator), "invoke(...)");
    }
}
