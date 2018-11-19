package com.tinder.scarlet.internal.connection.p492a;

import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.C14788b.C16505b;
import com.tinder.scarlet.internal.connection.C14804a.C14803b;
import io.reactivex.subscribers.C18433a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/scarlet/internal/connection/subscriber/RetryTimerSubscriber;", "Lio/reactivex/subscribers/DisposableSubscriber;", "", "stateManager", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "(Lcom/tinder/scarlet/internal/connection/Connection$StateManager;)V", "onComplete", "", "onError", "", "throwable", "", "onNext", "t", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.connection.a.b */
public final class C18820b extends C18433a<Long> {
    /* renamed from: a */
    private final C14803b f58360a;

    public void onComplete() {
    }

    public /* synthetic */ void onError(Throwable th) {
        m67272a(th);
    }

    public /* synthetic */ void onNext(Object obj) {
        m67273a(((Number) obj).longValue());
    }

    public C18820b(@NotNull C14803b c14803b) {
        C2668g.b(c14803b, "stateManager");
        this.f58360a = c14803b;
    }

    /* renamed from: a */
    public void m67273a(long j) {
        this.f58360a.m56135a((C14788b) C16505b.f51178a);
    }

    @NotNull
    /* renamed from: a */
    public Void m67272a(@NotNull Throwable th) {
        C2668g.b(th, "throwable");
        throw th;
    }
}
