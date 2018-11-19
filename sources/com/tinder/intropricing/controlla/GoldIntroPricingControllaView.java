package com.tinder.intropricing.controlla;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.C6149a;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.intropricing.C9728a.C9723c;
import com.tinder.intropricing.C9728a.C9724d;
import com.tinder.intropricing.C9728a.C9726f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/intropricing/controlla/GoldIntroPricingControllaView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "discount", "Landroid/widget/TextView;", "getTinderGoldButton", "Lcom/tinder/gold/TinderGoldButtonView;", "introPricingExpirationTime", "unformattedDiscountText", "", "kotlin.jvm.PlatformType", "unformattedTimerText", "bindViewModel", "", "viewModel", "Lcom/tinder/intropricing/controlla/GoldIntroPricingControllaViewModel;", "onAttachedToWindow", "onDetachedFromWindow", "setOnClickListener", "l", "Landroid/view/View$OnClickListener;", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
public final class GoldIntroPricingControllaView extends LinearLayout {
    /* renamed from: a */
    private final TextView f32322a;
    /* renamed from: b */
    private final TinderGoldButtonView f32323b;
    /* renamed from: c */
    private final TextView f32324c;
    /* renamed from: d */
    private final String f32325d;
    /* renamed from: e */
    private final String f32326e;
    /* renamed from: f */
    private CountDownTimer f32327f;

    public GoldIntroPricingControllaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f32325d = context.getResources().getString(C9726f.intro_pricing_discount_expiration);
        this.f32326e = context.getResources().getString(C9726f.intro_pricing_discount_subtext_controlla);
        LinearLayout.inflate(context, C9724d.view_gold_intropricing_controlla, this);
        setOrientation(1);
        setGravity(17);
        context = findViewById(C9723c.intro_pricing_discount);
        C2668g.a(context, "findViewById(R.id.intro_pricing_discount)");
        this.f32322a = (TextView) context;
        context = findViewById(C9723c.intro_pricing_get_gold_button);
        C2668g.a(context, "findViewById(R.id.intro_pricing_get_gold_button)");
        this.f32323b = (TinderGoldButtonView) context;
        context = findViewById(C9723c.intro_pricing_expiration);
        C2668g.a(context, "findViewById(R.id.intro_pricing_expiration)");
        this.f32324c = (TextView) context;
    }

    public /* synthetic */ GoldIntroPricingControllaView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        this.f32323b.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void m40226a(@NotNull C9729a c9729a) {
        C2668g.b(c9729a, "viewModel");
        CountDownTimer countDownTimer = this.f32327f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        DateTime a = c9729a.m40227a();
        DateTime a2 = DateTime.a();
        C2668g.a(a2, "DateTime.now()");
        a = a.c(a2.getMillis());
        C2668g.a(a, "viewModel.expirationTime…us(DateTime.now().millis)");
        this.f32327f = new C6149a(a.getMillis(), new GoldIntroPricingControllaView$bindViewModel$1(this)).start();
        TextView textView = this.f32322a;
        C15828l c15828l = C15828l.f49033a;
        String str = this.f32326e;
        C2668g.a(str, "unformattedDiscountText");
        Object[] objArr = new Object[]{Integer.valueOf(c9729a.m40228b())};
        c9729a = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(c9729a, "java.lang.String.format(format, *args)");
        textView.setText((CharSequence) c9729a);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        CountDownTimer countDownTimer = this.f32327f;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f32327f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
