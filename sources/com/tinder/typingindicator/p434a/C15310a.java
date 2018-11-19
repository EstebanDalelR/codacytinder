package com.tinder.typingindicator.p434a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.annotation.ColorInt;
import com.tinder.typingindicator.renderer.TypingIndicatorRenderer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/typingindicator/animator/TypingIndicatorAnimator;", "", "typingIndicatorRenderer", "Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer;", "dotCount", "", "primaryColor", "secondaryColor", "(Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer;III)V", "animationIsInProgress", "", "animatorSet", "Landroid/animation/AnimatorSet;", "createAnimator", "Landroid/animation/ValueAnimator;", "dotIndex", "animationDuration", "", "createAnimators", "", "Landroid/animation/Animator;", "start", "", "stop", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.a.a */
public final class C15310a {
    /* renamed from: a */
    private final AnimatorSet f47515a = new AnimatorSet();
    /* renamed from: b */
    private boolean f47516b;
    /* renamed from: c */
    private final TypingIndicatorRenderer f47517c;
    /* renamed from: d */
    private final int f47518d;
    /* renamed from: e */
    private final int f47519e;
    /* renamed from: f */
    private final int f47520f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/typingindicator/animator/TypingIndicatorAnimator$2$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/typingindicator/animator/TypingIndicatorAnimator$2;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.a.a$a */
    public static final class C15307a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C15310a f47508a;

        C15307a(C15310a c15310a) {
            this.f47508a = c15310a;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            if (this.f47508a.f47516b != null) {
                this.f47508a.f47515a.start();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/typingindicator/animator/TypingIndicatorAnimator$createAnimator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.a.a$b */
    static final class C15308b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C15310a f47509a;
        /* renamed from: b */
        final /* synthetic */ long f47510b;
        /* renamed from: c */
        final /* synthetic */ int f47511c;

        C15308b(C15310a c15310a, long j, int i) {
            this.f47509a = c15310a;
            this.f47510b = j;
            this.f47511c = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animation");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            this.f47509a.f47517c.m57514a(((Integer) valueAnimator).intValue(), this.f47511c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/typingindicator/animator/TypingIndicatorAnimator$createAnimator$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/typingindicator/animator/TypingIndicatorAnimator$createAnimator$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.a.a$c */
    public static final class C15309c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C15310a f47512a;
        /* renamed from: b */
        final /* synthetic */ long f47513b;
        /* renamed from: c */
        final /* synthetic */ int f47514c;

        C15309c(C15310a c15310a, long j, int i) {
            this.f47512a = c15310a;
            this.f47513b = j;
            this.f47514c = i;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f47512a.f47517c.m57513a(this.f47514c);
        }
    }

    public C15310a(@NotNull TypingIndicatorRenderer typingIndicatorRenderer, int i, @ColorInt int i2, @ColorInt int i3) {
        C2668g.b(typingIndicatorRenderer, "typingIndicatorRenderer");
        this.f47517c = typingIndicatorRenderer;
        this.f47518d = i;
        this.f47519e = i2;
        this.f47520f = i3;
        if ((this.f47518d > null ? true : null) == null) {
            typingIndicatorRenderer = new StringBuilder();
            typingIndicatorRenderer.append("Dot count ");
            typingIndicatorRenderer.append(this.f47518d);
            typingIndicatorRenderer.append(" must be greater than 0");
            throw ((Throwable) new IllegalArgumentException(typingIndicatorRenderer.toString().toString()));
        }
        typingIndicatorRenderer = this.f47515a;
        typingIndicatorRenderer.setInterpolator(C15311b.f47521a);
        typingIndicatorRenderer.playSequentially(m57482b());
        typingIndicatorRenderer.addListener((AnimatorListener) new C15307a(this));
    }

    /* renamed from: a */
    public final void m57485a() {
        if (!this.f47516b) {
            this.f47516b = true;
            this.f47515a.start();
        }
    }

    /* renamed from: b */
    private final List<Animator> m57482b() {
        ArrayList arrayList = new ArrayList(this.f47518d);
        int i = this.f47518d;
        int i2 = 0;
        long j = 140;
        while (i2 < i) {
            arrayList.add(m57480a(i2, j));
            i2++;
            j += 140;
        }
        return arrayList;
    }

    /* renamed from: a */
    private final ValueAnimator m57480a(int i, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(this.f47520f), Integer.valueOf(this.f47519e)});
        ofObject.setDuration(j);
        ofObject.setInterpolator(C15311b.f47521a);
        ofObject.addUpdateListener(new C15308b(this, j, i));
        ofObject.addListener(new C15309c(this, j, i));
        C2668g.a(ofObject, "colorFilterAnimator.appl…\n            })\n        }");
        return ofObject;
    }
}
