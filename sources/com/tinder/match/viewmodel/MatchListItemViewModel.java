package com.tinder.match.viewmodel;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import java.util.List;

interface MatchListItemViewModel {

    public interface Builder<B extends Builder, VM extends MatchListItemViewModel> {
        VM build();

        B hasInteractedWithView(boolean z);

        B id(String str);

        B imageUrls(List<String> list);

        B isMuted(boolean z);

        B match(Match match);

        B matchAttribution(Attribution attribution);

        B name(String str);
    }

    /* renamed from: a */
    String mo11192a();

    /* renamed from: b */
    String mo11193b();

    /* renamed from: c */
    Attribution mo11194c();

    /* renamed from: d */
    List<String> mo11195d();

    /* renamed from: e */
    Match mo11196e();

    /* renamed from: f */
    boolean mo11197f();

    /* renamed from: g */
    boolean mo11198g();
}
