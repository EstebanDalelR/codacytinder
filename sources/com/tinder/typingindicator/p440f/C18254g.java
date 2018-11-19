package com.tinder.typingindicator.p440f;

import com.tinder.typingindicator.model.TypingIndicator.State;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorStateToViewModelState;", "Lkotlin/Function1;", "Lcom/tinder/typingindicator/model/TypingIndicator$State;", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator$State;", "()V", "invoke", "state", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.f.g */
public final class C18254g implements Function1<State, TypingIndicator.State> {
    public /* synthetic */ Object invoke(Object obj) {
        return m66144a((State) obj);
    }

    @NotNull
    /* renamed from: a */
    public TypingIndicator.State m66144a(@NotNull State state) {
        C2668g.b(state, "state");
        switch (C15320h.f47530a[state.ordinal()]) {
            case 1:
                return TypingIndicator.State.ACTIVE;
            case 2:
                return TypingIndicator.State.EXPIRED;
            case 3:
                return TypingIndicator.State.INTERRUPTED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
