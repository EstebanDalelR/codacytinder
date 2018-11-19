package com.tinder.settings.views;

import android.databinding.BindingAdapter;
import com.tinder.api.ManagerWebServices;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J!\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lcom/tinder/settings/views/SwitchRowView$Companion;", "", "()V", "setCheckStatusListener", "", "switchRowView", "Lcom/tinder/settings/views/SwitchRowView;", "checkStatusListener", "Lcom/tinder/settings/views/SwitchRowView$CheckStatusListener;", "setChecked", "isChecked", "", "(Lcom/tinder/settings/views/SwitchRowView;Ljava/lang/Boolean;)Lkotlin/Unit;", "setText", "text", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SwitchRowView$a {
    private SwitchRowView$a() {
    }

    @JvmStatic
    @BindingAdapter({"text"})
    /* renamed from: a */
    public final void m56385a(@NotNull SwitchRowView switchRowView, @NotNull String str) {
        C2668g.b(switchRowView, "switchRowView");
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        switchRowView.setText(str);
    }

    @JvmStatic
    @BindingAdapter({"checked"})
    @Nullable
    /* renamed from: a */
    public final C15813i m56383a(@NotNull SwitchRowView switchRowView, @Nullable Boolean bool) {
        C2668g.b(switchRowView, "switchRowView");
        if (bool == null) {
            return null;
        }
        bool.booleanValue();
        switchRowView.setChecked(bool.booleanValue());
        return C15813i.f49016a;
    }

    @JvmStatic
    @BindingAdapter({"checkStatusListener"})
    /* renamed from: a */
    public final void m56384a(@NotNull SwitchRowView switchRowView, @NotNull SwitchRowView$CheckStatusListener switchRowView$CheckStatusListener) {
        C2668g.b(switchRowView, "switchRowView");
        C2668g.b(switchRowView$CheckStatusListener, "checkStatusListener");
        switchRowView.setCheckStatusClickListener(switchRowView$CheckStatusListener);
    }
}
