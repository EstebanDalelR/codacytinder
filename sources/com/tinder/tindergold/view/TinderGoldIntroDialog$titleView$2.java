package com.tinder.tindergold.view;

import android.widget.TextView;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class TinderGoldIntroDialog$titleView$2 extends Lambda implements Function0<TextView> {
    /* renamed from: a */
    final /* synthetic */ TinderGoldIntroDialog f58649a;

    TinderGoldIntroDialog$titleView$2(TinderGoldIntroDialog tinderGoldIntroDialog) {
        this.f58649a = tinderGoldIntroDialog;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67465a();
    }

    /* renamed from: a */
    public final TextView m67465a() {
        return (TextView) this.f58649a.findViewById(R.id.intro_title);
    }
}
