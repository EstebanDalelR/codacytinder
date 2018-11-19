package com.tinder.data.p222i.p354a;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.Config;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.NoConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/typingindicator/mapperfunctions/MetaGlobalsToTypingIndicatorConfig;", "Lkotlin/Function1;", "Lcom/tinder/api/model/meta/Meta$Globals;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "()V", "invoke", "globals", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.i.a.a */
public final class C12902a implements Function1<Globals, TypingIndicatorConfig> {
    public /* synthetic */ Object invoke(Object obj) {
        return m50569a((Globals) obj);
    }

    @NotNull
    /* renamed from: a */
    public TypingIndicatorConfig m50569a(@NotNull Globals globals) {
        C2668g.b(globals, ManagerWebServices.PARAM_GLOBALS);
        globals = globals.typingIndicatorConfig();
        if (globals == null) {
            return (TypingIndicatorConfig) NoConfig.INSTANCE;
        }
        Long typingHeartbeat = globals.typingHeartbeat();
        if (typingHeartbeat == null) {
            throw new IllegalArgumentException("typingHeartbeat cannot be null".toString());
        }
        long longValue = typingHeartbeat.longValue();
        globals = globals.typingTimeToLive();
        if (globals != null) {
            return new Config(longValue, ((Number) globals).longValue());
        }
        throw new IllegalArgumentException("typingTimeToLive cannot be null".toString());
    }
}
