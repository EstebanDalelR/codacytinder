package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.Lifecycle.C14785a.C16490b;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c.C18033a;
import io.reactivex.schedulers.C15757b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.p458a.C15798b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u0002H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0001H\u0002\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0001H\u0002¨\u0006\t"}, d2 = {"combine", "Lcom/tinder/scarlet/Lifecycle$State;", "", "Lio/reactivex/schedulers/Timed;", "isEquivalentTo", "", "other", "isStopped", "isStoppedAndAborted", "scarlet"}, k = 2, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.f */
public final class C14819f {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.lifecycle.f$a */
    public static final class C14818a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C15798b.m59813a(Long.valueOf(((C15757b) t).m59014b()), Long.valueOf(((C15757b) t2).m59014b()));
        }
    }

    @NotNull
    /* renamed from: a */
    public static final C14785a m56162a(@NotNull List<C15757b<C14785a>> list) {
        Object obj;
        C2668g.b(list, "$receiver");
        Iterable<C15757b> iterable = list;
        boolean z = iterable instanceof Collection;
        Object obj2 = null;
        if (!(z && ((Collection) iterable).isEmpty())) {
            for (C15757b a : iterable) {
                Object a2 = a.m59013a();
                C2668g.a(a2, "it.value()");
                if (C14819f.m56165b((C14785a) a2)) {
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj != null) {
            return (C14785a) C18033a.f56033a;
        }
        if (!z || !((Collection) iterable).isEmpty()) {
            for (C15757b a3 : iterable) {
                obj = a3.m59013a();
                C2668g.a(obj, "it.value()");
                if (C14819f.m56163a((C14785a) obj)) {
                    obj2 = 1;
                    break;
                }
            }
        }
        if (obj2 == null) {
            return (C14785a) C16490b.f51167a;
        }
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            obj2 = ((C15757b) next).m59013a();
            C2668g.a(obj2, "it.value()");
            if (C14819f.m56163a((C14785a) obj2)) {
                arrayList.add(next);
            }
        }
        list = ((C15757b) C19299w.m68829f((List) C19299w.m68799a((Iterable) (List) arrayList, (Comparator) new C14818a()))).m59013a();
        C2668g.a(list, "filter { it.value().isSt…st()\n            .value()");
        return (C14785a) list;
    }

    /* renamed from: a */
    public static final boolean m56164a(@NotNull C14785a c14785a, @NotNull C14785a c14785a2) {
        C2668g.b(c14785a, "$receiver");
        C2668g.b(c14785a2, "other");
        if (!C2668g.a(c14785a, c14785a2)) {
            if (C14819f.m56163a(c14785a) == null || C14819f.m56163a(c14785a2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static final boolean m56163a(@NotNull C14785a c14785a) {
        return c14785a instanceof C16491c;
    }

    /* renamed from: b */
    private static final boolean m56165b(@NotNull C14785a c14785a) {
        return C2668g.a(c14785a, C18033a.f56033a);
    }
}
