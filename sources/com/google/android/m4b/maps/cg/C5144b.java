package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* renamed from: com.google.android.m4b.maps.cg.b */
public final class C5144b {
    /* renamed from: a */
    public static void m22920a(View view, String str) {
        if (VERSION.SDK_INT >= 16) {
            view.announceForAccessibility(str);
            return;
        }
        if (VERSION.SDK_INT >= 14) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(8);
            obtain.getText().add(str);
            obtain.setEnabled(view.isEnabled());
            obtain.setClassName(view.getClass().getName());
            obtain.setPackageName(view.getContext().getPackageName());
            view.getParent().requestSendAccessibilityEvent(view, obtain);
        }
    }

    /* renamed from: a */
    public static boolean m22921a(Context context) {
        if (context.getSystemService("accessibility") == null) {
            return null;
        }
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }
}
