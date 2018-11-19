package com.tinder.chat.view.provider;

import com.tinder.chat.view.model.MessageViewModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/chat/view/provider/ChatNewMessagesNotifier;", "", "notifyNewMessages", "", "newMessages", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ChatNewMessagesNotifier {
    void notifyNewMessages(@NotNull List<? extends MessageViewModel<?>> list);
}
