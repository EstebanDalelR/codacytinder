package com.tinder.cardstack.swipe;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.C0597f;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tinder.cardstack.cardstack.CardStackSwipeHelper.OnPreSwipeListener;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.p180a.p181a.C8360a;
import com.tinder.cardstack.swipe.CardAnimation.AnimationType;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.cardstack.swipe.c */
public abstract class C10502c implements OnItemTouchListener {
    /* renamed from: a */
    private static final String f34150a = "c";
    /* renamed from: c */
    private static final OnPreSwipeListener f34151c = new C105011();
    @Nullable
    /* renamed from: b */
    protected C8402e f34152b;
    @NonNull
    /* renamed from: d */
    private final C8401d f34153d;
    @NonNull
    /* renamed from: e */
    private final CardAnimator f34154e;
    @NonNull
    /* renamed from: f */
    private final C8397b f34155f;
    @NonNull
    /* renamed from: g */
    private final PointF f34156g = new PointF();
    @NonNull
    /* renamed from: h */
    private OnPreSwipeListener f34157h = f34151c;
    @Nullable
    /* renamed from: i */
    private VelocityTracker f34158i;

    /* renamed from: com.tinder.cardstack.swipe.c$1 */
    static class C105011 implements OnPreSwipeListener {
        public boolean onPreSwipe(int i, @NonNull SwipeDirection swipeDirection) {
            return false;
        }

        C105011() {
        }
    }

    @NonNull
    /* renamed from: a */
    protected abstract RecyclerView mo11000a();

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public C10502c(@NonNull C8401d c8401d, @NonNull CardAnimator cardAnimator, @NonNull C8397b c8397b) {
        this.f34153d = c8401d;
        this.f34154e = cardAnimator;
        this.f34155f = c8397b;
    }

    /* renamed from: a */
    public void m42458a(@NonNull OnPreSwipeListener onPreSwipeListener) {
        this.f34157h = onPreSwipeListener;
    }

