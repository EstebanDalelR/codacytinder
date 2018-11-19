package android.support.v4.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: android.support.v4.util.j */
public class C0559j<F, S> {
    @Nullable
    /* renamed from: a */
    public final F f1724a;
    @Nullable
    /* renamed from: b */
    public final S f1725b;

    public C0559j(@Nullable F f, @Nullable S s) {
        this.f1724a = f;
        this.f1725b = s;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0559j)) {
            return false;
        }
        C0559j c0559j = (C0559j) obj;
        if (C0559j.m2059b(c0559j.f1724a, this.f1724a) && C0559j.m2059b(c0559j.f1725b, this.f1725b) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m2059b(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f1724a == null ? 0 : this.f1724a.hashCode();
        if (this.f1725b != null) {
            i = this.f1725b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.f1724a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.f1725b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @NonNull
    /* renamed from: a */
    public static <A, B> C0559j<A, B> m2058a(@Nullable A a, @Nullable B b) {
        return new C0559j(a, b);
    }
}
