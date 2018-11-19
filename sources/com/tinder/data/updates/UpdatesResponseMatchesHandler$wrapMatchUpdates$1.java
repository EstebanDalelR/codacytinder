package com.tinder.data.updates;

import com.tinder.api.model.common.ApiMatch;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "apiMatch", "Lcom/tinder/api/model/common/ApiMatch;", "invoke"}, k = 3, mv = {1, 1, 10})
final class UpdatesResponseMatchesHandler$wrapMatchUpdates$1 extends Lambda implements Function1<ApiMatch, Boolean> {
    /* renamed from: a */
    final /* synthetic */ ac f44024a;

    UpdatesResponseMatchesHandler$wrapMatchUpdates$1(ac acVar) {
        this.f44024a = acVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53442a((ApiMatch) obj));
    }

    /* renamed from: a */
    public final boolean m53442a(@NotNull ApiMatch apiMatch) {
        C2668g.b(apiMatch, "apiMatch");
        return this.f44024a.m37472a(apiMatch);
    }
}
