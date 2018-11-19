package com.tinder.settingsemail.email.adapter;

import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel.Type;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.adapter.a */
public final /* synthetic */ class C14925a {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46618a = new int[Type.values().length];

    static {
        f46618a[Type.EMAIL.ordinal()] = 1;
        f46618a[Type.SETTING_OPTIONS.ordinal()] = 2;
        f46618a[Type.UNSUBSCRIBE.ordinal()] = 3;
    }
}
