package com.tinder.data.adapter;

import com.tinder.api.model.common.Teaser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/api/model/common/Teaser;", "invoke"}, k = 3, mv = {1, 1, 10})
final class RecDomainApiAdapter$parseTeasers$1 extends Lambda implements Function1<Teaser, Boolean> {
    /* renamed from: a */
    public static final RecDomainApiAdapter$parseTeasers$1 f43793a = new RecDomainApiAdapter$parseTeasers$1();

    RecDomainApiAdapter$parseTeasers$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53363a((Teaser) obj));
    }

    /* renamed from: a */
    public final boolean m53363a(@NotNull Teaser teaser) {
        C2668g.b(teaser, "it");
        Object string = teaser.string();
        if (string == null) {
            string = "";
        }
        C2668g.a(string, "(it.string() ?: \"\")");
        if ((C19303i.a((CharSequence) string) ^ 1) != 0) {
            teaser = teaser.type();
            if (teaser == null) {
                teaser = "";
            }
            C2668g.a(teaser, "(it.type() ?: \"\")");
            if ((C19303i.a((CharSequence) teaser) ^ 1) != null) {
                return true;
            }
        }
        return false;
    }
}
