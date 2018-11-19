package com.tinder.common.view.extension;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"getSpannedString", "", "Landroid/widget/TextView;", "setViewVisibleOrGone", "", "Landroid/view/View;", "isVisible", "", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.view.extension.g */
public final class C8587g {
    /* renamed from: a */
    public static final void m36614a(@NotNull View view, boolean z) {
        C2668g.b(view, "$receiver");
        if (z) {
            view.setVisibility(false);
        } else {
            view.setVisibility(true);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final String m36613a(@NotNull TextView textView) {
        C2668g.b(textView, "$receiver");
        textView = textView.getText();
        if (!(textView instanceof Spannable)) {
            return "";
        }
        textView = ((URLSpan[]) ((Spannable) textView).getSpans(0, textView.length(), URLSpan.class))[0];
        C2668g.a(textView, "text.getSpans(0, text.le…, URLSpan::class.java)[0]");
        textView = textView.getURL();
        C2668g.a(textView, "text.getSpans(0, text.le…LSpan::class.java)[0].url");
        return textView;
    }
}
