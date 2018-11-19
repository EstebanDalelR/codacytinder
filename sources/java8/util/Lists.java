package java8.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Lists {
    /* renamed from: a */
    public static <E> void m59098a(List<E> list, Comparator<? super E> comparator) {
        Collections.sort(list, comparator);
    }

    private Lists() {
    }
}
