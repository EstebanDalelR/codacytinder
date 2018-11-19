package com.tinder.data.updates;

import com.tinder.domain.common.reactivex.BackoffStrategy.ExponentialWithJitter;
import com.tinder.domain.common.reactivex.RxUtils;
import com.tinder.domain.common.reactivex.RxUtils.RetryListener;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/data/updates/SyncUpdatesRetryTransformer;", "Lio/reactivex/CompletableTransformer;", "scheduler", "Lio/reactivex/Scheduler;", "(Lio/reactivex/Scheduler;)V", "apply", "Lio/reactivex/CompletableSource;", "p0", "Lio/reactivex/Completable;", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.k */
public final class C11062k implements CompletableTransformer {
    /* renamed from: a */
    public static final C8806a f35833a = new C8806a();
    /* renamed from: b */
    private final C15679f f35834b;
    /* renamed from: c */
    private final /* synthetic */ CompletableTransformer f35835c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/updates/SyncUpdatesRetryTransformer$Companion;", "", "()V", "RETRY_INTERVAL_MILLIS", "", "RETRY_MAX_COUNT", "", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.k$a */
    public static final class C8806a {
        private C8806a() {
        }
    }

    @NotNull
    @NonNull
    public CompletableSource apply(@NotNull @NonNull C3956a c3956a) {
        C2668g.b(c3956a, "p0");
        return this.f35835c.apply(c3956a);
    }

    public C11062k(@NotNull final C15679f c15679f) {
        C2668g.b(c15679f, "scheduler");
        this.f35835c = RxUtils.INSTANCE.retryOnError(3, new ExponentialWithJitter(DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL, 0, null, 6, null), new RetryListener() {
            public void onRetry(int i) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SyncUpdates retried ");
                stringBuilder.append(i);
                stringBuilder.append(" times at ");
                stringBuilder.append(c15679f.a(TimeUnit.MILLISECONDS));
                C0001a.b(stringBuilder.toString(), new Object[0]);
            }
        }).forCompletable();
        this.f35834b = c15679f;
    }
}
