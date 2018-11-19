package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.Lifecycle.C14785a.C16490b;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscriber;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H\u0001¢\u0006\u0002\u0010\bJ9\u0010\t\u001a\u00020\n2.\u0010\u000b\u001a*\u0012\u000e\b\u0000\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0014\u0012\u000e\b\u0000\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\fH\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/scarlet/lifecycle/DefaultLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "lifecycleRegistry", "Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "(Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;)V", "combineWith", "others", "", "([Lcom/tinder/scarlet/Lifecycle;)Lcom/tinder/scarlet/Lifecycle;", "subscribe", "", "p0", "Lorg/reactivestreams/Subscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "kotlin.jvm.PlatformType", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.a */
public final class C18039a implements Lifecycle {
    /* renamed from: a */
    private final C18043d f56039a;

    public C18039a() {
        this(null, 1, null);
    }

    @NotNull
    public Lifecycle combineWith(@NotNull Lifecycle... lifecycleArr) {
        C2668g.b(lifecycleArr, "others");
        return this.f56039a.combineWith(lifecycleArr);
    }

    public void subscribe(Subscriber<? super C14785a> subscriber) {
        this.f56039a.subscribe(subscriber);
    }

    public C18039a(@NotNull C18043d c18043d) {
        C2668g.b(c18043d, "lifecycleRegistry");
        this.f56039a = c18043d;
        this.f56039a.m65511a((C14785a) C16490b.f51167a);
    }

    public /* synthetic */ C18039a(C18043d c18043d, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            c18043d = new C18043d(0, 1, 0);
        }
        this(c18043d);
    }
}
