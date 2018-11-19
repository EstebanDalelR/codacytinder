package rx.internal.util.atomic;

/* renamed from: rx.internal.util.atomic.c */
public final class C19610c<E> extends C19440b<E> {
    public C19610c() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        m69934c(linkedQueueNode);
        m69932b(linkedQueueNode);
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
        m69932b(linkedQueueNode).m69921a(linkedQueueNode);
        return true;
    }

    public E poll() {
        LinkedQueueNode d = m69935d();
        LinkedQueueNode c = d.m69923c();
        E a;
        if (c != null) {
            a = c.m69919a();
            m69934c(c);
            return a;
        } else if (d == m69929a()) {
            return null;
        } else {
            while (true) {
                c = d.m69923c();
                if (c != null) {
                    a = c.m69919a();
                    m69934c(c);
                    return a;
                }
            }
        }
    }

    public E peek() {
        LinkedQueueNode d = m69935d();
        LinkedQueueNode c = d.m69923c();
        if (c != null) {
            return c.m69922b();
        }
        if (d == m69929a()) {
            return null;
        }
        while (true) {
            c = d.m69923c();
            if (c != null) {
                return c.m69922b();
            }
        }
    }
}
