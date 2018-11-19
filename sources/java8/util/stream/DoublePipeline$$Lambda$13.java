package java8.util.stream;

import java8.util.DoubleSummaryStatistics;
import java8.util.function.ObjDoubleConsumer;

final /* synthetic */ class DoublePipeline$$Lambda$13 implements ObjDoubleConsumer {
    /* renamed from: a */
    private static final DoublePipeline$$Lambda$13 f54540a = new DoublePipeline$$Lambda$13();

    private DoublePipeline$$Lambda$13() {
    }

    /* renamed from: a */
    public static ObjDoubleConsumer m63970a() {
        return f54540a;
    }

    public void accept(Object obj, double d) {
        ((DoubleSummaryStatistics) obj).accept(d);
    }
}
