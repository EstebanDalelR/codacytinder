package com.tinder.reactions.gestures.view;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.C6250b.C6248a;
import com.tinder.reactions.gestures.viewmodel.C14677g;
import com.tinder.reactions.gestures.viewmodel.C16360a;
import com.tinder.reactions.gestures.viewmodel.C16361b;
import com.tinder.reactions.gestures.viewmodel.C16362c;
import com.tinder.reactions.gestures.viewmodel.C16364m;
import com.tinder.reactions.gestures.viewmodel.C16365n;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0010\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\f\u001a\u00020\u0012\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\f\u001a\u00020\r¨\u0006\u0013"}, d2 = {"setAnimatedBackground", "", "view", "Lcom/airbnb/lottie/LottieAnimationView;", "animatedBackground", "Lcom/tinder/reactions/gestures/viewmodel/AnimatedBackground;", "setDrawableBackground", "Landroid/widget/ImageView;", "saticBackground", "Lcom/tinder/reactions/gestures/viewmodel/DrawableBackground;", "bind", "Lcom/tinder/reactions/gestures/view/FlingOnTargetGrandGestureView;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/SingleGrandGestureViewModel;", "Lcom/tinder/reactions/gestures/view/PullAndReleaseGrandGestureView;", "Lcom/tinder/reactions/gestures/view/SelectableGrandGestureView;", "Lcom/tinder/reactions/gestures/viewmodel/SelectableGrandGestureViewModel;", "Lcom/tinder/reactions/gestures/view/TappableGrandGestureView;", "Lcom/tinder/reactions/gestures/viewmodel/DynamicTypeGrandGestureViewModel;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.view.e */
public final class C14673e {
    /* renamed from: a */
    public static final void m55917a(@NotNull PullAndReleaseGrandGestureView pullAndReleaseGrandGestureView, @NotNull C16365n c16365n) {
        C2668g.b(pullAndReleaseGrandGestureView, "$receiver");
        C2668g.b(c16365n, "viewModel");
        if (c16365n.m61728e() instanceof C16361b) {
            ImageView imageView = (ImageView) pullAndReleaseGrandGestureView.m55909a(C6248a.pullAndReleaseGestureBackground);
            C2668g.a(imageView, "pullAndReleaseGestureBackground");
            C14673e.m55914a(imageView, (C16361b) c16365n.m61728e());
        } else {
            ((ImageView) pullAndReleaseGrandGestureView.m55909a(C6248a.pullAndReleaseGestureBackground)).setImageDrawable(null);
        }
        pullAndReleaseGrandGestureView.setAnimation(c16365n.m61726b());
    }

    /* renamed from: a */
    public static final void m55920a(@NotNull TappableGrandGestureView tappableGrandGestureView, @NotNull C16365n c16365n) {
        C2668g.b(tappableGrandGestureView, "$receiver");
        C2668g.b(c16365n, "viewModel");
        C14677g e = c16365n.m61728e();
        if (e instanceof C16361b) {
            ImageView imageView = (ImageView) tappableGrandGestureView.m55913a(C6248a.drawableBackgroundView);
            C2668g.a(imageView, "drawableBackgroundView");
            C14673e.m55914a(imageView, (C16361b) c16365n.m61728e());
            tappableGrandGestureView.getTappableAnimationView$Tinder_release().setScaleX(c16365n.m61727d());
            tappableGrandGestureView.getTappableAnimationView$Tinder_release().setScaleY(c16365n.m61727d());
        } else if (e instanceof C16360a) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) tappableGrandGestureView.m55913a(C6248a.animatedBackgroundView);
            C2668g.a(lottieAnimationView, "animatedBackgroundView");
            C14673e.m55915a(lottieAnimationView, (C16360a) c16365n.m61728e());
            tappableGrandGestureView.getTappableAnimationView$Tinder_release().setScale(c16365n.m61727d());
        }
        tappableGrandGestureView.getTappableAnimationView$Tinder_release().setAnimation(c16365n.m61726b());
        tappableGrandGestureView.getTappableAnimationView$Tinder_release().c();
    }

    /* renamed from: a */
    public static final void m55919a(@NotNull TappableGrandGestureView tappableGrandGestureView, @NotNull C16362c c16362c) {
        C2668g.b(tappableGrandGestureView, "$receiver");
        C2668g.b(c16362c, "viewModel");
        tappableGrandGestureView.getTappableAnimationView$Tinder_release().setScaleX(c16362c.m61722b());
        tappableGrandGestureView.getTappableAnimationView$Tinder_release().setScaleY(c16362c.m61722b());
        tappableGrandGestureView.getTappableAnimationView$Tinder_release().setAnimation(c16362c.m61721a());
        tappableGrandGestureView.getTappableAnimationView$Tinder_release().c();
    }

    /* renamed from: a */
    public static final void m55916a(@NotNull FlingOnTargetGrandGestureView flingOnTargetGrandGestureView, @NotNull C16365n c16365n) {
        C2668g.b(flingOnTargetGrandGestureView, "$receiver");
        C2668g.b(c16365n, "viewModel");
        flingOnTargetGrandGestureView.setFlingComponentAnimation$Tinder_release(c16365n.m61726b());
    }

    /* renamed from: a */
    public static final void m55918a(@NotNull SelectableGrandGestureView selectableGrandGestureView, @NotNull C16364m c16364m) {
        C2668g.b(selectableGrandGestureView, "$receiver");
        C2668g.b(c16364m, "viewModel");
        ((GrandGestureSelectorView) selectableGrandGestureView.m61703a(C6248a.gestureSelector)).m61693a(c16364m.m61723a());
        ((TappableGrandGestureView) selectableGrandGestureView.m61703a(C6248a.gestureActivator)).getTappableAnimationView$Tinder_release().setAnimation(c16364m.m61724b());
        ((TappableGrandGestureView) selectableGrandGestureView.m61703a(C6248a.gestureActivator)).getTappableAnimationView$Tinder_release().c();
    }

    /* renamed from: a */
    private static final void m55914a(ImageView imageView, C16361b c16361b) {
        imageView.setScaleType(c16361b.m61720b());
        imageView.setImageResource(c16361b.m61719a());
    }

    /* renamed from: a */
    private static final void m55915a(LottieAnimationView lottieAnimationView, C16360a c16360a) {
        lottieAnimationView.b(true);
        lottieAnimationView.setScale(c16360a.m61718b());
        lottieAnimationView.setAnimation(c16360a.m61717a());
        lottieAnimationView.c();
    }
}
