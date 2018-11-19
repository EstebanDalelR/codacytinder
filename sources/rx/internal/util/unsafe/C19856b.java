package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;
import rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.b */
abstract class C19856b<E> extends C19778d<E> {
    /* renamed from: a */
    protected static final long f62136a = af.m69983a(C19856b.class, "consumerNode");
    protected LinkedQueueNode<E> consumerNode;

    C19856b() {
    }

    /* renamed from: a */
    protected final void m71482a(LinkedQueueNode<E> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }

    /* renamed from: a */
    protected final LinkedQueueNode<E> m71481a() {
        return (LinkedQueueNode) af.f60679a.getObjectVolatile(this, f62136a);
    }

    /* renamed from: b */
    protected final LinkedQueueNode<E> m71483b() {
        return this.consumerNode;
    }
}
