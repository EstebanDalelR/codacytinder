package com.tinder.settings.views;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004*+,-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0014J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0012\u0010'\u001a\b\u0012\u0004\u0012\u00020#0(*\u00020)H\u0002R\u001e\u0010\u0007\u001a\u00020\u00018\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lcom/tinder/settings/views/DropdownOptionsSwitch;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "optionsDropdown", "getOptionsDropdown", "()Landroid/widget/LinearLayout;", "setOptionsDropdown", "(Landroid/widget/LinearLayout;)V", "optionsSwitch", "Landroid/support/v7/widget/SwitchCompat;", "getOptionsSwitch", "()Landroid/support/v7/widget/SwitchCompat;", "setOptionsSwitch", "(Landroid/support/v7/widget/SwitchCompat;)V", "settingsDropdownListener", "Lcom/tinder/settings/views/DropdownOptionsSwitch$SettingsDropdownListener;", "getSettingsDropdownListener", "()Lcom/tinder/settings/views/DropdownOptionsSwitch$SettingsDropdownListener;", "setSettingsDropdownListener", "(Lcom/tinder/settings/views/DropdownOptionsSwitch$SettingsDropdownListener;)V", "addAndBindOption", "", "optionViewModel", "Lcom/tinder/settings/views/DropdownOptionsSwitch$OptionViewModel;", "bind", "viewModel", "Lcom/tinder/settings/views/DropdownOptionsSwitch$ViewModel;", "hidePreferenceChecks", "onFinishInflate", "onOptionClick", "view", "Landroid/view/View;", "setDefaultOption", "defaultOption", "", "views", "", "Landroid/view/ViewGroup;", "Factory", "OptionViewModel", "SettingsDropdownListener", "ViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DropdownOptionsSwitch extends LinearLayout {
    @Nullable
    /* renamed from: a */
    private SettingsDropdownListener f46598a;
    @NotNull
    @BindView(2131363096)
    public LinearLayout optionsDropdown;
    @NotNull
    @BindView(2131363097)
    public SwitchCompat optionsSwitch;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/settings/views/DropdownOptionsSwitch$SettingsDropdownListener;", "", "onOptionSelect", "", "value", "onSwitchToggle", "isChecked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface SettingsDropdownListener {
        void onOptionSelect(@NotNull Object obj);

        void onSwitchToggle(boolean z);
    }

    @NotNull
    public final SwitchCompat getOptionsSwitch() {
        SwitchCompat switchCompat = this.optionsSwitch;
        if (switchCompat == null) {
            C2668g.b("optionsSwitch");
        }
        return switchCompat;
    }

    public final void setOptionsSwitch(@NotNull SwitchCompat switchCompat) {
        C2668g.b(switchCompat, "<set-?>");
        this.optionsSwitch = switchCompat;
    }

    @NotNull
    public final LinearLayout getOptionsDropdown() {
        LinearLayout linearLayout = this.optionsDropdown;
        if (linearLayout == null) {
            C2668g.b("optionsDropdown");
        }
        return linearLayout;
    }

    public final void setOptionsDropdown(@NotNull LinearLayout linearLayout) {
        C2668g.b(linearLayout, "<set-?>");
        this.optionsDropdown = linearLayout;
    }

    @Nullable
    public final SettingsDropdownListener getSettingsDropdownListener() {
        return this.f46598a;
    }

    public final void setSettingsDropdownListener(@Nullable SettingsDropdownListener settingsDropdownListener) {
        this.f46598a = settingsDropdownListener;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    private final void setDefaultOption(Object obj) {
        LinearLayout linearLayout = this.optionsDropdown;
        if (linearLayout == null) {
            C2668g.b("optionsDropdown");
        }
        Iterable<View> a = m56382a(linearLayout);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) a, 10));
        for (View view : a) {
            ImageView imageView = (ImageView) view.findViewById(R.id.preference_check);
            C2668g.a(imageView, "preferenceCheck");
            imageView.setVisibility(C2668g.a(view.getTag(), obj) ? 0 : 8);
            arrayList.add(C15813i.f49016a);
        }
        List list = (List) arrayList;
    }

    /* renamed from: a */
    private final List<View> m56382a(@NotNull ViewGroup viewGroup) {
        Iterable c18461c = new C18461c(0, viewGroup.getChildCount() - 1);
        Collection arrayList = new ArrayList(C18457p.m66906a(c18461c, 10));
        Iterator it = c18461c.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((ab) it).mo13805b()));
        }
        return (List) arrayList;
    }
}
