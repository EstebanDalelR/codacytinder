package java8.util.stream;

import java.util.LinkedHashSet;
import java8.util.function.BiConsumer;

final /* synthetic */ class DistinctOps$1$$Lambda$2 implements BiConsumer {
    /* renamed from: a */
    private static final DistinctOps$1$$Lambda$2 f54533a = new DistinctOps$1$$Lambda$2();

    private DistinctOps$1$$Lambda$2() {
    }

    /* renamed from: a */
    public static BiConsumer m63964a() {
        return f54533a;
    }

    public void accept(Object obj, Object obj2) {
        ((LinkedHashSet) obj).add(obj2);
    }
}
