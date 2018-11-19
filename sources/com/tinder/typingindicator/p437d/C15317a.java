package com.tinder.typingindicator.p437d;

import com.tinder.typingindicator.model.TypingIndicator;
import com.tinder.typingindicator.model.TypingIndicator.State;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"asExpired", "Lcom/tinder/typingindicator/model/TypingIndicator;", "asInterrupted", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.d.a */
public final class C15317a {
    @NotNull
    /* renamed from: a */
    public static final TypingIndicator m57496a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "$receiver");
        return TypingIndicator.m57501a(typingIndicator, null, null, null, State.EXPIRED, 7, null);
    }

    @NotNull
    /* renamed from: b */
    public static final TypingIndicator m57497b(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "$receiver");
        return TypingIndicator.m57501a(typingIndicator, null, null, null, State.INTERRUPTED, 7, null);
    }
}
