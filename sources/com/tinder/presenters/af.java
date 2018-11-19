package com.tinder.presenters;

import com.tinder.domain.profile.usecase.SMSUpdateJob.OnJobChangedListener;
import java.util.List;

final /* synthetic */ class af implements OnJobChangedListener {
    /* renamed from: a */
    private final C17744d f49835a;
    /* renamed from: b */
    private final String f49836b;
    /* renamed from: c */
    private final String f49837c;

    af(C17744d c17744d, String str, String str2) {
        this.f49835a = c17744d;
        this.f49836b = str;
        this.f49837c = str2;
    }

    public void afterJobChanged(List list) {
        this.f49835a.m64725a(this.f49836b, this.f49837c, list);
    }
}
