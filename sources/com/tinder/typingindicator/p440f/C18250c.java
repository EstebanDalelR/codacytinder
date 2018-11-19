package com.tinder.typingindicator.p440f;

import com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator;
import com.tinder.typingindicator.model.TypingIndicator.State;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/typingindicator/mapperfunctions/KeepAliveTypingIndicatorToTypingIndicator;", "Lkotlin/Function1;", "Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;", "Lcom/tinder/typingindicator/model/TypingIndicator;", "timestampToDateTime", "Lcom/tinder/typingindicator/mapperfunctions/TimestampToDateTime;", "(Lcom/tinder/typingindicator/mapperfunctions/TimestampToDateTime;)V", "invoke", "keepAliveTypingIndicator", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.f.c */
public final class C18250c implements Function1<TypingIndicator, com.tinder.typingindicator.model.TypingIndicator> {
    /* renamed from: a */
    private final C18252e f56567a;

    @Inject
    public C18250c(@NotNull C18252e c18252e) {
        C2668g.b(c18252e, "timestampToDateTime");
        this.f56567a = c18252e;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m66136a((TypingIndicator) obj);
    }

    @NotNull
    /* renamed from: a */
    public com.tinder.typingindicator.model.TypingIndicator m66136a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "keepAliveTypingIndicator");
        String matchId = typingIndicator.getMatchId();
        C2668g.a(matchId, "matchId");
        String toUserId = typingIndicator.getToUserId();
        C2668g.a(toUserId, "toUserId");
        C18252e c18252e = this.f56567a;
        typingIndicator = typingIndicator.getSentTime();
        C2668g.a(typingIndicator, "sentTime");
        return new com.tinder.typingindicator.model.TypingIndicator(matchId, toUserId, c18252e.m66140a(typingIndicator), State.ACTIVE);
    }
}
