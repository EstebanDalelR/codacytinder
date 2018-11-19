package com.tinder.domain.message.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.User;
import com.tinder.domain.message.Image;
import com.tinder.domain.message.ImageMessage;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/ImageMessage;", "user", "Lcom/tinder/domain/common/model/User;", "commonProperties", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "call"}, k = 3, mv = {1, 1, 10})
final class SendImageMessage$execute$1<T1, T2, R> implements Func2<User, CommonMessageProperties, ImageMessage> {
    final /* synthetic */ String $fallbackMessage;
    final /* synthetic */ Image $image;
    final /* synthetic */ SendImageMessage this$0;

    SendImageMessage$execute$1(SendImageMessage sendImageMessage, String str, Image image) {
        this.this$0 = sendImageMessage;
        this.$fallbackMessage = str;
        this.$image = image;
    }

    @NotNull
    public final ImageMessage call(@NotNull User user, @NotNull CommonMessageProperties commonMessageProperties) {
        C2668g.b(user, ManagerWebServices.PARAM_USER);
        C2668g.b(commonMessageProperties, "commonProperties");
        C15828l c15828l = C15828l.f49033a;
        Object[] objArr = new Object[]{user.name()};
        user = String.format(this.$fallbackMessage, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(user, "java.lang.String.format(format, *args)");
        return this.this$0.createImageMessage(commonMessageProperties, this.$image, user);
    }
}
