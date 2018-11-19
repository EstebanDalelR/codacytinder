package org.apache.commons.lang3.concurrent;

import java.beans.PropertyChangeSupport;
import java.util.concurrent.atomic.AtomicReference;

public abstract class AbstractCircuitBreaker<T> implements CircuitBreaker<T> {
    /* renamed from: a */
    protected final AtomicReference<State> f55135a;
    /* renamed from: b */
    private final PropertyChangeSupport f55136b;

    protected enum State {
        CLOSED {
            public State oppositeState() {
                return OPEN;
            }
        },
        OPEN {
            public State oppositeState() {
                return CLOSED;
            }
        };

        public abstract State oppositeState();
    }

    public boolean isOpen() {
        return m64557a((State) this.f55135a.get());
    }

    public boolean isClosed() {
        return isOpen() ^ 1;
    }

    public void close() {
        m64558b(State.CLOSED);
    }

    public void open() {
        m64558b(State.OPEN);
    }

    /* renamed from: a */
    protected static boolean m64557a(State state) {
        return state == State.OPEN ? true : null;
    }

    /* renamed from: b */
    protected void m64558b(State state) {
        if (this.f55135a.compareAndSet(state.oppositeState(), state)) {
            this.f55136b.firePropertyChange("open", m64557a(state) ^ 1, m64557a(state));
        }
    }
}
