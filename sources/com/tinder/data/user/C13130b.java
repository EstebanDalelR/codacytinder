package com.tinder.data.user;

import com.tinder.api.response.UserResponse;
import rx.functions.Func1;

/* renamed from: com.tinder.data.user.b */
final /* synthetic */ class C13130b implements Func1 {
    /* renamed from: a */
    static final Func1 f41783a = new C13130b();

    private C13130b() {
    }

    public Object call(Object obj) {
        return ((UserResponse) obj).getUser();
    }
}
