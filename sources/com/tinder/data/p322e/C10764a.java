package com.tinder.data.p322e;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.request.SendMessageRequestBody;
import com.tinder.common.function.Mapper;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/mapper/MessageRequestBodyMapper;", "Lcom/tinder/common/function/Mapper;", "Lcom/tinder/domain/message/Message;", "Lcom/tinder/api/request/SendMessageRequestBody;", "()V", "map", "message", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.e.a */
public final class C10764a implements Mapper<Message, SendMessageRequestBody> {
    public /* synthetic */ Object map(Object obj) {
        return m43167a((Message) obj);
    }

    @NotNull
    /* renamed from: a */
    public SendMessageRequestBody m43167a(@NotNull Message message) {
        C2668g.b(message, "message");
        if (message instanceof TextMessage) {
            return new SendMessageRequestBody(message.getText(), null, null, null, null, null, null, null, 254, null);
        }
        if (message instanceof GifMessage) {
            message = ((GifMessage) message).getFixedHeightGif();
            return new SendMessageRequestBody(message.component3(), "gif", message.component1(), null, null, null, null, null, 248, null);
        } else if (message instanceof ReactionMessage) {
            return new SendMessageRequestBody(message.getText(), "gesture", null, ((ReactionMessage) message).getReaction().getId(), null, null, null, null, 244, null);
        } else {
            if (message instanceof ActivityMessage) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("An operation is not implemented: ");
                stringBuilder.append("Activity messages can not be sent");
                throw new NotImplementedError(stringBuilder.toString());
            } else if (message instanceof ImageMessage) {
                ImageMessage imageMessage = (ImageMessage) message;
                return new SendMessageRequestBody(message.getText(), ManagerWebServices.IG_PARAM_IMAGE, null, null, imageMessage.getImage().getSource(), imageMessage.getImage().getUrl(), Integer.valueOf(imageMessage.getImage().getWidth()), Integer.valueOf(imageMessage.getImage().getHeight()), 12, null);
            } else if ((message instanceof SystemMessage) != null) {
                throw ((Throwable) new IllegalArgumentException("System messages can not be sent"));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
