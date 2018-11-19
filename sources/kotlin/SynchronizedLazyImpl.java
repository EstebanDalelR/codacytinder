package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
final class SynchronizedLazyImpl<T> implements Serializable, Lazy<T> {
    /* renamed from: a */
    private Function0<? extends T> f54729a;
    /* renamed from: b */
    private volatile Object f54730b;
    /* renamed from: c */
    private final Object f54731c;

    public SynchronizedLazyImpl(@NotNull Function0<? extends T> function0, @Nullable Object obj) {
        C2668g.b(function0, "initializer");
        this.f54729a = function0;
        this.f54730b = C15812h.f49015a;
        if (obj == null) {
            obj = this;
        }
        this.f54731c = obj;
    }

    public /* synthetic */ SynchronizedLazyImpl(Function0 function0, Object obj, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(function0, obj);
    }

    public T getValue() {
        T t = this.f54730b;
        if (t != C15812h.f49015a) {
            return t;
        }
        T t2;
        synchronized (this.f54731c) {
            t2 = this.f54730b;
            if (t2 == C15812h.f49015a) {
                Function0 function0 = this.f54729a;
                if (function0 == null) {
                    C2668g.a();
                }
                t2 = function0.invoke();
                this.f54730b = t2;
                this.f54729a = (Function0) null;
            }
        }
        return t2;
    }

    public boolean isInitialized() {
        return this.f54730b != C15812h.f49015a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }
}
