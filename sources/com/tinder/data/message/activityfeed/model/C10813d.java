package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.d */
final class C10813d implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function5 f35376a;

    C10813d(Function5 function5) {
        this.f35376a = function5;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, long j2, long j3, long j4) {
        C2668g.b(str, "activity_feed_item_id");
        return (ActivityEventNewMatchModel) this.f35376a.invoke(Long.valueOf(j), str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
    }
}
