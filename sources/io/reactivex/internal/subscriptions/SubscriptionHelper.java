package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public enum SubscriptionHelper implements Subscription {
    CANCELLED;

    public void cancel() {
    }

    public void request(long j) {
    }

    public static boolean validate(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            C2667a.a(new NullPointerException("next is null"));
            return false;
        } else if (subscription == null) {
            return true;
        } else {
            subscription2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public static void reportSubscriptionSet() {
        C2667a.a(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("n > 0 required but it was ");
        stringBuilder.append(j);
        C2667a.a(new IllegalArgumentException(stringBuilder.toString()));
        return 0;
    }

    public static void reportMoreProduced(long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("More produced than requested: ");
        stringBuilder.append(j);
        C2667a.a(new ProtocolViolationException(stringBuilder.toString()));
    }

    public static boolean isCancelled(Subscription subscription) {
        return subscription == CANCELLED ? true : null;
    }

    public static boolean set(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        Subscription subscription2;
        do {
            subscription2 = (Subscription) atomicReference.get();
            if (subscription2 == CANCELLED) {
                if (subscription != null) {
                    subscription.cancel();
                }
                return null;
            }
        } while (!atomicReference.compareAndSet(subscription2, subscription));
        if (subscription2 != null) {
            subscription2.cancel();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        C15684a.m58895a((Object) subscription, "s is null");
        if (atomicReference.compareAndSet(null, subscription)) {
            return true;
        }
        subscription.cancel();
        if (atomicReference.get() != CANCELLED) {
            reportSubscriptionSet();
        }
        return null;
    }

    public static boolean replace(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        Subscription subscription2;
        do {
            subscription2 = (Subscription) atomicReference.get();
            if (subscription2 == CANCELLED) {
                if (subscription != null) {
                    subscription.cancel();
                }
                return null;
            }
        } while (!atomicReference.compareAndSet(subscription2, subscription));
        return true;
    }

    public static boolean cancel(AtomicReference<Subscription> atomicReference) {
        if (((Subscription) atomicReference.get()) != CANCELLED) {
            Subscription subscription = (Subscription) atomicReference.getAndSet(CANCELLED);
            if (subscription != CANCELLED) {
                if (subscription != null) {
                    subscription.cancel();
                }
                return true;
            }
        }
        return null;
    }

    public static boolean deferredSetOnce(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (setOnce(atomicReference, subscription) == null) {
            return null;
        }
        atomicReference = atomicLong.getAndSet(0);
        if (atomicReference != null) {
            subscription.request(atomicReference);
        }
        return true;
    }

    public static void deferredRequest(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, long j) {
        Subscription subscription = (Subscription) atomicReference.get();
        if (subscription != null) {
            subscription.request(j);
        } else if (validate(j)) {
            C15735a.m58967a(atomicLong, j);
            Subscription subscription2 = (Subscription) atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }
}
