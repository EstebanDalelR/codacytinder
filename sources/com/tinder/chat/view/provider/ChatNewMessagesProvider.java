package com.tinder.chat.view.provider;

import com.tinder.chat.view.model.MessageViewModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00040\u0003H&J\u0018\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00040\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/chat/view/provider/ChatNewMessagesProvider;", "", "observeNewInboundMessages", "Lrx/Observable;", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "observeNewMessages", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ChatNewMessagesProvider {
    @NotNull
    Observable<List<MessageViewModel<?>>> observeNewInboundMessages();

    @NotNull
    Observable<List<MessageViewModel<?>>> observeNewMessages();
}
