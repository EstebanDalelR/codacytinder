package com.tinder.data.meta.p226a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.TinderSelect.Select;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.meta.model.SelectSettings;
import java8.util.Objects;
import javax.inject.Inject;

/* renamed from: com.tinder.data.meta.a.k */
public class C10848k extends C2646o<SelectSettings, Select> {
    @NonNull
    /* renamed from: a */
    private final C10738l f35469a;

    @Inject
    public C10848k(@NonNull C10738l c10738l) {
        this.f35469a = c10738l;
    }

    @Nullable
    /* renamed from: a */
    public SelectSettings m43323a(@NonNull Select select) {
        int intValue = ((Integer) Objects.b(select.invitationCount(), Integer.valueOf(0))).intValue();
        String dateAdded = select.dateAdded();
        return SelectSettings.builder().dateAdded(dateAdded != null ? this.f35469a.m43129a(dateAdded) : null).invitationCount(intValue).isSelectedRecsEnabled(((Boolean) Objects.b(select.recsEnabled(), Boolean.valueOf(false))).booleanValue()).build();
    }
}
