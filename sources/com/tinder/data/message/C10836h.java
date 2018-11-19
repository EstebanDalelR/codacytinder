package com.tinder.data.message;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.model.GifModel;
import com.tinder.data.model.GifModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.h */
final class C10836h implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function9 f35449a;

    C10836h(Function9 function9) {
        this.f35449a = function9;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull String str3, long j2, long j3, @NotNull @NonNull String str4, long j4, long j5) {
        String str5 = str;
        C2668g.b(str5, ManagerWebServices.PARAM_GIF_ID);
        String str6 = str2;
        C2668g.b(str6, "message_id");
        String str7 = str3;
        C2668g.b(str7, "url");
        String str8 = str4;
        C2668g.b(str8, "fixed_height_url");
        return (GifModel) this.f35449a.invoke(Long.valueOf(j), str5, str6, str7, Long.valueOf(j2), Long.valueOf(j3), str8, Long.valueOf(j4), Long.valueOf(j5));
    }
}
