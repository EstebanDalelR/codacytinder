package rx.internal.util.atomic;

/* renamed from: rx.internal.util.atomic.f */
public final class C19612f<E> extends C19440b<E> {
    public C19612f() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        m69930a(linkedQueueNode);
        m69934c(linkedQueueNode);
        linkedQueueNode.m69921a(null);
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode(e);
        m69931b().m69921a(linkedQueueNode);
        m69930a(linkedQueueNode);
        return true;
    }

    public E poll() {
        LinkedQueueNode c = m69935d().m69923c();
        if (c == null) {
            return null;
        }
        E a = c.m69919a();
        m69934c(c);
        return a;
    }

    public E peek() {
        LinkedQueueNode c = m69935d().m69923c();
        return c != null ? c.m69922b() : null;
    }
}
