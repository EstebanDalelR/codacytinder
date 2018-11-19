package com.tinder.boost.provider;

import android.content.Context;
import com.tinder.boost.view.C13658h;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;

/* renamed from: com.tinder.boost.provider.j */
final /* synthetic */ class C10444j implements Function {
    /* renamed from: a */
    private final Context f34031a;

    C10444j(Context context) {
        this.f34031a = context;
    }

    public Object apply(Object obj) {
        return C3959e.just(new C13658h(this.f34031a, (String) obj));
    }
}
