package com.tinder.profile.presenter;

import com.tinder.domain.recs.model.UserRec;
import com.tinder.enums.ReportCause;
import retrofit2.Response;
import rx.functions.Action1;

final /* synthetic */ class br implements Action1 {
    /* renamed from: a */
    private final bp f57976a;
    /* renamed from: b */
    private final String f57977b;
    /* renamed from: c */
    private final ReportCause f57978c;
    /* renamed from: d */
    private final String f57979d;
    /* renamed from: e */
    private final UserRec f57980e;

    br(bp bpVar, String str, ReportCause reportCause, String str2, UserRec userRec) {
        this.f57976a = bpVar;
        this.f57977b = str;
        this.f57978c = reportCause;
        this.f57979d = str2;
        this.f57980e = userRec;
    }

    public void call(Object obj) {
        this.f57976a.m55052a(this.f57977b, this.f57978c, this.f57979d, this.f57980e, (Response) obj);
    }
}
