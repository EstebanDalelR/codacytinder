package com.tinder.data.message;

import android.database.Cursor;
import com.tinder.data.model.MessageImageModel.C10857c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/MessageImage;", "p1", "Landroid/database/Cursor;", "Lkotlin/ParameterName;", "name", "cursor", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageDataStore$messageImageById$2$1 extends FunctionReference implements Function1<Cursor, al> {
    MessageDataStore$messageImageById$2$1(C10857c c10857c) {
        super(1, c10857c);
    }

    public final String getName() {
        return "map";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10857c.class);
    }

    public final String getSignature() {
        return "map(Landroid/database/Cursor;)Lcom/tinder/data/model/MessageImageModel;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54355a((Cursor) obj);
    }

    @NotNull
    /* renamed from: a */
    public final al m54355a(@NotNull Cursor cursor) {
        C2668g.b(cursor, "p1");
        return (al) ((C10857c) this.receiver).m43361a(cursor);
    }
}
