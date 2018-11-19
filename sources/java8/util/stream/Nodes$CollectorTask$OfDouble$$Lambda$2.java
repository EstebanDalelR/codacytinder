package java8.util.stream;

import java8.util.function.BinaryOperator;
import java8.util.stream.Node.OfDouble;

final /* synthetic */ class Nodes$CollectorTask$OfDouble$$Lambda$2 implements BinaryOperator {
    /* renamed from: a */
    private static final Nodes$CollectorTask$OfDouble$$Lambda$2 f57678a = new Nodes$CollectorTask$OfDouble$$Lambda$2();

    private Nodes$CollectorTask$OfDouble$$Lambda$2() {
    }

    /* renamed from: a */
    public static BinaryOperator m66761a() {
        return f57678a;
    }

    public Object apply(Object obj, Object obj2) {
        return new OfDouble((OfDouble) obj, (OfDouble) obj2);
    }
}
