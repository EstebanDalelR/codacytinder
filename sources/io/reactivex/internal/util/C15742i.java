package io.reactivex.internal.util;

import com.google.android.exoplayer2.Format;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.queue.SpscArrayQueue;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.util.i */
public final class C15742i {
    /* renamed from: a */
    public static <T, U> void m58996a(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int i = 1;
        while (!C15742i.m58998a(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean done = observableQueueDrain.done();
                Object poll = simplePlainQueue.poll();
                boolean z2 = poll == null;
                if (!C15742i.m58998a(done, z2, observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
                    if (z2) {
                        i = observableQueueDrain.leave(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                    observableQueueDrain.accept(observer, poll);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, U> boolean m58998a(boolean z, boolean z2, Observer<?> observer, boolean z3, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (z) {
            if (!z3) {
                z = observableQueueDrain.error();
                if (z) {
                    simpleQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    observer.onError(z);
                    return true;
                } else if (z2) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    observer.onComplete();
                    return true;
                }
            } else if (z2) {
                if (disposable != null) {
                    disposable.dispose();
                }
                z = observableQueueDrain.error();
                if (z) {
                    observer.onError(z);
                } else {
                    observer.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static <T> SimpleQueue<T> m58995a(int i) {
        if (i < 0) {
            return new C18423a(-i);
        }
        return new SpscArrayQueue(i);
    }

    /* renamed from: a */
    public static void m58997a(Subscription subscription, int i) {
        subscription.request(i < 0 ? Format.OFFSET_SAMPLE_RELATIVE : (long) i);
    }
}
