package com.tinder.fireboarding.view;

import android.view.View;
import com.tinder.base.p173c.C8302a;
import com.tinder.base.p173c.C8304b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¨\u0006\u0006"}, d2 = {"createOnScreenViewBounds", "Lcom/tinder/fireboarding/view/ViewBounds;", "Landroid/view/View;", "getCenterX", "", "getCenterY", "fireboarding_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.b */
public final class C9617b {
    /* renamed from: a */
    public static final int m40011a(@NotNull C9571a c9571a) {
        C2668g.b(c9571a, "$receiver");
        return (c9571a.m39894a() + c9571a.m39898e()) / 2;
    }

    /* renamed from: b */
    public static final int m40013b(@NotNull C9571a c9571a) {
        C2668g.b(c9571a, "$receiver");
        return (c9571a.m39895b() + c9571a.m39899f()) / 2;
    }

    @NotNull
    /* renamed from: a */
    public static final C9571a m40012a(@NotNull View view) {
        C2668g.b(view, "$receiver");
        C8302a a = C8304b.m35395a(view);
        return new C9571a(a.m35393a(), a.m35394b(), view.getHeight(), view.getWidth(), ((int) (((float) view.getWidth()) * view.getScaleX())) + a.m35393a(), a.m35394b() + ((int) (((float) view.getHeight()) * view.getScaleY())));
    }
}
