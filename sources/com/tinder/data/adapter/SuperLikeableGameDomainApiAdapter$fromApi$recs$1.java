package com.tinder.data.adapter;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.UserRec;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/Rec;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class SuperLikeableGameDomainApiAdapter$fromApi$recs$1 extends Lambda implements Function1<Rec, C15813i> {
    /* renamed from: a */
    final /* synthetic */ String f43796a;

    SuperLikeableGameDomainApiAdapter$fromApi$recs$1(String str) {
        this.f43796a = str;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53366a((Rec) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53366a(Rec rec) {
        if (!(rec instanceof UserRec)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SuperLikeable game apiModel (");
            stringBuilder.append(this.f43796a);
            stringBuilder.append(") contains non-user rec: ");
            stringBuilder.append(rec);
            stringBuilder.append(", which got skipped.");
            C0001a.d(stringBuilder.toString(), new Object[0]);
        }
    }
}
