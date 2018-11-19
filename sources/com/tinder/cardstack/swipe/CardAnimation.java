package com.tinder.cardstack.swipe;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.Set;
import p000a.p001a.C0001a;

public class CardAnimation implements AnimatorListener {
    /* renamed from: a */
    private static final String f29788a = "CardAnimation";
    @NonNull
    /* renamed from: b */
    private final ViewHolder f29789b;
    /* renamed from: c */
    private final PointF f29790c;
    /* renamed from: d */
    private final ValueAnimator f29791d;
    /* renamed from: e */
    private final AnimationType f29792e;
    /* renamed from: f */
    private final Set<AnimatorListener> f29793f;
    /* renamed from: g */
    private final float f29794g;
    /* renamed from: h */
    private final float f29795h;
    /* renamed from: i */
    private final float f29796i;
    /* renamed from: j */
    private final float f29797j;
    /* renamed from: k */
    private final float f29798k;
    /* renamed from: l */
    private final float f29799l;
    /* renamed from: m */
    private State f29800m;
    /* renamed from: n */
    private float f29801n;
    /* renamed from: o */
    private float f29802o;
    /* renamed from: p */
    private float f29803p;
    /* renamed from: q */
    private long f29804q;
    /* renamed from: r */
    private float f29805r;
    /* renamed from: s */
    private boolean f29806s;
    /* renamed from: t */
    private boolean f29807t;

    /* renamed from: com.tinder.cardstack.swipe.CardAnimation$1 */
    class C83961 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ CardAnimation f29787a;

