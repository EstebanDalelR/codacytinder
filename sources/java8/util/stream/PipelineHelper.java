package java8.util.stream;

import java8.util.Spliterator;
import java8.util.function.Consumer;
import java8.util.function.IntFunction;
import java8.util.stream.Node.Builder;

abstract class PipelineHelper<P_OUT> {
    /* renamed from: a */
    abstract <P_IN> long mo12959a(Spliterator<P_IN> spliterator);

    /* renamed from: a */
    abstract <P_IN, S extends Consumer<P_OUT>> S mo12960a(S s, Spliterator<P_IN> spliterator);

    /* renamed from: a */
    abstract Builder<P_OUT> mo12961a(long j, IntFunction<P_OUT[]> intFunction);

    /* renamed from: a */
    abstract <P_IN> Node<P_OUT> mo12962a(Spliterator<P_IN> spliterator, boolean z, IntFunction<P_OUT[]> intFunction);

    /* renamed from: a */
    abstract <P_IN> Sink<P_IN> mo12963a(Consumer<P_OUT> consumer);

    /* renamed from: a */
    abstract <P_IN> Sink<P_IN> mo12964a(Sink<P_OUT> sink);

    /* renamed from: a */
    abstract <P_IN, S extends Sink<P_OUT>> S mo12965a(S s, Spliterator<P_IN> spliterator);

    /* renamed from: b */
    abstract <P_IN> Spliterator<P_OUT> mo12966b(Spliterator<P_IN> spliterator);

    /* renamed from: b */
    abstract StreamShape mo12967b();

    /* renamed from: b */
    abstract <P_IN> void mo12968b(Sink<P_IN> sink, Spliterator<P_IN> spliterator);

    /* renamed from: c */
    abstract int mo12969c();

    /* renamed from: c */
    abstract <P_IN> boolean mo12970c(Sink<P_IN> sink, Spliterator<P_IN> spliterator);

    PipelineHelper() {
    }
}
