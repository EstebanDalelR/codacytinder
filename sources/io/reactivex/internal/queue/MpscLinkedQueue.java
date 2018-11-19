package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {
    /* renamed from: a */
    private final AtomicReference<LinkedQueueNode<T>> f57344a = new AtomicReference();
    /* renamed from: b */
    private final AtomicReference<LinkedQueueNode<T>> f57345b = new AtomicReference();

    static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        /* renamed from: a */
        private E f48622a;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e) {
            m58944a((Object) e);
        }

        /* renamed from: a */
        public E m58942a() {
            E b = m58945b();
            m58944a(null);
            return b;
        }

        /* renamed from: b */
        public E m58945b() {
            return this.f48622a;
        }

        /* renamed from: a */
        public void m58944a(E e) {
            this.f48622a = e;
        }

        /* renamed from: a */
        public void m58943a(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        /* renamed from: c */
        public LinkedQueueNode<E> m58946c() {
            return (LinkedQueueNode) get();
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        m66553b(linkedQueueNode);
        m66551a(linkedQueueNode);
    }

    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode(t);
        m66551a(linkedQueueNode).m58943a(linkedQueueNode);
        return true;
    }

    @Nullable
    public T poll() {
        LinkedQueueNode c = m66554c();
        LinkedQueueNode c2 = c.m58946c();
        T a;
        if (c2 != null) {
            a = c2.m58942a();
            m66553b(c2);
            return a;
        } else if (c == m66550a()) {
            return null;
        } else {
            while (true) {
                c2 = c.m58946c();
                if (c2 != null) {
                    a = c2.m58942a();
                    m66553b(c2);
                    return a;
                }
            }
        }
    }

    public boolean offer(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }

    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* renamed from: a */
    LinkedQueueNode<T> m66550a() {
        return (LinkedQueueNode) this.f57344a.get();
    }

    /* renamed from: a */
    LinkedQueueNode<T> m66551a(LinkedQueueNode<T> linkedQueueNode) {
        return (LinkedQueueNode) this.f57344a.getAndSet(linkedQueueNode);
    }

    /* renamed from: b */
    LinkedQueueNode<T> m66552b() {
        return (LinkedQueueNode) this.f57345b.get();
    }

    /* renamed from: c */
    LinkedQueueNode<T> m66554c() {
        return (LinkedQueueNode) this.f57345b.get();
    }

    /* renamed from: b */
    void m66553b(LinkedQueueNode<T> linkedQueueNode) {
        this.f57345b.lazySet(linkedQueueNode);
    }

    public boolean isEmpty() {
        return m66552b() == m66550a();
    }
}
