package com.tinder.onboarding.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.text.PrivacyLinkMovementMethod;
import com.tinder.base.text.PrivacyLinkMovementMethod$OnLinksClickedListener;
import com.tinder.onboarding.C9964g.C9960a;
import com.tinder.onboarding.C9964g.C9961b;
import com.tinder.onboarding.C9964g.C9962c;
import com.tinder.onboarding.C9964g.C9963d;
import com.tinder.utils.au;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0006\u0010\u001e\u001a\u00020\u001aJ\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\u0012¨\u0006!"}, d2 = {"Lcom/tinder/onboarding/view/CountdownView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundGradient", "Landroid/graphics/drawable/Drawable;", "cardViews", "", "Landroid/widget/TextView;", "getCardViews", "()Ljava/util/List;", "cardViews$delegate", "Lkotlin/Lazy;", "daysLeft", "getDaysLeft", "()Landroid/widget/TextView;", "daysLeft$delegate", "privacyPolicyString", "", "privacyPolicyText", "getPrivacyPolicyText", "privacyPolicyText$delegate", "bindDays", "", "days", "", "bindPolicyLinks", "hideDays", "showPolicy", "policyLink", "onboarding_release"}, k = 1, mv = {1, 1, 10})
public final class CountdownView extends ConstraintLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39500a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(CountdownView.class), "cardViews", "getCardViews()Ljava/util/List;")), C15825i.a(new PropertyReference1Impl(C15825i.a(CountdownView.class), "daysLeft", "getDaysLeft()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(CountdownView.class), "privacyPolicyText", "getPrivacyPolicyText()Landroid/widget/TextView;"))};
    /* renamed from: b */
    private final Lazy f39501b = C18451c.a((Function0) new CountdownView$cardViews$2(this));
    /* renamed from: c */
    private final Lazy f39502c = C18451c.a(LazyThreadSafetyMode.NONE, new CountdownView$$special$$inlined$bindView$1(this, C9961b.countdown_days_left));
    /* renamed from: d */
    private final Lazy f39503d = C18451c.a(LazyThreadSafetyMode.NONE, new CountdownView$$special$$inlined$bindView$2(this, C9961b.countdown_privacy_policy));
    /* renamed from: e */
    private final Drawable f39504e = au.b(this, C9960a.vertical_tinder_gradient);
    /* renamed from: f */
    private final String f39505f = au.a(this, C9963d.onboarding_age_gate_terms_of_service_privacy_policy, new String[0]);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/onboarding/view/CountdownView$bindPolicyLinks$listener$1", "Lcom/tinder/base/text/PrivacyLinkMovementMethod$OnLinksClickedListener;", "(Lcom/tinder/onboarding/view/CountdownView;)V", "onPrivacyPolicyClicked", "", "onTermsOfServiceClicked", "onboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.onboarding.view.CountdownView$a */
    public static final class C12191a implements PrivacyLinkMovementMethod$OnLinksClickedListener {
        /* renamed from: a */
        final /* synthetic */ CountdownView f39499a;

        C12191a(CountdownView countdownView) {
            this.f39499a = countdownView;
        }

        public void onTermsOfServiceClicked() {
            this.f39499a.m48352a(ManagerWebServices.URL_TOS);
        }

        public void onPrivacyPolicyClicked() {
            this.f39499a.m48352a(ManagerWebServices.URL_PRIVACY);
        }
    }

    private final List<TextView> getCardViews() {
        Lazy lazy = this.f39501b;
        KProperty kProperty = f39500a[0];
        return (List) lazy.getValue();
    }

    private final TextView getDaysLeft() {
        Lazy lazy = this.f39502c;
        KProperty kProperty = f39500a[1];
        return (TextView) lazy.getValue();
    }

    private final TextView getPrivacyPolicyText() {
        Lazy lazy = this.f39503d;
        KProperty kProperty = f39500a[2];
        return (TextView) lazy.getValue();
    }

    public CountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ConstraintLayout.inflate(context, C9962c.view_countdown, this);
        setBackground(this.f39504e);
        m48353b();
    }

    /* renamed from: a */
    public final void m48355a(int i) {
        getDaysLeft().setVisibility(0);
        C15828l c15828l = C15828l.f49033a;
        Locale locale = Locale.US;
        C2668g.a(locale, "Locale.US");
        Object[] objArr = new Object[]{Integer.valueOf(i)};
        i = String.format(locale, "%04d", Arrays.copyOf(objArr, objArr.length));
        C2668g.a(i, "java.lang.String.format(locale, format, *args)");
        CharSequence f = C19303i.f(i, getCardViews().size());
        int i2 = 0;
        int i3 = 0;
        while (i2 < f.length()) {
            char charAt = f.charAt(i2);
            int i4 = i3 + 1;
            ((TextView) getCardViews().get(i3)).setVisibility(0);
            ((TextView) getCardViews().get(i3)).setText(String.valueOf(charAt));
            i2++;
            i3 = i4;
        }
    }

    /* renamed from: a */
    public final void m48354a() {
        for (TextView visibility : getCardViews()) {
            visibility.setVisibility(4);
        }
        getDaysLeft().setVisibility(4);
    }

    /* renamed from: b */
    private final void m48353b() {
        getPrivacyPolicyText().setMovementMethod(new PrivacyLinkMovementMethod(new C12191a(this)));
        if (VERSION.SDK_INT >= 24) {
            getPrivacyPolicyText().setText(Html.fromHtml(this.f39505f, 0));
        } else {
            getPrivacyPolicyText().setText(Html.fromHtml(this.f39505f));
        }
    }

    /* renamed from: a */
    private final void m48352a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        str = getContext();
        C2668g.a(str, "context");
        if (intent.resolveActivity(str.getPackageManager()) == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        getContext().startActivity(intent);
    }
}
