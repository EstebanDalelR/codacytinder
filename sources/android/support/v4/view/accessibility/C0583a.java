package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.accessibility.a */
public final class C0583a {
    /* renamed from: a */
    public static void m2246a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m2245a(AccessibilityEvent accessibilityEvent) {
        return VERSION.SDK_INT >= 19 ? accessibilityEvent.getContentChangeTypes() : null;
    }
}
