package com.tinder.data.gif;

import com.tinder.common.p194f.C8532a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class TinderGiphyApiClient$lang$1 extends Lambda implements Function0<String> {
    /* renamed from: a */
    final /* synthetic */ C8532a f43836a;

    TinderGiphyApiClient$lang$1(C8532a c8532a) {
        this.f43836a = c8532a;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53386a();
    }

    /* renamed from: a */
    public final String m53386a() {
        String language = this.f43836a.m36500a().getLanguage();
        C2668g.a(language, "defaultLocaleProvider.get().language");
        return language;
    }
}
