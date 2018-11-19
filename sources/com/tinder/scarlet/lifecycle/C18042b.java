package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15757b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0016¢\u0006\u0002\u0010\fJ9\u0010\r\u001a\u00020\u000e2.\u0010\u000f\u001a*\u0012\u000e\b\u0000\u0012\n \u0011*\u0004\u0018\u00010\u00030\u0003 \u0011*\u0014\u0012\u000e\b\u0000\u0012\n \u0011*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00100\u0010H\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/lifecycle/FlowableLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "Lorg/reactivestreams/Publisher;", "Lcom/tinder/scarlet/Lifecycle$State;", "flowable", "Lio/reactivex/Flowable;", "scheduler", "Lio/reactivex/Scheduler;", "(Lio/reactivex/Flowable;Lio/reactivex/Scheduler;)V", "combineWith", "others", "", "([Lcom/tinder/scarlet/Lifecycle;)Lcom/tinder/scarlet/Lifecycle;", "subscribe", "", "p0", "Lorg/reactivestreams/Subscriber;", "kotlin.jvm.PlatformType", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.b */
public final class C18042b implements Lifecycle, Publisher<C14785a> {
    /* renamed from: a */
    private final C3957b<C14785a> f56043a;
    /* renamed from: b */
    private final C15679f f56044b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "Lio/reactivex/schedulers/Timed;", "Lcom/tinder/scarlet/Lifecycle$State;", "it", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.lifecycle.b$a */
    static final class C16542a<T, R> implements Function<Object[], R> {
        /* renamed from: a */
        public static final C16542a f51220a = new C16542a();

        C16542a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m61964a((Object[]) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C15757b<C14785a>> m61964a(@NotNull Object[] objArr) {
            C2668g.b(objArr, "it");
            Collection arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type io.reactivex.schedulers.Timed<com.tinder.scarlet.Lifecycle.State>");
                }
                arrayList.add((C15757b) obj);
            }
            return (List) arrayList;
        }
    }

    public void subscribe(Subscriber<? super C14785a> subscriber) {
        this.f56043a.subscribe(subscriber);
    }

    public C18042b(@NotNull C3957b<C14785a> c3957b, @NotNull C15679f c15679f) {
        C2668g.b(c3957b, "flowable");
        C2668g.b(c15679f, "scheduler");
        this.f56043a = c3957b;
        this.f56044b = c15679f;
    }

    @NotNull
    public Lifecycle combineWith(@NotNull Lifecycle... lifecycleArr) {
        C2668g.b(lifecycleArr, "others");
        Iterable<Lifecycle> b = C19299w.m68810b((Collection) C15807n.m59826a(this), (Object[]) lifecycleArr);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) b, 10));
        for (Lifecycle a : b) {
            arrayList.add(C3957b.a(a).c(this.f56044b));
        }
        lifecycleArr = C3957b.a((List) arrayList, (Function) C16542a.f51220a);
        Function1 function1 = FlowableLifecycle$combineWith$flowable$2.f59392a;
        if (function1 != null) {
            function1 = new C16543c(function1);
        }
        lifecycleArr = lifecycleArr.f((Function) function1);
        C2668g.a(lifecycleArr, "flowable");
        return new C18042b(lifecycleArr, this.f56044b);
    }
}
