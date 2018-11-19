package rx.internal.util.atomic;

import java.util.concurrent.atomic.AtomicReference;

public final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    /* renamed from: a */
    private E f60643a;

    public LinkedQueueNode(E e) {
        m69920a((Object) e);
    }

    /* renamed from: a */
    public E m69919a() {
        E b = m69922b();
        m69920a(null);
        return b;
    }

    /* renamed from: b */
    public E m69922b() {
        return this.f60643a;
    }

    /* renamed from: a */
    public void m69920a(E e) {
        this.f60643a = e;
    }

    /* renamed from: a */
    public void m69921a(LinkedQueueNode<E> linkedQueueNode) {
        lazySet(linkedQueueNode);
    }

    /* renamed from: c */
    public LinkedQueueNode<E> m69923c() {
        return (LinkedQueueNode) get();
    }
}
