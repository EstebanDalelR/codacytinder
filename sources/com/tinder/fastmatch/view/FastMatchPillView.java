package com.tinder.fastmatch.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.tinder.fastmatch.target.FastMatchPillTarget;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0014J\b\u0010 \u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0002R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00180\u0018X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006("}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchPillView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/fastmatch/target/FastMatchPillTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "likeCountText", "Landroid/widget/TextView;", "getLikeCountText$Tinder_release", "()Landroid/widget/TextView;", "setLikeCountText$Tinder_release", "(Landroid/widget/TextView;)V", "pillExpandAnimation", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "scaleDownAnimation", "Landroid/animation/ValueAnimator;", "shadowPillCount", "getShadowPillCount$Tinder_release", "setShadowPillCount$Tinder_release", "animateLikeCountText", "", "dismiss", "onDetachedFromWindow", "popUp", "scaleLikeCountText", "value", "", "updateCount", "countString", "", "updateShadowText", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchPillView extends FrameLayout implements FastMatchPillTarget {
    /* renamed from: a */
    private final Animation f38119a;
    /* renamed from: b */
    private final ValueAnimator f38120b;
    /* renamed from: c */
    private int f38121c;
    @NotNull
    @BindView(2131362478)
    public TextView likeCountText;
    @NotNull
    @BindView(2131363556)
    public TextView shadowPillCount;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/fastmatch/view/FastMatchPillView$scaleDownAnimation$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchPillView$a */
    static final class C9406a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchPillView f31533a;

        C9406a(FastMatchPillView fastMatchPillView) {
            this.f31533a = fastMatchPillView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FastMatchPillView fastMatchPillView = this.f31533a;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            fastMatchPillView.m47455a((float) ((Float) valueAnimator).floatValue());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FastMatchPillView(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.Nullable android.util.AttributeSet r4) {
        /*
        r2 = this;
        r0 = "context";
        kotlin.jvm.internal.C2668g.b(r3, r0);
        r2.<init>(r3, r4);
        r4 = 2130772004; // 0x7f010024 float:1.7147114E38 double:1.0527412463E-314;
        r4 = android.view.animation.AnimationUtils.loadAnimation(r3, r4);
        r2.f38119a = r4;
        r4 = 2;
        r4 = new float[r4];
        r4 = {1067030938, 1065353216};
        r4 = android.animation.ValueAnimator.ofFloat(r4);
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2.setPivotX(r0);
        r2.setPivotY(r0);
        r0 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r4.setDuration(r0);
        r0 = new com.tinder.fastmatch.view.FastMatchPillView$a;
        r0.<init>(r2);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r4.addUpdateListener(r0);
        r2.f38120b = r4;
        r4 = r2;
        r4 = (android.view.ViewGroup) r4;
        r0 = 2131493397; // 0x7f0c0215 float:1.8610273E38 double:1.053097662E-314;
        android.widget.FrameLayout.inflate(r3, r0, r4);
        r4 = r2;
        r4 = (android.view.View) r4;
        butterknife.ButterKnife.a(r4);
        r2.dismiss();
        r4 = new android.view.ViewGroup$LayoutParams;
        r0 = -2;
        r4.<init>(r0, r0);
        r2.setLayoutParams(r4);
        r4 = 2131231942; // 0x7f0804c6 float:1.807998E38 double:1.052968486E-314;
        r3 = android.support.v4.content.C0432b.a(r3, r4);
        r2.setBackground(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.fastmatch.view.FastMatchPillView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NotNull
    public final TextView getLikeCountText$Tinder_release() {
        TextView textView = this.likeCountText;
        if (textView == null) {
            C2668g.b("likeCountText");
        }
        return textView;
    }

    public final void setLikeCountText$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.likeCountText = textView;
    }

    @NotNull
    public final TextView getShadowPillCount$Tinder_release() {
        TextView textView = this.shadowPillCount;
        if (textView == null) {
            C2668g.b("shadowPillCount");
        }
        return textView;
    }

    public final void setShadowPillCount$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.shadowPillCount = textView;
    }

    public final int getCount() {
        return this.f38121c;
    }

    public final void setCount(int i) {
        this.f38121c = i;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38119a.cancel();
        this.f38120b.cancel();
    }

    public void popUp() {
        if (getAlpha() == 0.0f) {
            setVisibility(0);
            setAlpha(1.0f);
            startAnimation(this.f38119a);
        }
    }

    public void dismiss() {
        setAlpha(0.0f);
        setVisibility(8);
    }

    public void updateCount(@NotNull String str) {
        C2668g.b(str, "countString");
        TextView textView = this.likeCountText;
        if (textView == null) {
            C2668g.b("likeCountText");
        }
        textView.setText(str);
        m47457a(str);
        m47454a();
    }

    /* renamed from: a */
    private final void m47457a(String str) {
        TextView textView = this.shadowPillCount;
        if (textView == null) {
            C2668g.b("shadowPillCount");
        }
        CharSequence text = textView.getText();
        TextView textView2 = this.shadowPillCount;
        if (textView2 == null) {
            C2668g.b("shadowPillCount");
        }
        textView2.measure(0, 0);
        textView2 = this.shadowPillCount;
        if (textView2 == null) {
            C2668g.b("shadowPillCount");
        }
        int measuredWidth = textView2.getMeasuredWidth();
        TextView textView3 = this.shadowPillCount;
        if (textView3 == null) {
            C2668g.b("shadowPillCount");
        }
        CharSequence charSequence = str;
        textView3.setText(charSequence);
        textView3 = this.shadowPillCount;
        if (textView3 == null) {
            C2668g.b("shadowPillCount");
        }
        textView3.measure(0, 0);
        TextView textView4 = this.shadowPillCount;
        if (textView4 == null) {
            C2668g.b("shadowPillCount");
        }
        if (textView4.getMeasuredWidth() <= measuredWidth) {
            str = this.shadowPillCount;
            if (str == null) {
                C2668g.b("shadowPillCount");
            }
            str.setText(text);
            return;
        }
        textView = this.shadowPillCount;
        if (textView == null) {
            C2668g.b("shadowPillCount");
        }
        textView.setText(charSequence);
    }

    /* renamed from: a */
    private final void m47454a() {
        this.f38120b.cancel();
        m47455a(1.2f);
        this.f38120b.start();
    }

    /* renamed from: a */
    private final void m47455a(float f) {
        TextView textView = this.likeCountText;
        if (textView == null) {
            C2668g.b("likeCountText");
        }
        textView.setScaleX(f);
        textView = this.likeCountText;
        if (textView == null) {
            C2668g.b("likeCountText");
        }
        textView.setScaleY(f);
    }
}
