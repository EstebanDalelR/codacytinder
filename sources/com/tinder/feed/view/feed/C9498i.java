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
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n²\u0006\u0015\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0002¢\u0006\u0000²\u0006\u0015\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0002¢\u0006\u0000²\u0006\u0015\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0002¢\u0006\u0000"}, d2 = {"Lcom/tinder/feed/view/feed/FooterSpannableStringFormatter;", "", "()V", "getSpannableStringForFooter", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "footerValues", "Lcom/tinder/feed/view/feed/FooterSpannableStringFormatter$FooterDescription;", "FooterDescription", "Tinder_release", "whiteSpace1", "", "kotlin.jvm.PlatformType", "whiteSpace2", "ellipsize"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.i */
public final class C9498i {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31816a = new KProperty[]{C15825i.a(new PropertyReference0Impl(C15825i.a(C9498i.class), "whiteSpace1", "<v#0>")), C15825i.a(new PropertyReference0Impl(C15825i.a(C9498i.class), "whiteSpace2", "<v#1>")), C15825i.a(new PropertyReference0Impl(C15825i.a(C9498i.class), "ellipsize", "<v#2>"))};

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/feed/view/feed/FooterSpannableStringFormatter$FooterDescription;", "", "userName", "", "caption", "(Ljava/lang/String;Ljava/lang/String;)V", "getCaption", "()Ljava/lang/String;", "getUserName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.feed.i$a */
    public static final class C9497a {
        @NotNull
        /* renamed from: a */
        private final String f31814a;
        @NotNull
        /* renamed from: b */
        private final String f31815b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9497a) {
                    C9497a c9497a = (C9497a) obj;
                    if (C2668g.a(this.f31814a, c9497a.f31814a) && C2668g.a(this.f31815b, c9497a.f31815b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f31814a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f31815b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FooterDescription(userName=");
            stringBuilder.append(this.f31814a);
            stringBuilder.append(", caption=");
            stringBuilder.append(this.f31815b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9497a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "userName");
            C2668g.b(str2, "caption");
            this.f31814a = str;
            this.f31815b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m39728a() {
            return this.f31814a;
        }

        @NotNull
        /* renamed from: b */
        public final String m39729b() {
            return this.f31815b;
        }
    }

    @NotNull
    /* renamed from: a */
    public final SpannableString m39730a(@NotNull Context context, @NotNull C9497a c9497a) {
        C2668g.b(context, "context");
        C2668g.b(c9497a, "footerValues");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String a = c9497a.m39728a();
        c9497a = c9497a.m39729b();
        Lazy a2 = C18451c.a(new C14014xe4b16a7b(context));
        KProperty kProperty = f31816a[0];
        Lazy a3 = C18451c.a(new C14015xe4b16e3c(context));
        KProperty kProperty2 = f31816a[1];
        Lazy a4 = C18451c.a(new C14013xff15e794(context));
        KProperty kProperty3 = f31816a[2];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_s);
        int c = C0432b.c(context, R.color.dark_gray2);
        int c2 = C0432b.c(context, R.color.light_grey2);
        C8534a c8534a = new C8534a(c, dimensionPixelSize);
        if ((C19303i.a(a) ^ 1) != 0) {
            c8534a.m36503a(c);
            spannableStringBuilder.append((CharSequence) a3.getValue());
            spannableStringBuilder.append(C8535b.m36507a(c8534a, a));
        }
        if ((C19303i.a((CharSequence) c9497a) ^ 1) != 0) {
            spannableStringBuilder.append((CharSequence) a2.getValue());
            if (c9497a.length() > 120) {
                StringBuilder stringBuilder = new StringBuilder();
                if (c9497a == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                c9497a = c9497a.substring(0, 120);
                C2668g.a(c9497a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                stringBuilder.append(c9497a);
                stringBuilder.append((String) a4.getValue());
                stringBuilder.append((String) a2.getValue());
                c9497a = stringBuilder.toString();
                c8534a.m36503a(c2);
                spannableStringBuilder.append(C8535b.m36508b(c8534a, c9497a));
                c8534a.m36503a(c);
                c9497a = context.getString(R.string.more_caption);
                C2668g.a(c9497a, "context.getString(R.string.more_caption)");
                if (c9497a == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                c9497a = c9497a.toLowerCase();
                C2668g.a(c9497a, "(this as java.lang.String).toLowerCase()");
                spannableStringBuilder.append(C8535b.m36507a(c8534a, c9497a));
            } else {
                c8534a.m36503a(c2);
                spannableStringBuilder.append(C8535b.m36508b(c8534a, c9497a));
            }
        }
        c9497a = SpannableString.valueOf(spannableStringBuilder);
        C2668g.a(c9497a, "spannableString");
        C8535b.m36505a(context, c9497a, R.drawable.ic_instagram);
        return c9497a;
    }
}
