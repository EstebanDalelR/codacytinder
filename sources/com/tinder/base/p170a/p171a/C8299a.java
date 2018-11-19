package com.tinder.base.p170a.p171a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"DURATION_DEFAULT_MS", "", "cancelAndReset", "", "Landroid/animation/ValueAnimator;", "base_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.base.a.a.a */
public final class C8299a {
    /* renamed from: a */
    public static final void m35391a(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "$receiver");
        valueAnimator.cancel();
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.setStartDelay(0);
        valueAnimator.setDuration(300);
        valueAnimator.setInterpolator((TimeInterpolator) null);
    }
}
