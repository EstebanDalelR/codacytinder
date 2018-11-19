package java8.util.function;

final /* synthetic */ class Consumers$$Lambda$1 implements Consumer {
    /* renamed from: a */
    private final Consumer f54368a;
    /* renamed from: b */
    private final Consumer f54369b;

    private Consumers$$Lambda$1(Consumer consumer, Consumer consumer2) {
        this.f54368a = consumer;
        this.f54369b = consumer2;
    }

    /* renamed from: a */
    public static Consumer m63911a(Consumer consumer, Consumer consumer2) {
        return new Consumers$$Lambda$1(consumer, consumer2);
    }

    public void accept(Object obj) {
        Consumers.m59350b(this.f54368a, this.f54369b, obj);
    }
}
