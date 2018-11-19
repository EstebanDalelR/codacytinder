package rx.internal.util.unsafe;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.Iterator;
import rx.internal.util.SuppressAnimalSniffer;
import rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.a */
abstract class C19908a<E> extends C19856b<E> {
    C19908a() {
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        LinkedQueueNode a = m71481a();
        LinkedQueueNode c = m70650c();
        int i = 0;
        while (a != c && i < ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            LinkedQueueNode c2;
            while (true) {
                c2 = a.m69923c();
                if (c2 != null) {
                    break;
                }
            }
            i++;
            a = c2;
        }
        return i;
    }

    public final boolean isEmpty() {
        return m71481a() == m70650c();
    }
}
