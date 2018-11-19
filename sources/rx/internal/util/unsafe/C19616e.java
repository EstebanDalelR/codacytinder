package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;
import rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.e */
abstract class C19616e<E> extends C19446c<E> {
    /* renamed from: b */
    protected static final long f61303b = af.m69983a(C19616e.class, "producerNode");
    protected LinkedQueueNode<E> producerNode;

    C19616e() {
    }

    /* renamed from: b */
    protected final void m70649b(LinkedQueueNode<E> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }

    /* renamed from: c */
    protected final LinkedQueueNode<E> m70650c() {
        return (LinkedQueueNode) af.f60679a.getObjectVolatile(this, f61303b);
    }
}
