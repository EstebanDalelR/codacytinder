package com.tinder.gold;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tinder.shimmy.ShimmerFrameLayout$LayoutParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"enableShimmer", "", "Landroid/view/View;", "enabled", "", "gold_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.gold.a */
public final class C9684a {
    /* renamed from: a */
    public static final void m40145a(@NotNull View view, boolean z) {
        C2668g.b(view, "$receiver");
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ShimmerFrameLayout$LayoutParams)) {
            layoutParams = null;
        }
        ShimmerFrameLayout$LayoutParams shimmerFrameLayout$LayoutParams = (ShimmerFrameLayout$LayoutParams) layoutParams;
        if (shimmerFrameLayout$LayoutParams != null) {
            shimmerFrameLayout$LayoutParams.a(z);
            view.setLayoutParams(shimmerFrameLayout$LayoutParams);
        }
    }
}
