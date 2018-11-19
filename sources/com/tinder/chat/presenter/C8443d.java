package com.tinder.chat.presenter;

import com.tinder.enums.ReportCause;
import java.util.concurrent.Callable;

/* renamed from: com.tinder.chat.presenter.d */
final /* synthetic */ class C8443d implements Callable {
    /* renamed from: a */
    private final C8442a f30026a;
    /* renamed from: b */
    private final ReportCause f30027b;
    /* renamed from: c */
    private final String f30028c;

    C8443d(C8442a c8442a, ReportCause reportCause, String str) {
        this.f30026a = c8442a;
        this.f30027b = reportCause;
        this.f30028c = str;
    }

    public Object call() {
        return this.f30026a.m36044a(this.f30027b, this.f30028c);
    }
}
