package com.tinder.profile.view.tappy;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.gamepad.view.animation.C9661a;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.presenter.bn;
import com.tinder.profile.target.ProfileGamepadTarget;
import com.tinder.recs.view.BoostButton;
import com.tinder.recs.view.IconGamepadButton;
import com.tinder.recs.view.LikeButton;
import com.tinder.recs.view.SuperLikeButton;
import com.tinder.recs.view.extension.LikeButtonExtKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u000bH\u0002J\b\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020#H\u0014J\b\u0010)\u001a\u00020#H\u0014J\b\u0010*\u001a\u00020#H\u0014J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010/\u001a\u00020#2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020#2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u00106\u001a\u00020#2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020-H\u0016J\u0010\u00109\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010:\u001a\u00020#2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u0010;\u001a\u00020#H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/tinder/profile/view/tappy/TappyProfileGamePadView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/profile/target/ProfileGamepadTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boostButton", "Lcom/tinder/recs/view/BoostButton;", "enterAnimatorSet", "Landroid/animation/AnimatorSet;", "exitAnimatorSet", "likeButton", "Lcom/tinder/recs/view/LikeButton;", "passButton", "Lcom/tinder/recs/view/IconGamepadButton;", "presenter", "Lcom/tinder/profile/presenter/TappyProfileGamePadPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/profile/presenter/TappyProfileGamePadPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/profile/presenter/TappyProfileGamePadPresenter;)V", "rewindButton", "superlikeButton", "Lcom/tinder/recs/view/SuperLikeButton;", "createAnimatorForScale", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "scaleTo", "", "createEntranceAnimationSet", "createExitAnimationSet", "enterWithAnimation", "", "enterWithoutAnimation", "exitWithAnimation", "exitWithoutAnimation", "hide", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "setEnabled", "enabled", "", "setLikeButtonEnabled", "setLikeClickListener", "clickListener", "Landroid/view/View$OnClickListener;", "setLikePercentRemaining", "likePercentRemaining", "", "setPassButtonEnabled", "setPassClickListener", "setSuperLikeButtonVisible", "visible", "setSuperlikeButtonEnabled", "setSuperlikeClickListener", "show", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyProfileGamePadView extends LinearLayout implements ProfileGamepadTarget {
    /* renamed from: b */
    public static final C14456a f50348b = new C14456a();
    @Inject
    @NotNull
    /* renamed from: a */
    public bn f50349a;
    /* renamed from: c */
    private final IconGamepadButton f50350c;
    /* renamed from: d */
    private final BoostButton f50351d;
    /* renamed from: e */
    private final LikeButton f50352e;
    /* renamed from: f */
    private final IconGamepadButton f50353f;
    /* renamed from: g */
    private final SuperLikeButton f50354g;
    /* renamed from: h */
    private AnimatorSet f50355h;
    /* renamed from: i */
    private AnimatorSet f50356i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\u000e*\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/profile/view/tappy/TappyProfileGamePadView$Companion;", "", "()V", "ENTER_ANIMATION_DURATION", "", "GROW_DURATION", "INITIAL_BTN_SCALE", "", "SCALE_0", "SCALE_1", "SHRINK_DURATION", "SHRINK_DURATION_WHEN_DISABLED", "SHRUNK_BTN_SCALE", "cancelIfRunning", "", "Landroid/animation/AnimatorSet;", "disableTouchAndClick", "Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.tappy.TappyProfileGamePadView$a */
    public static final class C14456a {
        private C14456a() {
        }

        /* renamed from: a */
        private final void m55183a(@NotNull AnimatorSet animatorSet) {
            if (animatorSet.isRunning()) {
                animatorSet.cancel();
            }
        }

        /* renamed from: a */
        private final void m55184a(@NotNull View view) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
        }
    }

    public TappyProfileGamePadView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ((ProfileComponentProvider) context).provideComponent().inject(this);
        setGravity(17);
        context = View.inflate(context, R.layout.profile_gamepad, this);
        attributeSet = context.findViewById(R.id.gamepad_rewind);
        C2668g.a(attributeSet, "view.findViewById(R.id.gamepad_rewind)");
        this.f50350c = (IconGamepadButton) attributeSet;
        attributeSet = context.findViewById(R.id.gamepad_boost);
        C2668g.a(attributeSet, "view.findViewById(R.id.gamepad_boost)");
        this.f50351d = (BoostButton) attributeSet;
        attributeSet = context.findViewById(R.id.gamepad_like);
        C2668g.a(attributeSet, "view.findViewById(R.id.gamepad_like)");
        this.f50352e = (LikeButton) attributeSet;
        attributeSet = context.findViewById(R.id.gamepad_pass);
        C2668g.a(attributeSet, "view.findViewById(R.id.gamepad_pass)");
        this.f50353f = (IconGamepadButton) attributeSet;
        context = context.findViewById(R.id.gamepad_superlike);
        C2668g.a(context, "view.findViewById(R.id.gamepad_superlike)");
        this.f50354g = (SuperLikeButton) context;
        this.f50351d.setVisibility(4);
        this.f50350c.setVisibility(4);
    }

    @NotNull
    public final bn getPresenter$Tinder_release() {
        bn bnVar = this.f50349a;
        if (bnVar == null) {
            C2668g.b("presenter");
        }
        return bnVar;
    }

    public final void setPresenter$Tinder_release(@NotNull bn bnVar) {
        C2668g.b(bnVar, "<set-?>");
        this.f50349a = bnVar;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setEnabled(false);
        this.f50355h = m61089a();
        this.f50356i = m61090b();
        f50348b.m55184a((View) this.f50351d);
        f50348b.m55184a((View) this.f50350c);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bn bnVar = this.f50349a;
        if (bnVar == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, bnVar);
    }

    protected void onDetachedFromWindow() {
        C14456a c14456a = f50348b;
        AnimatorSet animatorSet = this.f50355h;
        if (animatorSet == null) {
            C2668g.b("enterAnimatorSet");
        }
        c14456a.m55183a(animatorSet);
        c14456a = f50348b;
        animatorSet = this.f50356i;
        if (animatorSet == null) {
            C2668g.b("exitAnimatorSet");
        }
        c14456a.m55183a(animatorSet);
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setLikePercentRemaining(int i) {
        LikeButtonExtKt.animateLikeMeter(this.f50352e, i);
    }

    public void setEnabled(boolean z) {
        if (z) {
            C9661a.a((View) this.f50352e, 1.0f, 0.75f, 200, 200);
            C9661a.a((View) this.f50354g, 1.0f, 0.75f, 200, 200);
            C9661a.a((View) this.f50353f, 1.0f, 0.75f, 200, 200);
            return;
        }
        C9661a.a((View) this.f50352e, 1.0f, 1.0f, 0, 0);
        C9661a.a((View) this.f50354g, 1.0f, 1.0f, 0, 0);
        C9661a.a((View) this.f50353f, 1.0f, 1.0f, 0, 0);
    }

    public void enterWithAnimation() {
        AnimatorSet animatorSet = this.f50355h;
        if (animatorSet == null) {
            C2668g.b("enterAnimatorSet");
        }
        if (!animatorSet.isRunning()) {
            animatorSet = this.f50355h;
            if (animatorSet == null) {
                C2668g.b("enterAnimatorSet");
            }
            animatorSet.start();
        }
    }

    public void exitWithAnimation() {
        AnimatorSet animatorSet = this.f50356i;
        if (animatorSet == null) {
            C2668g.b("exitAnimatorSet");
        }
        if (!animatorSet.isRunning()) {
            animatorSet = this.f50356i;
            if (animatorSet == null) {
                C2668g.b("exitAnimatorSet");
            }
            animatorSet.start();
        }
    }

    public void enterWithoutAnimation() {
        setVisibility(0);
        this.f50350c.setVisibility(8);
        this.f50351d.setVisibility(8);
    }

    public void exitWithoutAnimation() {
        setVisibility(4);
        this.f50350c.setVisibility(0);
        this.f50351d.setVisibility(0);
    }

    public void setLikeButtonEnabled(boolean z) {
        this.f50352e.setEnabled(z);
    }

    public void setSuperlikeButtonEnabled(boolean z) {
        this.f50354g.setEnabled(z);
    }

    public void setPassButtonEnabled(boolean z) {
        this.f50353f.setEnabled(z);
    }

    public void setSuperlikeClickListener(@Nullable OnClickListener onClickListener) {
        this.f50354g.setOnClickListener(onClickListener);
    }

    public void setLikeClickListener(@Nullable OnClickListener onClickListener) {
        this.f50352e.setOnClickListener(onClickListener);
    }

    public void setPassClickListener(@Nullable OnClickListener onClickListener) {
        this.f50353f.setOnClickListener(onClickListener);
    }

    public void hide() {
        setVisibility(8);
    }

    public void show() {
        setVisibility(0);
    }

    public void setSuperLikeButtonVisible(boolean z) {
        this.f50354g.setVisibility(z ? false : true);
    }

    /* renamed from: a */
    private final AnimatorSet m61089a() {
        Animator a = m61088a(this.f50350c, 0.0f);
        Animator a2 = m61088a(this.f50351d, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150);
        animatorSet.playTogether(new Animator[]{a, a2});
        return animatorSet;
    }

    /* renamed from: b */
    private final AnimatorSet m61090b() {
        Animator a = m61088a(this.f50350c, 1.0f);
        Animator a2 = m61088a(this.f50351d, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150);
        animatorSet.playTogether(new Animator[]{a, a2});
        return animatorSet;
    }

    /* renamed from: a */
    private final Animator m61088a(View view, float f) {
        r0 = new PropertyValuesHolder[2];
        r0[0] = PropertyValuesHolder.ofFloat("scaleX", new float[]{f});
        r0[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{f});
        view = ObjectAnimator.ofPropertyValuesHolder(view, r0);
        C2668g.a(view, "ObjectAnimator.ofPropert…Float(\"scaleY\", scaleTo))");
        return (Animator) view;
    }
}
