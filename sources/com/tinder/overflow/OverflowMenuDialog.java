package com.tinder.overflow;

import android.content.Context;
import android.databinding.C0119f;
import android.support.v7.app.AppCompatDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import butterknife.BindDimen;
import com.tinder.R;
import com.tinder.p361b.C13626a;
import com.tinder.utils.av;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/overflow/OverflowMenuDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "menuItems", "", "Lcom/tinder/overflow/MenuItem;", "anchorView", "Landroid/view/View;", "(Landroid/content/Context;Ljava/util/List;Landroid/view/View;)V", "defaultYPosition", "", "dialogShadowHeight", "setWindowPositionForMenuItem", "", "setWindowPositionForYPositionOfView", "view", "show", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class OverflowMenuDialog extends AppCompatDialog {
    /* renamed from: a */
    private final View f43258a;
    @BindDimen(2131165263)
    @JvmField
    public int defaultYPosition;
    @BindDimen(2131165633)
    @JvmField
    public int dialogShadowHeight;

    public OverflowMenuDialog(@NotNull Context context, @NotNull List<C10019a> list, @Nullable View view) {
        C2668g.b(context, "context");
        C2668g.b(list, "menuItems");
        super(context, R.style.Theme.AppCompat.Light.Dialog.NoTitle);
        this.f43258a = view;
        setCanceledOnTouchOutside(true);
        context = C0119f.a(LayoutInflater.from(context), R.layout.dialog_overflow_menu, null, false);
        C2668g.a(context, "DataBindingUtil.inflate(…erflow_menu, null, false)");
        C13626a c13626a = (C13626a) context;
        setContentView(c13626a.d());
        for (C10019a b : list) {
            b.m41050b().add(new OverflowMenuDialog$$special$$inlined$forEach$lambda$1(this));
        }
        c13626a.m53114a(list);
    }

    public void show() {
        View view = this.f43258a;
        if (view != null) {
            m52914a(view);
        } else {
            m52913a();
        }
        super.show();
    }

    /* renamed from: a */
    private final void m52913a() {
        Window window = getWindow();
        Context context = getContext();
        C2668g.a(context, "context");
        window.setLayout(context.getResources().getDimensionPixelSize(R.dimen.overflow_menu_item_width), -2);
        window = getWindow();
        C2668g.a(window, "window");
        LayoutParams attributes = window.getAttributes();
        attributes.gravity = 8388661;
        attributes.flags = 512;
        attributes.y = this.defaultYPosition - this.dialogShadowHeight;
    }

    /* renamed from: a */
    private final void m52914a(View view) {
        view = av.a(view).y;
        Window window = getWindow();
        Context context = getContext();
        C2668g.a(context, "context");
        window.setLayout(context.getResources().getDimensionPixelSize(R.dimen.overflow_menu_item_width), -2);
        window = getWindow();
        C2668g.a(window, "window");
        LayoutParams attributes = window.getAttributes();
        attributes.gravity = 8388661;
        attributes.flags = 768;
        attributes.y = view;
    }
}
