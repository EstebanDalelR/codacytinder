package com.tinder.usecase;

import com.tinder.domain.meta.gateway.MetaGateway;
import rx.functions.Action0;

/* renamed from: com.tinder.usecase.b */
final /* synthetic */ class C18985b implements Action0 {
    /* renamed from: a */
    private final MetaGateway f58723a;

    private C18985b(MetaGateway metaGateway) {
        this.f58723a = metaGateway;
    }

    /* renamed from: a */
    static Action0 m67499a(MetaGateway metaGateway) {
        return new C18985b(metaGateway);
    }

    public void call() {
        this.f58723a.clear();
    }
}
