package com.tinder.data.message;

import com.tinder.data.model.MessageImageModel.C10857c;
import com.tinder.data.model.MessageImageModel.C8709a;
import com.tinder.data.model.MessageImageModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\"8\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"messageImageMapper", "Lcom/tinder/data/model/MessageImageModel$Mapper;", "Lcom/tinder/data/message/MessageImage;", "kotlin.jvm.PlatformType", "getMessageImageMapper", "()Lcom/tinder/data/model/MessageImageModel$Mapper;", "messageImageModelFactory", "Lcom/tinder/data/model/MessageImageModel$Factory;", "getMessageImageModelFactory", "()Lcom/tinder/data/model/MessageImageModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class am {
    @NotNull
    /* renamed from: a */
    private static final C8709a<al> f30623a;
    /* renamed from: b */
    private static final C10857c<al> f30624b = f30623a.m37181a();

    static {
        Function5 function5 = MessageImageModelsKt$messageImageModelFactory$1.f45279a;
        if (function5 != null) {
            function5 = new an(function5);
        }
        f30623a = new C8709a((Creator) function5);
    }

    @NotNull
    /* renamed from: a */
    public static final C8709a<al> m37118a() {
        return f30623a;
    }
}
