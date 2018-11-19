package rx.internal.util.unsafe;

import java.util.AbstractQueue;

abstract class ae<E> extends AbstractQueue<E> {
    protected long producerIndex;

    ae() {
    }
}
