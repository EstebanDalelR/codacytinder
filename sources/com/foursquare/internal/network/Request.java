package com.foursquare.internal.network;

import com.foursquare.api.types.FoursquareType;
import java.io.Serializable;
import java.util.concurrent.Callable;

public abstract class Request<T extends FoursquareType> implements Serializable, Callable<C1932g<T>> {
    /* renamed from: a */
    private boolean f5146a = true;

    /* renamed from: b */
    public void mo2010b() {
    }

    /* renamed from: d */
    public abstract C1932g<T> mo2011d();

    public /* synthetic */ Object call() throws Exception {
        return m6677c();
    }

    /* renamed from: a */
    public boolean m6675a() {
        return this.f5146a;
    }

    /* renamed from: a */
    public void m6674a(boolean z) {
        this.f5146a = z;
    }

    /* renamed from: c */
    public final C1932g<T> m6677c() {
        return mo2011d();
    }
}
