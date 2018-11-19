package com.tinder.reactions.p389d;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J.\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J2\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/tinder/reactions/utils/GrandGestureAnimationUtils;", "", "()V", "normalize", "", "originalValue", "min", "max", "normalizeAndScale", "scaledMin", "scaledMax", "scale", "baseMin", "baseMax", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.d.a */
public final class C14618a {
    /* renamed from: a */
    public static final C14618a f46122a = new C14618a();

    /* renamed from: a */
    public final float m55772a(float f, float f2, float f3) {
        return (f - f2) / (f3 - f2);
    }

    /* renamed from: b */
    public final float m55774b(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f4) * (f - f2)) / (f3 - f2)) + f4;
    }

    private C14618a() {
    }

    /* renamed from: a */
    public final float m55773a(float f, float f2, float f3, float f4, float f5) {
        return C14618a.m55771a(this, m55772a(f, f3, f2), 0.0f, 0.0f, f4, f5, 6, null);
    }

    /* renamed from: a */
    public static /* synthetic */ float m55771a(C14618a c14618a, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        return c14618a.m55774b(f, (i & 2) != null ? 0.0f : f2, (i & 4) != null ? 1.0f : f3, f4, f5);
    }
}
