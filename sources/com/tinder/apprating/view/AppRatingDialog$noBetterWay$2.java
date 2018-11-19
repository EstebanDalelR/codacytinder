package com.tinder.apprating.view;

import android.content.Context;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class AppRatingDialog$noBetterWay$2 extends Lambda implements Function0<String> {
    /* renamed from: a */
    final /* synthetic */ Context f43382a;

    AppRatingDialog$noBetterWay$2(Context context) {
        this.f43382a = context;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53095a();
    }

    /* renamed from: a */
    public final String m53095a() {
        return this.f43382a.getResources().getString(R.string.no_better_way);
    }
}
