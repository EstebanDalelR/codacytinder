package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.f */
final class C17624f<T> implements Sequence<T> {
    /* renamed from: a */
    private final Function0<T> f54794a;
    /* renamed from: b */
    private final Function1<T, T> f54795b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\t\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "(Lkotlin/sequences/GeneratorSequence;)V", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.sequences.f$a */
    public static final class C17623a implements Iterator<T>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C17624f f54791a;
        @Nullable
        /* renamed from: b */
        private T f54792b;
        /* renamed from: c */
        private int f54793c = -2;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17623a(C17624f c17624f) {
            this.f54791a = c17624f;
        }

        /* renamed from: a */
        private final void m64225a() {
            Object invoke;
            if (this.f54793c == -2) {
                invoke = this.f54791a.f54794a.invoke();
            } else {
                Function1 b = this.f54791a.f54795b;
                Object obj = this.f54792b;
                if (obj == null) {
                    C2668g.a();
                }
                invoke = b.invoke(obj);
            }
            this.f54792b = invoke;
            this.f54793c = this.f54792b == null ? 0 : 1;
        }

        @NotNull
        public T next() {
            if (this.f54793c < 0) {
                m64225a();
            }
            if (this.f54793c == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f54792b;
            if (t == null) {
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            this.f54793c = -1;
            return t;
        }

        public boolean hasNext() {
            if (this.f54793c < 0) {
                m64225a();
            }
            return this.f54793c == 1;
        }
    }

    public C17624f(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        C2668g.b(function0, "getInitialValue");
        C2668g.b(function1, "getNextValue");
        this.f54794a = function0;
        this.f54795b = function1;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new C17623a(this);
    }
}
