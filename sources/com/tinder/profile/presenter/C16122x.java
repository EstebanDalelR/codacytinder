package com.tinder.profile.presenter;

import com.tinder.domain.common.model.Job;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.profile.presenter.x */
final /* synthetic */ class C16122x implements Consumer {
    /* renamed from: a */
    private final C14431r f50196a;
    /* renamed from: b */
    private final Job f50197b;

    C16122x(C14431r c14431r, Job job) {
        this.f50196a = c14431r;
        this.f50197b = job;
    }

    public void accept(Object obj) {
        this.f50196a.m55095a(this.f50197b, (Throwable) obj);
    }
}
