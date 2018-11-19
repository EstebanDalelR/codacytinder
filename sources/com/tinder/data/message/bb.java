package com.tinder.data.message;

import android.support.annotation.NonNull;
import com.tinder.data.model.ReactionModel;
import com.tinder.data.model.ReactionModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bb implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35439a;

    bb(Function3 function3) {
        this.f35439a = function3;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, @NotNull @NonNull String str2) {
        C2668g.b(str, "reaction_id");
        C2668g.b(str2, "message_id");
        return (ReactionModel) this.f35439a.invoke(Long.valueOf(j), str, str2);
    }
}
