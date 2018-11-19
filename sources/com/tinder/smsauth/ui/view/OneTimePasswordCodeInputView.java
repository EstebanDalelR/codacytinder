package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.ColorRes;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tinder.smsauth.ui.C15008k.C15002a;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.C15012a;
import com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.C15012a.C15011a.C16792a;
import com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText.C15012a.C15011a.C16793b;
import com.tinder.smsauth.ui.view.p413a.C15028a;
import com.tinder.smsauth.ui.view.p413a.C15029b;
import java.util.Iterator;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import kotlin.text.C19302t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001:B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020\bH\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u0004\u0018\u00010/J\u0010\u00100\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\r\u00104\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\f\u00107\u001a\u000208*\u00020-H\u0002J\f\u00109\u001a\u00020\b*\u00020-H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR7\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006;"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "newCode", "", "code", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "newColorMode", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode;", "colorMode", "getColorMode", "()Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode;", "setColorMode", "(Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode;)V", "newLength", "", "length", "getLength", "()I", "setLength", "(I)V", "onCodeChangedListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getOnCodeChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnCodeChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "boxAt", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText;", "index", "clearAllBoxes", "createNewBox", "extractCodeFromBoxes", "handleBoxUpdate", "update", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText$BoxTextUpdate;", "hideKeyboard", "", "populateBoxesWith", "setBackgroundTintList", "tint", "Landroid/content/res/ColorStateList;", "showKeyboard", "()Lkotlin/Unit;", "updateLength", "isPastingFromClipboard", "", "oneCharLimitedTypedDelta", "ColorMode", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class OneTimePasswordCodeInputView extends LinearLayout {
    @Nullable
    /* renamed from: a */
    private Function1<? super String, C15813i> f46789a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode;", "", "backgroundTintColor", "", "(I)V", "getBackgroundTintColor", "()I", "Default", "Error", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode$Default;", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode$Error;", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$a */
    public static abstract class C15013a {
        /* renamed from: a */
        private final int f46778a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode$Default;", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$a$a */
        public static final class C16799a extends C15013a {
            /* renamed from: a */
            public static final C16799a f51831a = new C16799a();

            private C16799a() {
                super(C15002a.input_view_default_tint);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode$Error;", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$ColorMode;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$a$b */
        public static final class C16800b extends C15013a {
            /* renamed from: a */
            public static final C16800b f51832a = new C16800b();

            private C16800b() {
                super(C15002a.input_view_error_tint);
            }
        }

        private C15013a(@ColorRes int i) {
            this.f46778a = i;
        }

        /* renamed from: a */
        public final int m56611a() {
            return this.f46778a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$clearAllBoxes$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$b */
    static final class C15014b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ int f46779a;
        /* renamed from: b */
        final /* synthetic */ OneTimePasswordCodeInputView f46780b;

        C15014b(int i, OneTimePasswordCodeInputView oneTimePasswordCodeInputView) {
            this.f46779a = i;
            this.f46780b = oneTimePasswordCodeInputView;
        }

        public final void run() {
            OneTimePasswordCodeBoxEditText a = this.f46780b.m56617b(this.f46779a);
            if (a != null) {
                a.m65826a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$c */
    static final class C15015c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCodeInputView f46781a;

        C15015c(OneTimePasswordCodeInputView oneTimePasswordCodeInputView) {
            this.f46781a = oneTimePasswordCodeInputView;
        }

        public final void run() {
            OneTimePasswordCodeBoxEditText a = this.f46781a.m56617b(0);
            if (a != null) {
                a.m65827b();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$d */
    static final class C15016d implements Runnable {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCodeInputView f46782a;
        /* renamed from: b */
        final /* synthetic */ C15012a f46783b;

        C15016d(OneTimePasswordCodeInputView oneTimePasswordCodeInputView, C15012a c15012a) {
            this.f46782a = oneTimePasswordCodeInputView;
            this.f46783b = c15012a;
        }

        public final void run() {
            Function1 onCodeChangedListener = this.f46782a.getOnCodeChangedListener();
            if (onCodeChangedListener != null) {
                C15813i c15813i = (C15813i) onCodeChangedListener.invoke(this.f46783b.m56609c());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$populateBoxesWith$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$e */
    static final class C15017e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ int f46784a;
        /* renamed from: b */
        final /* synthetic */ char f46785b;
        /* renamed from: c */
        final /* synthetic */ OneTimePasswordCodeInputView f46786c;

        C15017e(int i, char c, OneTimePasswordCodeInputView oneTimePasswordCodeInputView) {
            this.f46784a = i;
            this.f46785b = c;
            this.f46786c = oneTimePasswordCodeInputView;
        }

        public final void run() {
            OneTimePasswordCodeBoxEditText a = this.f46786c.m56617b(this.f46784a);
            if (a != null) {
                a.m65825a(String.valueOf(this.f46785b), false);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$f */
    static final class C15018f implements Runnable {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCodeInputView f46787a;
        /* renamed from: b */
        final /* synthetic */ String f46788b;

        C15018f(OneTimePasswordCodeInputView oneTimePasswordCodeInputView, String str) {
            this.f46787a = oneTimePasswordCodeInputView;
            this.f46788b = str;
        }

        public final void run() {
            OneTimePasswordCodeBoxEditText a = this.f46787a.m56617b(this.f46788b.length() - 1);
            if (a != null) {
                a.m65827b();
            }
        }
    }

    public /* synthetic */ OneTimePasswordCodeInputView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public OneTimePasswordCodeInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    public final void setCode(@NotNull String str) {
        C2668g.b(str, "newCode");
        if ((C2668g.a(str, m56622e()) ^ 1) != 0) {
            m56616a(str);
        }
    }

    @NotNull
    public final String getCode() {
        return m56622e();
    }

    public final void setLength(int i) {
        m56613a(i);
    }

    public final int getLength() {
        return getChildCount();
    }

    @Nullable
    public final Function1<String, C15813i> getOnCodeChangedListener() {
        return this.f46789a;
    }

    public final void setOnCodeChangedListener(@Nullable Function1<? super String, C15813i> function1) {
        this.f46789a = function1;
    }

    @NotNull
    public final C15013a getColorMode() {
        ColorStateList v = ViewCompat.v(this);
        C2668g.a(v, "getBackgroundTintList(this)");
        if (v.getDefaultColor() == C15002a.input_view_error_tint) {
            return C16800b.f51832a;
        }
        return C16799a.f51831a;
    }

    public final void setColorMode(@NotNull C15013a c15013a) {
        C2668g.b(c15013a, "newColorMode");
        View view = this;
        Context context = getContext();
        C2668g.a(context, "context");
        ViewCompat.a(view, ColorStateList.valueOf(C15028a.m56627a(context, c15013a.m56611a())));
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        ColorStateList v = ViewCompat.v(this);
        super.setBackgroundTintList(colorStateList);
        if ((C2668g.a(v, colorStateList) ^ 1) != 0) {
            Iterator it = C18464j.m66925b(0, getChildCount()).iterator();
            while (it.hasNext()) {
                ViewCompat.a(m56617b(((ab) it).mo13805b()), colorStateList);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final C15813i m56623a() {
        View focusedChild = getFocusedChild();
        if (focusedChild == null) {
            return null;
        }
        C15029b.m56628a(focusedChild);
        return C15813i.f49016a;
    }

    @Nullable
    /* renamed from: b */
    public final Object m56624b() {
        Object focusedChild = getFocusedChild();
        if (focusedChild != null) {
            return focusedChild;
        }
        OneTimePasswordCodeBoxEditText b = m56617b(0);
        if (b == null) {
            return null;
        }
        C15029b.m56629b(b);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    private final void m56613a(int i) {
        if ((i >= 0 ? 1 : null) == null) {
            throw new IllegalArgumentException("Length must be positive".toString());
        } else if (getChildCount() != i) {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            i = C18464j.m66925b(0, i).iterator();
            while (i.hasNext()) {
                ((ab) i).mo13805b();
                addView(m56619c(), new LayoutParams(0, -2, 1.0f));
            }
            i = m56617b(0);
            if (i != 0) {
                i.m65827b();
            }
        }
    }

    /* renamed from: c */
    private final OneTimePasswordCodeBoxEditText m56619c() {
        View inflate = LinearLayout.inflate(getContext(), C15006e.one_time_password_code_box_edit_text_view, null);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.smsauth.ui.view.OneTimePasswordCodeBoxEditText");
        }
        OneTimePasswordCodeBoxEditText oneTimePasswordCodeBoxEditText = (OneTimePasswordCodeBoxEditText) inflate;
        oneTimePasswordCodeBoxEditText.setOnTextUpdated(new C18901x5264f35a(this));
        oneTimePasswordCodeBoxEditText.setOnBackspaceKeyPressedOnEmptyText(new C18902x5264f35b(this));
        return oneTimePasswordCodeBoxEditText;
    }

    /* renamed from: a */
    private final void m56614a(C15012a c15012a) {
        if (m56618b(c15012a)) {
            m56621d();
            m56616a(c15012a.m56609c());
            post(new C15016d(this, c15012a));
        } else if (c15012a.m56609c().length() > 1) {
            c15012a.m56607a().setText(m56620c(c15012a));
        } else {
            int indexOfChild = indexOfChild(c15012a.m56607a());
            c15012a = c15012a.m56610d();
            if (C2668g.a(c15012a, C16793b.f51825a)) {
                c15012a = m56617b(indexOfChild + 1);
                if (c15012a == null) {
                    c15012a = m56617b(indexOfChild);
                }
            } else if (C2668g.a(c15012a, C16792a.f51824a) != null) {
                c15012a = m56617b(indexOfChild - 1);
                if (c15012a == null) {
                    c15012a = m56617b(indexOfChild);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (c15012a != null) {
                c15012a.m65827b();
            }
            c15012a = this.f46789a;
            if (c15012a != null) {
                C15813i c15813i = (C15813i) c15012a.invoke(getCode());
            }
        }
    }

    /* renamed from: a */
    private final void m56616a(String str) {
        CharSequence charSequence = str;
        if (C19296q.m68673a(charSequence)) {
            m56621d();
            str = this.f46789a;
            if (str != null) {
                C15813i c15813i = (C15813i) str.invoke("");
            }
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            post(new C15017e(i2, charSequence.charAt(i), this));
            i++;
            i2 = i3;
        }
        post(new C15018f(this, str));
    }

    /* renamed from: d */
    private final void m56621d() {
        Iterator it = C18464j.m66922a(getChildCount() - 1, 0).iterator();
        while (it.hasNext()) {
            post(new C15014b(((ab) it).mo13805b(), this));
        }
        post(new C15015c(this));
    }

    /* renamed from: e */
    private final String m56622e() {
        String str = "";
        Iterator it = C18464j.m66925b(0, getChildCount()).iterator();
        while (it.hasNext()) {
            Object text;
            int b = ((ab) it).mo13805b();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            OneTimePasswordCodeBoxEditText b2 = m56617b(b);
            if (b2 != null) {
                text = b2.getText();
                if (text != null) {
                    stringBuilder.append(text);
                    str = stringBuilder.toString();
                }
            }
            text = "";
            stringBuilder.append(text);
            str = stringBuilder.toString();
        }
        return str;
    }

    /* renamed from: b */
    private final OneTimePasswordCodeBoxEditText m56617b(int i) {
        i = getChildAt(i);
        if (!(i instanceof OneTimePasswordCodeBoxEditText)) {
            i = 0;
        }
        return (OneTimePasswordCodeBoxEditText) i;
    }

    /* renamed from: b */
    private final boolean m56618b(@NotNull C15012a c15012a) {
        return c15012a.m56609c().length() - c15012a.m56608b().length() > 1 ? true : null;
    }

    /* renamed from: c */
    private final String m56620c(@NotNull C15012a c15012a) {
        CharSequence c = c15012a.m56609c();
        Appendable stringBuilder = new StringBuilder();
        int length = c.length();
        for (int i = 0; i < length; i++) {
            char charAt = c.charAt(i);
            if ((1 ^ C19298r.m68784b((CharSequence) c15012a.m56608b(), charAt, false, 2, null)) != 0) {
                stringBuilder.append(charAt);
            }
        }
        String stringBuilder2 = ((StringBuilder) stringBuilder).toString();
        C2668g.a(stringBuilder2, "filterTo(StringBuilder(), predicate).toString()");
        stringBuilder2 = C19302t.m68849e(stringBuilder2, 1);
        return C19296q.m68673a((CharSequence) stringBuilder2) ? C19302t.m68849e(c15012a.m56609c(), 1) : stringBuilder2;
    }
}
