package com.tinder.profiletab.p368b;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/profiletab/tooltip/ProfileTooltipAnimator;", "", "()V", "animator", "Landroid/animation/ObjectAnimator;", "bounceAnimator", "view", "Landroid/view/View;", "start", "", "stop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profiletab.b.b */
public final class C14462b {
    /* renamed from: a */
    private ObjectAnimator f45810a = new ObjectAnimator();

    /* renamed from: a */
    public final void m55194a(@NotNull View view) {
        C2668g.b(view, "view");
        this.f45810a = m55192b(view);
        this.f45810a.start();
    }

    /* renamed from: a */
    public final void m55193a() {
        this.f45810a.cancel();
    }

    /* renamed from: b */
    private final ObjectAnimator m55192b(View view) {
        float translationY = 20.0f + view.getTranslationY();
        view = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), translationY});
        C2668g.a(view, "animator");
        view.setInterpolator(new AccelerateDecelerateInterpolator());
        view.setDuration(500);
        view.setRepeatMode(2);
        view.setRepeatCount(-1);
        return view;
    }
}
