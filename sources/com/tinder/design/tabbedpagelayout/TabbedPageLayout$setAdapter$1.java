package com.tinder.design.tabbedpagelayout;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class TabbedPageLayout$setAdapter$1 extends Lambda implements Function1<Integer, C15813i> {
    /* renamed from: a */
    final /* synthetic */ TabbedPageLayout f44028a;

    TabbedPageLayout$setAdapter$1(TabbedPageLayout tabbedPageLayout) {
        this.f44028a = tabbedPageLayout;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53444a(((Number) obj).intValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53444a(int i) {
        for (OnPageSelectedListener onPageReselected : this.f44028a.f30937g) {
            onPageReselected.onPageReselected((TabbedPageLayout$Page) TabbedPageLayout.m37542b(this.f44028a).getPages().get(i));
        }
    }
}
