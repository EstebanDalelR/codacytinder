package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map.Entry;

final /* synthetic */ class Maps$Entry$$Lambda$3 implements Serializable, Comparator {
    /* renamed from: a */
    private final Comparator f48740a;

    public int compare(Object obj, Object obj2) {
        return this.f48740a.compare(((Entry) obj).getKey(), ((Entry) obj2).getKey());
    }
}
