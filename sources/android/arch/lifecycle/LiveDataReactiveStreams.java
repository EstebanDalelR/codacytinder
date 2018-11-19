package android.arch.lifecycle;

import android.arch.core.p002a.C2673a;
import android.support.annotation.NonNull;
import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class LiveDataReactiveStreams {

    private static class PublisherLiveData<T> extends LiveData<T> {
        /* renamed from: a */
        final AtomicReference<LiveDataSubscriber> f8490a = new AtomicReference();
        /* renamed from: b */
        private final Publisher<T> f8491b;

        final class LiveDataSubscriber extends AtomicReference<Subscription> implements Subscriber<T> {
            /* renamed from: a */
            final /* synthetic */ PublisherLiveData f8489a;

            LiveDataSubscriber(PublisherLiveData publisherLiveData) {
                this.f8489a = publisherLiveData;
            }

            public void onSubscribe(Subscription subscription) {
                if (compareAndSet(null, subscription)) {
                    subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                } else {
                    subscription.cancel();
                }
            }

            public void onNext(T t) {
                this.f8489a.mo39a((Object) t);
            }

            public void onError(final Throwable th) {
                this.f8489a.f8490a.compareAndSet(this, null);
                C2673a.m10423a().m36c(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ LiveDataSubscriber f30b;

                    public void run() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
                    }
                });
            }

            public void onComplete() {
                this.f8489a.f8490a.compareAndSet(this, null);
            }

            /* renamed from: a */
            public void m10449a() {
                Subscription subscription = (Subscription) get();
                if (subscription != null) {
                    subscription.cancel();
                }
            }
        }

        PublisherLiveData(@NonNull Publisher<T> publisher) {
            this.f8491b = publisher;
        }

        /* renamed from: c */
        protected void mo24c() {
            super.mo24c();
            Subscriber liveDataSubscriber = new LiveDataSubscriber(this);
            this.f8490a.set(liveDataSubscriber);
            this.f8491b.subscribe(liveDataSubscriber);
        }

        /* renamed from: d */
        protected void mo25d() {
            super.mo25d();
            LiveDataSubscriber liveDataSubscriber = (LiveDataSubscriber) this.f8490a.getAndSet(null);
            if (liveDataSubscriber != null) {
                liveDataSubscriber.m10449a();
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public static <T> LiveData<T> m75a(@NonNull Publisher<T> publisher) {
        return new PublisherLiveData(publisher);
    }
}
