package com.tinder.intropricing.paywall.view.info;

import android.widget.TextView;
import java.util.Arrays;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "formattedTime", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class IntroPricingInfoView$bind$1 extends Lambda implements Function1<String, C15813i> {
    /* renamed from: a */
    final /* synthetic */ IntroPricingInfoView f44484a;

    IntroPricingInfoView$bind$1(IntroPricingInfoView introPricingInfoView) {
        this.f44484a = introPricingInfoView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53721a((String) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53721a(@NotNull String str) {
        C2668g.b(str, "formattedTime");
        TextView a = this.f44484a.getIntroPricingExpirationTime();
        C2668g.a(a, "introPricingExpirationTime");
        C15828l c15828l = C15828l.f49033a;
        String b = this.f44484a.f38757h;
        C2668g.a(b, "unformattedTimerText");
        Object[] objArr = new Object[]{str};
        str = String.format(b, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str, "java.lang.String.format(format, *args)");
        a.setText(str);
    }
}
