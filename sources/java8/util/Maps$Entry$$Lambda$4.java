package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map.Entry;

final /* synthetic */ class Maps$Entry$$Lambda$4 implements Serializable, Comparator {
    /* renamed from: a */
    private final Comparator f48741a;

    public int compare(Object obj, Object obj2) {
        return this.f48741a.compare(((Entry) obj).getValue(), ((Entry) obj2).getValue());
    }
}
