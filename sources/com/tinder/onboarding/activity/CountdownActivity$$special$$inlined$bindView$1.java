package com.tinder.onboarding.activity;

import android.app.Activity;
import android.view.View;
import com.tinder.onboarding.view.CountdownView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "Landroid/view/View;", "invoke", "()Landroid/view/View;", "com/tinder/utils/ViewBindingKt$bindView$1"}, k = 3, mv = {1, 1, 10})
public final class CountdownActivity$$special$$inlined$bindView$1 extends Lambda implements Function0<CountdownView> {
    /* renamed from: a */
    final /* synthetic */ Activity f44626a;
    /* renamed from: b */
    final /* synthetic */ int f44627b;

    public CountdownActivity$$special$$inlined$bindView$1(Activity activity, int i) {
        this.f44626a = activity;
        this.f44627b = i;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53816a();
    }

    @NotNull
    /* renamed from: a */
    public final CountdownView m53816a() {
        View findViewById = this.f44626a.findViewById(this.f44627b);
        if (findViewById != null) {
            return findViewById;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't find view: ");
        stringBuilder.append(CountdownView.class.getSimpleName());
        stringBuilder.append(" with id: ");
        stringBuilder.append(this.f44627b);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
