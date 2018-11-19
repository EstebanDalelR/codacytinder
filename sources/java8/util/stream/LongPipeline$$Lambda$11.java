package java8.util.stream;

import java8.util.LongSummaryStatistics;
import java8.util.function.ObjLongConsumer;

final /* synthetic */ class LongPipeline$$Lambda$11 implements ObjLongConsumer {
    /* renamed from: a */
    private static final LongPipeline$$Lambda$11 f54582a = new LongPipeline$$Lambda$11();

    private LongPipeline$$Lambda$11() {
    }

    /* renamed from: a */
    public static ObjLongConsumer m64009a() {
        return f54582a;
    }

    public void accept(Object obj, long j) {
        ((LongSummaryStatistics) obj).accept(j);
    }
}
