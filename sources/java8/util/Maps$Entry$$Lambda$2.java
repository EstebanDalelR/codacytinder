package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map.Entry;

final /* synthetic */ class Maps$Entry$$Lambda$2 implements Serializable, Comparator {
    /* renamed from: a */
    private static final Maps$Entry$$Lambda$2 f48739a = new Maps$Entry$$Lambda$2();

    private Maps$Entry$$Lambda$2() {
    }

    public int compare(Object obj, Object obj2) {
        return ((Comparable) ((Entry) obj).getValue()).compareTo(((Entry) obj2).getValue());
    }
}
