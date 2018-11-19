package com.tinder.feed.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedMainViewExtensionsKt$showComposerDialog$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ FeedMainView f44160a;
    /* renamed from: b */
    final /* synthetic */ int f44161b;
    /* renamed from: c */
    final /* synthetic */ View f44162c;
    /* renamed from: d */
    final /* synthetic */ ViewGroup f44163d;
    /* renamed from: e */
    final /* synthetic */ String f44164e;

    FeedMainViewExtensionsKt$showComposerDialog$1(FeedMainView feedMainView, int i, View view, ViewGroup viewGroup, String str) {
        this.f44160a = feedMainView;
        this.f44161b = i;
        this.f44162c = view;
        this.f44163d = viewGroup;
        this.f44164e = str;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53536a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53536a() {
        FeedMainView feedMainView = this.f44160a;
        int i = this.f44161b;
        View view = this.f44162c;
        C2668g.a(view, "anchorView");
        C9488c.m39673b(feedMainView, i, view, this.f44163d, this.f44164e);
    }
}
