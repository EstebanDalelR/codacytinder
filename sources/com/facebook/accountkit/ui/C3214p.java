package com.facebook.accountkit.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.accountkit.ui.p */
abstract class C3214p extends af {
    /* renamed from: a */
    protected abstract View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    C3214p() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView == null) {
            onCreateView = mo3276a(layoutInflater, viewGroup, bundle);
        }
        ag.m4602a(getActivity(), m4589n(), onCreateView);
        return onCreateView;
    }
}
