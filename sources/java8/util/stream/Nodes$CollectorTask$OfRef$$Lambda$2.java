package java8.util.stream;

import java8.util.function.BinaryOperator;

final /* synthetic */ class Nodes$CollectorTask$OfRef$$Lambda$2 implements BinaryOperator {
    /* renamed from: a */
    private static final Nodes$CollectorTask$OfRef$$Lambda$2 f57681a = new Nodes$CollectorTask$OfRef$$Lambda$2();

    private Nodes$CollectorTask$OfRef$$Lambda$2() {
    }

    /* renamed from: a */
    public static BinaryOperator m66764a() {
        return f57681a;
    }

    public Object apply(Object obj, Object obj2) {
        return new ConcNode((Node) obj, (Node) obj2);
    }
}
