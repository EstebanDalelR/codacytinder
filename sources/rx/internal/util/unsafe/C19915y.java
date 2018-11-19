package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: rx.internal.util.unsafe.y */
public final class C19915y<E> extends C19908a<E> {
    public C19915y() {
        m70649b(new LinkedQueueNode());
        m71482a(this.producerNode);
        this.consumerNode.m69921a(null);
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
        this.producerNode.m69921a(linkedQueueNode);
        this.producerNode = linkedQueueNode;
        return true;
    }

    public E poll() {
        LinkedQueueNode c = this.consumerNode.m69923c();
        if (c == null) {
            return null;
        }
        E a = c.m69919a();
        this.consumerNode = c;
        return a;
    }

    public E peek() {
        LinkedQueueNode c = this.consumerNode.m69923c();
        return c != null ? c.m69922b() : null;
    }
}
