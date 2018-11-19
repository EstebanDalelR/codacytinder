package com.tinder.shimmy.shimmer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.tinder.shimmy.p411a.C14945d;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Canvas;", "invoke"}, k = 3, mv = {1, 1, 9})
final class ShimmerEngine$drawShimmer$$inlined$readAlphaMask$lambda$1 extends Lambda implements Function1<Canvas, C15813i> {
    /* renamed from: a */
    final /* synthetic */ Bitmap f58483a;
    /* renamed from: b */
    final /* synthetic */ C14945d f58484b;
    /* renamed from: c */
    final /* synthetic */ ObjectRef f58485c;
    /* renamed from: d */
    final /* synthetic */ C14945d f58486d;
    /* renamed from: e */
    final /* synthetic */ int[] f58487e;
    /* renamed from: f */
    final /* synthetic */ float[] f58488f;
    /* renamed from: g */
    final /* synthetic */ C14963d f58489g;
    /* renamed from: h */
    final /* synthetic */ float f58490h;

    ShimmerEngine$drawShimmer$$inlined$readAlphaMask$lambda$1(Bitmap bitmap, C14945d c14945d, ObjectRef objectRef, C14945d c14945d2, int[] iArr, float[] fArr, C14963d c14963d, float f) {
        this.f58483a = bitmap;
        this.f58484b = c14945d;
        this.f58485c = objectRef;
        this.f58486d = c14945d2;
        this.f58487e = iArr;
        this.f58488f = fArr;
        this.f58489g = c14963d;
        this.f58490h = f;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67327a((Canvas) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67327a(@NotNull Canvas canvas) {
        C2668g.b(canvas, "it");
        this.f58489g.m56515a(canvas);
        this.f58489g.m56516a(canvas, this.f58483a, this.f58484b, (C14945d) this.f58485c.f49022a, this.f58486d, this.f58487e, this.f58488f);
    }
}
