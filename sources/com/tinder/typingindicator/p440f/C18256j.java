package com.tinder.typingindicator.p440f;

import com.tinder.proto.keepalive.KeepAliveTypingIndicator;
import com.tinder.typingindicator.model.TypingIndicator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorToKeepAliveTypingIndicator;", "Lkotlin/Function1;", "Lcom/tinder/typingindicator/model/TypingIndicator;", "Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;", "dateTimeToTimestamp", "Lcom/tinder/typingindicator/mapperfunctions/DateTimeToTimestamp;", "(Lcom/tinder/typingindicator/mapperfunctions/DateTimeToTimestamp;)V", "invoke", "typingIndicator", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.f.j */
public final class C18256j implements Function1<TypingIndicator, KeepAliveTypingIndicator.TypingIndicator> {
    /* renamed from: a */
    private final C18248a f56571a;

    @Inject
    public C18256j(@NotNull C18248a c18248a) {
        C2668g.b(c18248a, "dateTimeToTimestamp");
        this.f56571a = c18248a;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m66148a((TypingIndicator) obj);
    }

    @NotNull
    /* renamed from: a */
    public KeepAliveTypingIndicator.TypingIndicator m66148a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "typingIndicator");
        typingIndicator = KeepAliveTypingIndicator.TypingIndicator.newBuilder().setMatchId(typingIndicator.m57503a()).setToUserId(typingIndicator.m57504b()).setSentTime(this.f56571a.m66132a(typingIndicator.m57505c())).build();
        C2668g.a(typingIndicator, "KeepAliveTypingIndicator…\n                .build()");
        C2668g.a(typingIndicator, "with(typingIndicator) {\n…       .build()\n        }");
        return typingIndicator;
    }
}
