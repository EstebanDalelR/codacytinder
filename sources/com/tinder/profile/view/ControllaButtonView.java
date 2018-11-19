package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.PluralsRes;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.C0432b;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.shimmy.ShimmerFrameLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001;B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020.2\b\b\u0001\u0010/\u001a\u00020\u000eJ\u0012\u00100\u001a\u00020.2\b\b\u0001\u00101\u001a\u00020\u000eH\u0002J\u000e\u00102\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u00103\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020\u000eJ\u0012\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u00020.2\b\b\u0001\u0010&\u001a\u00020\u000eJ\b\u00108\u001a\u00020.H\u0002J\b\u00109\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020.H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u0012\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/tinder/profile/view/ControllaButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionButton", "Landroid/support/design/widget/FloatingActionButton;", "getActionButton$Tinder_release", "()Landroid/support/design/widget/FloatingActionButton;", "setActionButton$Tinder_release", "(Landroid/support/design/widget/FloatingActionButton;)V", "color", "", "getMoreTextView", "Landroid/widget/TextView;", "getGetMoreTextView$Tinder_release", "()Landroid/widget/TextView;", "setGetMoreTextView$Tinder_release", "(Landroid/widget/TextView;)V", "millisRemaining", "", "numberRemaining", "numberRemainingTextView", "getNumberRemainingTextView$Tinder_release", "setNumberRemainingTextView$Tinder_release", "secondsFormatting", "Ljava/text/SimpleDateFormat;", "shimmerFrameLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "getShimmerFrameLayout$Tinder_release", "()Lcom/tinder/shimmy/ShimmerFrameLayout;", "setShimmerFrameLayout$Tinder_release", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "timeRemainingTextView", "getTimeRemainingTextView$Tinder_release", "setTimeRemainingTextView$Tinder_release", "title", "type", "Lcom/tinder/profile/view/ControllaButtonView$Type;", "getCountingText", "Landroid/text/Spannable;", "titleValue", "", "setColor", "", "colorRes", "setIcon", "icon", "setMillisRemaining", "setNumberRemaining", "setOnClickListener", "listener", "Landroid/view/View$OnClickListener;", "setTitle", "updateGetMoreVisibility", "updateShimmyVisibility", "updateTitle", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ControllaButtonView extends LinearLayout {
    @ColorInt
    /* renamed from: a */
    private int f45757a;
    @NotNull
    @BindView(2131362233)
    public FloatingActionButton actionButton;
    /* renamed from: b */
    private long f45758b;
    /* renamed from: c */
    private int f45759c;
    /* renamed from: d */
    private final SimpleDateFormat f45760d = new SimpleDateFormat("mm:ss", Locale.getDefault());
    @PluralsRes
    /* renamed from: e */
    private int f45761e;
    /* renamed from: f */
    private Type f45762f = Type.UNKNOWN;
    @NotNull
    @BindView(2131362227)
    public TextView getMoreTextView;
    @NotNull
    @BindView(2131362228)
    public TextView numberRemainingTextView;
    @NotNull
    @BindView(2131362229)
    public ShimmerFrameLayout shimmerFrameLayout;
    @NotNull
    @BindView(2131362230)
    public TextView timeRemainingTextView;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/tinder/profile/view/ControllaButtonView$Type;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SUPER_LIKE", "BOOST", "GOLD", "UNKNOWN", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
        ;
        
        public static final C14441a Companion = null;
        private final int value;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/profile/view/ControllaButtonView$Type$Companion;", "", "()V", "fromIntValue", "Lcom/tinder/profile/view/ControllaButtonView$Type;", "value", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.profile.view.ControllaButtonView$Type$a */
        public static final class C14441a {
            private C14441a() {
            }

            @NotNull
            /* renamed from: a */
            public final Type m55134a(int i) {
                Type[] values = Type.values();
                Collection arrayList = new ArrayList();
                for (Type type : values) {
                    if ((type.value() == i ? 1 : null) != null) {
                        arrayList.add(type);
                    }
                }
                i = ((List) arrayList).iterator();
                if (i.hasNext()) {
                    return (Type) i.next();
                }
                throw ((Throwable) new IllegalArgumentException("Unknown controlla button state"));
            }
        }

        protected Type(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        static {
            Companion = new C14441a();
        }

        public final int value() {
            return this.value;
        }
    }

    public ControllaButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        LinearLayout.inflate(context, R.layout.view_controlla_tinder_plus, this);
        ButterKnife.a(this);
        setOrientation(1);
        setGravity(17);
        setClipChildren(false);
        setClipToPadding(false);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C6249b.ControllaButtonView, 0, 0);
            this.f45762f = Type.Companion.m55134a(context.getInt(3, Type.UNKNOWN.value()));
            int resourceId = context.getResourceId(1, Integer.MIN_VALUE);
            if (resourceId != Integer.MIN_VALUE) {
                setIcon(resourceId);
            }
            this.f45761e = context.getResourceId(2, R.plurals.superlike_paywall_options);
            m55138c();
            setColor(context.getResourceId(0, R.color.superlike));
        }
        m55137b();
        m55136a();
    }

    @NotNull
    public final FloatingActionButton getActionButton$Tinder_release() {
        FloatingActionButton floatingActionButton = this.actionButton;
        if (floatingActionButton == null) {
            C2668g.b("actionButton");
        }
        return floatingActionButton;
    }

    public final void setActionButton$Tinder_release(@NotNull FloatingActionButton floatingActionButton) {
        C2668g.b(floatingActionButton, "<set-?>");
        this.actionButton = floatingActionButton;
    }

    @NotNull
    public final TextView getGetMoreTextView$Tinder_release() {
        TextView textView = this.getMoreTextView;
        if (textView == null) {
            C2668g.b("getMoreTextView");
        }
        return textView;
    }

    public final void setGetMoreTextView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.getMoreTextView = textView;
    }

    @NotNull
    public final TextView getNumberRemainingTextView$Tinder_release() {
        TextView textView = this.numberRemainingTextView;
        if (textView == null) {
            C2668g.b("numberRemainingTextView");
        }
        return textView;
    }

    public final void setNumberRemainingTextView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.numberRemainingTextView = textView;
    }

    @NotNull
    public final ShimmerFrameLayout getShimmerFrameLayout$Tinder_release() {
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        return shimmerFrameLayout;
    }

    public final void setShimmerFrameLayout$Tinder_release(@NotNull ShimmerFrameLayout shimmerFrameLayout) {
        C2668g.b(shimmerFrameLayout, "<set-?>");
        this.shimmerFrameLayout = shimmerFrameLayout;
    }

    @NotNull
    public final TextView getTimeRemainingTextView$Tinder_release() {
        TextView textView = this.timeRemainingTextView;
        if (textView == null) {
            C2668g.b("timeRemainingTextView");
        }
        return textView;
    }

    public final void setTimeRemainingTextView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.timeRemainingTextView = textView;
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        FloatingActionButton floatingActionButton = this.actionButton;
        if (floatingActionButton == null) {
            C2668g.b("actionButton");
        }
        floatingActionButton.setOnClickListener(onClickListener);
        TextView textView = this.getMoreTextView;
        if (textView == null) {
            C2668g.b("getMoreTextView");
        }
        textView.setOnClickListener(onClickListener);
    }

    public final void setColor(@ColorRes int i) {
        this.f45757a = C0432b.c(getContext(), i);
        i = this.getMoreTextView;
        if (i == 0) {
            C2668g.b("getMoreTextView");
        }
        i.setTextColor(this.f45757a);
        i = this.timeRemainingTextView;
        if (i == 0) {
            C2668g.b("timeRemainingTextView");
        }
        i.setTextColor(this.f45757a);
        m55138c();
    }

    public final void setMillisRemaining(long j) {
        int i = 0;
        Object obj = j > 0 ? 1 : null;
        this.f45758b = j;
        TextView textView = this.timeRemainingTextView;
        if (textView == null) {
            C2668g.b("timeRemainingTextView");
        }
        int i2 = 8;
        if (obj == null) {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.getMoreTextView;
        if (textView2 == null) {
            C2668g.b("getMoreTextView");
        }
        if (obj == null) {
            i2 = 4;
        }
        textView2.setVisibility(i2);
        textView2 = this.timeRemainingTextView;
        if (textView2 == null) {
            C2668g.b("timeRemainingTextView");
        }
        textView2.setText(this.f45760d.format(Long.valueOf(j)));
        if (obj == null) {
            m55137b();
        }
    }

    public final void setNumberRemaining(int i) {
        this.f45759c = i;
        m55138c();
        m55137b();
    }

    public final void setTitle(@PluralsRes int i) {
        this.f45761e = i;
        m55138c();
    }

    /* renamed from: a */
    private final Spannable m55135a(String str) {
        int length = String.valueOf(this.f45759c).length();
        C15828l c15828l = C15828l.f49033a;
        Locale locale = Locale.getDefault();
        C2668g.a(locale, "Locale.getDefault()");
        String str2 = "%d %s";
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f45759c);
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        str = str.toUpperCase();
        C2668g.a(str, "(this as java.lang.String).toUpperCase()");
        objArr[1] = str;
        str = String.format(locale, str2, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str, "java.lang.String.format(locale, format, *args)");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(this.f45757a), 0, length, 33);
        return spannableString;
    }

    private final void setIcon(@DrawableRes int i) {
        FloatingActionButton floatingActionButton = this.actionButton;
        if (floatingActionButton == null) {
            C2668g.b("actionButton");
        }
        floatingActionButton.setImageResource(i);
    }

    /* renamed from: a */
    private final void m55136a() {
        if (C14450d.f45794a[this.f45762f.ordinal()] != 1) {
            ShimmerFrameLayout shimmerFrameLayout;
            shimmerFrameLayout = this.shimmerFrameLayout;
            if (shimmerFrameLayout == null) {
                C2668g.b("shimmerFrameLayout");
            }
            shimmerFrameLayout.setVisibility(8);
            return;
        }
        shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        shimmerFrameLayout.setVisibility(0);
    }

    /* renamed from: b */
    private final void m55137b() {
        int i = 4;
        TextView textView;
        switch (C14450d.f45795b[this.f45762f.ordinal()]) {
            case 1:
                textView = this.getMoreTextView;
                if (textView == null) {
                    C2668g.b("getMoreTextView");
                }
                textView.setVisibility(4);
                return;
            case 2:
            case 3:
                Object obj = (this.f45759c != 0 || this.f45758b > 0) ? null : 1;
                TextView textView2 = this.getMoreTextView;
                if (textView2 == null) {
                    C2668g.b("getMoreTextView");
                }
                if (obj != null) {
                    i = 0;
                }
                textView2.setVisibility(i);
                return;
            default:
                textView = this.getMoreTextView;
                if (textView == null) {
                    C2668g.b("getMoreTextView");
                }
                textView.setVisibility(4);
                return;
        }
    }

    /* renamed from: c */
    private final void m55138c() {
        if (this.f45761e != 0) {
            String quantityString = getResources().getQuantityString(this.f45761e, this.f45759c);
            TextView textView;
            switch (C14450d.f45796c[this.f45762f.ordinal()]) {
                case 1:
                    textView = this.numberRemainingTextView;
                    if (textView == null) {
                        C2668g.b("numberRemainingTextView");
                    }
                    C2668g.a(quantityString, "titleValue");
                    if (quantityString != null) {
                        quantityString = quantityString.toUpperCase();
                        C2668g.a(quantityString, "(this as java.lang.String).toUpperCase()");
                        textView.setText(quantityString);
                        break;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                case 2:
                case 3:
                    textView = this.numberRemainingTextView;
                    if (textView == null) {
                        C2668g.b("numberRemainingTextView");
                    }
                    C2668g.a(quantityString, "titleValue");
                    textView.setText(m55135a(quantityString));
                    break;
                default:
                    break;
            }
        }
    }
}
