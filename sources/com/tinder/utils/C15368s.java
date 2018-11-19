package com.tinder.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C15875b;
import kotlin.text.CharCategory;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"containsOnlyEmojis", "", "", "getContainsOnlyEmojis", "(Ljava/lang/String;)Z", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.utils.s */
public final class C15368s {
    /* renamed from: a */
    public static final boolean m57681a(@NotNull String str) {
        C2668g.b(str, "$receiver");
        CharSequence charSequence = str;
        if ((charSequence.length() == 0 ? 1 : null) != null) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            Object obj;
            CharCategory b = C15875b.m59927b(charSequence.charAt(i));
            if (b != CharCategory.SURROGATE) {
                if (b != CharCategory.OTHER_SYMBOL) {
                    obj = null;
                    if (obj == null) {
                        str = null;
                        break;
                    }
                }
            }
            obj = 1;
            if (obj == null) {
                str = null;
                break;
            }
        }
        str = true;
        if (str != null) {
            return true;
        }
        return false;
    }
}
