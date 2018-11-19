package java8.util.stream;

import java8.util.function.BinaryOperator;
import java8.util.stream.Node.OfInt;

final /* synthetic */ class Nodes$CollectorTask$OfInt$$Lambda$2 implements BinaryOperator {
    /* renamed from: a */
    private static final Nodes$CollectorTask$OfInt$$Lambda$2 f57679a = new Nodes$CollectorTask$OfInt$$Lambda$2();

    private Nodes$CollectorTask$OfInt$$Lambda$2() {
    }

    /* renamed from: a */
    public static BinaryOperator m66762a() {
        return f57679a;
    }

    public Object apply(Object obj, Object obj2) {
        return new OfInt((OfInt) obj, (OfInt) obj2);
    }
}
