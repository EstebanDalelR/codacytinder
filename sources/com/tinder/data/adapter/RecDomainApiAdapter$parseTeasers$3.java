package com.tinder.data.adapter;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.UserRec.Teaser;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/UserRec$Teaser;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class RecDomainApiAdapter$parseTeasers$3 extends Lambda implements Function1<Pair<? extends String, ? extends String>, Teaser> {
    /* renamed from: a */
    public static final RecDomainApiAdapter$parseTeasers$3 f43795a = new RecDomainApiAdapter$parseTeasers$3();

    RecDomainApiAdapter$parseTeasers$3() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53365a((Pair) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Teaser m53365a(@NotNull Pair<String, String> pair) {
        C2668g.b(pair, "<name for destructuring parameter 0>");
        String str = (String) pair.c();
        String str2 = (String) pair.d();
        C2668g.a(str, ManagerWebServices.PARAM_TEASER_STRING);
        C2668g.a(str2, "value");
        return new Teaser(str, str2);
    }
}
