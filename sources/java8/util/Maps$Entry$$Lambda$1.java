package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map.Entry;

final /* synthetic */ class Maps$Entry$$Lambda$1 implements Serializable, Comparator {
    /* renamed from: a */
    private static final Maps$Entry$$Lambda$1 f48738a = new Maps$Entry$$Lambda$1();

    private Maps$Entry$$Lambda$1() {
    }

    public int compare(Object obj, Object obj2) {
        return ((Comparable) ((Entry) obj).getKey()).compareTo(((Entry) obj2).getKey());
    }
}
