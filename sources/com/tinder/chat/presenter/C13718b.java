package com.tinder.chat.presenter;

import com.tinder.enums.ReportCause;
import retrofit2.Response;
import rx.functions.Action1;

/* renamed from: com.tinder.chat.presenter.b */
final /* synthetic */ class C13718b implements Action1 {
    /* renamed from: a */
    private final C8442a f43583a;
    /* renamed from: b */
    private final String f43584b;
    /* renamed from: c */
    private final String f43585c;
    /* renamed from: d */
    private final ReportCause f43586d;
    /* renamed from: e */
    private final String f43587e;

    C13718b(C8442a c8442a, String str, String str2, ReportCause reportCause, String str3) {
        this.f43583a = c8442a;
        this.f43584b = str;
        this.f43585c = str2;
        this.f43586d = reportCause;
        this.f43587e = str3;
    }

    public void call(Object obj) {
        this.f43583a.m36052a(this.f43584b, this.f43585c, this.f43586d, this.f43587e, (Response) obj);
    }
}
