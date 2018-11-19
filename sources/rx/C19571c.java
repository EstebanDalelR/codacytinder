package rx;

import com.google.android.exoplayer2.Format;
import rx.internal.util.C19615i;

/* renamed from: rx.c */
public abstract class C19571c<T> implements Observer<T>, Subscription {
    private static final long NOT_SET = Long.MIN_VALUE;
    private Producer producer;
    private long requested;
    private final C19571c<?> subscriber;
    private final C19615i subscriptions;

    public void onStart() {
    }

    protected C19571c() {
        this(null, false);
    }

    protected C19571c(C19571c<?> c19571c) {
        this(c19571c, true);
    }

    protected C19571c(C19571c<?> c19571c, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = c19571c;
        c19571c = (!z || c19571c == null) ? new C19615i() : c19571c.subscriptions;
        this.subscriptions = c19571c;
    }

    public final void add(Subscription subscription) {
        this.subscriptions.m70647a(subscription);
    }

    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    protected final void request(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("number requested cannot be negative: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        synchronized (this) {
            if (this.producer != null) {
                Producer producer = this.producer;
                producer.request(j);
                return;
            }
            addToRequested(j);
        }
    }

    private void addToRequested(long j) {
        if (this.requested == NOT_SET) {
            this.requested = j;
            return;
        }
        long j2 = this.requested + j;
        if (j2 < 0) {
            this.requested = Format.OFFSET_SAMPLE_RELATIVE;
        } else {
            this.requested = j2;
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            long j = this.requested;
            this.producer = producer;
            producer = (this.subscriber == null || j != NOT_SET) ? null : true;
        }
        if (producer != null) {
            this.subscriber.setProducer(this.producer);
        } else if (j == NOT_SET) {
            this.producer.request(Format.OFFSET_SAMPLE_RELATIVE);
        } else {
            this.producer.request(j);
        }
    }
}
