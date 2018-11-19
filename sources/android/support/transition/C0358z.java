package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.support.transition.z */
public class C0358z {
    /* renamed from: a */
    public final Map<String, Object> f1196a = new HashMap();
    /* renamed from: b */
    public View f1197b;
    /* renamed from: c */
    final ArrayList<Transition> f1198c = new ArrayList();

    public boolean equals(Object obj) {
        if (obj instanceof C0358z) {
            C0358z c0358z = (C0358z) obj;
            if (this.f1197b == c0358z.f1197b && this.f1196a.equals(c0358z.f1196a) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        return (this.f1197b.hashCode() * 31) + this.f1196a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.f1197b);
        stringBuilder3.append("\n");
        stringBuilder2 = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    values:");
        stringBuilder2 = stringBuilder3.toString();
        for (String str : this.f1196a.keySet()) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append("    ");
            stringBuilder4.append(str);
            stringBuilder4.append(": ");
            stringBuilder4.append(this.f1196a.get(str));
            stringBuilder4.append("\n");
            stringBuilder2 = stringBuilder4.toString();
        }
        return stringBuilder2;
    }
}
