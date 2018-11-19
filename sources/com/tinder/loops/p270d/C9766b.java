package com.tinder.loops.p270d;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/loops/tooltip/MediaSelectorTooltipAnimator;", "", "()V", "animator", "Landroid/animation/ObjectAnimator;", "setupAnimatorTargetAndValues", "", "view", "Landroid/view/View;", "start", "stop", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.d.b */
public final class C9766b {
    /* renamed from: a */
    private ObjectAnimator f32406a;

    public C9766b() {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setProperty(View.TRANSLATION_Y);
        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimator.setDuration(500);
        objectAnimator.setRepeatMode(2);
        objectAnimator.setRepeatCount(-1);
        this.f32406a = objectAnimator;
    }

    /* renamed from: a */
    public final void m40307a(@NotNull View view) {
        C2668g.b(view, "view");
        m40305b(view);
        this.f32406a.start();
    }

    /* renamed from: a */
    public final void m40306a() {
        this.f32406a.cancel();
    }

    /* renamed from: b */
    private final void m40305b(View view) {
        float translationY = 20.0f + view.getTranslationY();
        ObjectAnimator objectAnimator = this.f32406a;
        objectAnimator.setTarget(view);
        objectAnimator.setFloatValues(new float[]{r0, translationY});
    }
}
