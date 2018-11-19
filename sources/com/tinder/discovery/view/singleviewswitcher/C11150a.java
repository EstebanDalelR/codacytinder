package com.tinder.discovery.view.singleviewswitcher;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.C8908a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/discovery/view/singleviewswitcher/DefaultChildViewAnimator;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "animationDuration", "", "startDelay", "(JJ)V", "animator", "Landroid/animation/ValueAnimator;", "animate", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "fromAlpha", "", "toAlpha", "endAnimation", "", "startAppearingAnimation", "adapterPosition", "", "startDisappearingAnimation", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.view.singleviewswitcher.a */
public class C11150a extends C8908a {
    /* renamed from: a */
    private final ValueAnimator f36064a;
    /* renamed from: b */
    private final long f36065b;
    /* renamed from: c */
    private final long f36066c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/discovery/view/singleviewswitcher/DefaultChildViewAnimator$animate$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.singleviewswitcher.a$a */
    static final class C8909a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C11150a f31192a;
        /* renamed from: b */
        final /* synthetic */ float f31193b;
        /* renamed from: c */
        final /* synthetic */ float f31194c;
        /* renamed from: d */
        final /* synthetic */ View f31195d;

        C8909a(C11150a c11150a, float f, float f2, View view) {
            this.f31192a = c11150a;
            this.f31193b = f;
            this.f31194c = f2;
            this.f31195d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f31195d;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            view.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/discovery/view/singleviewswitcher/DefaultChildViewAnimator$animate$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/view/singleviewswitcher/DefaultChildViewAnimator$animate$1;Landroid/animation/ValueAnimator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.singleviewswitcher.a$b */
    public static final class C8910b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f31196a;
        /* renamed from: b */
        final /* synthetic */ C11150a f31197b;
        /* renamed from: c */
        final /* synthetic */ float f31198c;
        /* renamed from: d */
        final /* synthetic */ float f31199d;
        /* renamed from: e */
        final /* synthetic */ View f31200e;

        C8910b(ValueAnimator valueAnimator, C11150a c11150a, float f, float f2, View view) {
            this.f31196a = valueAnimator;
            this.f31197b = c11150a;
            this.f31198c = f;
            this.f31199d = f2;
            this.f31200e = view;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f31196a.removeListener(this);
            this.f31200e.setAlpha(this.f31199d);
            this.f31197b.m37712b(this.f31200e);
        }
    }

    public C11150a() {
        this(0, 0, 3, null);
    }

    public /* synthetic */ C11150a(long j, long j2, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            j = 300;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        this(j, j2);
    }

    public C11150a(long j, long j2) {
        this.f36065b = j;
        this.f36066c = j2;
        this.f36064a = new ValueAnimator();
    }

    /* renamed from: a */
    public void mo10009a(int i, @NotNull View view) {
        C2668g.b(view, "view");
        i = m43917a(view, 0, 1.0f);
        i.setStartDelay(this.f36066c);
        i.start();
    }

    /* renamed from: b */
    public void mo10010b(int i, @NotNull View view) {
        C2668g.b(view, "view");
        m43917a(view, 1065353216, 0.0f).start();
    }

    /* renamed from: a */
    public void mo10008a() {
        C8299a.m35391a(this.f36064a);
    }

    /* renamed from: a */
    private final Animator m43917a(View view, float f, float f2) {
        view.setAlpha(f);
        m37709a(view);
        ValueAnimator valueAnimator = this.f36064a;
        C8299a.m35391a(valueAnimator);
        valueAnimator.setDuration(this.f36065b);
        valueAnimator.setFloatValues(new float[]{f, f2});
        valueAnimator.addUpdateListener(new C8909a(this, f, f2, view));
        valueAnimator.addListener(new C8910b(valueAnimator, this, f, f2, view));
        return valueAnimator;
    }
}
