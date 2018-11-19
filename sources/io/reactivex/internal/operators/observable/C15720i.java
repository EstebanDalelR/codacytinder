package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.C15736b;
import io.reactivex.internal.util.C17520c;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: io.reactivex.internal.operators.observable.i */
public final class C15720i {
    /* renamed from: a */
    public static <T> void m58939a(ObservableSource<? extends T> observableSource, Observer<? super T> observer) {
        BlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        observer.onSubscribe(blockingObserver);
        observableSource.subscribe(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object poll = linkedBlockingQueue.poll();
            if (poll == null) {
                try {
                    poll = linkedBlockingQueue.take();
                } catch (ObservableSource<? extends T> observableSource2) {
                    blockingObserver.dispose();
                    observer.onError(observableSource2);
                    return;
                }
            }
            if (!blockingObserver.isDisposed() && observableSource2 != BlockingObserver.f53137a) {
                if (NotificationLite.acceptFull(poll, (Observer) observer)) {
                    break;
                }
            }
            break;
        }
    }

    /* renamed from: a */
    public static <T> void m58938a(ObservableSource<? extends T> observableSource) {
        CountDownLatch c17520c = new C17520c();
        Object lambdaObserver = new LambdaObserver(Functions.m58878b(), c17520c, c17520c, Functions.m58878b());
        observableSource.subscribe(lambdaObserver);
        C15736b.m58972a(c17520c, lambdaObserver);
        Throwable th = c17520c.f54142a;
        if (th != null) {
            throw ExceptionHelper.m58962a(th);
        }
    }

    /* renamed from: a */
    public static <T> void m58940a(ObservableSource<? extends T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        C15684a.m58895a((Object) consumer, "onNext is null");
        C15684a.m58895a((Object) consumer2, "onError is null");
        C15684a.m58895a((Object) action, "onComplete is null");
        C15720i.m58939a(observableSource, new LambdaObserver(consumer, consumer2, action, Functions.m58878b()));
    }
}
