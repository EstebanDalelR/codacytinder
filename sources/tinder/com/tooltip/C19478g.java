package tinder.com.tooltip;

import android.graphics.Point;
import android.support.annotation.DimenRes;
import android.view.View;
import com.mapbox.mapboxsdk.style.layers.Property;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import tinder.com.tooltip.Tooltip.C19464b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0004H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0004H\u0000\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0004\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"cacheArray", "", "getDimen", "", "Landroid/view/View;", "dimen", "", "getLocationOnScreen", "Landroid/graphics/Point;", "getViewAbsolutePosition", "viewPosition", "point", "getViewPositionsForTooltip", "Ltinder/com/tooltip/Tooltip$ViewPositions;", "hasSize", "", "scale", "", "value", "tooltip_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: tinder.com.tooltip.g */
public final class C19478g {
    /* renamed from: a */
    private static final int[] f60809a = new int[]{0, 0};

    @NotNull
    /* renamed from: a */
    public static final Point m70097a(@NotNull View view) {
        C2668g.b(view, "$receiver");
        return C19478g.m70098a(view, f60809a, new Point());
    }

    @NotNull
    /* renamed from: b */
    public static final Point m70100b(@NotNull View view) {
        C2668g.b(view, "$receiver");
        view.getLocationOnScreen(f60809a);
        return new Point(f60809a[0], f60809a[1]);
    }

    @NotNull
    /* renamed from: a */
    public static final Point m70098a(@NotNull View view, @NotNull int[] iArr, @NotNull Point point) {
        C2668g.b(view, "$receiver");
        C2668g.b(iArr, "viewPosition");
        C2668g.b(point, Property.SYMBOL_PLACEMENT_POINT);
        view.getLocationInWindow(iArr);
        point.x = iArr[null];
        point.y = iArr[1];
        return point;
    }

    @NotNull
    /* renamed from: c */
    public static final C19464b m70101c(@NotNull View view) {
        C2668g.b(view, "$receiver");
        View rootView = view.getRootView();
        C2668g.a(rootView, "rootView");
        return new C19464b(rootView.getWidth(), rootView.getHeight(), rootView.getY(), C19478g.m70097a(view), view.getX(), view.getY(), view.getWidth(), view.getHeight());
    }

    /* renamed from: a */
    public static final float m70096a(@NotNull View view, @DimenRes int i) {
        C2668g.b(view, "$receiver");
        return view.getResources().getDimension(i);
    }

    /* renamed from: a */
    public static final void m70099a(@NotNull View view, float f) {
        C2668g.b(view, "$receiver");
        if (view.getScaleX() != f) {
            view.setScaleX(f);
        }
        if (view.getScaleY() != f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: d */
    public static final boolean m70102d(@NotNull View view) {
        C2668g.b(view, "$receiver");
        return (view.getWidth() <= 0 || view.getHeight() <= null) ? null : true;
    }
}
