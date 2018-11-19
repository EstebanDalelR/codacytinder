package android.support.transition;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

class af {
    /* renamed from: a */
    private static final ai f1143a;

    static {
        if (VERSION.SDK_INT >= 18) {
            f1143a = new ah();
        } else {
            f1143a = new ag();
        }
    }

    /* renamed from: a */
    static ae m1231a(@NonNull ViewGroup viewGroup) {
        return f1143a.mo340a(viewGroup);
    }

    /* renamed from: a */
    static void m1232a(@NonNull ViewGroup viewGroup, boolean z) {
        f1143a.mo341a(viewGroup, z);
    }
}
