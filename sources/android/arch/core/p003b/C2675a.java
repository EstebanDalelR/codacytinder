package android.arch.core.p003b;

import android.arch.core.p003b.C0008b.C0006c;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.HashMap;
import java.util.Map.Entry;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.core.b.a */
public class C2675a<K, V> extends C0008b<K, V> {
    /* renamed from: a */
    private HashMap<K, C0006c<K, V>> f8481a = new HashMap();

    /* renamed from: a */
    protected C0006c<K, V> mo18a(K k) {
        return (C0006c) this.f8481a.get(k);
    }

    /* renamed from: a */
    public V mo19a(@NonNull K k, @NonNull V v) {
        C0006c a = mo18a(k);
        if (a != null) {
            return a.f6b;
        }
        this.f8481a.put(k, m42b(k, v));
        return null;
    }

    /* renamed from: b */
    public V mo20b(@NonNull K k) {
        V b = super.mo20b(k);
        this.f8481a.remove(k);
        return b;
    }

    /* renamed from: c */
    public boolean m10435c(K k) {
        return this.f8481a.containsKey(k);
    }

    /* renamed from: d */
    public Entry<K, V> m10436d(K k) {
        return m10435c(k) ? ((C0006c) this.f8481a.get(k)).f8d : null;
    }
}
