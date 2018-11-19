package com.tinder.chat.view.model;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0011\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Lcom/tinder/chat/view/model/MatchToChatMatchContext;", "Lkotlin/Function1;", "Lcom/tinder/domain/match/model/Match;", "Lcom/tinder/chat/view/model/ChatContext;", "()V", "buildAvatarUrlMap", "", "", "match", "buildUserNameMap", "getPersonPhotos", "", "Lcom/tinder/domain/common/model/Photo;", "getUserId", "getUserIdAndAvatarUrl", "Lkotlin/Pair;", "user", "Lcom/tinder/domain/common/model/User;", "invoke", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.s */
public final class C12750s implements Function1<Match, ChatContext> {
    public /* synthetic */ Object invoke(Object obj) {
        return m50181a((Match) obj);
    }

    @NotNull
    /* renamed from: a */
    public ChatContext m50181a(@NotNull Match match) {
        C2668g.b(match, "match");
        return new C10641l(m50179d(match), C19301m.l(m50178c(match).values()), m50180e(match), m50177b(match));
    }

    /* renamed from: b */
    private final Map<String, String> m50177b(Match match) {
        if (match instanceof CoreMatch) {
            CoreMatch coreMatch = (CoreMatch) match;
            return ae.a(C15811g.a(coreMatch.getPerson().id(), coreMatch.getPerson().name()));
        } else if (match instanceof MessageAdMatch) {
            return ae.a(C15811g.a(match.getId(), ((MessageAdMatch) match).getTitle()));
        } else {
            if (match instanceof PlacesMatch) {
                PlacesMatch placesMatch = (PlacesMatch) match;
                return ae.a(C15811g.a(placesMatch.getPerson().id(), placesMatch.getPerson().name()));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    private final Map<String, String> m50178c(Match match) {
        if (match instanceof CoreMatch) {
            return ae.a(m50176a(((CoreMatch) match).getPerson()));
        }
        if (match instanceof MessageAdMatch) {
            return ae.a();
        }
        if (match instanceof PlacesMatch) {
            return ae.a(m50176a(((PlacesMatch) match).getPerson()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    private final String m50179d(Match match) {
        if (match instanceof CoreMatch) {
            match = ((CoreMatch) match).getPerson().id();
            C2668g.a(match, "match.person.id()");
            return match;
        } else if (match instanceof MessageAdMatch) {
            return "";
        } else {
            if (match instanceof PlacesMatch) {
                match = ((PlacesMatch) match).getPerson().id();
                C2668g.a(match, "match.person.id()");
                return match;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final Pair<String, String> m50176a(User user) {
        return C15811g.a(user.id(), UserPhotoExtKt.avatarUrl(user, C8500t.f30212a));
    }

    /* renamed from: e */
    private final List<Photo> m50180e(Match match) {
        if (match instanceof CoreMatch) {
            match = ((CoreMatch) match).getPerson().photos();
            C2668g.a(match, "match.person.photos()");
            return match;
        } else if (match instanceof MessageAdMatch) {
            return C19301m.a(C10641l.f34911a.m36416a());
        } else {
            if (match instanceof PlacesMatch) {
                match = ((PlacesMatch) match).getPerson().photos();
                C2668g.a(match, "match.person.photos()");
                return match;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
