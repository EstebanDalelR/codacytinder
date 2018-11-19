package com.tinder.data.updates;

import com.tinder.domain.updates.model.UpdateSignal;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/updates/SyncUpdates;", "", "requestConfigurator", "Lcom/tinder/data/updates/UpdatesRequestConfigurator;", "responseHandler", "Lcom/tinder/data/updates/UpdatesResponseHandler;", "(Lcom/tinder/data/updates/UpdatesRequestConfigurator;Lcom/tinder/data/updates/UpdatesResponseHandler;)V", "handleUpdatesResponse", "Lio/reactivex/Completable;", "updatesRequestContext", "Lcom/tinder/data/updates/UpdatesRequestContext;", "requestFromUpdates", "Lio/reactivex/Single;", "updateSignal", "Lcom/tinder/domain/updates/model/UpdateSignal;", "sync", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.i */
public final class C8805i {
    /* renamed from: a */
    private final C8813v f30894a;
    /* renamed from: b */
    private final C11085z f30895b;

    @Inject
    public C8805i(@NotNull C8813v c8813v, @NotNull C11085z c11085z) {
        C2668g.b(c8813v, "requestConfigurator");
        C2668g.b(c11085z, "responseHandler");
        this.f30894a = c8813v;
        this.f30895b = c11085z;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37491a(@NotNull UpdateSignal updateSignal) {
        C2668g.b(updateSignal, "updateSignal");
        updateSignal = m37490b(updateSignal).d(new C11060j(new SyncUpdates$sync$1(this)));
        C2668g.a(updateSignal, "requestFromUpdates(updat…(::handleUpdatesResponse)");
        return updateSignal;
    }

    /* renamed from: b */
    private final C3960g<C8815y> m37490b(UpdateSignal updateSignal) {
        return this.f30894a.m37514a(updateSignal);
    }

    /* renamed from: a */
    private final C3956a m37489a(C8815y c8815y) {
        return this.f30895b.m43773a(c8815y);
    }
}
