package java8.util.stream;

import java8.util.IntSummaryStatistics;
import java8.util.function.ObjIntConsumer;

final /* synthetic */ class IntPipeline$$Lambda$11 implements ObjIntConsumer {
    /* renamed from: a */
    private static final IntPipeline$$Lambda$11 f54568a = new IntPipeline$$Lambda$11();

    private IntPipeline$$Lambda$11() {
    }

    /* renamed from: a */
    public static ObjIntConsumer m63995a() {
        return f54568a;
    }

    public void accept(Object obj, int i) {
        ((IntSummaryStatistics) obj).accept(i);
    }
}
