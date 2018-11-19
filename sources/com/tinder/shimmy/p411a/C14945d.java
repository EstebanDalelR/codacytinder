package com.tinder.shimmy.p411a;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u000fJ\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/tinder/shimmy/utils/Size;", "", "width", "", "height", "(II)V", "", "(FF)V", "getHeight", "()F", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isZero", "toString", "", "Companion", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.a.d */
public final class C14945d {
    /* renamed from: a */
    public static final C14944a f46667a = new C14944a();
    @NotNull
    /* renamed from: d */
    private static final C14945d f46668d = new C14945d(0.0f, 0.0f, 3, null);
    /* renamed from: b */
    private final float f46669b;
    /* renamed from: c */
    private final float f46670c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/shimmy/utils/Size$Companion;", "", "()V", "zero", "Lcom/tinder/shimmy/utils/Size;", "getZero", "()Lcom/tinder/shimmy/utils/Size;", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.a.d$a */
    public static final class C14944a {
        private C14944a() {
        }

        @NotNull
        /* renamed from: a */
        public final C14945d m56450a() {
            return C14945d.f46668d;
        }
    }

    public C14945d() {
        this(0.0f, 0.0f, 3, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14945d) {
                C14945d c14945d = (C14945d) obj;
                if (Float.compare(this.f46669b, c14945d.f46669b) == 0 && Float.compare(this.f46670c, c14945d.f46670c) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f46669b) * 31) + Float.floatToIntBits(this.f46670c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size(width=");
        stringBuilder.append(this.f46669b);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f46670c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14945d(float f, float f2) {
        this.f46669b = f;
        this.f46670c = f2;
    }

    public /* synthetic */ C14945d(float f, float f2, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        this(f, f2);
    }

    /* renamed from: a */
    public final float m56452a() {
        return this.f46669b;
    }

    /* renamed from: b */
    public final float m56453b() {
        return this.f46670c;
    }

    public C14945d(int i, int i2) {
        this((float) i, (float) i2);
    }
}
