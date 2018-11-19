package android.arch.persistence.room.p006b;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.persistence.room.b.a */
public class C0075a {
    /* renamed from: a */
    public static final String[] f188a = new String[0];

    /* renamed from: a */
    public static StringBuilder m244a() {
        return new StringBuilder();
    }

    /* renamed from: a */
    public static void m245a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("?");
            if (i2 < i - 1) {
                stringBuilder.append(",");
            }
        }
    }
}
