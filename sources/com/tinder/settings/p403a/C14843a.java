package com.tinder.settings.p403a;

import android.databinding.BindingAdapter;
import android.support.v7.widget.Toolbar;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/settings/bindingadapter/ToolbarBindingAdapters;", "", "()V", "setNavigationIconClickListener", "", "toolbar", "Landroid/support/v7/widget/Toolbar;", "onClickListener", "Landroid/view/View$OnClickListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.a.a */
public final class C14843a {
    /* renamed from: a */
    public static final C14843a f46476a = new C14843a();

    private C14843a() {
    }

    @JvmStatic
    @BindingAdapter({"navigationIconClickListener"})
    /* renamed from: a */
    public static final void m56222a(@NotNull Toolbar toolbar, @NotNull OnClickListener onClickListener) {
        C2668g.b(toolbar, "toolbar");
        C2668g.b(onClickListener, "onClickListener");
        toolbar.setNavigationOnClickListener(onClickListener);
    }
}
