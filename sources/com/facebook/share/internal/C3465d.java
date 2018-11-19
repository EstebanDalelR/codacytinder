package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

@Deprecated
/* renamed from: com.facebook.share.internal.d */
final class C3465d extends PlatformServiceClient {
    /* renamed from: a */
    private String f10490a;

    C3465d(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str);
        this.f10490a = str2;
    }

    /* renamed from: a */
    protected void mo1867a(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.f10490a);
    }
}
