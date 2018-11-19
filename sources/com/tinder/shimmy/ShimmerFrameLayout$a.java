package com.tinder.shimmy;

import android.support.annotation.UiThread;
import com.tinder.shimmy.mask.AlphaMaskConfig.C14948a;
import com.tinder.shimmy.p411a.C14945d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\bJ\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$AlphaMaskRenderer;", "", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "alphaMaskConfigBuilder", "Lcom/tinder/shimmy/mask/AlphaMaskConfig$Builder;", "onDrawChild", "", "child", "Landroid/view/View;", "drawChild", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "onEndDispatchDraw", "onStartDispatchDraw", "shimmy_release"}, k = 1, mv = {1, 1, 9})
final class ShimmerFrameLayout$a {
    /* renamed from: a */
    final /* synthetic */ ShimmerFrameLayout f46658a;
    /* renamed from: b */
    private C14948a f46659b;

    public ShimmerFrameLayout$a(ShimmerFrameLayout shimmerFrameLayout) {
        this.f46658a = shimmerFrameLayout;
    }

    @UiThread
    /* renamed from: a */
    public final void m56432a() {
        this.f46659b = new C14948a(new C14945d(this.f46658a.getWidth(), this.f46658a.getHeight()));
    }

    @UiThread
    /* renamed from: b */
    public final void m56433b() {
        C14948a c14948a = this.f46659b;
        if (c14948a != null) {
            ShimmerFrameLayout.c(this.f46658a).m56474a(c14948a.m56460a());
            this.f46659b = (C14948a) null;
        }
    }
}
