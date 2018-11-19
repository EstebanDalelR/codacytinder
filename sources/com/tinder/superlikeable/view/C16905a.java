package com.tinder.superlikeable.view;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableFlingDetector;", "Lcom/tinder/superlikeable/view/FlingDetector;", "flingEscapeVelocity", "", "(F)V", "isFling", "", "velocityX", "velocityY", "isFlingDirectionUpward", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.view.a */
public final class C16905a implements FlingDetector {
    /* renamed from: a */
    private final float f52094a;

    /* renamed from: a */
    private final boolean m62539a(float f) {
        return f < ((float) null);
    }

    public C16905a(float f) {
        this.f52094a = f;
    }

    public boolean isFling(float f, float f2) {
        return m62539a(f2) && Math.abs(f2) >= this.f52094a && Math.abs(f2) >= Math.abs(f);
    }
}
