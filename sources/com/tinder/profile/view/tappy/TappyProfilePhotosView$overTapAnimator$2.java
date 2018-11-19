package com.tinder.profile.view.tappy;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TappyProfilePhotosView$overTapAnimator$2 extends Lambda implements Function0<ObjectAnimator> {
    /* renamed from: a */
    final /* synthetic */ TappyProfilePhotosView f58005a;

    TappyProfilePhotosView$overTapAnimator$2(TappyProfilePhotosView tappyProfilePhotosView) {
        this.f58005a = tappyProfilePhotosView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67055a();
    }

    @NotNull
    /* renamed from: a */
    public final ObjectAnimator m67055a() {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setProperty(View.TRANSLATION_X);
        objectAnimator.setTarget(this.f58005a.getTappablePager());
        objectAnimator.setDuration(75);
        objectAnimator.setRepeatCount(1);
        objectAnimator.setRepeatMode(2);
        objectAnimator.setInterpolator(new AccelerateInterpolator());
        return objectAnimator;
    }
}
