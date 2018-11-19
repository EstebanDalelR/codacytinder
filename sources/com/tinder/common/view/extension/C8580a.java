package com.tinder.common.view.extension;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"handleBackButton", "", "Landroid/app/Activity;", "viewGroup", "Landroid/view/ViewGroup;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.view.extension.a */
public final class C8580a {
    /* renamed from: a */
    public static final boolean m36599a(@NotNull Activity activity, @NotNull ViewGroup viewGroup) {
        C2668g.b(activity, "$receiver");
        C2668g.b(viewGroup, "viewGroup");
        int childCount = viewGroup.getChildCount() - 1;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof BackButtonHandlerView) && ((BackButtonHandlerView) childAt).handleBackButton()) {
                    return true;
                }
                if (!(childAt instanceof ViewGroup) || !C8580a.m36599a(activity, (ViewGroup) childAt)) {
                    if (i == childCount) {
                        break;
                    }
                    i++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
