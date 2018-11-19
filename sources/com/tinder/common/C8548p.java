package com.tinder.common;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isEnglish", "", "Ljava/util/Locale;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.p */
public final class C8548p {
    /* renamed from: a */
    public static final boolean m36531a(@NotNull Locale locale) {
        C2668g.b(locale, "$receiver");
        return ak.a(new Locale[]{Locale.ENGLISH, Locale.US, Locale.UK, Locale.CANADA}).contains(locale);
    }
}
