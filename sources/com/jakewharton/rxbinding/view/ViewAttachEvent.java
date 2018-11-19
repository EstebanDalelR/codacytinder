package com.jakewharton.rxbinding.view;

import android.support.annotation.NonNull;
import android.view.View;

public final class ViewAttachEvent extends C5710e<View> {
    /* renamed from: a */
    private final Kind f25473a;

    public enum Kind {
        ATTACH,
        DETACH
    }

    @NonNull
    /* renamed from: a */
    public Kind m30519a() {
        return this.f25473a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewAttachEvent)) {
            return false;
        }
        ViewAttachEvent viewAttachEvent = (ViewAttachEvent) obj;
        if (viewAttachEvent.m24986c() != m24986c() || viewAttachEvent.m30519a() != m30519a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((629 + m24986c().hashCode()) * 37) + m30519a().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ViewAttachEvent{view=");
        stringBuilder.append(m24986c());
        stringBuilder.append(", kind=");
        stringBuilder.append(m30519a());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
