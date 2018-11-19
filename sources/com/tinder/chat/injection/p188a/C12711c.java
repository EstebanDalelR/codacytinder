package com.tinder.chat.injection.p188a;

import android.content.Context;
import com.tinder.chat.analytics.C10531g;
import com.tinder.chat.analytics.C10533j;
import com.tinder.chat.analytics.C10536o;
import com.tinder.chat.analytics.C10537q;
import com.tinder.chat.analytics.C10542z;
import com.tinder.chat.view.action.C8464u;
import com.tinder.chat.view.action.C8465w;
import com.tinder.chat.view.action.C8467y;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction;
import com.tinder.chat.view.action.aa;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.c */
public final class C12711c implements Factory<ChatContextualMenuDisplayAction> {
    /* renamed from: a */
    private final C8440a f41000a;
    /* renamed from: b */
    private final Provider<Context> f41001b;
    /* renamed from: c */
    private final Provider<String> f41002c;
    /* renamed from: d */
    private final Provider<aa> f41003d;
    /* renamed from: e */
    private final Provider<C8465w> f41004e;
    /* renamed from: f */
    private final Provider<C8467y> f41005f;
    /* renamed from: g */
    private final Provider<C8464u> f41006g;
    /* renamed from: h */
    private final Provider<C10533j> f41007h;
    /* renamed from: i */
    private final Provider<C10531g> f41008i;
    /* renamed from: j */
    private final Provider<C10536o> f41009j;
    /* renamed from: k */
    private final Provider<C10537q> f41010k;
    /* renamed from: l */
    private final Provider<C10542z> f41011l;

    public /* synthetic */ Object get() {
        return m50030a();
    }

    public C12711c(C8440a c8440a, Provider<Context> provider, Provider<String> provider2, Provider<aa> provider3, Provider<C8465w> provider4, Provider<C8467y> provider5, Provider<C8464u> provider6, Provider<C10533j> provider7, Provider<C10531g> provider8, Provider<C10536o> provider9, Provider<C10537q> provider10, Provider<C10542z> provider11) {
        this.f41000a = c8440a;
        this.f41001b = provider;
        this.f41002c = provider2;
        this.f41003d = provider3;
        this.f41004e = provider4;
        this.f41005f = provider5;
        this.f41006g = provider6;
        this.f41007h = provider7;
        this.f41008i = provider8;
        this.f41009j = provider9;
        this.f41010k = provider10;
        this.f41011l = provider11;
    }

    /* renamed from: a */
    public ChatContextualMenuDisplayAction m50030a() {
        return C12711c.m50028a(this.f41000a, this.f41001b, this.f41002c, this.f41003d, this.f41004e, this.f41005f, this.f41006g, this.f41007h, this.f41008i, this.f41009j, this.f41010k, this.f41011l);
    }

    /* renamed from: a */
    public static ChatContextualMenuDisplayAction m50028a(C8440a c8440a, Provider<Context> provider, Provider<String> provider2, Provider<aa> provider3, Provider<C8465w> provider4, Provider<C8467y> provider5, Provider<C8464u> provider6, Provider<C10533j> provider7, Provider<C10531g> provider8, Provider<C10536o> provider9, Provider<C10537q> provider10, Provider<C10542z> provider11) {
        return C12711c.m50027a(c8440a, (Context) provider.get(), (String) provider2.get(), (aa) provider3.get(), (C8465w) provider4.get(), (C8467y) provider5.get(), (C8464u) provider6.get(), (C10533j) provider7.get(), (C10531g) provider8.get(), (C10536o) provider9.get(), (C10537q) provider10.get(), (C10542z) provider11.get());
    }

    /* renamed from: b */
    public static C12711c m50029b(C8440a c8440a, Provider<Context> provider, Provider<String> provider2, Provider<aa> provider3, Provider<C8465w> provider4, Provider<C8467y> provider5, Provider<C8464u> provider6, Provider<C10533j> provider7, Provider<C10531g> provider8, Provider<C10536o> provider9, Provider<C10537q> provider10, Provider<C10542z> provider11) {
        return new C12711c(c8440a, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    /* renamed from: a */
    public static ChatContextualMenuDisplayAction m50027a(C8440a c8440a, Context context, String str, aa aaVar, C8465w c8465w, C8467y c8467y, C8464u c8464u, C10533j c10533j, C10531g c10531g, C10536o c10536o, C10537q c10537q, C10542z c10542z) {
        return (ChatContextualMenuDisplayAction) C15521i.a(c8440a.m36012a(context, str, aaVar, c8465w, c8467y, c8464u, c10533j, c10531g, c10536o, c10537q, c10542z), "Cannot return null from a non-@Nullable @Provides method");
    }
}
