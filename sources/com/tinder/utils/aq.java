package com.tinder.utils;

import android.support.v4.text.util.LinkifyCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.utils.StringLinkDetector;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/tinder/utils/StringEntityDetector;", "Lcom/tinder/common/utils/StringLinkDetector;", "()V", "containsAddress", "", "text", "", "containsEmail", "containsEntity", "entityTypeMask", "", "containsPhoneNumber", "containsURL", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aq implements StringLinkDetector {
    public boolean containsURL(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        return m63120a(1, str);
    }

    public boolean containsPhoneNumber(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        return m63120a(4, str);
    }

    public boolean containsEmail(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        return m63120a(2, str);
    }

    public boolean containsAddress(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        return m63120a(8, str);
    }

    /* renamed from: a */
    private final boolean m63120a(int i, String str) {
        CharSequence spannableString = new SpannableString(str);
        LinkifyCompat.a((Spannable) spannableString, i);
        int i2 = 0;
        i = spannableString.getSpans(0, spannableString.length() - 1, URLSpan.class);
        C2668g.a(i, "spannable.getSpans(0, sp…- 1, URLSpan::class.java)");
        if (i.length == 0) {
            i2 = 1;
        }
        return i2 ^ 1;
    }
}
