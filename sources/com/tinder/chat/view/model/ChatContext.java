package com.tinder.chat.view.model;

import com.tinder.domain.common.model.Photo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0012\u0010\n\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tinder/chat/view/model/ChatContext;", "", "avatarUrls", "", "", "getAvatarUrls", "()Ljava/util/List;", "matchPersonPhotos", "Lcom/tinder/domain/common/model/Photo;", "getMatchPersonPhotos", "userId", "getUserId", "()Ljava/lang/String;", "userName", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ChatContext {
    @NotNull
    List<String> getAvatarUrls();

    @NotNull
    List<Photo> getMatchPersonPhotos();

    @NotNull
    String getUserId();

    @NotNull
    String userName(@NotNull String str);
}