        C83961(CardAnimation cardAnimation) {
            this.f29787a = cardAnimation;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f29787a.m35778a((float) valueAnimator.getAnimatedFraction());
        }
    }

    public enum AnimationType {
        RECOVER,
        SWIPE_OUT
    }

    private enum State {
        INITIALIZED,
        RUNNING,
        FINISHED
    }

    public void onAnimationRepeat(Animator animator) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected CardAnimation(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ViewHolder r3, com.tinder.cardstack.swipe.CardAnimation.AnimationType r4, android.graphics.PointF r5, float r6, float r7, float r8, float r9, float r10, float r11) {
        /*
        r2 = this;
        r2.<init>();
        r0 = new java.util.HashSet;
        r1 = 4;
        r0.<init>(r1);
        r2.f29793f = r0;
        r0 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r2.f29804q = r0;
        r2.f29789b = r3;
        r2.f29792e = r4;
        r2.f29790c = r5;
        r2.f29794g = r6;
        r2.f29795h = r7;
        r2.f29796i = r8;
        r2.f29797j = r9;
        r4 = com.tinder.cardstack.swipe.CardAnimation.State.INITIALIZED;
        r2.f29800m = r4;
        r4 = 2;
        r4 = new float[r4];
        r4 = {0, 1065353216};
        r4 = android.animation.ValueAnimator.ofFloat(r4);
        r2.f29791d = r4;
        r4 = r2.f29791d;
        r5 = new com.tinder.cardstack.swipe.CardAnimation$1;
        r5.<init>(r2);
        r4.addUpdateListener(r5);
        r4 = r2.f29791d;
        r5 = new android.view.animation.AccelerateInterpolator;
        r5.<init>();
        r4.setInterpolator(r5);
        r4 = r2.f29791d;
        r5 = r2.f29804q;
        r4.setDuration(r5);
        r4 = r2.f29791d;
        r3 = r3.itemView;
        r4.setTarget(r3);
        r3 = r2.f29791d;
        r3.addListener(r2);
        r3 = 0;
        r2.m35778a(r3);
        r3 = -822083584; // 0xffffffffcf000000 float:-2.14748365E9 double:NaN;
        r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r4 == 0) goto L_0x0066;
    L_0x005e:
        r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r3 == 0) goto L_0x0066;
    L_0x0062:
        r3 = 1;
        r2.f29806s = r3;
        goto L_0x0089;
    L_0x0066:
        r3 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r3 == 0) goto L_0x0089;
    L_0x006a:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Invalid Rotation values: startRotation=";
        r4.append(r5);
        r4.append(r10);
        r5 = "::endRotation";
        r4.append(r5);
        r4.append(r11);
        r4 = r4.toString();
        r3.<init>(r4);
        throw r3;
    L_0x0089:
        r2.f29798k = r10;
        r2.f29799l = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.cardstack.swipe.CardAnimation.<init>(android.support.v7.widget.RecyclerView$ViewHolder, com.tinder.cardstack.swipe.CardAnimation$AnimationType, android.graphics.PointF, float, float, float, float, float, float):void");
    }

    CardAnimation(@NonNull ViewHolder viewHolder, AnimationType animationType, PointF pointF, float f, float f2, float f3, float f4) {
        this(viewHolder, animationType, pointF, f, f2, f3, f4, -2.14748365E9f, -2.14748365E9f);
    }

    @NonNull
    /* renamed from: a */
    public ViewHolder m35783a() {
        return this.f29789b;
    }

    /* renamed from: a */
    public void m35785a(@NonNull AnimatorListener animatorListener) {
        if (this.f29800m == State.FINISHED) {
            animatorListener = new StringBuilder();
            animatorListener.append("Attaching Listener after animation is over::");
            animatorListener.append(this);
            C0001a.d(animatorListener.toString(), new Object[0]);
            return;
        }
        this.f29793f.add(animatorListener);
    }

    /* renamed from: a */
    public void m35787a(@NonNull AnimatorUpdateListener animatorUpdateListener) {
        this.f29791d.addUpdateListener(animatorUpdateListener);
    }

    /* renamed from: b */
    public PointF m35789b() {
        return this.f29790c;
    }

    /* renamed from: c */
    float m35791c() {
        return this.f29794g;
    }

    /* renamed from: d */
    float m35792d() {
        return this.f29795h;
    }

    /* renamed from: e */
    float m35793e() {
        return this.f29796i;
    }

    /* renamed from: f */
    float m35794f() {
        return this.f29797j;
    }

    /* renamed from: g */
    public float m35795g() {
        return this.f29801n;
    }

    /* renamed from: h */
    public float m35796h() {
        return this.f29802o;
    }

    /* renamed from: i */
    public AnimationType m35797i() {
        return this.f29792e;
    }

    /* renamed from: j */
    float m35798j() {
        return this.f29805r;
    }

    /* renamed from: a */
    private void m35778a(float f) {
        this.f29805r = f;
    }

    /* renamed from: k */
    public void m35799k() {
        this.f29800m = State.RUNNING;
        this.f29789b.setIsRecyclable(false);
        m35807s();
        this.f29791d.start();
    }

    /* renamed from: l */
    void m35800l() {
        this.f29791d.cancel();
    }

    /* renamed from: m */
    CardAnimation m35801m() {
        m35807s();
        float f = this.f29801n;
        float f2 = this.f29802o;
        float f3 = this.f29796i;
        float f4 = this.f29797j;
        long max = Math.max(0, this.f29804q - ((long) (this.f29805r * ((float) this.f29804q))));
        CardAnimation cardAnimation = new CardAnimation(this.f29789b, this.f29792e, this.f29790c, f, f2, f3, f4);
        cardAnimation.m35784a(max);
        return cardAnimation;
    }

    /* renamed from: n */
    public boolean m35802n() {
        return this.f29807t;
    }

    /* renamed from: a */
    public void m35788a(boolean z) {
        this.f29807t = z;
    }

    /* renamed from: o */
    long m35803o() {
        return this.f29804q;
    }

    /* renamed from: a */
    public void m35784a(long j) {
        this.f29804q = j;
        this.f29791d.setDuration(j);
    }

    /* renamed from: p */
    public float m35804p() {
        return this.f29803p;
    }

    /* renamed from: q */
    boolean m35805q() {
        return this.f29806s;
    }

    /* renamed from: b */
    void m35790b(boolean z) {
        this.f29806s = z;
    }

    /* renamed from: a */
    public void m35786a(@NonNull TimeInterpolator timeInterpolator) {
        this.f29791d.setInterpolator(timeInterpolator);
    }

    /* renamed from: r */
    public boolean m35806r() {
        return this.f29800m == State.RUNNING;
    }

    /* renamed from: s */
    void m35807s() {
        if (this.f29794g == this.f29796i) {
            this.f29801n = ViewCompat.i(this.f29789b.itemView);
        } else {
            this.f29801n = this.f29794g + (this.f29805r * (this.f29796i - this.f29794g));
        }
        if (this.f29795h == this.f29797j) {
            this.f29802o = ViewCompat.j(this.f29789b.itemView);
        } else {
            this.f29802o = this.f29795h + (this.f29805r * (this.f29797j - this.f29795h));
        }
        if (!m35805q()) {
            return;
        }
        if (this.f29798k == this.f29799l) {
            this.f29803p = ViewCompat.n(m35783a().itemView);
        } else {
            this.f29803p = this.f29798k + (m35798j() * (this.f29799l - this.f29798k));
        }
    }

    public void onAnimationStart(Animator animator) {
        m35779a(animator);
    }

    public void onAnimationEnd(Animator animator) {
        if (m35806r()) {
            this.f29789b.setIsRecyclable(true);
            this.f29791d.removeAllUpdateListeners();
        }
        this.f29800m = State.FINISHED;
        m35781b(animator);
    }

    public void onAnimationCancel(Animator animator) {
        if (m35806r()) {
            this.f29789b.setIsRecyclable(true);
            this.f29791d.removeAllUpdateListeners();
        }
        m35778a(1.0f);
        this.f29800m = State.FINISHED;
        m35782c(animator);
    }

    /* renamed from: a */
    private void m35779a(Animator animator) {
        for (AnimatorListener onAnimationStart : this.f29793f) {
            onAnimationStart.onAnimationStart(animator);
        }
    }

    /* renamed from: b */
    private void m35781b(Animator animator) {
        for (AnimatorListener onAnimationEnd : this.f29793f) {
            onAnimationEnd.onAnimationEnd(animator);
        }
        this.f29793f.clear();
    }

    /* renamed from: c */
    private void m35782c(Animator animator) {
        for (AnimatorListener onAnimationCancel : this.f29793f) {
            onAnimationCancel.onAnimationCancel(animator);
        }
        this.f29793f.clear();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[vh=");
        stringBuilder.append(this.f29789b);
        stringBuilder.append(":animationType=");
        stringBuilder.append(this.f29792e);
        stringBuilder.append("::sx=");
        stringBuilder.append(this.f29794g);
        stringBuilder.append("::sy=");
        stringBuilder.append(this.f29795h);
        stringBuilder.append("::ex=");
        stringBuilder.append(this.f29796i);
        stringBuilder.append("::ey=");
        stringBuilder.append(this.f29797j);
        stringBuilder.append("::currX=");
        stringBuilder.append(this.f29801n);
        stringBuilder.append("::currY=");
        stringBuilder.append(this.f29802o);
        stringBuilder.append("::duration=");
        stringBuilder.append(this.f29804q);
        stringBuilder.append("::aimationState=");
        stringBuilder.append(this.f29800m);
        stringBuilder.append("::flaggedForRemoval=");
        stringBuilder.append(this.f29807t);
        stringBuilder.append("::hasRot=");
        stringBuilder.append(m35805q());
        stringBuilder.append("::fraction=");
        stringBuilder.append(this.f29805r);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
