package com.tinder.scarlet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u0007\bJ\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\t"}, d2 = {"Lcom/tinder/scarlet/Stream;", "T", "Lorg/reactivestreams/Publisher;", "start", "Lcom/tinder/scarlet/Stream$Disposable;", "observer", "Lcom/tinder/scarlet/Stream$Observer;", "Disposable", "Observer", "scarlet-core"}, k = 1, mv = {1, 1, 9})
public interface Stream<T> extends Publisher<T> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/scarlet/Stream$Disposable;", "", "dispose", "", "isDisposed", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    public interface Disposable {
        void dispose();

        boolean isDisposed();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/Stream$Observer;", "T", "", "onComplete", "", "onError", "throwable", "", "onNext", "data", "(Ljava/lang/Object;)V", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    public interface Observer<T> {
        void onComplete();

        void onError(@NotNull Throwable th);

        void onNext(T t);
    }

    @NotNull
    Disposable start(@NotNull Observer<? super T> observer);
}
