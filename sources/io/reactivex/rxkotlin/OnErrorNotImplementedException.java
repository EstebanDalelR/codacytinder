package io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/reactivex/rxkotlin/OnErrorNotImplementedException;", "Ljava/lang/RuntimeException;", "e", "", "(Ljava/lang/Throwable;)V", "rxkotlin_main"}, k = 1, mv = {1, 1, 6})
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(@NotNull Throwable th) {
        C2668g.b(th, "e");
        super(th);
    }
}
