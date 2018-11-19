package com.tinder.common.provider;

import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/common/provider/DefaultLocaleProvider;", "", "()V", "get", "Ljava/util/Locale;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Use com.tinder.common.locale.DefaultLocaleProvider instead")
/* renamed from: com.tinder.common.provider.c */
public final class C2643c {
    @NotNull
    /* renamed from: a */
    public final Locale m9994a() {
        Object obj = Locale.getDefault();
        C2668g.m10305a(obj, "Locale.getDefault()");
        return obj;
    }
}
