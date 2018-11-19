package com.tinder.settings.views;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableBoolean;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.BindColor;
import butterknife.ButterKnife;
import com.tinder.api.ManagerWebServices;
import com.tinder.p361b.C13631f;
import kotlin.C15813i;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/settings/views/SwitchRowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/tinder/databinding/ViewSwitchRowBinding;", "white", "", "setBackgroundColor", "", "color", "setCheckStatusClickListener", "checkStatusListener", "Lcom/tinder/settings/views/SwitchRowView$CheckStatusListener;", "setChecked", "isChecked", "", "setText", "text", "", "CheckStatusListener", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Use {@link SwitchRowView} in base module")
public class SwitchRowView extends FrameLayout {
    /* renamed from: b */
    public static final SwitchRowView$a f8369b = new SwitchRowView$a(null);
    /* renamed from: a */
    private final C13631f f8370a;
    @BindColor(2131100300)
    @JvmField
    public int white;

    @JvmStatic
    @BindingAdapter({"checked"})
    @Nullable
    /* renamed from: a */
    public static final C15813i m10164a(@NotNull SwitchRowView switchRowView, @Nullable Boolean bool) {
        return f8369b.a(switchRowView, bool);
    }

    @JvmStatic
    @BindingAdapter({"checkStatusListener"})
    /* renamed from: a */
    public static final void m10165a(@NotNull SwitchRowView switchRowView, @NotNull SwitchRowView$CheckStatusListener switchRowView$CheckStatusListener) {
        f8369b.a(switchRowView, switchRowView$CheckStatusListener);
    }

    @JvmStatic
    @BindingAdapter({"text"})
    /* renamed from: a */
    public static final void m10166a(@NotNull SwitchRowView switchRowView, @NotNull String str) {
        f8369b.a(switchRowView, str);
    }

    public SwitchRowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        ButterKnife.m2675a((View) this);
        Object a = C13631f.a(LayoutInflater.from(context), this, true);
        C2668g.m10305a(a, "ViewSwitchRowBinding.inflate(inflater, this, true)");
        this.f8370a = a;
        this.f8370a.a(new ObservableBoolean());
        setBackgroundColor(this.white);
    }

    public final void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
    }

    public final void setText(@NotNull String str) {
        C2668g.m10309b(str, ManagerWebServices.PARAM_TEXT);
        this.f8370a.a(str);
    }

    public final void setChecked(boolean z) {
        ObservableBoolean j = this.f8370a.j();
        if (j != null) {
            j.set(z);
        }
    }

    public final void setCheckStatusClickListener(@NotNull SwitchRowView$CheckStatusListener switchRowView$CheckStatusListener) {
        C2668g.m10309b(switchRowView$CheckStatusListener, "checkStatusListener");
        this.f8370a.a(new SwitchRowView$b(switchRowView$CheckStatusListener));
    }
}
