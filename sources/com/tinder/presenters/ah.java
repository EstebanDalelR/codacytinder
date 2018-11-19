package com.tinder.presenters;

import com.tinder.model.GlobalConfig;
import rx.functions.Func1;

final /* synthetic */ class ah implements Func1 {
    /* renamed from: a */
    static final Func1 f55206a = new ah();

    private ah() {
    }

    public Object call(Object obj) {
        return Boolean.valueOf(((GlobalConfig) obj).canEditJobs());
    }
}
