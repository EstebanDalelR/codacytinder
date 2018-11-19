package com.tinder.superlikeable.p422b;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"hasChildren", "", "Landroid/view/ViewGroup;", "hasSize", "Landroid/view/View;", "superlikeable_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.b.c */
public final class C15137c {
    /* renamed from: a */
    public static final boolean m56962a(@NotNull View view) {
        C2668g.b(view, "$receiver");
        return (view.getWidth() <= 0 || view.getHeight() <= null) ? null : true;
    }

    /* renamed from: a */
    public static final boolean m56963a(@NotNull ViewGroup viewGroup) {
        C2668g.b(viewGroup, "$receiver");
        return viewGroup.getChildCount() > null ? true : null;
    }
}
