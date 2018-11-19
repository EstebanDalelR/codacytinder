package com.tinder.smsauth.ui.view;

import com.tinder.smsauth.ui.view.OneTimePasswordCollectionContainerView.Listener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newCode", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class OneTimePasswordCollectionContainerView$onAttachedToWindow$1 extends Lambda implements Function1<String, C15813i> {
    /* renamed from: a */
    final /* synthetic */ OneTimePasswordCollectionContainerView f58544a;

    OneTimePasswordCollectionContainerView$onAttachedToWindow$1(OneTimePasswordCollectionContainerView oneTimePasswordCollectionContainerView) {
        this.f58544a = oneTimePasswordCollectionContainerView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67383a((String) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67383a(@NotNull String str) {
        C2668g.b(str, "newCode");
        Listener listener = this.f58544a.getListener();
        if (listener != null) {
            listener.onOneTimePasswordTextChanged(str);
        }
    }
}
