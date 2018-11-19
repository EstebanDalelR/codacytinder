package com.jakewharton.rxbinding.view;

import android.view.MenuItem;

public final class MenuItemActionViewEvent extends C5706a<MenuItem> {
    /* renamed from: a */
    private final Kind f25472a;

    public enum Kind {
        EXPAND,
        COLLAPSE
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                MenuItemActionViewEvent menuItemActionViewEvent = (MenuItemActionViewEvent) obj;
                if (!m24982a().equals(menuItemActionViewEvent.m24982a())) {
                    return false;
                }
                if (this.f25472a != menuItemActionViewEvent.f25472a) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (m24982a().hashCode() * 31) + this.f25472a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MenuItemActionViewEvent{menuItem=");
        stringBuilder.append(m24982a());
        stringBuilder.append(", kind=");
        stringBuilder.append(this.f25472a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
