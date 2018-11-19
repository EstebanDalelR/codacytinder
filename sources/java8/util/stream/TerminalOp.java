package java8.util.stream;

import java8.util.Spliterator;

interface TerminalOp<E_IN, R> {
    /* renamed from: a */
    <P_IN> R mo12988a(PipelineHelper<E_IN> pipelineHelper, Spliterator<P_IN> spliterator);

    /* renamed from: b */
    <P_IN> R mo12989b(PipelineHelper<E_IN> pipelineHelper, Spliterator<P_IN> spliterator);

    int x_();
}
