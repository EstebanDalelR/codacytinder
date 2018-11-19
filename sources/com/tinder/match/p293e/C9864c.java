package com.tinder.match.p293e;

import android.support.annotation.NonNull;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.match.model.MessageMatch;
import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.match.viewmodel.C9889e;
import com.tinder.match.viewmodel.MatchListItem;
import com.tinder.match.viewmodel.MatchListItem.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;

/* renamed from: com.tinder.match.e.c */
public class C9864c {
    /* renamed from: a */
    private final C9889e f32659a;

    @Inject
    public C9864c(C9889e c9889e) {
        this.f32659a = c9889e;
    }

    @NonNull
    /* renamed from: a */
    public List<MatchListItem> m40578a(@NonNull MessageMatchesUpdate messageMatchesUpdate, boolean z, boolean z2) {
        boolean z3 = true;
        if (!(messageMatchesUpdate.getShowNewMatches() || z)) {
            if (!z2) {
                z = false;
                if (!messageMatchesUpdate.getShowNewMatches()) {
                    if (!messageMatchesUpdate.getMessageMatches().isEmpty()) {
                        z3 = false;
                    }
                }
                return m40576a(z, messageMatchesUpdate.getMessageMatches(), z3);
            }
        }
        z = true;
        if (messageMatchesUpdate.getShowNewMatches()) {
            if (!messageMatchesUpdate.getMessageMatches().isEmpty()) {
                z3 = false;
            }
        }
        return m40576a(z, messageMatchesUpdate.getMessageMatches(), z3);
    }

    @NonNull
    /* renamed from: a */
    private List<MatchListItem> m40576a(boolean z, @NonNull List<MessageMatch> list, boolean z2) {
        List arrayList = new ArrayList();
        if (!z && C2641a.a(list)) {
            return arrayList;
        }
        String str;
        if (z) {
            arrayList.add(MatchListItem.m40672d().mo10596a(Type.NEW_MATCHES).mo10599a());
        }
        z = MatchListItem.m40672d().mo10596a(Type.MESSAGES_HEADER);
        long count = StreamSupport.a(list).map(C12052d.f39193a).filter(C12053e.f39194a).count();
        if (count <= 0) {
            str = "";
        } else {
            str = String.valueOf(count);
        }
        z.mo10598a(str);
        arrayList.add(z.mo10599a());
        if (!list.isEmpty()) {
            for (MessageMatch messageMatch : list) {
                arrayList.add(MatchListItem.m40672d().mo10596a(Type.MATCH_WITH_MESSAGE).mo10597a(this.f32659a.m40690a(messageMatch.getMatch(), messageMatch.getMessage())).mo10599a());
            }
        } else if (z2) {
            arrayList.add(MatchListItem.m40672d().mo10596a(Type.NO_MESSAGES).mo10599a());
        } else {
            arrayList.add(MatchListItem.m40672d().mo10596a(Type.NO_MATCHES).mo10599a());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
