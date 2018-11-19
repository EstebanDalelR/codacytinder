package com.facebook.accountkit.ui;

import android.app.Activity;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.facebook.accountkit.ui.h */
abstract class C4127h extends C3214p {
    /* renamed from: a */
    abstract LoginFlowState mo3698a();

    /* renamed from: b */
    abstract boolean mo3699b();

    C4127h() {
    }

    @Nullable
    /* renamed from: h */
    protected GoogleApiClient m16180h() {
        Activity activity = getActivity();
        return (activity == null || !(activity instanceof AccountKitActivity)) ? null : ((AccountKitActivity) activity).m18721a();
    }

    @Nullable
    /* renamed from: i */
    protected LoginFlowState m16181i() {
        Activity activity = getActivity();
        return (activity == null || !(activity instanceof AccountKitActivity)) ? null : ((AccountKitActivity) activity).m18732b();
    }
}
