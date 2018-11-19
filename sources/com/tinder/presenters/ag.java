package com.tinder.presenters;

import com.tinder.domain.profile.usecase.SMSUpdateSchool.OnSchoolChangedListener;
import java.util.List;

final /* synthetic */ class ag implements OnSchoolChangedListener {
    /* renamed from: a */
    private final C17744d f49838a;
    /* renamed from: b */
    private final String f49839b;

    ag(C17744d c17744d, String str) {
        this.f49838a = c17744d;
        this.f49839b = str;
    }

    public void afterSchoolChanged(List list) {
        this.f49838a.m64726a(this.f49839b, list);
    }
}
