package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.text.Editable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.jakewharton.rxbinding2.p141c.C5717c;
import com.jakewharton.rxbinding2.p141c.C5718d;
import com.jakewharton.rxbinding2.p141c.C5719f;
import com.tinder.api.ManagerWebServices;
import com.tinder.smsauth.ui.C15008k.C15002a;
import com.tinder.smsauth.ui.C15008k.C15004c;
import com.tinder.smsauth.ui.C15008k.C15005d;
import com.tinder.smsauth.ui.C15008k.C15007f;
import com.tinder.smsauth.ui.view.p413a.C15028a;
import com.tinder.smsauth.ui.view.p413a.C15029b;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "listener", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener;", "getListener", "()Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener;", "setListener", "(Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "onFinishInflate", "setContinueButtonEnabled", "isEnabled", "", "setCountryCode", "countryCode", "", "setDisclaimerText", "setPhoneNumber", "phoneNumber", "Companion", "Listener", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class PhoneNumberCollectionContainerView extends ConstraintLayout {
    @Deprecated
    /* renamed from: a */
    public static final C15023a f51840a = new C15023a();
    @Nullable
    /* renamed from: b */
    private Listener f51841b;
    /* renamed from: c */
    private final C17356a f51842c;
    /* renamed from: d */
    private HashMap f51843d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener;", "", "onContinueButtonClicked", "", "onCountryCodeClicked", "onPhoneNumberTextChanged", "phoneNumberTextUpdate", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener$PhoneNumberTextUpdate;", "PhoneNumberTextUpdate", "ui_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener$PhoneNumberTextUpdate;", "", "oldValue", "", "newValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewValue", "()Ljava/lang/String;", "getOldValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$Listener$a */
        public static final class C15022a {
            @NotNull
            /* renamed from: a */
            private final String f46793a;
            @NotNull
            /* renamed from: b */
            private final String f46794b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C15022a) {
                        C15022a c15022a = (C15022a) obj;
                        if (C2668g.a(this.f46793a, c15022a.f46793a) && C2668g.a(this.f46794b, c15022a.f46794b)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f46793a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f46794b;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PhoneNumberTextUpdate(oldValue=");
                stringBuilder.append(this.f46793a);
                stringBuilder.append(", newValue=");
                stringBuilder.append(this.f46794b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C15022a(@NotNull String str, @NotNull String str2) {
                C2668g.b(str, "oldValue");
                C2668g.b(str2, "newValue");
                this.f46793a = str;
                this.f46794b = str2;
            }

            @NotNull
            /* renamed from: a */
            public final String m56625a() {
                return this.f46793a;
            }

            @NotNull
            /* renamed from: b */
            public final String m56626b() {
                return this.f46794b;
            }
        }

        void onContinueButtonClicked();

        void onCountryCodeClicked();

        void onPhoneNumberTextChanged(@NotNull C15022a c15022a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Companion;", "", "()V", "DISCLAIMER_PLACEHOLDER", "", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$a */
    private static final class C15023a {
        private C15023a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$g */
    static final class C15024g implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PhoneNumberCollectionContainerView f46795a;

        C15024g(PhoneNumberCollectionContainerView phoneNumberCollectionContainerView) {
            this.f46795a = phoneNumberCollectionContainerView;
        }

        public final void onClick(View view) {
            view = this.f46795a.getListener();
            if (view != null) {
                view.onCountryCodeClicked();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$h */
    static final class C15025h implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PhoneNumberCollectionContainerView f46796a;

        C15025h(PhoneNumberCollectionContainerView phoneNumberCollectionContainerView) {
            this.f46796a = phoneNumberCollectionContainerView;
        }

        public final void onClick(View view) {
            view = this.f46796a.getListener();
            if (view != null) {
                view.onContinueButtonClicked();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$i */
    static final class C15026i implements Runnable {
        /* renamed from: a */
        final /* synthetic */ PhoneNumberCollectionContainerView f46797a;

        C15026i(PhoneNumberCollectionContainerView phoneNumberCollectionContainerView) {
            this.f46797a = phoneNumberCollectionContainerView;
        }

        public final void run() {
            EditText editText = (EditText) this.f46797a.m62335a(C15005d.phoneNumberInputView);
            C2668g.a(editText, "phoneNumberInputView");
            C15029b.m56628a(editText);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/jakewharton/rxbinding2/widget/TextViewBeforeTextChangeEvent;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$b */
    static final class C16801b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16801b f51835a = new C16801b();

        C16801b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62329a((C5719f) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m62329a(@NotNull C5719f c5719f) {
            C2668g.b(c5719f, "event");
            return c5719f.b().toString();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/jakewharton/rxbinding2/widget/TextViewAfterTextChangeEvent;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$c */
    static final class C16802c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16802c f51836a = new C16802c();

        C16802c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62330a((C5718d) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m62330a(@NotNull C5718d c5718d) {
            C2668g.b(c5718d, "event");
            return String.valueOf(c5718d.b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener$PhoneNumberTextUpdate;", "oldValue", "", "newValue", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$d */
    static final class C16803d<T1, T2, R> implements BiFunction<String, String, C15022a> {
        /* renamed from: a */
        public static final C16803d f51837a = new C16803d();

        C16803d() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m62331a((String) obj, (String) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C15022a m62331a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "oldValue");
            C2668g.b(str2, "newValue");
            return new C15022a(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener$PhoneNumberTextUpdate;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$e */
    static final class C16804e<T> implements Predicate<C15022a> {
        /* renamed from: a */
        public static final C16804e f51838a = new C16804e();

        C16804e() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62332a((C15022a) obj);
        }

        /* renamed from: a */
        public final boolean m62332a(@NotNull C15022a c15022a) {
            C2668g.b(c15022a, "it");
            return C2668g.a(c15022a.m56625a(), c15022a.m56626b()) ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener$PhoneNumberTextUpdate;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView$f */
    static final class C16805f<T> implements Consumer<C15022a> {
        /* renamed from: a */
        final /* synthetic */ PhoneNumberCollectionContainerView f51839a;

        C16805f(PhoneNumberCollectionContainerView phoneNumberCollectionContainerView) {
            this.f51839a = phoneNumberCollectionContainerView;
        }

        public /* synthetic */ void accept(Object obj) {
            m62333a((C15022a) obj);
        }

        /* renamed from: a */
        public final void m62333a(C15022a c15022a) {
            Listener listener = this.f51839a.getListener();
            if (listener != null) {
                C2668g.a(c15022a, "it");
                listener.onPhoneNumberTextChanged(c15022a);
            }
        }
    }

    /* renamed from: a */
    public View m62335a(int i) {
        if (this.f51843d == null) {
            this.f51843d = new HashMap();
        }
        View view = (View) this.f51843d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f51843d.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ PhoneNumberCollectionContainerView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public PhoneNumberCollectionContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f51842c = new C17356a();
        ViewCompat.a(this, ColorStateList.valueOf(C15028a.m56627a(context, C15002a.input_view_default_tint)));
    }

    @Nullable
    public final Listener getListener() {
        return this.f51841b;
    }

    public final void setListener(@Nullable Listener listener) {
        this.f51841b = listener;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((EditText) m62335a(C15005d.countryCodeInputView)).setCompoundDrawablesWithIntrinsicBounds(null, null, AppCompatResources.getDrawable(getContext(), C15004c.ic_country_selection_down_arrow), null);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m62334a();
        this.f51842c.add(C3959e.zip(C5717c.b((EditText) m62335a(C15005d.phoneNumberInputView)).map(C16801b.f51835a), C5717c.c((EditText) m62335a(C15005d.phoneNumberInputView)).map(C16802c.f51836a), C16803d.f51837a).skip(1).filter(C16804e.f51838a).subscribe(new C16805f(this)));
        ((EditText) m62335a(C15005d.countryCodeInputView)).setOnClickListener(new C15024g(this));
        ((Button) m62335a(C15005d.continueButton)).setOnClickListener(new C15025h(this));
        postDelayed(new C15026i(this), 450);
    }

    protected void onDetachedFromWindow() {
        EditText editText = (EditText) m62335a(C15005d.phoneNumberInputView);
        C2668g.a(editText, "phoneNumberInputView");
        C15029b.m56629b(editText);
        this.f51842c.m63446a();
        super.onDetachedFromWindow();
    }

    public final void setCountryCode(@NotNull String str) {
        C2668g.b(str, "countryCode");
        ((EditText) m62335a(C15005d.countryCodeInputView)).setText(str, BufferType.NORMAL);
    }

    public final void setPhoneNumber(@NotNull String str) {
        C2668g.b(str, "phoneNumber");
        EditText editText = (EditText) m62335a(C15005d.phoneNumberInputView);
        C2668g.a(editText, "phoneNumberInputView");
        Editable editableText = editText.getEditableText();
        if (!C2668g.a(editableText != null ? editableText.toString() : null, str)) {
            editText = (EditText) m62335a(C15005d.phoneNumberInputView);
            editText.setText(str, BufferType.EDITABLE);
            editText.setSelection(str.length());
        }
    }

    public final void setContinueButtonEnabled(boolean z) {
        Button button = (Button) m62335a(C15005d.continueButton);
        C2668g.a(button, "continueButton");
        button.setEnabled(z);
    }

    /* renamed from: a */
    private final void m62334a() {
        CharSequence fromHtml;
        String string = getContext().getString(C15007f.sms_auth_legal_disclaimer);
        String string2 = getContext().getString(C15007f.sms_auth_legal_faq_link);
        C2668g.a(string, "disclaimerTemplate");
        C2668g.a(string2, ManagerWebServices.IG_PARAM_LINK);
        String a = C19296q.m68672a(string, "#sms-auth-legal-faq-link", string2, false, 4, null);
        TextView textView = (TextView) m62335a(C15005d.messageLabel);
        C2668g.a(textView, "messageLabel");
        if (VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(a, 0);
        } else {
            fromHtml = Html.fromHtml(a);
        }
        textView.setText(fromHtml);
        TextView textView2 = (TextView) m62335a(C15005d.messageLabel);
        C2668g.a(textView2, "messageLabel");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
