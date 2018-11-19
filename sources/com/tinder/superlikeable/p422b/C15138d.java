package com.tinder.superlikeable.p422b;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u0012\u0010\n\u001a\u00020\r*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000b\u001a\f\u0010\u000f\u001a\u00020\u0007*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"DEFAULT_PACKAGE_NAME", "", "DEFAULT_RESOURCE_TYPE", "STATUS_BAR_IDENTIFIER", "intArray", "", "getStatusBarHeight", "", "context", "Landroid/content/Context;", "getLocationOnScreen", "Landroid/graphics/Rect;", "Landroid/view/View;", "", "rect", "getStatusBarHeightForLocationOnScreen", "superlikeable_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.b.d */
public final class C15138d {
    /* renamed from: a */
    private static final int[] f47106a = new int[]{0, 0};

    @NotNull
    /* renamed from: a */
    public static final Rect m56965a(@NotNull View view) {
        C2668g.b(view, "$receiver");
        Rect rect = new Rect();
        C15138d.m56966a(view, rect);
        return rect;
    }

    /* renamed from: a */
    public static final void m56966a(@NotNull View view, @NotNull Rect rect) {
        C2668g.b(view, "$receiver");
        C2668g.b(rect, "rect");
        view.getLocationOnScreen(f47106a);
        int[] iArr = f47106a;
        iArr[1] = iArr[1] - C15138d.m56967b(view);
        rect.set(f47106a[0], f47106a[1], f47106a[0] + view.getWidth(), f47106a[1] + view.getHeight());
    }

    /* renamed from: b */
    private static final int m56967b(@NotNull View view) {
        if (VERSION.SDK_INT >= 21) {
            return null;
        }
        Context context = view.getContext();
        C2668g.a(context, "context");
        return C15138d.m56964a(context);
    }

    /* renamed from: a */
    private static final int m56964a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : null;
    }
}
