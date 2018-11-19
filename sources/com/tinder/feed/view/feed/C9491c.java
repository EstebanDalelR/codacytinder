package com.tinder.feed.view.feed;

import android.content.Context;
import android.support.v4.content.C0432b;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.tinder.R;
import com.tinder.common.feed.p195a.C8534a;
import com.tinder.common.feed.p195a.C8535b;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n²\u0006\u0015\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0002¢\u0006\u0000"}, d2 = {"Lcom/tinder/feed/view/feed/FeedCommentSpannableStringFormatter;", "", "()V", "getSpannableStringForFooter", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "footerValues", "Lcom/tinder/feed/view/feed/FeedCommentSpannableStringFormatter$FeedCommentDescription;", "FeedCommentDescription", "Tinder_release", "whiteSpace1", "", "kotlin.jvm.PlatformType"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.c */
public final class C9491c {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31809a = new KProperty[]{C15825i.a(new PropertyReference0Impl(C15825i.a(C9491c.class), "whiteSpace1", "<v#0>"))};

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J?\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tinder/feed/view/feed/FeedCommentSpannableStringFormatter$FeedCommentDescription;", "", "firstStringWithColorRes", "Lkotlin/Pair;", "", "", "secondStringWithColorRes", "drawableRes", "(Lkotlin/Pair;Lkotlin/Pair;I)V", "getDrawableRes", "()I", "getFirstStringWithColorRes", "()Lkotlin/Pair;", "getSecondStringWithColorRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.feed.c$a */
    public static final class C9490a {
        @NotNull
        /* renamed from: a */
        private final Pair<String, Integer> f31806a;
        @NotNull
        /* renamed from: b */
        private final Pair<String, Integer> f31807b;
        /* renamed from: c */
        private final int f31808c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9490a) {
                C9490a c9490a = (C9490a) obj;
                if (C2668g.a(this.f31806a, c9490a.f31806a) && C2668g.a(this.f31807b, c9490a.f31807b)) {
                    if ((this.f31808c == c9490a.f31808c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Pair pair = this.f31806a;
            int i = 0;
            int hashCode = (pair != null ? pair.hashCode() : 0) * 31;
            Pair pair2 = this.f31807b;
            if (pair2 != null) {
                i = pair2.hashCode();
            }
            return ((hashCode + i) * 31) + this.f31808c;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedCommentDescription(firstStringWithColorRes=");
            stringBuilder.append(this.f31806a);
            stringBuilder.append(", secondStringWithColorRes=");
            stringBuilder.append(this.f31807b);
            stringBuilder.append(", drawableRes=");
            stringBuilder.append(this.f31808c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9490a(@NotNull Pair<String, Integer> pair, @NotNull Pair<String, Integer> pair2, int i) {
            C2668g.b(pair, "firstStringWithColorRes");
            C2668g.b(pair2, "secondStringWithColorRes");
            this.f31806a = pair;
            this.f31807b = pair2;
            this.f31808c = i;
        }

        @NotNull
        /* renamed from: a */
        public final Pair<String, Integer> m39675a() {
            return this.f31806a;
        }

        @NotNull
        /* renamed from: b */
        public final Pair<String, Integer> m39676b() {
            return this.f31807b;
        }

        /* renamed from: c */
        public final int m39677c() {
            return this.f31808c;
        }
    }

    @NotNull
    /* renamed from: a */
    public final SpannableString m39678a(@NotNull Context context, @NotNull C9490a c9490a) {
        C2668g.b(context, "context");
        C2668g.b(c9490a, "footerValues");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = (String) c9490a.m39675a().a();
        String str2 = (String) c9490a.m39676b().a();
        Lazy a = C18451c.a(new C14012xb9baca01(context));
        KProperty kProperty = f31809a[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_xxs);
        int c = C0432b.c(context, ((Number) c9490a.m39675a().b()).intValue());
        int c2 = C0432b.c(context, ((Number) c9490a.m39676b().b()).intValue());
        C8534a c8534a = new C8534a(c, dimensionPixelSize);
        if ((C19303i.a(str) ^ 1) != 0) {
            c8534a.m36503a(c);
            spannableStringBuilder.append(C8535b.m36507a(c8534a, str));
            spannableStringBuilder.append((CharSequence) a.getValue());
        }
        if ((C19303i.a(str2) ^ 1) != 0) {
            c8534a.m36503a(c2);
            spannableStringBuilder.append((CharSequence) a.getValue());
            spannableStringBuilder.append(C8535b.m36508b(c8534a, str2));
        }
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        C2668g.a(valueOf, "spannableString");
        C8535b.m36506a(context, valueOf, c9490a.m39677c(), str.length() + 1);
        return valueOf;
    }
}
