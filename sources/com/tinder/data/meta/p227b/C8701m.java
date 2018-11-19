package com.tinder.data.meta.p227b;

import com.tinder.data.meta.store.MetaStore;
import java.util.concurrent.Callable;

/* renamed from: com.tinder.data.meta.b.m */
final /* synthetic */ class C8701m implements Callable {
    /* renamed from: a */
    private final MetaStore f30654a;

    private C8701m(MetaStore metaStore) {
        this.f30654a = metaStore;
    }

    /* renamed from: a */
    static Callable m37163a(MetaStore metaStore) {
        return new C8701m(metaStore);
    }

    public Object call() {
        return this.f30654a.getCurrentUser();
    }
}
