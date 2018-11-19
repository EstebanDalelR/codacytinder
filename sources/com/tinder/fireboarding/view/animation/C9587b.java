package com.tinder.fireboarding.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tinder.fireboarding.view.BackgroundScalingView;
import com.tinder.fireboarding.view.C9571a;
import com.tinder.fireboarding.view.animation.C9600e.C9596a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u0000 %2\u00020\u0001:\u0005%&'()B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010#\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory;", "", "()V", "animator", "Landroid/animation/ValueAnimator;", "backgroundBottomUpdateCalculator", "Lcom/tinder/fireboarding/view/animation/FractionUpdateCalculator;", "backgroundLeftUpdateCalculator", "backgroundRightUpdateCalculator", "backgroundTopUpdateCalculator", "iconScaleUpdateCalculator", "iconTranslationUpdateCalculator", "rayTranslationUpdateCalculator", "textScaleUpdateCalculator", "textTranslationUpdateCalculator", "create", "scaleUpParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$ScaleUpParams;", "iconTranslationParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$IconTranslationParams;", "iconScaleParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$IconScaleParams;", "textContainerParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$TextContainerParams;", "backgroundScalingView", "Lcom/tinder/fireboarding/view/BackgroundScalingView;", "iconView", "Landroid/view/View;", "textContainer", "initializeCalculators", "", "updateBackgroundScalingViewBounds", "fraction", "", "updateIconScale", "updateIconTranslation", "updateTextContainer", "Companion", "IconScaleParams", "IconTranslationParams", "ScaleUpParams", "TextContainerParams", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.b */
public final class C9587b {
    /* renamed from: a */
    public static final C9580a f32037a = new C9580a();
    /* renamed from: b */
    private final ValueAnimator f32038b = new ValueAnimator();
    /* renamed from: c */
    private C9604g f32039c;
    /* renamed from: d */
    private C9604g f32040d;
    /* renamed from: e */
    private C9604g f32041e;
    /* renamed from: f */
    private C9604g f32042f;
    /* renamed from: g */
    private C9604g f32043g;
    /* renamed from: h */
    private C9604g f32044h;
    /* renamed from: i */
    private C9604g f32045i;
    /* renamed from: j */
    private C9604g f32046j;
    /* renamed from: k */
    private C9604g f32047k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$Companion;", "", "()V", "END_TEXT_SCALE", "", "END_TRANSLATION", "crateScaleUpAnimationParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$ScaleUpParams;", "params", "Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$AnimationParams;", "createIconScaleParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$IconScaleParams;", "featureIconView", "Landroid/view/View;", "createIconTranslationParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$IconTranslationParams;", "createTextContainerParams", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$TextContainerParams;", "textContainer", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.b$a */
    public static final class C9580a {
        private C9580a() {
        }

        @NotNull
        /* renamed from: a */
        public final C9583d m39914a(@NotNull C9596a c9596a) {
            C2668g.b(c9596a, "params");
            return new C9583d(new C9571a(c9596a.m39957a().m39894a() - c9596a.m39958b().m39894a(), c9596a.m39957a().m39895b() - c9596a.m39958b().m39895b(), c9596a.m39957a().m39896c(), c9596a.m39957a().m39897d(), 0, 0, 48, null), new C9571a(0, 0, c9596a.m39958b().m39896c(), c9596a.m39958b().m39897d(), 0, 0, 48, null));
        }

        @NotNull
        /* renamed from: a */
        public final C9582c m39913a(@NotNull View view) {
            C2668g.b(view, "featureIconView");
            return new C9582c(view.getTranslationY(), 0.0f, 0.0f, -view.getTranslationY());
        }

        @NotNull
        /* renamed from: b */
        public final C9581b m39915b(@NotNull View view) {
            C2668g.b(view, "featureIconView");
            return new C9581b(view.getScaleX(), view.getScaleX() * 0.8f);
        }

