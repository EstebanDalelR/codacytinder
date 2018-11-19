package com.tinder.shimmy;

import android.graphics.Canvas;
import android.view.View;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "canvas", "Landroid/graphics/Canvas;", "invoke"}, k = 3, mv = {1, 1, 9})
public final class ShimmerFrameLayout$drawChild$$inlined$onDrawChild$1 extends Lambda implements Function1<Canvas, C15813i> {
    /* renamed from: a */
    final /* synthetic */ ShimmerFrameLayout f58471a;
    /* renamed from: b */
    final /* synthetic */ View f58472b;
    /* renamed from: c */
    final /* synthetic */ long f58473c;

    public ShimmerFrameLayout$drawChild$$inlined$onDrawChild$1(ShimmerFrameLayout shimmerFrameLayout, View view, long j) {
        this.f58471a = shimmerFrameLayout;
        this.f58472b = view;
        this.f58473c = j;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67325a((Canvas) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67325a(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        ShimmerFrameLayout.a(this.f58471a, canvas, this.f58472b, this.f58473c);
    }
}
