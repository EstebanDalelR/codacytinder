package com.tinder.base.p173c;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0006H\b\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"cachedArray", "", "doWhenViewHasSize", "", "Landroid/view/View;", "action", "Lkotlin/Function1;", "getLocationOnScreen", "Lcom/tinder/base/extension/LocationOnScreen;", "hasSize", "", "base_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.base.c.b */
public final class C8304b {
    /* renamed from: a */
    private static final int[] f29579a = new int[2];

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/base/extension/ViewExtKt$doWhenViewHasSize$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.base.c.b$a */
    public static final class C8303a implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ View f29577a;
        /* renamed from: b */
        final /* synthetic */ Function1 f29578b;

        public C8303a(View view, Function1 function1) {
            this.f29577a = view;
            this.f29578b = function1;
        }

        public boolean onPreDraw() {
            if (!C8304b.m35397b(this.f29577a)) {
                return true;
            }
            this.f29577a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f29578b.invoke(this.f29577a);
            return false;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final C8302a m35395a(@NotNull View view) {
        C2668g.b(view, "$receiver");
        view.getLocationOnScreen(f29579a);
        return new C8302a(f29579a[0], f29579a[1]);
    }

    /* renamed from: b */
    public static final boolean m35397b(@NotNull View view) {
        C2668g.b(view, "$receiver");
        return (view.getWidth() <= 0 || view.getHeight() <= null) ? null : true;
    }

    /* renamed from: a */
    public static final void m35396a(@NotNull View view, @NotNull Function1<? super View, C15813i> function1) {
        C2668g.b(view, "$receiver");
        C2668g.b(function1, "action");
        if (C8304b.m35397b(view)) {
            function1.invoke(view);
        } else {
            view.getViewTreeObserver().addOnPreDrawListener(new C8303a(view, function1));
        }
    }
}
