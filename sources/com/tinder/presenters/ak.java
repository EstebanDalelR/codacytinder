package com.tinder.presenters;

import com.tinder.model.GlobalConfig;
import rx.functions.Func1;

final /* synthetic */ class ak implements Func1 {
    /* renamed from: a */
    static final Func1 f55207a = new ak();

    private ak() {
    }

    public Object call(Object obj) {
        return Boolean.valueOf(((GlobalConfig) obj).canEditSchools());
    }
}
