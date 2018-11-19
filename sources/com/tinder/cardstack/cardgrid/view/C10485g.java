package com.tinder.cardstack.cardgrid.view;

import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector.SwipeActionRecognizer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/SwipeActionRecognizerImpl;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$SwipeActionRecognizer;", "configuration", "Lcom/tinder/cardstack/cardgrid/view/SwipeActionRecognizerImpl$Configuration;", "swipeDirectionRecognizer", "Lcom/tinder/cardstack/cardgrid/view/SwipeDirectionRecognizer;", "(Lcom/tinder/cardstack/cardgrid/view/SwipeActionRecognizerImpl$Configuration;Lcom/tinder/cardstack/cardgrid/view/SwipeDirectionRecognizer;)V", "findSwipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "isHorizontalFling", "", "Lcom/tinder/cardstack/cardgrid/model/Point;", "isVerticalFling", "Configuration", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.view.g */
public final class C10485g implements SwipeActionRecognizer {
    /* renamed from: a */
    private final C8388a f34099a;
    /* renamed from: b */
    private final SwipeDirectionRecognizer f34100b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/SwipeActionRecognizerImpl$Configuration;", "", "flingEscapeVelocity", "", "minThresholdForSwipe", "minThresholdForSwipeWhenFling", "(FFF)V", "getFlingEscapeVelocity", "()F", "getMinThresholdForSwipe", "getMinThresholdForSwipeWhenFling", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.g$a */
    public static final class C8388a {
        /* renamed from: a */
        private final float f29765a;
        /* renamed from: b */
        private final float f29766b;
        /* renamed from: c */
        private final float f29767c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8388a) {
                    C8388a c8388a = (C8388a) obj;
                    if (Float.compare(this.f29765a, c8388a.f29765a) == 0 && Float.compare(this.f29766b, c8388a.f29766b) == 0 && Float.compare(this.f29767c, c8388a.f29767c) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.f29765a) * 31) + Float.floatToIntBits(this.f29766b)) * 31) + Float.floatToIntBits(this.f29767c);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Configuration(flingEscapeVelocity=");
            stringBuilder.append(this.f29765a);
            stringBuilder.append(", minThresholdForSwipe=");
            stringBuilder.append(this.f29766b);
            stringBuilder.append(", minThresholdForSwipeWhenFling=");
            stringBuilder.append(this.f29767c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8388a(float f, float f2, float f3) {
            this.f29765a = f;
            this.f29766b = f2;
            this.f29767c = f3;
        }

        /* renamed from: a */
        public final float m35756a() {
            return this.f29765a;
        }

        /* renamed from: b */
        public final float m35757b() {
            return this.f29766b;
        }

        /* renamed from: c */
        public final float m35758c() {
            return this.f29767c;
        }
    }

    public C10485g(@NotNull C8388a c8388a, @NotNull SwipeDirectionRecognizer swipeDirectionRecognizer) {
        C2668g.b(c8388a, "configuration");
        C2668g.b(swipeDirectionRecognizer, "swipeDirectionRecognizer");
        this.f34099a = c8388a;
        this.f34100b = swipeDirectionRecognizer;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    public com.tinder.cardstack.model.SwipeDirection findSwipeDirection(@org.jetbrains.annotations.NotNull com.tinder.cardstack.cardgrid.swipe.p186a.C8378a r8) {
        /*
        r7 = this;
        r0 = "pointer";
        kotlin.jvm.internal.C2668g.b(r8, r0);
        r0 = r8.m35732f();
        r8 = r8.m35733g();
        if (r8 == 0) goto L_0x0084;
    L_0x000f:
        r1 = r7.f34100b;
        r1 = r1.m35742a(r0);
        r2 = r7.f34100b;
        r2 = r2.m35742a(r8);
        r2 = kotlin.jvm.internal.C2668g.a(r1, r2);
        r3 = 1;
        r2 = r2 ^ r3;
        if (r2 == 0) goto L_0x0026;
    L_0x0023:
        r8 = com.tinder.cardstack.model.SwipeDirection.NONE;
        return r8;
    L_0x0026:
        r2 = r0.m35612e();
        r2 = java.lang.Math.abs(r2);
        r0 = r0.m35613f();
        r0 = java.lang.Math.abs(r0);
        r4 = r7.m42359b(r8);
        r8 = r7.m42358a(r8);
        r5 = com.tinder.cardstack.cardgrid.view.C8389h.f29768a;
        r6 = r1.ordinal();
        r5 = r5[r6];
        r6 = 0;
        switch(r5) {
            case 1: goto L_0x0067;
            case 2: goto L_0x0067;
            case 3: goto L_0x004b;
            case 4: goto L_0x004b;
            default: goto L_0x004a;
        };
    L_0x004a:
        goto L_0x007e;
    L_0x004b:
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x007e;
    L_0x004f:
        r2 = r7.f34099a;
        r2 = r2.m35757b();
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x0065;
    L_0x0059:
        if (r8 == 0) goto L_0x007e;
    L_0x005b:
        r8 = r7.f34099a;
        r8 = r8.m35758c();
        r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r8 <= 0) goto L_0x007e;
    L_0x0065:
        r6 = 1;
        goto L_0x007e;
    L_0x0067:
        r8 = r7.f34099a;
        r8 = r8.m35757b();
        r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r8 > 0) goto L_0x0065;
    L_0x0071:
        if (r4 == 0) goto L_0x007e;
    L_0x0073:
        r8 = r7.f34099a;
        r8 = r8.m35758c();
        r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r8 <= 0) goto L_0x007e;
    L_0x007d:
        goto L_0x0065;
    L_0x007e:
        if (r6 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0083;
    L_0x0081:
        r1 = com.tinder.cardstack.model.SwipeDirection.NONE;
    L_0x0083:
        return r1;
    L_0x0084:
        r8 = com.tinder.cardstack.model.SwipeDirection.NONE;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.cardstack.cardgrid.view.g.findSwipeDirection(com.tinder.cardstack.cardgrid.swipe.a.a):com.tinder.cardstack.model.SwipeDirection");
    }

    /* renamed from: a */
    private final boolean m42358a(@NotNull C8365a c8365a) {
        float abs = Math.abs(c8365a.m35612e());
        c8365a = Math.abs(c8365a.m35613f());
        return (c8365a <= this.f34099a.m35756a() || c8365a < abs) ? null : true;
    }

    /* renamed from: b */
    private final boolean m42359b(@NotNull C8365a c8365a) {
        float abs = Math.abs(c8365a.m35612e());
        return (abs <= this.f34099a.m35756a() || abs < Math.abs(c8365a.m35613f())) ? null : true;
    }
}
