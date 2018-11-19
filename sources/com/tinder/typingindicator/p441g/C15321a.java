package com.tinder.typingindicator.p441g;

import com.tinder.typingindicator.model.TypingIndicator;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/typingindicator/store/TypingIndicatorDataStore;", "", "()V", "typingIndicatorProcessorsByMatchId", "", "", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/typingindicator/model/TypingIndicator;", "getTypingIndicatorProcessor", "matchId", "observeTypingIndicatorForMatchId", "Lio/reactivex/Flowable;", "updateTypingIndicator", "", "newTypingIndicator", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.g.a */
public final class C15321a {
    /* renamed from: a */
    private final Map<String, C18430a<TypingIndicator>> f47531a = new LinkedHashMap();

    @NotNull
    /* renamed from: a */
    public final C3957b<TypingIndicator> m57499a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = m57498b(str).g();
        C2668g.a(str, "getTypingIndicatorProcessor(matchId).hide()");
        return str;
    }

    /* renamed from: a */
    public final void m57500a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "newTypingIndicator");
        m57498b(typingIndicator.m57503a()).onNext(typingIndicator);
    }

    /* renamed from: b */
    private final C18430a<TypingIndicator> m57498b(String str) {
        C18430a<TypingIndicator> c18430a;
        synchronized (this) {
            Map map = this.f47531a;
            Object obj = map.get(str);
            if (obj == null) {
                obj = BehaviorProcessor.m67654q().m66603u();
                C2668g.a(obj, "BehaviorProcessor.create…dicator>().toSerialized()");
                map.put(str, obj);
            }
            c18430a = (C18430a) obj;
        }
        return c18430a;
    }
}
