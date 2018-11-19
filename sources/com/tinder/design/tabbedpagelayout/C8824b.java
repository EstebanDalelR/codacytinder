package com.tinder.design.tabbedpagelayout;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"dpToPx", "", "Landroid/view/View;", "dps", "tabbedpagelayout_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.design.tabbedpagelayout.b */
public final class C8824b {
    /* renamed from: a */
    public static final int m37546a(@NotNull View view, int i) {
        C2668g.b(view, "$receiver");
        view = view.getResources();
        C2668g.a(view, "resources");
        return Math.round(view.getDisplayMetrics().density * ((float) i));
    }
}
