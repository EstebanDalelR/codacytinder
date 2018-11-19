package com.tinder.chat.target;

import android.support.v7.util.DiffUtil.DiffResult;
import com.tinder.chat.view.model.ChatItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/chat/target/ChatTarget;", "", "scrollToLatestMessage", "", "showConversation", "showEmptyScreen", "showErrorMessage", "showLoading", "updateChat", "chatItems", "", "Lcom/tinder/chat/view/model/ChatItem;", "diffResult", "Landroid/support/v7/util/DiffUtil$DiffResult;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ChatTarget {
    void scrollToLatestMessage();

    void showConversation();

    void showEmptyScreen();

    void showErrorMessage();

    void showLoading();

    void updateChat(@NotNull List<? extends ChatItem> list, @NotNull DiffResult diffResult);
}
