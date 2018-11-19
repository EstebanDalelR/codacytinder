package com.tinder.common.reactivex.p197b;

import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/common/reactivex/disposables/DisposableMap;", "KEY", "", "()V", "disposableMap", "", "Lio/reactivex/disposables/Disposable;", "size", "", "getSize", "()I", "clear", "", "put", "key", "disposable", "(Ljava/lang/Object;Lio/reactivex/disposables/Disposable;)Lio/reactivex/disposables/Disposable;", "remove", "(Ljava/lang/Object;)Lio/reactivex/disposables/Disposable;", "reactivex"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.reactivex.b.a */
public final class C8551a<KEY> {
    /* renamed from: a */
    private final Map<KEY, Disposable> f30294a = new LinkedHashMap();

    @Nullable
    /* renamed from: a */
    public final Disposable m36536a(@NotNull KEY key, @NotNull Disposable disposable) {
        C2668g.b(key, "key");
        C2668g.b(disposable, "disposable");
        synchronized (this.f30294a) {
            key = (Disposable) this.f30294a.put(key, disposable);
            if (key != null) {
                key.dispose();
            } else {
                key = null;
            }
        }
        return key;
    }
}
