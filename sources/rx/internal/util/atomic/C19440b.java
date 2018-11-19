package rx.internal.util.atomic;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.util.atomic.b */
abstract class C19440b<E> extends AbstractQueue<E> {
    /* renamed from: a */
    private final AtomicReference<LinkedQueueNode<E>> f60650a = new AtomicReference();
    /* renamed from: b */
    private final AtomicReference<LinkedQueueNode<E>> f60651b = new AtomicReference();

    /* renamed from: a */
    protected final LinkedQueueNode<E> m69929a() {
        return (LinkedQueueNode) this.f60650a.get();
    }

    /* renamed from: b */
    protected final LinkedQueueNode<E> m69931b() {
        return (LinkedQueueNode) this.f60650a.get();
    }

    /* renamed from: a */
    protected final void m69930a(LinkedQueueNode<E> linkedQueueNode) {
        this.f60650a.lazySet(linkedQueueNode);
    }

    /* renamed from: b */
    protected final LinkedQueueNode<E> m69932b(LinkedQueueNode<E> linkedQueueNode) {
        return (LinkedQueueNode) this.f60650a.getAndSet(linkedQueueNode);
    }

    /* renamed from: c */
    protected final LinkedQueueNode<E> m69933c() {
        return (LinkedQueueNode) this.f60651b.get();
    }

    /* renamed from: d */
    protected final LinkedQueueNode<E> m69935d() {
        return (LinkedQueueNode) this.f60651b.get();
    }

    /* renamed from: c */
    protected final void m69934c(LinkedQueueNode<E> linkedQueueNode) {
        this.f60651b.lazySet(linkedQueueNode);
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        LinkedQueueNode c = m69933c();
        LinkedQueueNode a = m69929a();
        int i = 0;
        while (c != a && i < ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            LinkedQueueNode c2;
            while (true) {
                c2 = c.m69923c();
                if (c2 != null) {
                    break;
                }
            }
            i++;
            c = c2;
        }
        return i;
    }

    public final boolean isEmpty() {
        return m69933c() == m69929a();
    }
}
