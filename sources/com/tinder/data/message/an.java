package com.tinder.data.message;

import android.support.annotation.NonNull;
import com.tinder.data.model.MessageImageModel;
import com.tinder.data.model.MessageImageModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class an implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function5 f35429a;

    an(Function5 function5) {
        this.f35429a = function5;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull String str3, long j, long j2) {
        C2668g.b(str, "message_id");
        C2668g.b(str2, "source");
        C2668g.b(str3, "url");
        return (MessageImageModel) this.f35429a.invoke(str, str2, str3, Long.valueOf(j), Long.valueOf(j2));
    }
}
