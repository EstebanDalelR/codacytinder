package kotlin.reflect.jvm.internal.pcollections;

import java.io.Serializable;

final class MapEntry<K, V> implements Serializable {
    public final K key;
    public final V value;

    public MapEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = r4 instanceof kotlin.reflect.jvm.internal.pcollections.MapEntry;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r4 = (kotlin.reflect.jvm.internal.pcollections.MapEntry) r4;
        r0 = r3.key;
        if (r0 != 0) goto L_0x0011;
    L_0x000c:
        r0 = r4.key;
        if (r0 != 0) goto L_0x002f;
    L_0x0010:
        goto L_0x001b;
    L_0x0011:
        r0 = r3.key;
        r2 = r4.key;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x002f;
    L_0x001b:
        r0 = r3.value;
        if (r0 != 0) goto L_0x0024;
    L_0x001f:
        r4 = r4.value;
        if (r4 != 0) goto L_0x002f;
    L_0x0023:
        goto L_0x002e;
    L_0x0024:
        r0 = r3.value;
        r4 = r4.value;
        r4 = r0.equals(r4);
        if (r4 == 0) goto L_0x002f;
    L_0x002e:
        r1 = 1;
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.pcollections.MapEntry.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.key == null ? 0 : this.key.hashCode();
        if (this.value != null) {
            i = this.value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.key);
        stringBuilder.append("=");
        stringBuilder.append(this.value);
        return stringBuilder.toString();
    }
}