        @NotNull
        /* renamed from: c */
        public final C9584e m39916c(@NotNull View view) {
            C2668g.b(view, "textContainer");
            return new C9584e(view.getTranslationY(), 0.0f, view.getScaleX(), 1.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$IconScaleParams;", "", "startScale", "", "endScale", "(FF)V", "getEndScale", "()F", "getStartScale", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.b$b */
    public static final class C9581b {
        /* renamed from: a */
        private final float f32017a;
        /* renamed from: b */
        private final float f32018b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9581b) {
                    C9581b c9581b = (C9581b) obj;
                    if (Float.compare(this.f32017a, c9581b.f32017a) == 0 && Float.compare(this.f32018b, c9581b.f32018b) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f32017a) * 31) + Float.floatToIntBits(this.f32018b);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IconScaleParams(startScale=");
            stringBuilder.append(this.f32017a);
            stringBuilder.append(", endScale=");
            stringBuilder.append(this.f32018b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9581b(float f, float f2) {
            this.f32017a = f;
            this.f32018b = f2;
        }

        /* renamed from: a */
        public final float m39917a() {
            return this.f32017a;
        }

        /* renamed from: b */
        public final float m39918b() {
            return this.f32018b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$IconTranslationParams;", "", "startIconTranslationY", "", "endIconTranslationY", "startRaysTranslationY", "endRaysTranslationY", "(FFFF)V", "getEndIconTranslationY", "()F", "getEndRaysTranslationY", "getStartIconTranslationY", "getStartRaysTranslationY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.b$c */
    public static final class C9582c {
        /* renamed from: a */
        private final float f32019a;
        /* renamed from: b */
        private final float f32020b;
        /* renamed from: c */
        private final float f32021c;
        /* renamed from: d */
        private final float f32022d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9582c) {
                    C9582c c9582c = (C9582c) obj;
                    if (Float.compare(this.f32019a, c9582c.f32019a) == 0 && Float.compare(this.f32020b, c9582c.f32020b) == 0 && Float.compare(this.f32021c, c9582c.f32021c) == 0 && Float.compare(this.f32022d, c9582c.f32022d) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f32019a) * 31) + Float.floatToIntBits(this.f32020b)) * 31) + Float.floatToIntBits(this.f32021c)) * 31) + Float.floatToIntBits(this.f32022d);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IconTranslationParams(startIconTranslationY=");
            stringBuilder.append(this.f32019a);
            stringBuilder.append(", endIconTranslationY=");
            stringBuilder.append(this.f32020b);
            stringBuilder.append(", startRaysTranslationY=");
            stringBuilder.append(this.f32021c);
            stringBuilder.append(", endRaysTranslationY=");
            stringBuilder.append(this.f32022d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9582c(float f, float f2, float f3, float f4) {
            this.f32019a = f;
            this.f32020b = f2;
            this.f32021c = f3;
            this.f32022d = f4;
        }

        /* renamed from: a */
        public final float m39919a() {
            return this.f32019a;
        }

        /* renamed from: b */
        public final float m39920b() {
            return this.f32020b;
        }

        /* renamed from: c */
        public final float m39921c() {
            return this.f32021c;
        }

        /* renamed from: d */
        public final float m39922d() {
            return this.f32022d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$ScaleUpParams;", "", "startViewBounds", "Lcom/tinder/fireboarding/view/ViewBounds;", "endViewBounds", "(Lcom/tinder/fireboarding/view/ViewBounds;Lcom/tinder/fireboarding/view/ViewBounds;)V", "getEndViewBounds", "()Lcom/tinder/fireboarding/view/ViewBounds;", "getStartViewBounds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.b$d */
    public static final class C9583d {
        @NotNull
        /* renamed from: a */
        private final C9571a f32023a;
        @NotNull
        /* renamed from: b */
        private final C9571a f32024b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9583d) {
                    C9583d c9583d = (C9583d) obj;
                    if (C2668g.a(this.f32023a, c9583d.f32023a) && C2668g.a(this.f32024b, c9583d.f32024b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C9571a c9571a = this.f32023a;
            int i = 0;
            int hashCode = (c9571a != null ? c9571a.hashCode() : 0) * 31;
            C9571a c9571a2 = this.f32024b;
            if (c9571a2 != null) {
                i = c9571a2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ScaleUpParams(startViewBounds=");
            stringBuilder.append(this.f32023a);
            stringBuilder.append(", endViewBounds=");
            stringBuilder.append(this.f32024b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9583d(@NotNull C9571a c9571a, @NotNull C9571a c9571a2) {
            C2668g.b(c9571a, "startViewBounds");
            C2668g.b(c9571a2, "endViewBounds");
            this.f32023a = c9571a;
            this.f32024b = c9571a2;
        }

        @NotNull
        /* renamed from: a */
        public final C9571a m39923a() {
            return this.f32023a;
        }

        @NotNull
        /* renamed from: b */
        public final C9571a m39924b() {
            return this.f32024b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$TextContainerParams;", "", "startTranslationY", "", "endTranslationY", "startScale", "endScale", "(FFFF)V", "getEndScale", "()F", "getEndTranslationY", "getStartScale", "getStartTranslationY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.b$e */
    public static final class C9584e {
        /* renamed from: a */
        private final float f32025a;
        /* renamed from: b */
        private final float f32026b;
        /* renamed from: c */
        private final float f32027c;
        /* renamed from: d */
        private final float f32028d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9584e) {
                    C9584e c9584e = (C9584e) obj;
                    if (Float.compare(this.f32025a, c9584e.f32025a) == 0 && Float.compare(this.f32026b, c9584e.f32026b) == 0 && Float.compare(this.f32027c, c9584e.f32027c) == 0 && Float.compare(this.f32028d, c9584e.f32028d) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f32025a) * 31) + Float.floatToIntBits(this.f32026b)) * 31) + Float.floatToIntBits(this.f32027c)) * 31) + Float.floatToIntBits(this.f32028d);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TextContainerParams(startTranslationY=");
            stringBuilder.append(this.f32025a);
            stringBuilder.append(", endTranslationY=");
            stringBuilder.append(this.f32026b);
            stringBuilder.append(", startScale=");
            stringBuilder.append(this.f32027c);
            stringBuilder.append(", endScale=");
            stringBuilder.append(this.f32028d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9584e(float f, float f2, float f3, float f4) {
            this.f32025a = f;
            this.f32026b = f2;
            this.f32027c = f3;
            this.f32028d = f4;
        }

        /* renamed from: a */
        public final float m39925a() {
            return this.f32025a;
        }

        /* renamed from: b */
        public final float m39926b() {
            return this.f32026b;
        }

        /* renamed from: c */
        public final float m39927c() {
            return this.f32027c;
        }

        /* renamed from: d */
        public final float m39928d() {
            return this.f32028d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/fireboarding/view/animation/EntranceAnimatorFactory$create$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.b$f */
    static final class C9585f implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C9587b f32029a;
        /* renamed from: b */
        final /* synthetic */ BackgroundScalingView f32030b;
        /* renamed from: c */
        final /* synthetic */ View f32031c;
        /* renamed from: d */
        final /* synthetic */ View f32032d;

        C9585f(C9587b c9587b, BackgroundScalingView backgroundScalingView, View view, View view2) {
            this.f32029a = c9587b;
            this.f32030b = backgroundScalingView;
            this.f32031c = view;
            this.f32032d = view2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animation");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            this.f32029a.m39931a(animatedFraction, this.f32030b);
            this.f32029a.m39930a(animatedFraction, this.f32031c, this.f32030b);
            this.f32029a.m39929a(animatedFraction, this.f32031c);
            this.f32029a.m39936b(animatedFraction, this.f32032d);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/EntranceAnimatorFactory$create$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory$create$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.b$g */
    public static final class C9586g extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C9587b f32033a;
        /* renamed from: b */
        final /* synthetic */ BackgroundScalingView f32034b;
        /* renamed from: c */
        final /* synthetic */ View f32035c;
        /* renamed from: d */
        final /* synthetic */ View f32036d;

        C9586g(C9587b c9587b, BackgroundScalingView backgroundScalingView, View view, View view2) {
            this.f32033a = c9587b;
            this.f32034b = backgroundScalingView;
            this.f32035c = view;
            this.f32036d = view2;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32033a.m39931a(1.0f, this.f32034b);
            this.f32033a.m39930a(1.0f, this.f32035c, this.f32034b);
            this.f32033a.m39929a(1.0f, this.f32035c);
            this.f32033a.m39936b(1.0f, this.f32036d);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    public final android.animation.ValueAnimator m39938a(@org.jetbrains.annotations.NotNull com.tinder.fireboarding.view.animation.C9587b.C9583d r2, @org.jetbrains.annotations.NotNull com.tinder.fireboarding.view.animation.C9587b.C9582c r3, @org.jetbrains.annotations.NotNull com.tinder.fireboarding.view.animation.C9587b.C9581b r4, @org.jetbrains.annotations.NotNull com.tinder.fireboarding.view.animation.C9587b.C9584e r5, @org.jetbrains.annotations.NotNull com.tinder.fireboarding.view.BackgroundScalingView r6, @org.jetbrains.annotations.NotNull android.view.View r7, @org.jetbrains.annotations.NotNull android.view.View r8) {
        /*
        r1 = this;
        r0 = "scaleUpParams";
        kotlin.jvm.internal.C2668g.b(r2, r0);
        r0 = "iconTranslationParams";
        kotlin.jvm.internal.C2668g.b(r3, r0);
        r0 = "iconScaleParams";
        kotlin.jvm.internal.C2668g.b(r4, r0);
        r0 = "textContainerParams";
        kotlin.jvm.internal.C2668g.b(r5, r0);
        r0 = "backgroundScalingView";
        kotlin.jvm.internal.C2668g.b(r6, r0);
        r0 = "iconView";
        kotlin.jvm.internal.C2668g.b(r7, r0);
        r0 = "textContainer";
        kotlin.jvm.internal.C2668g.b(r8, r0);
        r1.m39932a(r2, r3, r4, r5);
        r2 = r1.f32038b;
        com.tinder.base.p170a.p171a.C8299a.m35391a(r2);
        r3 = 2;
        r3 = new float[r3];
        r3 = {0, 1065353216};
        r2.setFloatValues(r3);
        r3 = new com.tinder.fireboarding.view.animation.b$f;
        r3.<init>(r1, r6, r7, r8);
        r3 = (android.animation.ValueAnimator.AnimatorUpdateListener) r3;
        r2.addUpdateListener(r3);
        r3 = new com.tinder.fireboarding.view.animation.b$g;
        r3.<init>(r1, r6, r7, r8);
        r3 = (android.animation.Animator.AnimatorListener) r3;
        r2.addListener(r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.fireboarding.view.animation.b.a(com.tinder.fireboarding.view.animation.b$d, com.tinder.fireboarding.view.animation.b$c, com.tinder.fireboarding.view.animation.b$b, com.tinder.fireboarding.view.animation.b$e, com.tinder.fireboarding.view.BackgroundScalingView, android.view.View, android.view.View):android.animation.ValueAnimator");
    }

    /* renamed from: a */
    private final void m39932a(C9583d c9583d, C9582c c9582c, C9581b c9581b, C9584e c9584e) {
        this.f32040d = new C9604g((float) c9583d.m39923a().m39894a(), (float) c9583d.m39924b().m39894a(), 0.0f, 4, null);
        this.f32041e = new C9604g((float) c9583d.m39923a().m39895b(), (float) c9583d.m39924b().m39895b(), 0.0f, 4, null);
        this.f32042f = new C9604g((float) c9583d.m39923a().m39898e(), (float) c9583d.m39924b().m39898e(), 0.0f, 4, null);
        this.f32043g = new C9604g((float) c9583d.m39923a().m39899f(), (float) c9583d.m39924b().m39899f(), 0.0f, 4, null);
        this.f32044h = new C9604g(c9582c.m39919a(), c9582c.m39920b(), 0.0f, 4, null);
        this.f32039c = new C9604g(c9581b.m39917a(), c9581b.m39918b(), 0.0f, 4, null);
        this.f32045i = new C9604g(c9582c.m39921c(), c9582c.m39922d(), 0.0f, 4, null);
        this.f32046j = new C9604g(c9584e.m39925a(), c9584e.m39926b(), 0.0f, 4, null);
        this.f32047k = new C9604g(c9584e.m39927c(), c9584e.m39928d(), 0.0f, 4, null);
    }

    /* renamed from: a */
    private final void m39931a(float f, BackgroundScalingView backgroundScalingView) {
        C9604g c9604g = this.f32040d;
        if (c9604g == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        C9604g c9604g2 = this.f32041e;
        if (c9604g2 == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        C9604g c9604g3 = this.f32042f;
        if (c9604g3 == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        C9604g c9604g4 = this.f32043g;
        if (c9604g4 == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        backgroundScalingView.m39874a((int) c9604g.m39970a(f), (int) c9604g2.m39970a(f), (int) c9604g3.m39970a(f), (int) c9604g4.m39970a(f));
    }

    /* renamed from: a */
    private final void m39930a(float f, View view, BackgroundScalingView backgroundScalingView) {
        C9604g c9604g = this.f32044h;
        if (c9604g != null) {
            view.setTranslationY(c9604g.m39970a(f));
        }
        view = this.f32045i;
        if (view != null) {
            backgroundScalingView.setTranslationRaysY(view.m39970a(f));
        }
    }

    /* renamed from: a */
    private final void m39929a(float f, View view) {
        C9604g c9604g = this.f32039c;
        if (c9604g != null) {
            view.setScaleX(c9604g.m39970a(f));
            view.setScaleY(c9604g.m39970a(f));
        }
    }

    /* renamed from: b */
    private final void m39936b(float f, View view) {
        view.setAlpha(f);
        C9604g c9604g = this.f32046j;
        if (c9604g != null) {
            view.setTranslationY(c9604g.m39970a(f));
        }
        c9604g = this.f32047k;
        if (c9604g != null) {
            f = c9604g.m39970a(f);
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }
}
