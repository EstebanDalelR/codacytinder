package com.tinder.bitmoji.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.tinder.bitmoji.C8328l.C8324a;
import com.tinder.bitmoji.C8328l.C8325b;
import com.tinder.bitmoji.C8328l.C8326c;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fR\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0010\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR\u001b\u0010\u0013\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\nR\u001b\u0010\u0016\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0017\u0010\n¨\u0006\""}, d2 = {"Lcom/tinder/bitmoji/view/BitmojiIntroModalAnimationView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bottomLeftImage", "Landroid/widget/ImageView;", "getBottomLeftImage", "()Landroid/widget/ImageView;", "bottomLeftImage$delegate", "Lkotlin/Lazy;", "bottomRightImage", "getBottomRightImage", "bottomRightImage$delegate", "centerImage", "getCenterImage", "centerImage$delegate", "topLeftImage", "getTopLeftImage", "topLeftImage$delegate", "topRightImage", "getTopRightImage", "topRightImage$delegate", "animateIndividualPopIn", "Landroid/animation/AnimatorSet;", "view", "Landroid/view/View;", "animateIndividualPopOut", "animateViews", "", "showFemaleIcons", "showMaleIcons", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
public final class BitmojiIntroModalAnimationView extends ConstraintLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33888a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(BitmojiIntroModalAnimationView.class), "bottomLeftImage", "getBottomLeftImage()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(BitmojiIntroModalAnimationView.class), "topLeftImage", "getTopLeftImage()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(BitmojiIntroModalAnimationView.class), "topRightImage", "getTopRightImage()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(BitmojiIntroModalAnimationView.class), "bottomRightImage", "getBottomRightImage()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(BitmojiIntroModalAnimationView.class), "centerImage", "getCenterImage()Landroid/widget/ImageView;"))};
    /* renamed from: b */
    private final Lazy f33889b = C18451c.a(LazyThreadSafetyMode.NONE, new BitmojiIntroModalAnimationView$$special$$inlined$bindView$1(this, C8325b.intro_modal_bottom_left_image));
    /* renamed from: c */
    private final Lazy f33890c = C18451c.a(LazyThreadSafetyMode.NONE, new BitmojiIntroModalAnimationView$$special$$inlined$bindView$2(this, C8325b.intro_modal_top_left_image));
    /* renamed from: d */
    private final Lazy f33891d = C18451c.a(LazyThreadSafetyMode.NONE, new BitmojiIntroModalAnimationView$$special$$inlined$bindView$3(this, C8325b.intro_modal_top_right_image));
    /* renamed from: e */
    private final Lazy f33892e = C18451c.a(LazyThreadSafetyMode.NONE, new BitmojiIntroModalAnimationView$$special$$inlined$bindView$4(this, C8325b.intro_modal_bottom_right_image));
    /* renamed from: f */
    private final Lazy f33893f = C18451c.a(LazyThreadSafetyMode.NONE, new BitmojiIntroModalAnimationView$$special$$inlined$bindView$5(this, C8325b.intro_modal_center_image));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/bitmoji/view/BitmojiIntroModalAnimationView$animateViews$1", "Landroid/animation/AnimatorListenerAdapter;", "(Landroid/animation/AnimatorSet;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.view.BitmojiIntroModalAnimationView$a */
    public static final class C8333a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ AnimatorSet f29626a;

        C8333a(AnimatorSet animatorSet) {
            this.f29626a = animatorSet;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            this.f29626a.setStartDelay(250);
            this.f29626a.start();
        }
    }

    private final ImageView getBottomLeftImage() {
        Lazy lazy = this.f33889b;
        KProperty kProperty = f33888a[0];
        return (ImageView) lazy.getValue();
    }

    private final ImageView getBottomRightImage() {
        Lazy lazy = this.f33892e;
        KProperty kProperty = f33888a[3];
        return (ImageView) lazy.getValue();
    }

    private final ImageView getCenterImage() {
        Lazy lazy = this.f33893f;
        KProperty kProperty = f33888a[4];
        return (ImageView) lazy.getValue();
    }

    private final ImageView getTopLeftImage() {
        Lazy lazy = this.f33890c;
        KProperty kProperty = f33888a[1];
        return (ImageView) lazy.getValue();
    }

    private final ImageView getTopRightImage() {
        Lazy lazy = this.f33891d;
        KProperty kProperty = f33888a[2];
        return (ImageView) lazy.getValue();
    }

    public BitmojiIntroModalAnimationView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        View.inflate(context, C8326c.bitmoji_intro_modal_animation_view, this);
    }

    /* renamed from: a */
    public final void m42224a() {
        getBottomLeftImage().setBackground(C0432b.a(getContext(), C8324a.female_intro_1));
        getTopLeftImage().setBackground(C0432b.a(getContext(), C8324a.female_intro_2));
        getTopRightImage().setBackground(C0432b.a(getContext(), C8324a.female_intro_3));
        getBottomRightImage().setBackground(C0432b.a(getContext(), C8324a.female_intro_4));
        getCenterImage().setBackground(C0432b.a(getContext(), C8324a.f_texting));
    }

    /* renamed from: b */
    public final void m42225b() {
        getBottomLeftImage().setBackground(C0432b.a(getContext(), C8324a.male_intro_1));
        getTopLeftImage().setBackground(C0432b.a(getContext(), C8324a.male_intro_2));
        getTopRightImage().setBackground(C0432b.a(getContext(), C8324a.male_intro_3));
        getBottomRightImage().setBackground(C0432b.a(getContext(), C8324a.male_intro_4));
        getCenterImage().setBackground(C0432b.a(getContext(), C8324a.m_texting));
    }

    /* renamed from: c */
    public final void m42226c() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{m42222a(getBottomLeftImage()), m42222a(getTopLeftImage()), m42222a(getTopRightImage()), m42222a(getBottomRightImage())});
        animatorSet3.setStartDelay(DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
        animatorSet3.playTogether(new Animator[]{m42223b(getBottomLeftImage()), m42223b(getTopLeftImage()), m42223b(getTopRightImage()), m42223b(getBottomRightImage())});
        animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3});
        animatorSet.addListener(new C8333a(animatorSet));
        animatorSet.start();
    }

    /* renamed from: a */
    private final AnimatorSet m42222a(View view) {
        view.setVisibility(0);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet2.setInterpolator(new OvershootInterpolator(5.0f));
        animatorSet2.setDuration(100);
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 0.8f}), ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 0.8f})});
        animatorSet3.setInterpolator(new AccelerateInterpolator());
        animatorSet3.setDuration(90);
        animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.8f, 1.0f}), ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.8f, 1.0f})});
        animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3});
        return animatorSet;
    }

    /* renamed from: b */
    private final AnimatorSet m42223b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.setDuration(50);
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.7f}), ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.7f})});
        animatorSet3.setInterpolator(new OvershootInterpolator());
        animatorSet3.setDuration(50);
        animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.7f, 1.0f}), ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.7f, 1.0f})});
        animatorSet4.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet4.setDuration(80);
        animatorSet4.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.0f})});
        animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3, animatorSet4});
        return animatorSet;
    }
}
