package com.tinder.tindergold.view;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class TinderGoldIntroDialog$show$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ TinderGoldIntroDialog f58648a;

    TinderGoldIntroDialog$show$1(TinderGoldIntroDialog tinderGoldIntroDialog) {
        this.f58648a = tinderGoldIntroDialog;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m67464a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67464a() {
        this.f58648a.m62594g().m57097a();
        this.f58648a.m62595h().onGoldIntroContinueClick();
        this.f58648a.dismiss();
    }
}
