package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;
import rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.h */
public final class C19912h<E> extends C19908a<E> {
    public C19912h() {
        this.consumerNode = new LinkedQueueNode();
        m71716c(this.consumerNode);
    }

    /* renamed from: c */
    protected LinkedQueueNode<E> m71716c(LinkedQueueNode<E> linkedQueueNode) {
        LinkedQueueNode linkedQueueNode2;
        do {
            linkedQueueNode2 = this.producerNode;
        } while (!af.f60679a.compareAndSwapObject(this, b, linkedQueueNode2, linkedQueueNode));
        return linkedQueueNode2;
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
        m71716c(linkedQueueNode).m69921a(linkedQueueNode);
        return true;
    }

    public E poll() {
        LinkedQueueNode b = m71483b();
        LinkedQueueNode c = b.m69923c();
        E a;
        if (c != null) {
            a = c.m69919a();
            m71482a(c);
            return a;
        } else if (b == m70650c()) {
            return null;
        } else {
            while (true) {
                c = b.m69923c();
                if (c != null) {
                    a = c.m69919a();
                    this.consumerNode = c;
                    return a;
                }
            }
        }
    }

    public E peek() {
        LinkedQueueNode linkedQueueNode = this.consumerNode;
        LinkedQueueNode c = linkedQueueNode.m69923c();
        if (c != null) {
            return c.m69922b();
        }
        if (linkedQueueNode == m70650c()) {
            return null;
        }
        while (true) {
            c = linkedQueueNode.m69923c();
            if (c != null) {
                return c.m69922b();
            }
        }
    }
}
