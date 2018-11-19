package com.tinder.chat.analytics;

import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"isActive", "", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "isNotActive", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class ao {
    /* renamed from: c */
    private static final boolean m35932c(@NotNull TypingIndicator typingIndicator) {
        return typingIndicator.b() == State.ACTIVE ? true : null;
    }

    /* renamed from: d */
    private static final boolean m35933d(@NotNull TypingIndicator typingIndicator) {
        return m35932c(typingIndicator) ^ 1;
    }
}
