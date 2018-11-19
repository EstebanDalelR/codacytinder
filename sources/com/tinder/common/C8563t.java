package com.tinder.common;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"setHtmlWithLinks", "", "Landroid/widget/TextView;", "html", "", "urlClickListener", "Lcom/tinder/common/UrlClickListener;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.t */
public final class C8563t {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/common/TextViewExtKt$setHtmlWithLinks$clickable$1", "Landroid/text/style/ClickableSpan;", "(Lcom/tinder/common/UrlClickListener;Landroid/text/style/URLSpan;)V", "onClick", "", "widget", "Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.t$a */
    public static final class C8562a extends ClickableSpan {
        /* renamed from: a */
        final /* synthetic */ UrlClickListener f30311a;
        /* renamed from: b */
        final /* synthetic */ URLSpan f30312b;

        C8562a(UrlClickListener urlClickListener, URLSpan uRLSpan) {
            this.f30311a = urlClickListener;
            this.f30312b = uRLSpan;
        }

        public void onClick(@Nullable View view) {
            view = this.f30311a;
            if (view != null) {
                URLSpan uRLSpan = this.f30312b;
                C2668g.a(uRLSpan, "span");
                view.onUrlClick(uRLSpan);
            }
        }
    }

    /* renamed from: a */
    public static final void m36564a(@NotNull TextView textView, @NotNull String str, @Nullable UrlClickListener urlClickListener) {
        C2668g.b(textView, "$receiver");
        C2668g.b(str, "html");
        str = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, str.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        while (i < length) {
            URLSpan uRLSpan = uRLSpanArr[i];
            spannableStringBuilder.setSpan(new C8562a(urlClickListener, uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
            i++;
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
