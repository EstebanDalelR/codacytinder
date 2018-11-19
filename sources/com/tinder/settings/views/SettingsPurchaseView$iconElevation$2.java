package com.tinder.settings.views;

import android.content.Context;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class SettingsPurchaseView$iconElevation$2 extends Lambda implements Function0<Float> {
    /* renamed from: a */
    final /* synthetic */ Context f58452a;

    SettingsPurchaseView$iconElevation$2(Context context) {
        this.f58452a = context;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Float.valueOf(m67310a());
    }

    /* renamed from: a */
    public final float m67310a() {
        return this.f58452a.getResources().getDimension(R.dimen.space_xs);
    }
}
