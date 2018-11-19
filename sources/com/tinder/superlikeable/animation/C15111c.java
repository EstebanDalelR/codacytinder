package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.superlikeable.p422b.C15136b;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C15808y;
import kotlin.collections.C19066k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005!\"#$%BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0012H\u0002J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ$\u0010\u001f\u001a\u00020\u0012*\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010 \u001a\u00020\u0006H\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator;", "", "animatorSet", "Landroid/animation/AnimatorSet;", "activeAnimationsCounter", "Ljava/util/HashSet;", "Landroid/animation/Animator;", "Lkotlin/collections/HashSet;", "scaleBackgroundToFullScreenAnimator", "Landroid/animation/ValueAnimator;", "moveLogoUpAnimator", "textAppearanceAnimator", "childAppearanceAnimators", "", "(Landroid/animation/AnimatorSet;Ljava/util/HashSet;Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;[Landroid/animation/ValueAnimator;)V", "[Landroid/animation/ValueAnimator;", "onEntranceAnimationEndListener", "Lkotlin/Function0;", "", "Lcom/tinder/superlikeable/animation/OnEntranceAnimationEndListener;", "getOnEntranceAnimationEndListener", "()Lkotlin/jvm/functions/Function0;", "setOnEntranceAnimationEndListener", "(Lkotlin/jvm/functions/Function0;)V", "cancelIfRunning", "isRunning", "", "notifyAnimationEnd", "start", "params", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$AnimationParams;", "addAnimator", "animator", "AnimationParams", "ChildCardViewAppearanceParams", "MoveLogoUpParams", "ScaleBackgroundParams", "TextAppearanceParams", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.c */
public final class C15111c {
    @NotNull
    /* renamed from: a */
    private Function0<C15813i> f47020a;
    /* renamed from: b */
    private final AnimatorSet f47021b;
    /* renamed from: c */
    private HashSet<Animator> f47022c;
    /* renamed from: d */
    private final ValueAnimator f47023d;
    /* renamed from: e */
    private final ValueAnimator f47024e;
    /* renamed from: f */
    private final ValueAnimator f47025f;
    /* renamed from: g */
    private final ValueAnimator[] f47026g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$AnimationParams;", "", "cardViewContainer", "Landroid/view/ViewGroup;", "scaleBackgroundParams", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ScaleBackgroundParams;", "moveLogoUpParams", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$MoveLogoUpParams;", "textAppearanceParams", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$TextAppearanceParams;", "childCardViewsAppearanceParams", "", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;", "(Landroid/view/ViewGroup;Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ScaleBackgroundParams;Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$MoveLogoUpParams;Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$TextAppearanceParams;[Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;)V", "getCardViewContainer", "()Landroid/view/ViewGroup;", "getChildCardViewsAppearanceParams", "()[Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;", "[Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;", "getMoveLogoUpParams", "()Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$MoveLogoUpParams;", "getScaleBackgroundParams", "()Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ScaleBackgroundParams;", "getTextAppearanceParams", "()Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$TextAppearanceParams;", "component1", "component2", "component3", "component4", "component5", "copy", "(Landroid/view/ViewGroup;Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ScaleBackgroundParams;Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$MoveLogoUpParams;Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$TextAppearanceParams;[Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;)Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$AnimationParams;", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.c$a */
    public static final class C15104a {
        @NotNull
        /* renamed from: a */
        private final ViewGroup f46981a;
        @NotNull
        /* renamed from: b */
        private final C15107d f46982b;
        @NotNull
        /* renamed from: c */
        private final C15106c f46983c;
        @NotNull
        /* renamed from: d */
        private final C15108e f46984d;
        @NotNull
        /* renamed from: e */
        private final C15105b[] f46985e;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15104a) {
                    C15104a c15104a = (C15104a) obj;
                    if (C2668g.a(this.f46981a, c15104a.f46981a) && C2668g.a(this.f46982b, c15104a.f46982b) && C2668g.a(this.f46983c, c15104a.f46983c) && C2668g.a(this.f46984d, c15104a.f46984d) && C2668g.a(this.f46985e, c15104a.f46985e)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ViewGroup viewGroup = this.f46981a;
            int i = 0;
            int hashCode = (viewGroup != null ? viewGroup.hashCode() : 0) * 31;
            C15107d c15107d = this.f46982b;
            hashCode = (hashCode + (c15107d != null ? c15107d.hashCode() : 0)) * 31;
            C15106c c15106c = this.f46983c;
            hashCode = (hashCode + (c15106c != null ? c15106c.hashCode() : 0)) * 31;
            C15108e c15108e = this.f46984d;
            hashCode = (hashCode + (c15108e != null ? c15108e.hashCode() : 0)) * 31;
            C15105b[] c15105bArr = this.f46985e;
            if (c15105bArr != null) {
                i = Arrays.hashCode(c15105bArr);
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnimationParams(cardViewContainer=");
            stringBuilder.append(this.f46981a);
            stringBuilder.append(", scaleBackgroundParams=");
            stringBuilder.append(this.f46982b);
            stringBuilder.append(", moveLogoUpParams=");
            stringBuilder.append(this.f46983c);
            stringBuilder.append(", textAppearanceParams=");
            stringBuilder.append(this.f46984d);
            stringBuilder.append(", childCardViewsAppearanceParams=");
            stringBuilder.append(Arrays.toString(this.f46985e));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15104a(@NotNull ViewGroup viewGroup, @NotNull C15107d c15107d, @NotNull C15106c c15106c, @NotNull C15108e c15108e, @NotNull C15105b[] c15105bArr) {
            C2668g.b(viewGroup, "cardViewContainer");
            C2668g.b(c15107d, "scaleBackgroundParams");
            C2668g.b(c15106c, "moveLogoUpParams");
            C2668g.b(c15108e, "textAppearanceParams");
            C2668g.b(c15105bArr, "childCardViewsAppearanceParams");
            this.f46981a = viewGroup;
            this.f46982b = c15107d;
            this.f46983c = c15106c;
            this.f46984d = c15108e;
            this.f46985e = c15105bArr;
        }

        @NotNull
        /* renamed from: a */
        public final ViewGroup m56889a() {
            return this.f46981a;
        }

        @NotNull
        /* renamed from: b */
        public final C15107d m56890b() {
            return this.f46982b;
        }

        @NotNull
        /* renamed from: c */
        public final C15106c m56891c() {
            return this.f46983c;
        }

        @NotNull
        /* renamed from: d */
        public final C15108e m56892d() {
            return this.f46984d;
        }

        @NotNull
        /* renamed from: e */
        public final C15105b[] m56893e() {
            return this.f46985e;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006%"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ChildCardViewAppearanceParams;", "", "startDelay", "", "duration", "cardScaleInterpolator", "Landroid/view/animation/OvershootInterpolator;", "startScale", "", "endScale", "childView", "Landroid/view/View;", "(JJLandroid/view/animation/OvershootInterpolator;FFLandroid/view/View;)V", "getCardScaleInterpolator", "()Landroid/view/animation/OvershootInterpolator;", "getChildView", "()Landroid/view/View;", "getDuration", "()J", "getEndScale", "()F", "getStartDelay", "getStartScale", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.c$b */
    public static final class C15105b {
        /* renamed from: a */
        private final long f46986a;
        /* renamed from: b */
        private final long f46987b;
        @NotNull
        /* renamed from: c */
        private final OvershootInterpolator f46988c;
        /* renamed from: d */
        private final float f46989d;
        /* renamed from: e */
        private final float f46990e;
        @NotNull
        /* renamed from: f */
        private final View f46991f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15105b) {
                C15105b c15105b = (C15105b) obj;
                if ((this.f46986a == c15105b.f46986a ? 1 : null) != null) {
                    return ((this.f46987b > c15105b.f46987b ? 1 : (this.f46987b == c15105b.f46987b ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f46988c, c15105b.f46988c) && Float.compare(this.f46989d, c15105b.f46989d) == 0 && Float.compare(this.f46990e, c15105b.f46990e) == 0 && C2668g.a(this.f46991f, c15105b.f46991f);
                }
            }
        }

        public int hashCode() {
            long j = this.f46986a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f46987b;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            OvershootInterpolator overshootInterpolator = this.f46988c;
            int i2 = 0;
            i = (((((i + (overshootInterpolator != null ? overshootInterpolator.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f46989d)) * 31) + Float.floatToIntBits(this.f46990e)) * 31;
            View view = this.f46991f;
            if (view != null) {
                i2 = view.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChildCardViewAppearanceParams(startDelay=");
            stringBuilder.append(this.f46986a);
            stringBuilder.append(", duration=");
            stringBuilder.append(this.f46987b);
            stringBuilder.append(", cardScaleInterpolator=");
            stringBuilder.append(this.f46988c);
            stringBuilder.append(", startScale=");
            stringBuilder.append(this.f46989d);
            stringBuilder.append(", endScale=");
            stringBuilder.append(this.f46990e);
            stringBuilder.append(", childView=");
            stringBuilder.append(this.f46991f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15105b(long j, long j2, @NotNull OvershootInterpolator overshootInterpolator, float f, float f2, @NotNull View view) {
            C2668g.b(overshootInterpolator, "cardScaleInterpolator");
            C2668g.b(view, "childView");
            this.f46986a = j;
            this.f46987b = j2;
            this.f46988c = overshootInterpolator;
            this.f46989d = f;
            this.f46990e = f2;
            this.f46991f = view;
        }

        /* renamed from: a */
        public final long m56894a() {
            return this.f46986a;
        }

        /* renamed from: b */
        public final long m56895b() {
            return this.f46987b;
        }

        @NotNull
        /* renamed from: c */
        public final OvershootInterpolator m56896c() {
            return this.f46988c;
        }

        /* renamed from: d */
        public final float m56897d() {
            return this.f46989d;
        }

        /* renamed from: e */
        public final float m56898e() {
            return this.f46990e;
        }

        @NotNull
        /* renamed from: f */
        public final View m56899f() {
            return this.f46991f;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006."}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$MoveLogoUpParams;", "", "duration", "", "interpolator", "Landroid/animation/TimeInterpolator;", "logoStartScale", "", "logoEndScale", "logoStartTranslationY", "logoEndTranslationY", "logoView", "Lcom/airbnb/lottie/LottieAnimationView;", "topStarsAnimationView", "bottomStarsAnimationView", "(JLandroid/animation/TimeInterpolator;FFFFLcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;)V", "getBottomStarsAnimationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "getDuration", "()J", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "getLogoEndScale", "()F", "getLogoEndTranslationY", "getLogoStartScale", "getLogoStartTranslationY", "getLogoView", "getTopStarsAnimationView", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.c$c */
    public static final class C15106c {
        /* renamed from: a */
        private final long f46992a;
        @NotNull
        /* renamed from: b */
        private final TimeInterpolator f46993b;
        /* renamed from: c */
        private final float f46994c;
        /* renamed from: d */
        private final float f46995d;
        /* renamed from: e */
        private final float f46996e;
        /* renamed from: f */
        private final float f46997f;
        @NotNull
        /* renamed from: g */
        private final LottieAnimationView f46998g;
        @NotNull
        /* renamed from: h */
        private final LottieAnimationView f46999h;
        @NotNull
        /* renamed from: i */
        private final LottieAnimationView f47000i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15106c) {
                C15106c c15106c = (C15106c) obj;
                return ((this.f46992a > c15106c.f46992a ? 1 : (this.f46992a == c15106c.f46992a ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f46993b, c15106c.f46993b) && Float.compare(this.f46994c, c15106c.f46994c) == 0 && Float.compare(this.f46995d, c15106c.f46995d) == 0 && Float.compare(this.f46996e, c15106c.f46996e) == 0 && Float.compare(this.f46997f, c15106c.f46997f) == 0 && C2668g.a(this.f46998g, c15106c.f46998g) && C2668g.a(this.f46999h, c15106c.f46999h) && C2668g.a(this.f47000i, c15106c.f47000i);
            }
        }

        public int hashCode() {
            long j = this.f46992a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            TimeInterpolator timeInterpolator = this.f46993b;
            int i2 = 0;
            i = (((((((((i + (timeInterpolator != null ? timeInterpolator.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f46994c)) * 31) + Float.floatToIntBits(this.f46995d)) * 31) + Float.floatToIntBits(this.f46996e)) * 31) + Float.floatToIntBits(this.f46997f)) * 31;
            LottieAnimationView lottieAnimationView = this.f46998g;
            i = (i + (lottieAnimationView != null ? lottieAnimationView.hashCode() : 0)) * 31;
            lottieAnimationView = this.f46999h;
            i = (i + (lottieAnimationView != null ? lottieAnimationView.hashCode() : 0)) * 31;
            lottieAnimationView = this.f47000i;
            if (lottieAnimationView != null) {
                i2 = lottieAnimationView.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MoveLogoUpParams(duration=");
            stringBuilder.append(this.f46992a);
            stringBuilder.append(", interpolator=");
            stringBuilder.append(this.f46993b);
            stringBuilder.append(", logoStartScale=");
            stringBuilder.append(this.f46994c);
            stringBuilder.append(", logoEndScale=");
            stringBuilder.append(this.f46995d);
            stringBuilder.append(", logoStartTranslationY=");
            stringBuilder.append(this.f46996e);
            stringBuilder.append(", logoEndTranslationY=");
            stringBuilder.append(this.f46997f);
            stringBuilder.append(", logoView=");
            stringBuilder.append(this.f46998g);
            stringBuilder.append(", topStarsAnimationView=");
            stringBuilder.append(this.f46999h);
            stringBuilder.append(", bottomStarsAnimationView=");
            stringBuilder.append(this.f47000i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15106c(long j, @NotNull TimeInterpolator timeInterpolator, float f, float f2, float f3, float f4, @NotNull LottieAnimationView lottieAnimationView, @NotNull LottieAnimationView lottieAnimationView2, @NotNull LottieAnimationView lottieAnimationView3) {
            C2668g.b(timeInterpolator, "interpolator");
            C2668g.b(lottieAnimationView, "logoView");
            C2668g.b(lottieAnimationView2, "topStarsAnimationView");
            C2668g.b(lottieAnimationView3, "bottomStarsAnimationView");
            this.f46992a = j;
            this.f46993b = timeInterpolator;
            this.f46994c = f;
            this.f46995d = f2;
            this.f46996e = f3;
            this.f46997f = f4;
            this.f46998g = lottieAnimationView;
            this.f46999h = lottieAnimationView2;
            this.f47000i = lottieAnimationView3;
        }

        /* renamed from: a */
        public final long m56900a() {
            return this.f46992a;
        }

        @NotNull
        /* renamed from: b */
        public final TimeInterpolator m56901b() {
            return this.f46993b;
        }

        /* renamed from: c */
        public final float m56902c() {
            return this.f46994c;
        }

        /* renamed from: d */
        public final float m56903d() {
            return this.f46995d;
        }

        /* renamed from: e */
        public final float m56904e() {
            return this.f46996e;
        }

        /* renamed from: f */
        public final float m56905f() {
            return this.f46997f;
        }

        @NotNull
        /* renamed from: g */
        public final LottieAnimationView m56906g() {
            return this.f46998g;
        }

        @NotNull
        /* renamed from: h */
        public final LottieAnimationView m56907h() {
            return this.f46999h;
        }

        @NotNull
        /* renamed from: i */
        public final LottieAnimationView m56908i() {
            return this.f47000i;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0010HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$ScaleBackgroundParams;", "", "backgroundView", "Landroid/view/View;", "backgroundStartScaleX", "", "backgroundStartScaleY", "backgroundEndScaleX", "backgroundEndScaleY", "backgroundScaleAnimationDuration", "", "interpolator", "Landroid/animation/TimeInterpolator;", "logoStartScale", "logoEndScale", "logoView", "Lcom/airbnb/lottie/LottieAnimationView;", "(Landroid/view/View;FFFFJLandroid/animation/TimeInterpolator;FFLcom/airbnb/lottie/LottieAnimationView;)V", "getBackgroundEndScaleX", "()F", "getBackgroundEndScaleY", "getBackgroundScaleAnimationDuration", "()J", "getBackgroundStartScaleX", "getBackgroundStartScaleY", "getBackgroundView", "()Landroid/view/View;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "getLogoEndScale", "getLogoStartScale", "getLogoView", "()Lcom/airbnb/lottie/LottieAnimationView;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.c$d */
    public static final class C15107d {
        @NotNull
        /* renamed from: a */
        private final View f47001a;
        /* renamed from: b */
        private final float f47002b;
        /* renamed from: c */
        private final float f47003c;
        /* renamed from: d */
        private final float f47004d;
        /* renamed from: e */
        private final float f47005e;
        /* renamed from: f */
        private final long f47006f;
        @NotNull
        /* renamed from: g */
        private final TimeInterpolator f47007g;
        /* renamed from: h */
        private final float f47008h;
        /* renamed from: i */
        private final float f47009i;
        @NotNull
        /* renamed from: j */
        private final LottieAnimationView f47010j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15107d) {
                C15107d c15107d = (C15107d) obj;
                if (C2668g.a(this.f47001a, c15107d.f47001a) && Float.compare(this.f47002b, c15107d.f47002b) == 0 && Float.compare(this.f47003c, c15107d.f47003c) == 0 && Float.compare(this.f47004d, c15107d.f47004d) == 0 && Float.compare(this.f47005e, c15107d.f47005e) == 0) {
                    return ((this.f47006f > c15107d.f47006f ? 1 : (this.f47006f == c15107d.f47006f ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f47007g, c15107d.f47007g) && Float.compare(this.f47008h, c15107d.f47008h) == 0 && Float.compare(this.f47009i, c15107d.f47009i) == 0 && C2668g.a(this.f47010j, c15107d.f47010j);
                }
            }
        }

        public int hashCode() {
            View view = this.f47001a;
            int i = 0;
            int hashCode = (((((((((view != null ? view.hashCode() : 0) * 31) + Float.floatToIntBits(this.f47002b)) * 31) + Float.floatToIntBits(this.f47003c)) * 31) + Float.floatToIntBits(this.f47004d)) * 31) + Float.floatToIntBits(this.f47005e)) * 31;
            long j = this.f47006f;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            TimeInterpolator timeInterpolator = this.f47007g;
            hashCode = (((((hashCode + (timeInterpolator != null ? timeInterpolator.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f47008h)) * 31) + Float.floatToIntBits(this.f47009i)) * 31;
            LottieAnimationView lottieAnimationView = this.f47010j;
            if (lottieAnimationView != null) {
                i = lottieAnimationView.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ScaleBackgroundParams(backgroundView=");
            stringBuilder.append(this.f47001a);
            stringBuilder.append(", backgroundStartScaleX=");
            stringBuilder.append(this.f47002b);
            stringBuilder.append(", backgroundStartScaleY=");
            stringBuilder.append(this.f47003c);
            stringBuilder.append(", backgroundEndScaleX=");
            stringBuilder.append(this.f47004d);
            stringBuilder.append(", backgroundEndScaleY=");
            stringBuilder.append(this.f47005e);
            stringBuilder.append(", backgroundScaleAnimationDuration=");
            stringBuilder.append(this.f47006f);
            stringBuilder.append(", interpolator=");
            stringBuilder.append(this.f47007g);
            stringBuilder.append(", logoStartScale=");
            stringBuilder.append(this.f47008h);
            stringBuilder.append(", logoEndScale=");
            stringBuilder.append(this.f47009i);
            stringBuilder.append(", logoView=");
            stringBuilder.append(this.f47010j);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15107d(@NotNull View view, float f, float f2, float f3, float f4, long j, @NotNull TimeInterpolator timeInterpolator, float f5, float f6, @NotNull LottieAnimationView lottieAnimationView) {
            C2668g.b(view, "backgroundView");
            C2668g.b(timeInterpolator, "interpolator");
            C2668g.b(lottieAnimationView, "logoView");
            this.f47001a = view;
            this.f47002b = f;
            this.f47003c = f2;
            this.f47004d = f3;
            this.f47005e = f4;
            this.f47006f = j;
            this.f47007g = timeInterpolator;
            this.f47008h = f5;
            this.f47009i = f6;
            this.f47010j = lottieAnimationView;
        }

        @NotNull
        /* renamed from: a */
        public final View m56909a() {
            return this.f47001a;
        }

        /* renamed from: b */
        public final float m56910b() {
            return this.f47002b;
        }

        /* renamed from: c */
        public final float m56911c() {
            return this.f47003c;
        }

        /* renamed from: d */
        public final float m56912d() {
            return this.f47004d;
        }

        /* renamed from: e */
        public final float m56913e() {
            return this.f47005e;
        }

        /* renamed from: f */
        public final long m56914f() {
            return this.f47006f;
        }

        @NotNull
        /* renamed from: g */
        public final TimeInterpolator m56915g() {
            return this.f47007g;
        }

        /* renamed from: h */
        public final float m56916h() {
            return this.f47008h;
        }

        /* renamed from: i */
        public final float m56917i() {
            return this.f47009i;
        }

        @NotNull
        /* renamed from: j */
        public final LottieAnimationView m56918j() {
            return this.f47010j;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$TextAppearanceParams;", "", "topTextView", "Landroid/widget/TextView;", "bottomTextView", "textAppearanceAnimationDuration", "", "textAppearanceAnimationStartDelay", "(Landroid/widget/TextView;Landroid/widget/TextView;JJ)V", "getBottomTextView", "()Landroid/widget/TextView;", "getTextAppearanceAnimationDuration", "()J", "getTextAppearanceAnimationStartDelay", "getTopTextView", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.c$e */
    public static final class C15108e {
        @NotNull
        /* renamed from: a */
        private final TextView f47011a;
        @NotNull
        /* renamed from: b */
        private final TextView f47012b;
        /* renamed from: c */
        private final long f47013c;
        /* renamed from: d */
        private final long f47014d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15108e) {
                C15108e c15108e = (C15108e) obj;
                if (C2668g.a(this.f47011a, c15108e.f47011a) && C2668g.a(this.f47012b, c15108e.f47012b)) {
                    if ((this.f47013c == c15108e.f47013c ? 1 : null) != null) {
                        if ((this.f47014d == c15108e.f47014d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            TextView textView = this.f47011a;
            int i = 0;
            int hashCode = (textView != null ? textView.hashCode() : 0) * 31;
            TextView textView2 = this.f47012b;
            if (textView2 != null) {
                i = textView2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.f47013c;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            j = this.f47014d;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TextAppearanceParams(topTextView=");
            stringBuilder.append(this.f47011a);
            stringBuilder.append(", bottomTextView=");
            stringBuilder.append(this.f47012b);
            stringBuilder.append(", textAppearanceAnimationDuration=");
            stringBuilder.append(this.f47013c);
            stringBuilder.append(", textAppearanceAnimationStartDelay=");
            stringBuilder.append(this.f47014d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15108e(@NotNull TextView textView, @NotNull TextView textView2, long j, long j2) {
            C2668g.b(textView, "topTextView");
            C2668g.b(textView2, "bottomTextView");
            this.f47011a = textView;
            this.f47012b = textView2;
            this.f47013c = j;
            this.f47014d = j2;
        }

        @NotNull
        /* renamed from: a */
        public final TextView m56919a() {
            return this.f47011a;
        }

        @NotNull
        /* renamed from: b */
        public final TextView m56920b() {
            return this.f47012b;
        }

        /* renamed from: c */
        public final long m56921c() {
            return this.f47013c;
        }

        /* renamed from: d */
        public final long m56922d() {
            return this.f47014d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$addAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator;Ljava/util/HashSet;Landroid/animation/Animator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.c$f */
    public static final class C15109f extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C15111c f47015a;
        /* renamed from: b */
        final /* synthetic */ HashSet f47016b;
        /* renamed from: c */
        final /* synthetic */ Animator f47017c;

        C15109f(C15111c c15111c, HashSet<Animator> hashSet, Animator animator) {
            this.f47015a = c15111c;
            this.f47016b = hashSet;
            this.f47017c = animator;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f47016b.add(this.f47017c);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            if (animator != null) {
                animator.removeListener(this);
            }
            this.f47016b.remove(this.f47017c);
            if (this.f47016b.size() == null) {
                this.f47015a.m56926c();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$start$4", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "(Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator;Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator$MoveLogoUpParams;)V", "onAnimationUpdate", "", "animation", "Landroid/animation/ValueAnimator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.c$g */
    public static final class C15110g implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C15111c f47018a;
        /* renamed from: b */
        final /* synthetic */ C15106c f47019b;

        C15110g(C15111c c15111c, C15106c c15106c) {
            this.f47018a = c15111c;
            this.f47019b = c15106c;
        }

        public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            C2668g.b(valueAnimator, "animation");
            if (valueAnimator.getAnimatedFraction() >= 1.0f) {
                this.f47018a.f47024e.removeUpdateListener(this);
                this.f47019b.m56907h().setVisibility(0);
                this.f47019b.m56908i().setVisibility(0);
                this.f47019b.m56907h().c();
                this.f47019b.m56908i().c();
            }
        }
    }

    public C15111c() {
        this(null, null, null, null, null, null, 63, null);
    }

    public C15111c(@NotNull AnimatorSet animatorSet, @NotNull HashSet<Animator> hashSet, @NotNull ValueAnimator valueAnimator, @NotNull ValueAnimator valueAnimator2, @NotNull ValueAnimator valueAnimator3, @NotNull ValueAnimator[] valueAnimatorArr) {
        C2668g.b(animatorSet, "animatorSet");
        C2668g.b(hashSet, "activeAnimationsCounter");
        C2668g.b(valueAnimator, "scaleBackgroundToFullScreenAnimator");
        C2668g.b(valueAnimator2, "moveLogoUpAnimator");
        C2668g.b(valueAnimator3, "textAppearanceAnimator");
        C2668g.b(valueAnimatorArr, "childAppearanceAnimators");
        this.f47021b = animatorSet;
        this.f47022c = hashSet;
        this.f47023d = valueAnimator;
        this.f47024e = valueAnimator2;
        this.f47025f = valueAnimator3;
        this.f47026g = valueAnimatorArr;
        this.f47020a = (Function0) SuperLikeableEntranceAnimator$onEntranceAnimationEndListener$1.f58595a;
    }

    public /* synthetic */ C15111c(AnimatorSet animatorSet, HashSet hashSet, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, ValueAnimator[] valueAnimatorArr, int i, C15823e c15823e) {
        Animator animatorSet2;
        if ((i & 1) != null) {
            animatorSet2 = new AnimatorSet();
        }
        if ((i & 2) != null) {
            hashSet = new HashSet();
        }
        ValueAnimator valueAnimator4 = hashSet;
        if ((i & 4) != null) {
            valueAnimator = new ValueAnimator();
        }
        ValueAnimator valueAnimator5 = valueAnimator;
        if ((i & 8) != null) {
            valueAnimator2 = new ValueAnimator();
        }
        ValueAnimator valueAnimator6 = valueAnimator2;
        if ((i & 16) != null) {
            valueAnimator3 = new ValueAnimator();
        }
        ValueAnimator valueAnimator7 = valueAnimator3;
        if ((i & 32) != null) {
            valueAnimatorArr = new ValueAnimator[4];
            HashSet length = valueAnimatorArr.length;
            for (hashSet = null; hashSet < length; hashSet++) {
                valueAnimatorArr[hashSet] = new ValueAnimator();
            }
        }
        this(animatorSet2, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimatorArr);
    }

    /* renamed from: a */
    public final void m56928a(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "<set-?>");
        this.f47020a = function0;
    }

    /* renamed from: a */
    public final boolean m56929a() {
        return this.f47022c.size() != 0;
    }

    /* renamed from: b */
    public final void m56930b() {
        if (m56929a()) {
            Object obj = null;
            for (ValueAnimator a : this.f47026g) {
                C15136b.m56961a(a);
            }
            this.f47021b.cancel();
            this.f47021b.removeAllListeners();
            this.f47021b.setStartDelay(0);
            this.f47021b.setInterpolator((TimeInterpolator) null);
            if (this.f47022c.size() == 0) {
                obj = 1;
            }
            if (obj == null) {
                throw new IllegalStateException("Active animator counter should be 0, check implementation".toString());
            }
        }
    }

    /* renamed from: a */
    public final void m56927a(@NotNull C15104a c15104a) {
        C15111c c15111c = this;
        C2668g.b(c15104a, "params");
        int i = 0;
        if ((c15104a.m56893e().length == 4 ? 1 : null) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected childCardViewsAppearanceParams.size to be 4 but");
            stringBuilder.append(" was ");
            stringBuilder.append(c15104a.m56893e().length);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        ViewGroup a = c15104a.m56889a();
        C15106c c = c15104a.m56891c();
        C15105b[] e = c15104a.m56893e();
        C15108e d = c15104a.m56892d();
        C15107d b = c15104a.m56890b();
        a.setVisibility(0);
        c.m56906g().setTranslationY(c.m56904e());
        c.m56906g().setVisibility(0);
        for (C15105b f : e) {
            f.m56899f().setAlpha(0.0f);
        }
        C15134i.m56959a(c15111c.f47025f, d.m56921c(), d.m56922d(), d.m56920b(), d.m56919a());
        C15128g.m56957a(c15111c.f47023d, b.m56914f(), b.m56915g(), b.m56916h(), b.m56917i(), b.m56918j(), b.m56910b(), b.m56911c(), b.m56912d(), b.m56913e(), b.m56909a());
        C15131h.m56958a(c15111c.f47024e, c.m56900a(), c.m56901b(), c.m56902c(), c.m56903d(), c.m56904e(), c.m56905f(), c.m56906g());
        for (C15808y c15808y : C19066k.m68010l(e)) {
            int c2 = c15808y.m59830c();
            C15105b c15105b = (C15105b) c15808y.m59831d();
            ValueAnimator valueAnimator = c15111c.f47026g[c2];
            C15125f.m56956a(valueAnimator, c15105b.m56894a(), c15105b.m56895b(), c15105b.m56896c(), c15105b.m56897d(), c15105b.m56898e(), c15105b.m56899f());
            m56924a(c15111c.f47022c, valueAnimator);
        }
        c15111c.f47024e.addUpdateListener(new C15110g(c15111c, c));
        m56924a(c15111c.f47022c, c15111c.f47025f);
        m56924a(c15111c.f47022c, c15111c.f47024e);
        m56924a(c15111c.f47022c, c15111c.f47023d);
        m56924a(c15111c.f47022c, c15111c.f47021b);
        c15111c.f47021b.playSequentially(new Animator[]{c15111c.f47023d, c15111c.f47024e, c15111c.f47025f});
        c15111c.f47021b.start();
        ValueAnimator[] valueAnimatorArr = c15111c.f47026g;
        int length = valueAnimatorArr.length;
        while (i < length) {
            valueAnimatorArr[i].start();
            i++;
        }
    }

    /* renamed from: c */
    private final void m56926c() {
        this.f47020a.invoke();
    }

    /* renamed from: a */
    private final void m56924a(@NotNull HashSet<Animator> hashSet, Animator animator) {
        animator.addListener(new C15109f(this, hashSet, animator));
    }
}
