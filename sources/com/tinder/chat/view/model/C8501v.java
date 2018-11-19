package com.tinder.chat.view.model;

import com.tinder.domain.message.Message;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"viewModelId", "", "Lcom/tinder/domain/message/Message;", "getViewModelId", "(Lcom/tinder/domain/message/Message;)J", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.v */
public final class C8501v {
    /* renamed from: b */
    private static final long m36423b(@NotNull Message message) {
        message = message.getClientSequentialId();
        if (message != null) {
            return ((Number) message).longValue();
        }
        throw new IllegalStateException("Message View Model id cannot map to a null value".toString());
    }
}
