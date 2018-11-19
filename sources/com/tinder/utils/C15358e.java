package com.tinder.utils;

import android.os.Build.VERSION;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/utils/AndroidVersionUtil;", "", "()V", "atLeastLollipop", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.utils.e */
public final class C15358e {
    /* renamed from: a */
    public static final C15358e f47625a = new C15358e();

    private C15358e() {
    }

    /* renamed from: a */
    public final boolean m57654a() {
        return VERSION.SDK_INT >= 21;
    }
}
