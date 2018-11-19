package com.tinder.superlikeable.animation;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.superlikeable.animation.C15111c.C15104a;
import com.tinder.superlikeable.animation.C15111c.C15105b;
import com.tinder.superlikeable.animation.C15111c.C15106c;
import com.tinder.superlikeable.animation.C15111c.C15107d;
import com.tinder.superlikeable.animation.C15111c.C15108e;
import com.tinder.superlikeable.view.SuperLikeableGridView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JX\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0002JV\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006JW\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020(2\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0002\u00105J<\u00106\u001a\u0002072\u0006\u00108\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u001fH\u0002J,\u0010;\u001a\u00020<2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimationParamFactory;", "", "()V", "CARDS_APPEARANCE_ANIMATION_DURATION_MS", "", "CARDS_APPEARANCE_END_SCALE", "", "CARDS_APPEARANCE_SCALE_ANIMATION_OVERSHOOT_TENSION", "CARDS_APPEARANCE_START_SCALE", "CHILD_CARDS_APPEARANCE_DELAY_MS", "DELAY_BETWEEN_EACH_CHILD_CARD_APPEARANCE_MS", "MOVE_LOGO_UP_ANIMATION_DURATION_MS", "MOVE_LOGO_UP_LOGO_END_SCALE", "MOVE_LOGO_UP_LOGO_END_TRANSLATION_PX", "MOVE_LOGO_UP_OVERSHOOT_INTERPOLATOR_TENSION", "SCALE_BACKGROUND_TO_FULL_SCREEN_DURATION_MS", "SCALE_BACKGROUND_TO_FULL_SCREEN_EXTRA_SCALE", "TEXT_APPEARANCE_ANIMATION_DURATION_MS", "TEXT_APPEARANCE_ANIMATION_START_DELAY_MS", "createAnimationParamForMoveLogoUp", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$MoveLogoUpParams;", "logoView", "Lcom/airbnb/lottie/LottieAnimationView;", "topStarsAnimationView", "bottomStarsAnimationView", "logoStartTranslationY", "logoStartScale", "logoEndTranslationY", "logoEndScale", "duration", "interpolator", "Landroid/animation/TimeInterpolator;", "createAnimationParams", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$AnimationParams;", "backgroundScalingView", "Landroid/view/View;", "topTextView", "Landroid/widget/TextView;", "bottomTextView", "superlikeableGridFrameLayout", "Lcom/tinder/superlikeable/view/SuperLikeableGridView;", "screenWidth", "screenHeight", "createAnimationParamsChildCards", "", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;", "cardsViewContainer", "cardsStartScale", "cardsEndScale", "initialStartDelay", "animationDuration", "delayBetweenEachCardAppearance", "scaleOvershootTension", "(Lcom/tinder/superlikeable/view/SuperLikeableGridView;FFJJJF)[Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;", "createAnimationParamsForBackgroundScale", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ScaleBackgroundParams;", "backgroundView", "backgroundScaleAnimationDuration", "backgroundScaleInterpolator", "createParamsForTextAppearance", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$TextAppearanceParams;", "startDelay", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.b */
public final class C15103b {
    /* renamed from: a */
    public static final C15103b f46980a = new C15103b();

    private C15103b() {
    }

    @NotNull
    /* renamed from: a */
    public final C15104a m56888a(float f, @NotNull View view, @NotNull LottieAnimationView lottieAnimationView, @NotNull TextView textView, @NotNull TextView textView2, @NotNull LottieAnimationView lottieAnimationView2, @NotNull LottieAnimationView lottieAnimationView3, @NotNull SuperLikeableGridView superLikeableGridView, float f2, float f3) {
        SuperLikeableGridView superLikeableGridView2 = superLikeableGridView;
        View view2 = view;
        C2668g.b(view2, "backgroundScalingView");
        LottieAnimationView lottieAnimationView4 = lottieAnimationView;
        C2668g.b(lottieAnimationView4, "logoView");
        TextView textView3 = textView;
        C2668g.b(textView3, "topTextView");
        C2668g.b(textView2, "bottomTextView");
        C2668g.b(lottieAnimationView2, "topStarsAnimationView");
        C2668g.b(lottieAnimationView3, "bottomStarsAnimationView");
        C2668g.b(superLikeableGridView2, "superlikeableGridFrameLayout");
        C15107d a = C15103b.m56883a(this, view2, lottieAnimationView4, f2, f3, 0, null, 48, null);
        return new C15104a(superLikeableGridView2, a, C15103b.m56881a(this, lottieAnimationView4, lottieAnimationView2, lottieAnimationView3, f, a.m56917i(), 0.0f, 0.0f, 0, null, 480, null), C15103b.m56885a(this, textView3, textView2, 0, 0, 12, null), C15103b.m56886a(this, superLikeableGridView2, 0.0f, 0.0f, 0, 0, 0, 0.0f, 126, null));
    }

    /* renamed from: a */
    static /* synthetic */ C15108e m56885a(C15103b c15103b, TextView textView, TextView textView2, long j, long j2, int i, Object obj) {
        if ((i & 4) != null) {
            j = 180;
        }
        long j3 = j;
        if ((i & 8) != null) {
            j2 = 1200;
        }
        return c15103b.m56884a(textView, textView2, j3, j2);
    }

    /* renamed from: a */
    private final C15108e m56884a(TextView textView, TextView textView2, long j, long j2) {
        return new C15108e(textView, textView2, j, j2);
    }

    /* renamed from: a */
    static /* synthetic */ C15107d m56883a(C15103b c15103b, View view, LottieAnimationView lottieAnimationView, float f, float f2, long j, TimeInterpolator timeInterpolator, int i, Object obj) {
        return c15103b.m56882a(view, lottieAnimationView, f, f2, (i & 16) != 0 ? 400 : j, (i & 32) != 0 ? new AccelerateDecelerateInterpolator() : timeInterpolator);
    }

    /* renamed from: a */
    private final C15107d m56882a(View view, LottieAnimationView lottieAnimationView, float f, float f2, long j, TimeInterpolator timeInterpolator) {
        float width = (float) view.getWidth();
        float scaleX = (((f - width) / width) + view.getScaleX()) + 0.1f;
        return new C15107d(view, view.getScaleX(), view.getScaleY(), scaleX, (((f2 - ((float) view.getHeight())) / ((float) view.getHeight())) + view.getScaleY()) + 0.1f, j, timeInterpolator, lottieAnimationView.getScaleX(), scaleX, lottieAnimationView);
    }

    /* renamed from: a */
    static /* synthetic */ C15106c m56881a(C15103b c15103b, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, LottieAnimationView lottieAnimationView3, float f, float f2, float f3, float f4, long j, TimeInterpolator timeInterpolator, int i, Object obj) {
        int i2 = i;
        return c15103b.m56880a(lottieAnimationView, lottieAnimationView2, lottieAnimationView3, f, f2, (i2 & 32) != 0 ? 0.0f : f3, (i2 & 64) != 0 ? 1.0f : f4, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? 400 : j, (i2 & 256) != 0 ? new OvershootInterpolator(1.6f) : timeInterpolator);
    }

    /* renamed from: a */
    private final C15106c m56880a(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, LottieAnimationView lottieAnimationView3, float f, float f2, float f3, float f4, long j, TimeInterpolator timeInterpolator) {
        return new C15106c(j, timeInterpolator, f2, f4, f, f3, lottieAnimationView, lottieAnimationView2, lottieAnimationView3);
    }

    /* renamed from: a */
    static /* synthetic */ C15105b[] m56886a(C15103b c15103b, SuperLikeableGridView superLikeableGridView, float f, float f2, long j, long j2, long j3, float f3, int i, Object obj) {
        return c15103b.m56887a(superLikeableGridView, (i & 2) != 0 ? 0.85f : f, (i & 4) != 0 ? 1.0f : f2, (i & 8) != 0 ? 320 : j, (i & 16) != 0 ? 1400 : j2, (i & 32) != 0 ? 100 : j3, (i & 64) != 0 ? 4.0f : f3);
    }

    /* renamed from: a */
    private final C15105b[] m56887a(SuperLikeableGridView superLikeableGridView, float f, float f2, long j, long j2, long j3, float f3) {
        int childCount = superLikeableGridView.getChildCount();
        C15105b[] c15105bArr = new C15105b[childCount];
        int length = c15105bArr.length;
        for (int i = 0; i < length; i++) {
            long j4 = (((long) i) * j3) + j;
            OvershootInterpolator overshootInterpolator = new OvershootInterpolator(f3);
            View childAt = superLikeableGridView.getChildAt((childCount - i) - 1);
            C2668g.a(childAt, "cardsViewContainer.getCh…t(childCount - index - 1)");
            c15105bArr[i] = new C15105b(j4, j2, overshootInterpolator, f, f2, childAt);
        }
        return c15105bArr;
    }
}
