package com.tinder.smsauth.ui.view;

import com.tinder.smsauth.entity.C14975c;
import com.tinder.smsauth.ui.view.CountryCodeSelectionView.Listener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/entity/Country;", "invoke"}, k = 3, mv = {1, 1, 10})
final class CountryCodeSelectionView$countryCodeAdapter$1 extends Lambda implements Function1<C14975c, C15813i> {
    /* renamed from: a */
    final /* synthetic */ CountryCodeSelectionView f58541a;

    CountryCodeSelectionView$countryCodeAdapter$1(CountryCodeSelectionView countryCodeSelectionView) {
        this.f58541a = countryCodeSelectionView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67380a((C14975c) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67380a(@NotNull C14975c c14975c) {
        C2668g.b(c14975c, "it");
        Listener listener = this.f58541a.getListener();
        if (listener != null) {
            listener.onCountrySelected(c14975c);
        }
    }
}
