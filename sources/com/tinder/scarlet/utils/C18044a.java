package com.tinder.scarlet.utils;

import com.tinder.scarlet.Stream;
import com.tinder.scarlet.Stream.Disposable;
import com.tinder.scarlet.Stream.Observer;
import io.reactivex.C3957b;
import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0010B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J9\u0010\u000b\u001a\u00020\f2.\u0010\r\u001a*\u0012\u000e\b\u0000\u0012\n \u000f*\u0004\u0018\u00018\u00008\u0000 \u000f*\u0014\u0012\u000e\b\u0000\u0012\n \u000f*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u000e0\u000eH\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/scarlet/utils/FlowableStream;", "T", "Lcom/tinder/scarlet/Stream;", "Lorg/reactivestreams/Publisher;", "flowable", "Lio/reactivex/Flowable;", "(Lio/reactivex/Flowable;)V", "start", "Lcom/tinder/scarlet/Stream$Disposable;", "observer", "Lcom/tinder/scarlet/Stream$Observer;", "subscribe", "", "p0", "Lorg/reactivestreams/Subscriber;", "kotlin.jvm.PlatformType", "FlowableStreamDisposable", "scarlet-core-internal"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.utils.a */
public final class C18044a<T> implements Stream<T>, Publisher<T> {
    /* renamed from: a */
    private final C3957b<T> f56048a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/scarlet/utils/FlowableStream$FlowableStreamDisposable;", "Lcom/tinder/scarlet/Stream$Disposable;", "disposable", "Lio/reactivex/disposables/Disposable;", "(Lio/reactivex/disposables/Disposable;)V", "dispose", "", "isDisposed", "", "scarlet-core-internal"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.utils.a$a */
    public static final class C16548a implements Disposable {
        /* renamed from: a */
        private final io.reactivex.disposables.Disposable f51231a;

        public C16548a(@NotNull io.reactivex.disposables.Disposable disposable) {
            C2668g.b(disposable, "disposable");
            this.f51231a = disposable;
        }

        public void dispose() {
            this.f51231a.dispose();
        }

        public boolean isDisposed() {
            return this.f51231a.isDisposed();
        }
    }

    public void subscribe(Subscriber<? super T> subscriber) {
        this.f56048a.subscribe(subscriber);
    }

    public C18044a(@NotNull C3957b<T> c3957b) {
        C2668g.b(c3957b, "flowable");
        this.f56048a = c3957b;
    }

    @NotNull
    public Disposable start(@NotNull Observer<? super T> observer) {
        C2668g.b(observer, "observer");
        observer = this.f56048a.a(new C16550c(new FlowableStream$start$disposable$1(observer)), new C16550c(new FlowableStream$start$disposable$2(observer)), (Action) new C16549b(new FlowableStream$start$disposable$3(observer)));
        C2668g.a(observer, "disposable");
        return new C16548a(observer);
    }
}
