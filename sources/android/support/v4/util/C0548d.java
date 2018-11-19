package android.support.v4.util;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.tinder.api.ManagerWebServices;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.util.d */
public class C0548d {
    /* renamed from: a */
    public static void m2021a(Object obj, StringBuilder stringBuilder) {
        if (obj == null) {
            stringBuilder.append(ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        stringBuilder.append(simpleName);
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
