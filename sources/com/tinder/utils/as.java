package com.tinder.utils;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"setTextWithBoldWord", "", "Landroid/widget/TextView;", "entirePhrase", "", "word", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class as {
    /* renamed from: a */
    public static final void m57625a(@NotNull TextView textView, @NotNull String str, @NotNull String str2) {
        C2668g.b(textView, "$receiver");
        C2668g.b(str, "entirePhrase");
        C2668g.b(str2, "word");
        CharSequence charSequence = str;
        int a = C19298r.m68744a(charSequence, str2, 0, false, 6, null);
        str2 = str2.length() + a;
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new StyleSpan(1), a, str2, 0);
        textView.setText(spannableString);
    }
}
