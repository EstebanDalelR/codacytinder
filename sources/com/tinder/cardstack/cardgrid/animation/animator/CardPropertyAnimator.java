package com.tinder.cardstack.cardgrid.animation.animator;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tinder.cardstack.cardgrid.animation.p184a.C8368a;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10459a;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10460b;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10461c;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10462d;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10463e;
import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.view.CardViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 22\u00020\u0001:\u00041234B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0010\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020!J\u0016\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020!J\b\u0010&\u001a\u00020\u001bH\u0002J\u0006\u0010'\u001a\u00020\u001bJ\u001e\u0010(\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!2\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020!J\r\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator;", "", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "(Lcom/tinder/cardstack/view/CardViewHolder;)V", "value", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$AnimationConfig;", "animationConfig", "setAnimationConfig", "(Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$AnimationConfig;)V", "getCardViewHolder", "()Lcom/tinder/cardstack/view/CardViewHolder;", "onCompleteListeners", "", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$OnCompleteListener;", "shouldStartNewAnimation", "", "state", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$State;", "getState$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$State;", "setState$cardstack_release", "(Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$State;)V", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "addOnCompleteListener", "", "onCompleteListener", "getCardAnimation", "Lcom/tinder/cardstack/cardgrid/animation/model/CardPropertyAnimation;", "move", "firstTouchPoint", "Lcom/tinder/cardstack/cardgrid/model/Point;", "delta", "recover", "endPosition", "fromPosition", "start", "stop", "swipe", "duration", "", "translate", "updateAndGetCurrentValue", "Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty;", "updateAndGetCurrentValue$cardstack_release", "updateState", "newState", "AnimationConfig", "Companion", "OnCompleteListener", "State", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public final class CardPropertyAnimator {
    /* renamed from: a */
    public static final C8373b f29715a = new C8373b();
    /* renamed from: h */
    private static final long f29716h = 0;
    /* renamed from: i */
    private static final long f29717i = 1000;
    /* renamed from: j */
    private static final long f29718j = 500;
    /* renamed from: k */
    private static final long f29719k = 250;
    /* renamed from: l */
    private static final long f29720l = 250;
    /* renamed from: m */
    private static final AccelerateInterpolator f29721m = new AccelerateInterpolator();
    /* renamed from: n */
    private static final long f29722n = 180;
    /* renamed from: o */
    private static final C10459a f29723o = new C10459a();
    @NotNull
    /* renamed from: b */
    private State f29724b = State.STOPPED;
    /* renamed from: c */
    private C8372a f29725c = new C8372a(null, 0, null, 7, null);
    /* renamed from: d */
    private boolean f29726d;
    /* renamed from: e */
    private final ValueAnimator f29727e = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* renamed from: f */
    private final List<OnCompleteListener> f29728f = ((List) new ArrayList());
    @NotNull
    /* renamed from: g */
    private final CardViewHolder<?> f29729g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$OnCompleteListener;", "", "onComplete", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface OnCompleteListener {
        void onComplete();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$State;", "", "(Ljava/lang/String;I)V", "RUNNING", "STOPPED", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public enum State {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$AnimationConfig;", "", "cardAnimation", "Lcom/tinder/cardstack/cardgrid/animation/model/CardPropertyAnimation;", "duration", "", "interpolator", "Landroid/view/animation/Interpolator;", "(Lcom/tinder/cardstack/cardgrid/animation/model/CardPropertyAnimation;JLandroid/view/animation/Interpolator;)V", "getCardAnimation", "()Lcom/tinder/cardstack/cardgrid/animation/model/CardPropertyAnimation;", "getDuration", "()J", "getInterpolator", "()Landroid/view/animation/Interpolator;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator$a */
    private static final class C8372a {
        @NotNull
        /* renamed from: a */
        private final C8371b f29712a;
        /* renamed from: b */
        private final long f29713b;
        @NotNull
        /* renamed from: c */
        private final Interpolator f29714c;

        public C8372a() {
            this(null, 0, null, 7, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8372a) {
                C8372a c8372a = (C8372a) obj;
                if (C2668g.a(this.f29712a, c8372a.f29712a)) {
                    return ((this.f29713b > c8372a.f29713b ? 1 : (this.f29713b == c8372a.f29713b ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f29714c, c8372a.f29714c);
                }
            }
        }

        public int hashCode() {
            C8371b c8371b = this.f29712a;
            int i = 0;
            int hashCode = (c8371b != null ? c8371b.hashCode() : 0) * 31;
            long j = this.f29713b;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            Interpolator interpolator = this.f29714c;
            if (interpolator != null) {
                i = interpolator.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnimationConfig(cardAnimation=");
            stringBuilder.append(this.f29712a);
            stringBuilder.append(", duration=");
            stringBuilder.append(this.f29713b);
            stringBuilder.append(", interpolator=");
            stringBuilder.append(this.f29714c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8372a(@NotNull C8371b c8371b, long j, @NotNull Interpolator interpolator) {
            C2668g.b(c8371b, "cardAnimation");
            C2668g.b(interpolator, "interpolator");
            this.f29712a = c8371b;
            this.f29713b = j;
            this.f29714c = interpolator;
        }

        public /* synthetic */ C8372a(C8371b c8371b, long j, Interpolator interpolator, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                c8371b = CardPropertyAnimator.f29715a.m35668h();
            }
            if ((i & 2) != null) {
                j = CardPropertyAnimator.f29715a.m35665g();
            }
            if ((i & 4) != 0) {
                interpolator = CardPropertyAnimator.f29715a.m35664f();
            }
            this(c8371b, j, interpolator);
        }

        @NotNull
        /* renamed from: a */
        public final C8371b m35650a() {
            return this.f29712a;
        }

        /* renamed from: b */
        public final long m35651b() {
            return this.f29713b;
        }

        @NotNull
        /* renamed from: c */
        public final Interpolator m35652c() {
            return this.f29714c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$Companion;", "", "()V", "DEFAULT_CARD_PROPERTY_ANIMATION", "Lcom/tinder/cardstack/cardgrid/animation/model/CardPropertyAnimation$Default;", "getDEFAULT_CARD_PROPERTY_ANIMATION", "()Lcom/tinder/cardstack/cardgrid/animation/model/CardPropertyAnimation$Default;", "DEFAULT_DURATION", "", "getDEFAULT_DURATION", "()J", "DEFAULT_INTERPOLATOR", "Landroid/view/animation/AccelerateInterpolator;", "getDEFAULT_INTERPOLATOR", "()Landroid/view/animation/AccelerateInterpolator;", "MAX_SWIPE_ANIMATION_DURATION", "getMAX_SWIPE_ANIMATION_DURATION", "MIN_SWIPE_ANIMATION_DURATION", "getMIN_SWIPE_ANIMATION_DURATION", "MOVE_ANIMATION_DURATION", "getMOVE_ANIMATION_DURATION", "RECOVER_ANIMATION_DURATION", "getRECOVER_ANIMATION_DURATION", "TRANSLATE_ANIMATION_DURATION", "getTRANSLATE_ANIMATION_DURATION", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator$b */
    public static final class C8373b {
        private C8373b() {
        }

        /* renamed from: a */
        private final long m35653a() {
            return CardPropertyAnimator.f29716h;
        }

        /* renamed from: b */
        private final long m35655b() {
            return CardPropertyAnimator.f29717i;
        }

        /* renamed from: c */
        private final long m35657c() {
            return CardPropertyAnimator.f29718j;
        }

        /* renamed from: d */
        private final long m35659d() {
            return CardPropertyAnimator.f29719k;
        }

        /* renamed from: e */
        private final long m35661e() {
            return CardPropertyAnimator.f29720l;
        }

        /* renamed from: f */
        private final AccelerateInterpolator m35664f() {
            return CardPropertyAnimator.f29721m;
        }

        /* renamed from: g */
        private final long m35665g() {
            return CardPropertyAnimator.f29722n;
        }

        /* renamed from: h */
        private final C10459a m35668h() {
            return CardPropertyAnimator.f29723o;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardPropertyAnimator(@org.jetbrains.annotations.NotNull com.tinder.cardstack.view.CardViewHolder<?> r8) {
        /*
        r7 = this;
        r0 = "cardViewHolder";
        kotlin.jvm.internal.C2668g.b(r8, r0);
        r7.<init>();
        r7.f29729g = r8;
        r8 = com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator.State.STOPPED;
        r7.f29724b = r8;
        r8 = new com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator$a;
        r1 = 0;
        r2 = 0;
        r4 = 0;
        r5 = 7;
        r6 = 0;
        r0 = r8;
        r0.<init>(r1, r2, r4, r5, r6);
        r7.f29725c = r8;
        r8 = 2;
        r8 = new float[r8];
        r8 = {0, 1065353216};
        r8 = android.animation.ValueAnimator.ofFloat(r8);
        r7.f29727e = r8;
        r8 = new java.util.ArrayList;
        r8.<init>();
        r8 = (java.util.List) r8;
        r7.f29728f = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator.<init>(com.tinder.cardstack.view.CardViewHolder):void");
    }

    @NotNull
    /* renamed from: e */
    public final CardViewHolder<?> m35691e() {
        return this.f29729g;
    }

    @NotNull
    /* renamed from: a */
    public final State m35681a() {
        return this.f29724b;
    }

    /* renamed from: a */
    private final void m35670a(C8372a c8372a) {
        if ((C2668g.a(this.f29725c, c8372a) ^ 1) != 0) {
            this.f29726d = true;
            this.f29725c = c8372a;
        }
    }

    /* renamed from: a */
    public final void m35683a(@NotNull C8365a c8365a, @NotNull C8365a c8365a2) {
        C2668g.b(c8365a, "firstTouchPoint");
        C2668g.b(c8365a2, "delta");
        m35670a(new C8372a(new C10460b(C8368a.f29706a.m35630a(this.f29729g), c8365a, c8365a2), f29715a.m35653a(), null, 4, null));
    }

    /* renamed from: a */
    public final void m35684a(@NotNull C8365a c8365a, @NotNull C8365a c8365a2, long j) {
        C2668g.b(c8365a, "delta");
        C2668g.b(c8365a2, "firstTouchPoint");
        C8368a a = C8368a.f29706a.m35630a(this.f29729g);
        m35670a(new C8372a(new C10462d(a, a.m35633a().m35606a(c8365a), c8365a2), Math.max(Math.min(f29715a.m35655b(), j), f29715a.m35657c()), (Interpolator) new LinearInterpolator()));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m35671a(CardPropertyAnimator cardPropertyAnimator, C8365a c8365a, int i, Object obj) {
        if ((i & 1) != 0) {
            c8365a = C8365a.f29697a.m35602a();
        }
        cardPropertyAnimator.m35682a(c8365a);
    }

    /* renamed from: a */
    public final void m35682a(@NotNull C8365a c8365a) {
        C2668g.b(c8365a, "endPosition");
        m35670a(new C8372a(new C10461c(C8368a.f29706a.m35630a(this.f29729g), c8365a, 0.0f), f29715a.m35659d(), null, 4, null));
    }

    /* renamed from: b */
    public final void m35687b(@NotNull C8365a c8365a, @NotNull C8365a c8365a2) {
        C2668g.b(c8365a, "fromPosition");
        C2668g.b(c8365a2, "endPosition");
        m35670a(new C8372a(new C10461c(C8368a.m35631a(C8368a.f29706a.m35630a(this.f29729g), c8365a, 0.0f, 0.0f, 0.0f, 14, null), c8365a2, 0.0f), f29715a.m35659d(), null, 4, null));
    }

    /* renamed from: c */
    public final void m35689c(@NotNull C8365a c8365a, @NotNull C8365a c8365a2) {
        C2668g.b(c8365a, "fromPosition");
        C2668g.b(c8365a2, "endPosition");
        m35670a(new C8372a(new C10463e(C8368a.m35631a(C8368a.f29706a.m35630a(this.f29729g), c8365a, 0.0f, 0.0f, 0.0f, 14, null), c8365a2, 0.0f), f29715a.m35661e(), new LinearInterpolator()));
    }

    /* renamed from: b */
    public final void m35686b() {
        m35669a(State.STOPPED);
    }

    @NotNull
    /* renamed from: c */
    public final C8371b m35688c() {
        return this.f29725c.m35650a();
    }

    /* renamed from: a */
    public final void m35685a(@NotNull OnCompleteListener onCompleteListener) {
        C2668g.b(onCompleteListener, "onCompleteListener");
        this.f29728f.add(onCompleteListener);
    }

    @NotNull
    /* renamed from: d */
    public final C8368a m35690d() {
        C8371b a;
        ValueAnimator valueAnimator;
        if (this.f29726d) {
            m35680n();
            this.f29726d = false;
        }
        ValueAnimator valueAnimator2 = this.f29727e;
        C2668g.a(valueAnimator2, "valueAnimator");
        if (!valueAnimator2.isStarted()) {
            valueAnimator2 = this.f29727e;
            C2668g.a(valueAnimator2, "valueAnimator");
            if (!valueAnimator2.isRunning()) {
                m35669a(State.STOPPED);
                a = this.f29725c.m35650a();
                valueAnimator = this.f29727e;
                C2668g.a(valueAnimator, "valueAnimator");
                return a.mo9329a(valueAnimator.getAnimatedFraction());
            }
        }
        m35669a(State.RUNNING);
        a = this.f29725c.m35650a();
        valueAnimator = this.f29727e;
        C2668g.a(valueAnimator, "valueAnimator");
        return a.mo9329a(valueAnimator.getAnimatedFraction());
    }

    /* renamed from: a */
    private final void m35669a(State state) {
        if (!C2668g.a(this.f29724b, state)) {
            this.f29724b = state;
            if (C8374a.f29730a[this.f29724b.ordinal()] == 1) {
                this.f29727e.cancel();
                for (OnCompleteListener onComplete : (Iterable) this.f29728f) {
                    onComplete.onComplete();
                }
                this.f29728f.clear();
            }
        }
    }

    /* renamed from: n */
    private final void m35680n() {
        ValueAnimator valueAnimator = this.f29727e;
        C2668g.a(valueAnimator, "valueAnimator");
        valueAnimator.setInterpolator(this.f29725c.m35652c());
        valueAnimator = this.f29727e;
        C2668g.a(valueAnimator, "valueAnimator");
        valueAnimator.setDuration(this.f29725c.m35651b());
        this.f29727e.cancel();
        this.f29727e.start();
    }
}
