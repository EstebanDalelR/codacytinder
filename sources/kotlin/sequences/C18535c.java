package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C17556x;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "()V", "drop", "n", "", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.c */
final class C18535c implements DropTakeSequence, Sequence {
    /* renamed from: a */
    public static final C18535c f57772a = new C18535c();

    private C18535c() {
    }

    public /* synthetic */ Sequence drop(int i) {
        return m66930a(i);
    }

    public /* synthetic */ Sequence take(int i) {
        return m66931b(i);
    }

    @NotNull
    public Iterator iterator() {
        return C17556x.f54757a;
    }

    @NotNull
    /* renamed from: a */
    public C18535c m66930a(int i) {
        return f57772a;
    }

    @NotNull
    /* renamed from: b */
    public C18535c m66931b(int i) {
        return f57772a;
    }
}
