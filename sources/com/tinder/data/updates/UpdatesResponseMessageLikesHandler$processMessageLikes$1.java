package com.tinder.data.updates;

import com.tinder.api.model.updates.Updates.LikedMessage;
import com.tinder.data.message.C10838k;
import com.tinder.domain.message.MessageLike;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012F\u0010\u0005\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u001f\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t0\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/message/MessageLike;", "kotlin.jvm.PlatformType", "", "p1", "Lcom/tinder/api/model/updates/Updates$LikedMessage;", "Lkotlin/ParameterName;", "name", "apiModels", "invoke"}, k = 3, mv = {1, 1, 10})
final class UpdatesResponseMessageLikesHandler$processMessageLikes$1 extends FunctionReference implements Function1<List<LikedMessage>, List<MessageLike>> {
    UpdatesResponseMessageLikesHandler$processMessageLikes$1(C10838k c10838k) {
        super(1, c10838k);
    }

    public final String getName() {
        return "fromApi";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10838k.class);
    }

    public final String getSignature() {
        return "fromApi(Ljava/util/List;)Ljava/util/List;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54402a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<MessageLike> m54402a(@NotNull List<LikedMessage> list) {
        C2668g.b(list, "p1");
        return ((C10838k) this.receiver).a(list);
    }
}
