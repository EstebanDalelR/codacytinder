package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.view.PointerIcon;

/* renamed from: android.support.v4.view.j */
public final class C0601j {
    /* renamed from: a */
    private Object f1803a;

    private C0601j(Object obj) {
        this.f1803a = obj;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public Object m2351a() {
        return this.f1803a;
    }

    /* renamed from: a */
    public static C0601j m2350a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C0601j(PointerIcon.getSystemIcon(context, i));
        }
        return new C0601j(0);
    }
}
