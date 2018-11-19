package com.tinder.presenters;

import com.tinder.domain.common.model.Subscription;
import io.reactivex.functions.Function;

final /* synthetic */ class gb implements Function {
    /* renamed from: a */
    static final Function f49910a = new gb();

    private gb() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((Subscription) obj).isGold());
    }
}
