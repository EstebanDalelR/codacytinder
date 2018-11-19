package com.tinder.common.view.extension;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¨\u0006\u0007"}, d2 = {"cloneUrLSpansOnlyAfterReplace", "Landroid/text/Spannable;", "oldValue", "", "newValue", "urlReadableTextMap", "", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.view.extension.f */
public final class C8586f {
    @NotNull
    /* renamed from: a */
    public static final Spannable m36612a(@NotNull Spannable spannable, @NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        C2668g.b(spannable, "$receiver");
        C2668g.b(str, "oldValue");
        C2668g.b(str2, "newValue");
        C2668g.b(map, "urlReadableTextMap");
        if (C2668g.a(str, str2)) {
            return spannable;
        }
        Spannable spannable2;
        String obj = spannable.toString();
        str = C19303i.a(obj, str, str2, true);
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, obj.length(), URLSpan.class);
        C2668g.a(uRLSpanArr, "spans");
        if (((uRLSpanArr.length == 0 ? 1 : 0) ^ 1) != 0) {
            CharSequence charSequence = str;
            SpannableString spannableString = new SpannableString(charSequence);
            int length = uRLSpanArr.length;
            while (i < length) {
                int length2;
                URLSpan uRLSpan = uRLSpanArr[i];
                C2668g.a(uRLSpan, "span");
                String url = uRLSpan.getURL();
                C2668g.a(url, "span.url");
                int a = C19303i.a(charSequence, url, 0, false, 6, null);
                if (a < 0) {
                    String url2 = uRLSpan.getURL();
                    C2668g.a(url2, "span.url");
                    Locale locale = Locale.US;
                    C2668g.a(locale, "Locale.US");
                    if (url2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    url2 = url2.toLowerCase(locale);
                    C2668g.a(url2, "(this as java.lang.String).toLowerCase(locale)");
                    String str3 = (String) map.get(url2);
                    if (str3 != null) {
                        a = C19303i.a(charSequence, str3, 0, false, 6, null);
                        length2 = str3.length() + a;
                    } else {
                        i++;
                    }
                } else {
                    length2 = uRLSpan.getURL().length() + a;
                }
                spannableString.setSpan(uRLSpan, a, length2, spannable.getSpanFlags(uRLSpan));
                i++;
            }
            spannable2 = spannableString;
        } else {
            spannable2 = new SpannableString(str);
        }
        return spannable2;
    }
}
