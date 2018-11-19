package com.tinder.places.carousel.view;

import android.view.View;
import com.tinder.places.carousel.view.CarouselLayoutManager.LayoutTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselZoomLayoutTransformer;", "Lcom/tinder/places/carousel/view/CarouselLayoutManager$LayoutTransformer;", "()V", "calculateTranslateX", "", "width", "", "scale", "translateFactor", "diff", "getReverseScale", "transform", "Lcom/tinder/places/carousel/view/CarouselItemTransformation;", "child", "Landroid/view/View;", "itemPositionToCenterDiff", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.view.c */
public final class C12330c implements LayoutTransformer {
    /* renamed from: a */
    public static final C10201a f39924a = new C10201a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselZoomLayoutTransformer$Companion;", "", "()V", "calculateScale", "", "itemPositionToCenterDiff", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.c$a */
    public static final class C10201a {
        private C10201a() {
        }

        /* renamed from: a */
        public final float m41512a(float f) {
            return 1.0f - (Math.abs(f) * 0.14f);
        }
    }

    /* renamed from: a */
    private final float m48712a(float f) {
        return f - 3.44f;
    }

    @NotNull
    public C10200b transform(@NotNull View view, float f) {
        C2668g.b(view, "child");
        float a = f39924a.m41512a(f);
        if (f < ((float) 0)) {
            view = m48713a(view.getMeasuredWidth(), a, 10.2f, f);
        } else {
            view = m48713a(view.getMeasuredWidth(), a, 1.2f, f);
        }
        return new C10200b(a, a, Math.signum(f) * view, null);
    }

    /* renamed from: a */
    private final float m48713a(int i, float f, float f2, float f3) {
        f2 = (f2 * ((float) i)) * -1086828052;
        return f3 > 1073741824 ? f2 * (m48712a(f3) - 1065353216) : f2 * (f - 1.0f);
    }
}
