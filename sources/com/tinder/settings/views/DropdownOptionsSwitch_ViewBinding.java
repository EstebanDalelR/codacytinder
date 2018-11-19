package com.tinder.settings.views;

import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class DropdownOptionsSwitch_ViewBinding implements Unbinder {
    /* renamed from: b */
    private DropdownOptionsSwitch f51606b;

    @UiThread
    public DropdownOptionsSwitch_ViewBinding(DropdownOptionsSwitch dropdownOptionsSwitch, View view) {
        this.f51606b = dropdownOptionsSwitch;
        dropdownOptionsSwitch.optionsSwitch = (SwitchCompat) C0761c.b(view, R.id.options_switch, "field 'optionsSwitch'", SwitchCompat.class);
        dropdownOptionsSwitch.optionsDropdown = (LinearLayout) C0761c.b(view, R.id.options_dropdown, "field 'optionsDropdown'", LinearLayout.class);
    }

    public void unbind() {
        DropdownOptionsSwitch dropdownOptionsSwitch = this.f51606b;
        if (dropdownOptionsSwitch == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51606b = null;
        dropdownOptionsSwitch.optionsSwitch = null;
        dropdownOptionsSwitch.optionsDropdown = null;
    }
}
