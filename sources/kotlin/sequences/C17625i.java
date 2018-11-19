package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C19066k;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001b0\u001a\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001a0\u0001¨\u0006\u001c"}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 1, 10}, xi = 1, xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.sequences.i */
class C17625i extends C15868h {
    @NotNull
    /* renamed from: a */
    public static final <T> Sequence<T> m64234a(@NotNull T... tArr) {
        C2668g.b(tArr, "elements");
        return (tArr.length == 0 ? 1 : null) != null ? C17625i.m64228a() : C19066k.m68012n(tArr);
    }

    @NotNull
    /* renamed from: a */
    public static final <T> Sequence<T> m64228a() {
        return C18535c.f57772a;
    }

    @NotNull
    /* renamed from: a */
    public static final <T> Sequence<T> m64232a(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        C2668g.b(sequence, "$receiver");
        return C17625i.m64233a((Sequence) sequence, (Function1) SequencesKt__SequencesKt$flatten$1.f59342a);
    }

    /* renamed from: a */
    private static final <T, R> Sequence<R> m64233a(@NotNull Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        if (sequence instanceof C17633o) {
            return ((C17633o) sequence).m64244a((Function1) function1);
        }
        return new C17622e(sequence, SequencesKt__SequencesKt$flatten$3.f59343a, function1);
    }

    @NotNull
    /* renamed from: b */
    public static final <T> Sequence<T> m64235b(@NotNull Sequence<? extends T> sequence) {
        C2668g.b(sequence, "$receiver");
        return sequence instanceof C17617a ? sequence : new C17617a(sequence);
    }

    @NotNull
    /* renamed from: a */
    public static final <T> Sequence<T> m64230a(@NotNull Function0<? extends T> function0) {
        C2668g.b(function0, "nextFunction");
        return C17625i.m64235b(new C17624f(function0, new SequencesKt__SequencesKt$generateSequence$1(function0)));
    }

    @NotNull
    @LowPriorityInOverloadResolution
    /* renamed from: a */
    public static final <T> Sequence<T> m64229a(@Nullable T t, @NotNull Function1<? super T, ? extends T> function1) {
        C2668g.b(function1, "nextFunction");
        if (t == null) {
            return (Sequence) C18535c.f57772a;
        }
        return (Sequence) new C17624f(new SequencesKt__SequencesKt$generateSequence$2(t), function1);
    }

    @NotNull
    /* renamed from: a */
    public static final <T> Sequence<T> m64231a(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        C2668g.b(function0, "seedFunction");
        C2668g.b(function1, "nextFunction");
        return new C17624f(function0, function1);
    }
}
