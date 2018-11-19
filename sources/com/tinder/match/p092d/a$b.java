package com.tinder.match.p092d;

import com.tinder.ads.MessageAd;
import com.tinder.domain.common.TrackingUrl.Event;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.TextMessage;
import com.tinder.match.sponsoredmessage.C12082a.C9881a;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import rx.Completable;
import rx.Single;
import rx.functions.Func0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/match/model/MessageAdMatch;", "kotlin.jvm.PlatformType", "match", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.d.a$b */
final class a$b<T, R> implements Func1<T, Single<? extends R>> {
    /* renamed from: a */
    final /* synthetic */ C3942a f42577a;
    /* renamed from: b */
    final /* synthetic */ MessageAd f42578b;

    a$b(C3942a c3942a, MessageAd messageAd) {
        this.f42577a = c3942a;
        this.f42578b = messageAd;
    }

    public /* synthetic */ Object call(Object obj) {
        return m51897a((MessageAdMatch) obj);
    }

    /* renamed from: a */
    public final Single<MessageAdMatch> m51897a(final MessageAdMatch messageAdMatch) {
        TextMessage a = C3942a.a(this.f42577a, this.f42578b, messageAdMatch.getId());
        C9881a c9881a = new C9881a(this.f42578b.nativeCustomTemplateAd(), ak.a(new Event[]{Event.CLICK, Event.IMPRESSION, Event.OPEN}));
        r2 = new Completable[3];
        MatchRepository a2 = C3942a.a(this.f42577a);
        C2668g.a(messageAdMatch, "match");
        r2[0] = a2.insertMatches(C19301m.a(messageAdMatch));
        r2[1] = C3942a.b(this.f42577a).addMessages(C19301m.a(a));
        r2[2] = C3942a.c(this.f42577a).m48187a(c9881a);
        return Completable.b(r2).b(new Func0<MessageAdMatch>() {
            public /* synthetic */ Object call() {
                return m51896a();
            }

            /* renamed from: a */
            public final MessageAdMatch m51896a() {
                return messageAdMatch;
            }
        });
    }
}
