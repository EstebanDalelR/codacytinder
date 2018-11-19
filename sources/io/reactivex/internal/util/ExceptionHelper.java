package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

public final class ExceptionHelper {
    /* renamed from: a */
    public static final Throwable f48655a = new Termination();

    static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Throwable fillInStackTrace() {
            return this;
        }

        Termination() {
            super("No further exceptions");
        }
    }

    /* renamed from: a */
    public static RuntimeException m58962a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static <T> boolean m58964a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Object obj;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f48655a) {
                return false;
            }
            if (th2 == null) {
                obj = th;
            } else {
                obj = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, obj));
        return true;
    }

    /* renamed from: a */
    public static <T> Throwable m58963a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        return th != f48655a ? (Throwable) atomicReference.getAndSet(f48655a) : th;
    }

    /* renamed from: b */
    public static <E extends Throwable> Exception m58965b(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }
}