    @Nullable
    /* renamed from: b */
    public C8402e m42460b() {
        return this.f34152b;
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (C0597f.a(motionEvent)) {
            case null:
                m42464e();
                m42463d();
                m42456a(motionEvent);
                if (this.f34152b == null) {
                    m42452i();
                    break;
                }
                m42457a(this.f34152b.m35856a().itemView, motionEvent);
                break;
            case 1:
            case 3:
                m42461b(motionEvent);
                break;
            case 2:
                if (this.f34152b != null) {
                    onTouchEvent(mo11000a(), motionEvent);
                    break;
                }
                break;
            default:
                recyclerView = f34150a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unhandled event:");
                stringBuilder.append(motionEvent);
                Log.w(recyclerView, stringBuilder.toString());
                break;
        }
        return this.f34152b != null ? true : null;
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f34152b == null) {
            recyclerView = f34150a;
            motionEvent = new StringBuilder();
            motionEvent.append("OnTouchEvent received without ");
            motionEvent.append(C8402e.class);
            motionEvent.append("::");
            motionEvent.append(this.f34152b);
            Log.w(recyclerView, motionEvent.toString());
            return;
        }
        recyclerView = C0597f.a(motionEvent);
        int findPointerIndex = motionEvent.findPointerIndex(this.f34152b.m35864e());
        if (recyclerView != 6) {
            switch (recyclerView) {
                case 1:
                case 3:
                    m42461b(motionEvent);
                    break;
                case 2:
                    if (findPointerIndex >= 0) {
                        m42441a(this.f34156g, motionEvent, findPointerIndex);
                        if (this.f34156g.x != null || this.f34156g.y != null) {
                            this.f34152b.m35857a(this.f34156g.x);
                            this.f34152b.m35861b(this.f34156g.y);
                            if (this.f34155f.m35828a(this.f34152b, this.f34153d) == null && this.f34152b.m35867h() == null) {
                                this.f34152b.m35859a(true);
                            }
                            mo11000a().invalidate();
                            break;
                        }
                        return;
                    }
                    return;
                    break;
                default:
                    recyclerView = f34150a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unhandled event:");
                    stringBuilder.append(motionEvent);
                    Log.w(recyclerView, stringBuilder.toString());
                    break;
            }
        } else if (motionEvent.getPointerId(C0597f.b(motionEvent)) == this.f34152b.m35864e()) {
            m42445c(motionEvent);
        }
        m42448e(motionEvent);
    }

    /* renamed from: a */
    public void m42459a(boolean z) {
        this.f34152b = null;
        if (z) {
            m42452i();
        }
    }

    /* renamed from: a */
    protected void m42456a(MotionEvent motionEvent) {
        if (this.f34152b != null) {
            motionEvent = f34150a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("trying to findAndSelectViewHolder when activeTouchPointer is not null: ");
            stringBuilder.append(this.f34152b);
            Log.w(motionEvent, stringBuilder.toString());
        } else if (this.f34154e.m35818c()) {
            Log.w(f34150a, "findAndSelectViewHolder failed because we have paused animations");
        } else {
            ViewHolder a = this.f34155f.m35825a(motionEvent, mo11000a(), this.f34154e);
            if (a != null) {
                CardAnimation a2 = this.f34154e.m35811a(a);
                if (a2 == null || a2.m35797i() == AnimationType.SWIPE_OUT) {
                    this.f34152b = m42454a(a, motionEvent);
                } else {
                    float x = motionEvent.getX() - (motionEvent.getX() - a2.m35795g());
                    float y = motionEvent.getY() - (motionEvent.getY() - a2.m35796h());
                    this.f34152b = m42455a(a2, motionEvent);
                    this.f34152b.m35857a(x);
                    this.f34152b.m35861b(y);
                    this.f34154e.m35817b(a);
                }
                m42464e();
                mo11000a().invalidate();
            }
        }
    }

    @NonNull
    /* renamed from: a */
    protected C8402e m42455a(@NonNull CardAnimation cardAnimation, @NonNull MotionEvent motionEvent) {
        ViewHolder a = cardAnimation.m35783a();
        float x = motionEvent.getX() - cardAnimation.m35795g();
        float y = motionEvent.getY() - cardAnimation.m35796h();
        if (cardAnimation.m35806r()) {
            cardAnimation = cardAnimation.m35789b();
        } else {
            cardAnimation = new PointF(motionEvent.getX(), motionEvent.getY());
        }
        return new C8402e(a, cardAnimation, x, y, motionEvent.getPointerId(0));
    }

    @NonNull
    /* renamed from: a */
    protected C8402e m42454a(@NonNull ViewHolder viewHolder, @NonNull MotionEvent motionEvent) {
        return new C8402e(viewHolder, motionEvent);
    }

    /* renamed from: b */
    protected void m42461b(@NonNull MotionEvent motionEvent) {
        m42447d(motionEvent);
        m42451h();
    }

    /* renamed from: c */
    public void m42462c() {
        if (this.f34152b != null) {
            this.f34154e.m35814a(this.f34152b.m35856a(), mo11000a(), this.f34152b.m35860b());
        }
        m42459a(false);
    }

    /* renamed from: c */
    private void m42445c(@NonNull MotionEvent motionEvent) {
        if (this.f34152b != null) {
            ViewHolder a = this.f34152b.m35856a();
            m42443b(a.itemView, motionEvent);
            this.f34154e.m35814a(a, mo11000a(), this.f34152b.m35860b());
        }
        m42459a((boolean) null);
    }

    /* renamed from: d */
    private void m42447d(@NonNull MotionEvent motionEvent) {
        if (this.f34152b != null) {
            ViewHolder a = this.f34152b.m35856a();
            boolean h = this.f34152b.m35867h();
            if (!this.f34155f.m35828a(this.f34152b, this.f34153d) || h) {
                m42443b(a.itemView, motionEvent);
                motionEvent = this.f34155f.m35826a(a, mo11000a(), this.f34154e);
                h = m42444b(this.f34152b);
                if (motionEvent == null || !h) {
                    this.f34154e.m35814a(a, mo11000a(), this.f34152b.m35860b());
                } else {
                    motionEvent = this.f34152b.m35862c();
                    float d = this.f34152b.m35863d();
                    float f = 0.0f;
                    float xVelocity = this.f34158i == null ? 0.0f : this.f34158i.getXVelocity();
                    if (this.f34158i != null) {
                        f = this.f34158i.getYVelocity();
                    }
                    if (this.f34157h.onPreSwipe(a.getAdapterPosition(), this.f34153d.m35853b(motionEvent, d, xVelocity, f)) != null) {
                        m42442a(this.f34152b);
                    } else {
                        this.f34154e.m35814a(a, mo11000a(), this.f34152b.m35860b());
                    }
                }
            } else {
                this.f34154e.m35814a(a, mo11000a(), this.f34152b.m35860b());
                m42446c(a.itemView, motionEvent);
            }
        }
        m42459a(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m42442a(@android.support.annotation.NonNull com.tinder.cardstack.swipe.C8402e r17) {
        /*
        r16 = this;
        r6 = r16;
        r0 = r17.m35862c();
        r1 = r17.m35863d();
        r8 = r17.m35856a();
        r2 = r8.itemView;
        r11 = android.support.v4.view.ViewCompat.i(r2);
        r12 = android.support.v4.view.ViewCompat.j(r2);
        r3 = r2.getTranslationX();
        r2 = r2.getTranslationY();
        r4 = r6.f34158i;
        r5 = r17;
        r4 = r6.m42439a(r5, r4);
        r7 = r6.f34153d;
        r0 = r7.m35855c(r0, r1);
        r1 = com.tinder.cardstack.swipe.C10502c.C83982.f29813a;
        r7 = r0.ordinal();
        r1 = r1[r7];
        r7 = 0;
        switch(r1) {
            case 1: goto L_0x0083;
            case 2: goto L_0x006c;
            case 3: goto L_0x0056;
            default: goto L_0x003a;
        };
    L_0x003a:
        r1 = f34150a;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r9 = "Unhandled swipe direction::";
        r4.append(r9);
        r4.append(r0);
        r0 = r4.toString();
        android.util.Log.w(r1, r0);
        r14 = r2;
        r13 = r3;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        goto L_0x009c;
    L_0x0056:
        r0 = new com.tinder.cardstack.a.f;
        r0.<init>();
        r0 = r0.endY();
        r7 = r0 - r12;
        r1 = r16.m42450g();
        r2 = java.lang.Math.abs(r0);
        r14 = r0;
        r13 = r3;
        goto L_0x009b;
    L_0x006c:
        r0 = new com.tinder.cardstack.a.d;
        r0.<init>();
        r0 = r0.endX();
        r7 = r0 - r11;
        r4 = r4 * r7;
        r4 = r4 + r12;
        r1 = r16.m42449f();
        r2 = java.lang.Math.abs(r0);
        goto L_0x0099;
    L_0x0083:
        r0 = new com.tinder.cardstack.a.b;
        r0.<init>();
        r0 = r0.endX();
        r7 = r0 - r11;
        r4 = r4 * r7;
        r4 = r4 + r12;
        r1 = r16.m42449f();
        r2 = java.lang.Math.abs(r0);
    L_0x0099:
        r13 = r0;
        r14 = r4;
    L_0x009b:
        r0 = r7;
    L_0x009c:
        r3 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r2 = r2 / r3;
        r10 = r17.m35860b();
        r15 = new com.tinder.cardstack.swipe.CardAnimation;
        r9 = com.tinder.cardstack.swipe.CardAnimation.AnimationType.SWIPE_OUT;
        r7 = r15;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14);
        r5 = java.lang.Math.abs(r0);
        r0 = java.lang.Math.max(r2, r1);
        r0 = r5 / r0;
        r7 = (long) r0;
        r0 = r6;
        r3 = r7;
        r0 = r0.m42440a(r1, r2, r3, r5);
        r15.m35784a(r7);
        r15.m35786a(r0);
        r0 = r6.f34154e;
        r0.m35815a(r15);
        r15.m35799k();
        r0 = r16.mo11000a();
        r0.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.cardstack.swipe.c.a(com.tinder.cardstack.swipe.e):void");
    }

    /* renamed from: b */
    private boolean m42444b(C8402e c8402e) {
        if (this.f34158i != null) {
            return this.f34155f.m35827a(c8402e, this.f34158i, this.f34153d);
        }
        C0001a.d("Check implementation: velocityTracker is Null::", new Object[0]);
        return false;
    }

    /* renamed from: a */
    private float m42439a(@NonNull C8402e c8402e, @Nullable VelocityTracker velocityTracker) {
        float c = c8402e.m35862c();
        c8402e = c == 0.0f ? null : c8402e.m35863d() / c;
        if (velocityTracker == null) {
            return c8402e;
        }
        c = velocityTracker.getXVelocity();
        return c != 0.0f ? velocityTracker.getYVelocity() / c : c8402e;
    }

    @NonNull
    /* renamed from: a */
    private Interpolator m42440a(float f, float f2, long j, float f3) {
        if (f < f2) {
            return new C8360a(f3, f, j);
        }
        return new LinearInterpolator();
    }

    /* renamed from: f */
    private float m42449f() {
        if (this.f34158i == null) {
            return 0.0f;
        }
        this.f34158i.computeCurrentVelocity(this.f34153d.m35852b());
        return Math.abs(this.f34158i.getXVelocity()) / 1000.0f;
    }

    /* renamed from: g */
    private float m42450g() {
        if (this.f34158i == null) {
            return 0.0f;
        }
        this.f34158i.computeCurrentVelocity(this.f34153d.m35852b());
        return Math.abs(this.f34158i.getYVelocity()) / 1000.0f;
    }

    /* renamed from: h */
    private void m42451h() {
        if (this.f34158i != null) {
            this.f34158i.recycle();
            this.f34158i = null;
        }
    }

    /* renamed from: d */
    protected void m42463d() {
        if (this.f34158i != null) {
            this.f34158i.recycle();
        }
        this.f34158i = VelocityTracker.obtain();
    }

    /* renamed from: e */
    private void m42448e(MotionEvent motionEvent) {
        if (this.f34158i != null) {
            this.f34158i.addMovement(motionEvent);
        }
    }

    /* renamed from: e */
    protected void m42464e() {
        mo11000a().requestDisallowInterceptTouchEvent(true);
    }

    /* renamed from: i */
    private void m42452i() {
        mo11000a().requestDisallowInterceptTouchEvent(false);
    }

    /* renamed from: a */
    protected void m42457a(@NonNull View view, @NonNull MotionEvent motionEvent) {
        if (C0597f.a(motionEvent) != 0) {
            String str = f34150a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ACTION_DOWN but received:");
            stringBuilder.append(motionEvent);
            Log.e(str, stringBuilder.toString());
            motionEvent.setAction(0);
        }
        view.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private void m42443b(@NonNull View view, @NonNull MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain(motionEvent);
        motionEvent.setAction(3);
        view.dispatchTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    /* renamed from: c */
    private void m42446c(@NonNull View view, @NonNull MotionEvent motionEvent) {
        int a = C0597f.a(motionEvent);
        if (!(a == 1 || a == 3)) {
            String str = f34150a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ACTION_UP or ACTION_CANCEL but received:");
            stringBuilder.append(motionEvent);
            Log.e(str, stringBuilder.toString());
            motionEvent.setAction(1);
        }
        view.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m42441a(@NonNull PointF pointF, @NonNull MotionEvent motionEvent, int i) {
        if (this.f34152b == null) {
            pointF.set(0.0f, 0.0f);
            return;
        }
        float x = motionEvent.getX(i);
        motionEvent = motionEvent.getY(i);
        i = x - this.f34152b.m35865f();
        float g = motionEvent - this.f34152b.m35866g();
        if (this.f34152b.m35862c() != 0.0f || this.f34152b.m35863d() != 0.0f) {
            pointF.set(i, g);
        } else if (this.f34153d.m35854b(i, g) != 0) {
            pointF.set(0.0f, 0.0f);
        } else {
            this.f34152b.m35858a(x, motionEvent);
            pointF.set(0.1f, 0.1f);
        }
    }
}
