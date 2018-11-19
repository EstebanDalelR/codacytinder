package com.tinder.discovery.badge.p233a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/discovery/badge/animation/ShowBadgeAnimator;", "", "animator", "Landroid/animation/ValueAnimator;", "(Landroid/animation/ValueAnimator;)V", "end", "", "start", "badgeIconRenderer", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer;", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.badge.a.a */
public final class C8887a {
    /* renamed from: a */
    private final ValueAnimator f31093a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.badge.a.a$a */
    static final class C8885a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ BadgeIconRenderer f31090a;

        C8885a(BadgeIconRenderer badgeIconRenderer) {
            this.f31090a = badgeIconRenderer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animation");
            this.f31090a.m37686a(valueAnimator.getAnimatedFraction());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/discovery/badge/animation/ShowBadgeAnimator$start$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/badge/animation/ShowBadgeAnimator;Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.badge.a.a$b */
    public static final class C8886b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C8887a f31091a;
        /* renamed from: b */
        final /* synthetic */ BadgeIconRenderer f31092b;

        C8886b(C8887a c8887a, BadgeIconRenderer badgeIconRenderer) {
            this.f31091a = c8887a;
            this.f31092b = badgeIconRenderer;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            this.f31091a.f31093a.removeListener(this);
            this.f31092b.m37691b();
        }
    }

    public C8887a() {
        this(null, 1, null);
    }

    public C8887a(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "animator");
        this.f31093a = valueAnimator;
    }

    public /* synthetic */ C8887a(ValueAnimator valueAnimator, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            valueAnimator = new ValueAnimator();
        }
        this(valueAnimator);
    }

    /* renamed from: a */
    public final void m37670a(@NotNull BadgeIconRenderer badgeIconRenderer) {
        C2668g.b(badgeIconRenderer, "badgeIconRenderer");
        C8299a.m35391a(this.f31093a);
        this.f31093a.setFloatValues(new float[]{0.0f, 1.0f});
        this.f31093a.setStartDelay(150);
        badgeIconRenderer.m37685a();
        this.f31093a.addUpdateListener(new C8885a(badgeIconRenderer));
        this.f31093a.addListener(new C8886b(this, badgeIconRenderer));
        this.f31093a.start();
    }

    /* renamed from: a */
    public final void m37669a() {
        if (this.f31093a.isRunning()) {
            C8299a.m35391a(this.f31093a);
        }
    }
}
