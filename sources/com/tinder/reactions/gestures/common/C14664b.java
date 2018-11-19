package com.tinder.reactions.gestures.common;

import android.os.Handler;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/reactions/gestures/common/GrandGestureAnimationPulser;", "", "lottieAnimationView", "Lcom/airbnb/lottie/LottieAnimationView;", "minPulseProgress", "", "maxPulseProgress", "pulseIntervalMs", "", "pulseProgressIncrement", "(Lcom/airbnb/lottie/LottieAnimationView;FFJF)V", "animationPulseHandler", "Landroid/os/Handler;", "animationPulseRunnable", "Ljava/lang/Runnable;", "isAnimationReversing", "", "clearAnimationPulse", "", "pulseAnimation", "setupAnimationPulseRunnable", "startPulsing", "stopPulsing", "updateAnimationReversalState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.common.b */
public final class C14664b {
    /* renamed from: a */
    private boolean f46231a;
    /* renamed from: b */
    private final Handler f46232b;
    /* renamed from: c */
    private Runnable f46233c;
    /* renamed from: d */
    private final LottieAnimationView f46234d;
    /* renamed from: e */
    private final float f46235e;
    /* renamed from: f */
    private final float f46236f;
    /* renamed from: g */
    private final long f46237g;
    /* renamed from: h */
    private final float f46238h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.common.b$a */
    static final class C14663a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C14664b f46230a;

        C14663a(C14664b c14664b) {
            this.f46230a = c14664b;
        }

        public final void run() {
            this.f46230a.m55900e();
            this.f46230a.f46232b.postDelayed(C14664b.m55896c(this.f46230a), this.f46230a.f46237g);
        }
    }

    public C14664b(@NotNull LottieAnimationView lottieAnimationView, float f, float f2, long j, float f3) {
        C2668g.b(lottieAnimationView, "lottieAnimationView");
        this.f46234d = lottieAnimationView;
        this.f46235e = f;
        this.f46236f = f2;
        this.f46237g = j;
        this.f46238h = f3;
        this.f46232b = new Handler();
        if ((this.f46235e < this.f46236f ? true : null) == null) {
            throw ((Throwable) new IllegalArgumentException("Min pulse progress can't be greater than or equal to max pulse progress"));
        }
        m55899d();
    }

    @NotNull
    /* renamed from: c */
    public static final /* synthetic */ Runnable m55896c(C14664b c14664b) {
        c14664b = c14664b.f46233c;
        if (c14664b == null) {
            C2668g.b("animationPulseRunnable");
        }
        return c14664b;
    }

    public /* synthetic */ C14664b(LottieAnimationView lottieAnimationView, float f, float f2, long j, float f3, int i, C15823e c15823e) {
        if ((i & 8) != null) {
            j = 50;
        }
        this(lottieAnimationView, f, f2, j, (i & 16) != null ? 0.002f : f3);
    }

    /* renamed from: a */
    public final void m55902a() {
        m55901f();
        m55897c();
        Handler handler = this.f46232b;
        Runnable runnable = this.f46233c;
        if (runnable == null) {
            C2668g.b("animationPulseRunnable");
        }
        handler.post(runnable);
    }

    /* renamed from: b */
    public final void m55903b() {
        m55897c();
    }

    /* renamed from: c */
    private final void m55897c() {
        Handler handler = this.f46232b;
        Runnable runnable = this.f46233c;
        if (runnable == null) {
            C2668g.b("animationPulseRunnable");
        }
        handler.removeCallbacks(runnable);
    }

    /* renamed from: d */
    private final void m55899d() {
        this.f46233c = new C14663a(this);
    }

    /* renamed from: e */
    private final void m55900e() {
        LottieAnimationView lottieAnimationView;
        if (this.f46231a) {
            lottieAnimationView = this.f46234d;
            lottieAnimationView.setProgress(lottieAnimationView.getProgress() - this.f46238h);
        } else {
            lottieAnimationView = this.f46234d;
            lottieAnimationView.setProgress(lottieAnimationView.getProgress() + this.f46238h);
        }
        m55901f();
    }

    /* renamed from: f */
    private final void m55901f() {
        if (this.f46234d.getProgress() <= this.f46235e) {
            this.f46231a = false;
        } else if (this.f46234d.getProgress() >= this.f46236f) {
            this.f46231a = true;
        }
    }
}
