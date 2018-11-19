package com.tinder.onboarding.view;

import android.view.View;
import android.widget.TextView;
import com.tinder.onboarding.C9964g.C9961b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 1, 10})
final class CountdownView$cardViews$2 extends Lambda implements Function0<List<? extends TextView>> {
    /* renamed from: a */
    final /* synthetic */ CountdownView f44796a;

    CountdownView$cardViews$2(CountdownView countdownView) {
        this.f44796a = countdownView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53829a();
    }

    @NotNull
    /* renamed from: a */
    public final List<TextView> m53829a() {
        TextView[] textViewArr = new TextView[4];
        View findViewById = this.f44796a.findViewById(C9961b.countdown_day_count_thousands);
        C2668g.a(findViewById, "findViewById(R.id.countdown_day_count_thousands)");
        textViewArr[0] = (TextView) findViewById;
        findViewById = this.f44796a.findViewById(C9961b.countdown_day_count_hundreds);
        C2668g.a(findViewById, "findViewById(R.id.countdown_day_count_hundreds)");
        textViewArr[1] = (TextView) findViewById;
        findViewById = this.f44796a.findViewById(C9961b.countdown_day_count_tens);
        C2668g.a(findViewById, "findViewById(R.id.countdown_day_count_tens)");
        textViewArr[2] = (TextView) findViewById;
        findViewById = this.f44796a.findViewById(C9961b.countdown_day_count_ones);
        C2668g.a(findViewById, "findViewById(R.id.countdown_day_count_ones)");
        textViewArr[3] = (TextView) findViewById;
        return C19301m.b(textViewArr);
    }
}
