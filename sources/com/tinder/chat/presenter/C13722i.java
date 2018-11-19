package com.tinder.chat.presenter;

import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.enums.ReportCause;
import rx.functions.Action0;

/* renamed from: com.tinder.chat.presenter.i */
final /* synthetic */ class C13722i implements Action0 {
    /* renamed from: a */
    private final C8442a f43596a;
    /* renamed from: b */
    private final String f43597b;
    /* renamed from: c */
    private final String f43598c;
    /* renamed from: d */
    private final String f43599d;
    /* renamed from: e */
    private final Attribution f43600e;
    /* renamed from: f */
    private final ReportCause f43601f;
    /* renamed from: g */
    private final String f43602g;
    /* renamed from: h */
    private final String f43603h;

    C13722i(C8442a c8442a, String str, String str2, String str3, Attribution attribution, ReportCause reportCause, String str4, String str5) {
        this.f43596a = c8442a;
        this.f43597b = str;
        this.f43598c = str2;
        this.f43599d = str3;
        this.f43600e = attribution;
        this.f43601f = reportCause;
        this.f43602g = str4;
        this.f43603h = str5;
    }

    public void call() {
        this.f43596a.m36055a(this.f43597b, this.f43598c, this.f43599d, this.f43600e, this.f43601f, this.f43602g, this.f43603h);
    }
}
