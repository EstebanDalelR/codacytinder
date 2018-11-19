package com.tinder.common.feed.p195a;

import android.content.Context;
import android.support.v4.content.C0432b;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, d2 = {"appendWithImageSpanInBetween", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "spannableString", "drawableId", "", "start", "prependWithImageSpan", "toSpannableBold", "spanConfig", "Lcom/tinder/common/feed/utils/SpanConfig;", "text", "", "toSpannableRegular", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.feed.a.b */
public final class C8535b {
    @NotNull
    /* renamed from: a */
    public static final SpannableString m36507a(@NotNull C8534a c8534a, @NotNull String str) {
        C2668g.b(c8534a, "spanConfig");
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(c8534a.m36504b()), 0, spannableString.length(), 17);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
        spannableString.setSpan(new ForegroundColorSpan(c8534a.m36502a()), 0, spannableString.length(), 17);
        return spannableString;
    }

    @NotNull
    /* renamed from: b */
    public static final SpannableString m36508b(@NotNull C8534a c8534a, @NotNull String str) {
        C2668g.b(c8534a, "spanConfig");
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(c8534a.m36504b()), 0, spannableString.length(), 17);
        spannableString.setSpan(new ForegroundColorSpan(c8534a.m36502a()), 0, spannableString.length(), 17);
        return spannableString;
    }

    @NotNull
    /* renamed from: a */
    public static final SpannableString m36505a(@NotNull Context context, @NotNull SpannableString spannableString, int i) {
        C2668g.b(context, "context");
        C2668g.b(spannableString, "spannableString");
        context = C0432b.a(context, i);
        if (context == null) {
            C2668g.a();
        }
        C2668g.a(context, "drawable");
        context.setBounds(0, 0, context.getIntrinsicWidth(), context.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(context, 1), 0, 1, 17);
        return spannableString;
    }

    @NotNull
    /* renamed from: a */
    public static final SpannableString m36506a(@NotNull Context context, @NotNull SpannableString spannableString, int i, int i2) {
        C2668g.b(context, "context");
        C2668g.b(spannableString, "spannableString");
        context = C0432b.a(context, i);
        if (context == null) {
            C2668g.a();
        }
        C2668g.a(context, "drawable");
        context.setBounds(0, 0, context.getIntrinsicWidth(), context.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(context, 1), i2, i2 + 1, 17);
        return spannableString;
    }
}
