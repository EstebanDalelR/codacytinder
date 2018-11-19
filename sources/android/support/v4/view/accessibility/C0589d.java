package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.accessibility.d */
public class C0589d {
    /* renamed from: a */
    private final AccessibilityRecord f1790a;

    /* renamed from: a */
    public static void m2307a(@NonNull AccessibilityRecord accessibilityRecord, View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m2306a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m2308b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        return this.f1790a == null ? 0 : this.f1790a.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0589d c0589d = (C0589d) obj;
        if (this.f1790a == null) {
            if (c0589d.f1790a != null) {
                return false;
            }
        } else if (this.f1790a.equals(c0589d.f1790a) == null) {
            return false;
        }
        return true;
    }
}
