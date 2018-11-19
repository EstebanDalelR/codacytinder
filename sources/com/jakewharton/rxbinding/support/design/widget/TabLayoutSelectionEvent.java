package com.jakewharton.rxbinding.support.design.widget;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;
import com.jakewharton.rxbinding.view.C5710e;

public final class TabLayoutSelectionEvent extends C5710e<TabLayout> {
    /* renamed from: a */
    private final Kind f25468a;
    /* renamed from: b */
    private final C0218d f25469b;

    public enum Kind {
        SELECTED,
        RESELECTED,
        UNSELECTED
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static TabLayoutSelectionEvent m30516a(@NonNull TabLayout tabLayout, @NonNull Kind kind, @NonNull C0218d c0218d) {
        return new TabLayoutSelectionEvent(tabLayout, kind, c0218d);
    }

    private TabLayoutSelectionEvent(@NonNull TabLayout tabLayout, @NonNull Kind kind, @NonNull C0218d c0218d) {
        super(tabLayout);
        this.f25469b = c0218d;
        this.f25468a = kind;
    }

    @NonNull
    /* renamed from: a */
    public Kind m30517a() {
        return this.f25468a;
    }

    @NonNull
    /* renamed from: b */
    public C0218d m30518b() {
        return this.f25469b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TabLayoutSelectionEvent)) {
            return false;
        }
        TabLayoutSelectionEvent tabLayoutSelectionEvent = (TabLayoutSelectionEvent) obj;
        if (m24986c() != tabLayoutSelectionEvent.m24986c() || this.f25468a != tabLayoutSelectionEvent.f25468a || this.f25469b != tabLayoutSelectionEvent.f25469b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((629 + ((TabLayout) m24986c()).hashCode()) * 37) + this.f25468a.hashCode()) * 37) + this.f25469b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TabLayoutSelectionEvent{view=");
        stringBuilder.append(m24986c());
        stringBuilder.append(", kind=");
        stringBuilder.append(this.f25468a);
        stringBuilder.append(", tab=");
        stringBuilder.append(this.f25469b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
