package com.tinder.api.module;

import com.tinder.common.provider.C2643c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class ThirdPartyClientModule$provideGiphyApi$1 extends Lambda implements Function0<String> {
    final /* synthetic */ C2643c $defaultLocaleProvider;

    ThirdPartyClientModule$provideGiphyApi$1(C2643c c2643c) {
        this.$defaultLocaleProvider = c2643c;
        super(0);
    }

    public final String invoke() {
        String language = this.$defaultLocaleProvider.a().getLanguage();
        C2668g.a(language, "defaultLocaleProvider.get().language");
        return language;
    }
}
