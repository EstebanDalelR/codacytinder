package java8.util.stream;

import java.util.LinkedHashSet;
import java8.util.function.BiConsumer;

final /* synthetic */ class DistinctOps$1$$Lambda$3 implements BiConsumer {
    /* renamed from: a */
    private static final DistinctOps$1$$Lambda$3 f54534a = new DistinctOps$1$$Lambda$3();

    private DistinctOps$1$$Lambda$3() {
    }

    /* renamed from: a */
    public static BiConsumer m63965a() {
        return f54534a;
    }

    public void accept(Object obj, Object obj2) {
        ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
    }
}
