package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Map.Entry;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.C17714a;

public abstract class Pair<L, R> implements Serializable, Comparable<Pair<L, R>>, Entry<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    /* renamed from: b */
    public abstract L m60770b();

    /* renamed from: c */
    public abstract R m60771c();

    public /* synthetic */ int compareTo(Object obj) {
        return m60769a((Pair) obj);
    }

    public final L getKey() {
        return m60770b();
    }

    public R getValue() {
        return m60771c();
    }

    /* renamed from: a */
    public int m60769a(Pair<L, R> pair) {
        return new C17714a().m64493a(m60770b(), pair.m60770b()).m64493a(m60771c(), pair.m60771c()).m64486a();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!ObjectUtils.m60648a(getKey(), entry.getKey()) || ObjectUtils.m60648a(getValue(), entry.getValue()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = getKey() == null ? 0 : getKey().hashCode();
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(m60770b());
        stringBuilder.append(',');
        stringBuilder.append(m60771c());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
