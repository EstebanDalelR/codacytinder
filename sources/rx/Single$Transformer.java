package rx;

import rx.functions.Func1;

public interface Single$Transformer<T, R> extends Func1<Single<T>, Single<R>> {
}
