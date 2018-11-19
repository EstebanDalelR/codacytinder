package com.tinder.cardstack.cardgrid.p183a;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0006J\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0002J\u0006\u0010\u0016\u001a\u00020\u0000J\u0011\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0002J\u0006\u0010\u0018\u001a\u00020\u0006J\u0011\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/tinder/cardstack/cardgrid/model/Point;", "", "x", "", "y", "(II)V", "", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "div", "other", "equals", "", "hashCode", "isZero", "magnitude", "minus", "normalized", "plus", "rotationDegree", "times", "toString", "", "Companion", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.a.a */
public final class C8365a {
    /* renamed from: a */
    public static final C8364a f29697a = new C8364a();
    @NotNull
    /* renamed from: d */
    private static final C8365a f29698d = new C8365a(0.0f, 0.0f);
    /* renamed from: b */
    private final float f29699b;
    /* renamed from: c */
    private final float f29700c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/cardstack/cardgrid/model/Point$Companion;", "", "()V", "zero", "Lcom/tinder/cardstack/cardgrid/model/Point;", "getZero", "()Lcom/tinder/cardstack/cardgrid/model/Point;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.a.a$a */
    public static final class C8364a {
        private C8364a() {
        }

        @NotNull
        /* renamed from: a */
        public final C8365a m35602a() {
            return C8365a.f29698d;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8365a) {
                C8365a c8365a = (C8365a) obj;
                if (Float.compare(this.f29699b, c8365a.f29699b) == 0 && Float.compare(this.f29700c, c8365a.f29700c) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final float m35614h() {
        return this.f29699b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f29699b) * 31) + Float.floatToIntBits(this.f29700c);
    }

    /* renamed from: i */
    public final float m35615i() {
        return this.f29700c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Point(x=");
        stringBuilder.append(this.f29699b);
        stringBuilder.append(", y=");
        stringBuilder.append(this.f29700c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8365a(float f, float f2) {
        this.f29699b = f;
        this.f29700c = f2;
    }

    /* renamed from: e */
    public final float m35612e() {
        return this.f29699b;
    }

    /* renamed from: f */
    public final float m35613f() {
        return this.f29700c;
    }

    public C8365a(int i, int i2) {
        this((float) i, (float) i2);
    }

    @NotNull
    /* renamed from: a */
    public final C8365a m35606a(@NotNull C8365a c8365a) {
        C2668g.b(c8365a, "other");
        return new C8365a(this.f29699b + c8365a.f29699b, this.f29700c + c8365a.f29700c);
    }

    @NotNull
    /* renamed from: b */
    public final C8365a m35609b(@NotNull C8365a c8365a) {
        C2668g.b(c8365a, "other");
        return new C8365a(this.f29699b - c8365a.f29699b, this.f29700c - c8365a.f29700c);
    }

    @NotNull
    /* renamed from: a */
    public final C8365a m35605a(float f) {
        return new C8365a(this.f29699b * f, this.f29700c * f);
    }

    @NotNull
    /* renamed from: b */
    public final C8365a m35608b(float f) {
        return new C8365a(this.f29699b / f, this.f29700c / f);
    }

    /* renamed from: a */
    public final float m35604a() {
        return (float) Math.sqrt(Math.pow((double) this.f29699b, 2.0d) + Math.pow((double) this.f29700c, 2.0d));
    }

    /* renamed from: b */
    public final float m35607b() {
        return (((float) Math.toDegrees(Math.atan2((double) (-this.f29700c), (double) this.f29699b))) + 360.0f) % 360.0f;
    }

    /* renamed from: c */
    public final boolean m35610c() {
        return C2668g.a(this, f29697a.m35602a());
    }

    @NotNull
    /* renamed from: d */
    public final C8365a m35611d() {
        return m35608b(m35604a());
    }
}
