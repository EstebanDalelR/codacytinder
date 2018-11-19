package com.tinder.scarlet.internal.connection.p492a;

import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.C14788b.C16504a.C18035a;
import com.tinder.scarlet.C14788b.C16504a.C18036b;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.internal.connection.C14804a.C14803b;
import io.reactivex.subscribers.C18433a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\tH\u0014J\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/internal/connection/subscriber/LifecycleStateSubscriber;", "Lio/reactivex/subscribers/DisposableSubscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "stateManager", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "(Lcom/tinder/scarlet/internal/connection/Connection$StateManager;)V", "pendingRequestCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "onComplete", "", "onError", "", "throwable", "", "onNext", "lifecycleState", "onStart", "requestNext", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.connection.a.a */
public final class C18819a extends C18433a<C14785a> {
    /* renamed from: a */
    private final AtomicInteger f58358a = new AtomicInteger();
    /* renamed from: c */
    private final C14803b f58359c;

    public /* synthetic */ void onError(Throwable th) {
        m67268a(th);
    }

    public /* synthetic */ void onNext(Object obj) {
        m67270a((C14785a) obj);
    }

    public C18819a(@NotNull C14803b c14803b) {
        C2668g.b(c14803b, "stateManager");
        this.f58359c = c14803b;
    }

    /* renamed from: a */
    protected void mo13975a() {
        m66614b(1);
    }

    /* renamed from: a */
    public void m67270a(@NotNull C14785a c14785a) {
        C2668g.b(c14785a, "lifecycleState");
        if (this.f58358a.decrementAndGet() < 0) {
            this.f58358a.set(0);
        }
        this.f58359c.m56135a((C14788b) new C18035a(c14785a));
    }

    public void onComplete() {
        this.f58359c.m56135a((C14788b) C18036b.f56036a);
    }

    @NotNull
    /* renamed from: a */
    public Void m67268a(@NotNull Throwable th) {
        C2668g.b(th, "throwable");
        throw th;
    }

    /* renamed from: b */
    public final void m67271b() {
        if (this.f58358a.get() == 0) {
            this.f58358a.incrementAndGet();
            m66614b(1);
        }
    }
}
