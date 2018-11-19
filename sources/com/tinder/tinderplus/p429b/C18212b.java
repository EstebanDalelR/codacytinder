package com.tinder.tinderplus.p429b;

import android.util.Pair;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.meta.model.PlusControlSettings;
import rx.functions.Func2;

/* renamed from: com.tinder.tinderplus.b.b */
final /* synthetic */ class C18212b implements Func2 {
    /* renamed from: a */
    static final Func2 f56467a = new C18212b();

    private C18212b() {
    }

    public Object call(Object obj, Object obj2) {
        return Pair.create((Subscription) obj, (PlusControlSettings) obj2);
    }
}
