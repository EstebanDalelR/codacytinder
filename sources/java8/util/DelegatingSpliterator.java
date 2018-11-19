package java8.util;

import build.IgnoreJava8API;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java8.util.function.Consumers;

@IgnoreJava8API
final class DelegatingSpliterator<T> implements Spliterator<T> {
    /* renamed from: a */
    private final Spliterator<T> f54219a;

    private static final class ConsumerDelegate<T> implements Consumer<T> {
        /* renamed from: a */
        private final java8.util.function.Consumer<T> f48718a;

        ConsumerDelegate(java8.util.function.Consumer<T> consumer) {
            Objects.m59115b(consumer);
            this.f48718a = consumer;
        }

        public void accept(T t) {
            this.f48718a.accept(t);
        }

        @IgnoreJava8API
        public Consumer<T> andThen(final Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            return new ConsumerDelegate(Consumers.m59348a(this.f48718a, new java8.util.function.Consumer<T>(this) {
                /* renamed from: b */
                final /* synthetic */ ConsumerDelegate f54218b;

                public void accept(T t) {
                    consumer.accept(t);
                }
            }));
        }
    }

    DelegatingSpliterator(Spliterator<T> spliterator) {
        Objects.m59115b(spliterator);
        this.f54219a = spliterator;
    }

    public boolean tryAdvance(java8.util.function.Consumer<? super T> consumer) {
        return this.f54219a.tryAdvance(new ConsumerDelegate(consumer));
    }

    public Spliterator<T> trySplit() {
        Spliterator trySplit = this.f54219a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new DelegatingSpliterator(trySplit);
    }

    public long estimateSize() {
        return this.f54219a.estimateSize();
    }

    public int characteristics() {
        return this.f54219a.characteristics();
    }

    public void forEachRemaining(java8.util.function.Consumer<? super T> consumer) {
        this.f54219a.forEachRemaining(new ConsumerDelegate(consumer));
    }

    public long getExactSizeIfKnown() {
        return this.f54219a.getExactSizeIfKnown();
    }

    public boolean hasCharacteristics(int i) {
        return this.f54219a.hasCharacteristics(i);
    }

    public Comparator<? super T> getComparator() {
        return this.f54219a.getComparator();
    }
}
