package com.tinder.recs.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.gamepad.view.GamepadButton;
import com.tinder.views.SuperlikeCounterView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\n\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\b\u001a\u00020\u0002X.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/recs/view/SuperLikeButton;", "Lcom/tinder/gamepad/view/GamepadButton;", "Lcom/tinder/views/SuperlikeCounterView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "contentView", "counterView", "Landroid/view/View;", "createContent", "createCounterChangeAnimator", "Landroid/animation/Animator;", "currentCount", "", "nextCount", "iconView", "setAlpha", "", "alpha", "", "setCounterText", "count", "", "setEnabled", "enabled", "", "setRotationY", "translationY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeButton extends GamepadButton<SuperlikeCounterView> {
    private HashMap _$_findViewCache;
    private SuperlikeCounterView contentView;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public SuperLikeButton(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public void setAlpha(float f) {
        ((SuperlikeCounterView) getContent()).setAlpha(f);
    }

    public void setRotationY(float f) {
        super.setRotationY(f);
        ((SuperlikeCounterView) getContent()).setRotationY(f);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ((SuperlikeCounterView) getContent()).setEnabled(z);
    }

    @NotNull
    public SuperlikeCounterView createContent(@NotNull AttributeSet attributeSet) {
        C2668g.b(attributeSet, "attrs");
        Context context = getContext();
        C2668g.a(context, "context");
        this.contentView = new SuperlikeCounterView(context, R.drawable.superlike_gradient, R.drawable.superlike_gradient_disabled);
        attributeSet = this.contentView;
        if (attributeSet == null) {
            C2668g.b("contentView");
        }
        attributeSet.setAlpha(0.0f);
        attributeSet = this.contentView;
        if (attributeSet == null) {
            C2668g.b("contentView");
        }
        return attributeSet;
    }

    @Nullable
    protected View iconView() {
        SuperlikeCounterView superlikeCounterView = this.contentView;
        if (superlikeCounterView == null) {
            C2668g.b("contentView");
        }
        return superlikeCounterView.m57934b();
    }

    @Nullable
    protected View counterView() {
        SuperlikeCounterView superlikeCounterView = this.contentView;
        if (superlikeCounterView == null) {
            C2668g.b("contentView");
        }
        return superlikeCounterView.m57933a();
    }

    protected void setCounterText(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        SuperlikeCounterView superlikeCounterView = this.contentView;
        if (superlikeCounterView == null) {
            C2668g.b("contentView");
        }
        superlikeCounterView.setCounterText$Tinder_release(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    public final android.animation.Animator createCounterChangeAnimator(int r9, int r10) {
        /*
        r8 = this;
        r0 = r8.getContext();
        r1 = "context";
        kotlin.jvm.internal.C2668g.a(r0, r1);
        r0 = r0.getResources();
        r1 = "context.resources";
        kotlin.jvm.internal.C2668g.a(r0, r1);
        r0 = r0.getDisplayMetrics();
        r0 = r0.heightPixels;
        r0 = (float) r0;
        r1 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r0 = r0 / r1;
        r0 = -r0;
        r1 = new android.support.v4.view.a.b;
        r1.<init>();
        r2 = r8.getContent();
        r2 = (com.tinder.views.SuperlikeCounterView) r2;
        r2.setCount(r9);
        r9 = new android.animation.AnimatorSet;
        r9.<init>();
        r2 = 2;
        r3 = new int[r2];
        r3 = {0, 1};
        r3 = android.animation.ValueAnimator.ofInt(r3);
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r3.setDuration(r4);
        r4 = r1;
        r4 = (android.animation.TimeInterpolator) r4;
        r3.setInterpolator(r4);
        r5 = new com.tinder.recs.view.SuperLikeButton$createCounterChangeAnimator$$inlined$apply$lambda$1;
        r5.<init>(r8, r1, r0);
        r5 = (android.animation.ValueAnimator.AnimatorUpdateListener) r5;
        r3.addUpdateListener(r5);
        r5 = new int[r2];
        r5 = {0, 1};
        r5 = android.animation.ValueAnimator.ofInt(r5);
        r6 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r5.setDuration(r6);
        r5.setInterpolator(r4);
        r6 = new com.tinder.recs.view.SuperLikeButton$createCounterChangeAnimator$$inlined$apply$lambda$2;
        r7 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r6.<init>(r8, r1, r7, r10);
        r6 = (android.animation.ValueAnimator.AnimatorUpdateListener) r6;
        r5.addUpdateListener(r6);
        r10 = new int[r2];
        r10 = {0, 1};
        r10 = android.animation.ValueAnimator.ofInt(r10);
        r10.setInterpolator(r4);
        r6 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r10.setDuration(r6);
        r4 = new com.tinder.recs.view.SuperLikeButton$createCounterChangeAnimator$$inlined$apply$lambda$3;
        r4.<init>(r8, r1, r0);
        r4 = (android.animation.ValueAnimator.AnimatorUpdateListener) r4;
        r10.addUpdateListener(r4);
        r4 = new com.tinder.recs.view.SuperLikeButton$createCounterChangeAnimator$$inlined$apply$lambda$4;
        r4.<init>(r8, r1, r0);
        r4 = (android.animation.Animator.AnimatorListener) r4;
        r10.addListener(r4);
        r0 = 3;
        r0 = new android.animation.Animator[r0];
        r3 = (android.animation.Animator) r3;
        r1 = 0;
        r0[r1] = r3;
        r5 = (android.animation.Animator) r5;
        r1 = 1;
        r0[r1] = r5;
        r10 = (android.animation.Animator) r10;
        r0[r2] = r10;
        r9.playSequentially(r0);
        r9 = (android.animation.Animator) r9;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.view.SuperLikeButton.createCounterChangeAnimator(int, int):android.animation.Animator");
    }
}
