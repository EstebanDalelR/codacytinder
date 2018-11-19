package java8.util.stream;

import java8.util.function.BinaryOperator;
import java8.util.stream.Node.OfLong;

final /* synthetic */ class Nodes$CollectorTask$OfLong$$Lambda$2 implements BinaryOperator {
    /* renamed from: a */
    private static final Nodes$CollectorTask$OfLong$$Lambda$2 f57680a = new Nodes$CollectorTask$OfLong$$Lambda$2();

    private Nodes$CollectorTask$OfLong$$Lambda$2() {
    }

    /* renamed from: a */
    public static BinaryOperator m66763a() {
        return f57680a;
    }

    public Object apply(Object obj, Object obj2) {
        return new OfLong((OfLong) obj, (OfLong) obj2);
    }
}
