package android.support.design.widget;

import android.content.Context;
import android.support.v7.appcompat.C0667R;

/* renamed from: android.support.design.widget.o */
class C0248o {
    /* renamed from: a */
    private static final int[] f897a = new int[]{C0667R.attr.colorPrimary};

    /* renamed from: a */
    static void m917a(Context context) {
        context = context.obtainStyledAttributes(f897a);
        int hasValue = context.hasValue(0) ^ 1;
        context.recycle();
        if (hasValue != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
