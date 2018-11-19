package com.tinder.domain.message.usecase;

import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "fromId", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.domain.message.usecase.CommonMessagePropertiesAggregator$extractFromIdAndToIdFromMatch$1 */
final class C13158xdee7395<T, R> implements Func1<T, R> {
    final /* synthetic */ Match $match;

    C13158xdee7395(Match match) {
        this.$match = match;
    }

    @NotNull
    public final Pair<String, String> call(String str) {
        Object id;
        Match match = this.$match;
        if (match instanceof CoreMatch) {
            id = ((CoreMatch) this.$match).getPerson().id();
            C2668g.a(id, "match.person.id()");
        } else if (match instanceof MessageAdMatch) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid or unsupported match: ");
            stringBuilder.append(this.$match);
            throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        } else if (match instanceof PlacesMatch) {
            id = ((PlacesMatch) this.$match).getPerson().id();
            C2668g.a(id, "match.person.id()");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C15811g.a(str, id);
    }
}
