package com.tinder.match.p092d;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.MessageAd;
import com.tinder.ads.TinderAdType;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.TextMessage;
import com.tinder.match.sponsoredmessage.C12082a;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/match/usecase/CreateMessageAdMatch;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "Lcom/tinder/ads/MessageAd;", "Lcom/tinder/domain/match/model/MessageAdMatch;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "currentUserProvider", "Lcom/tinder/data/user/CurrentUserProvider;", "insertDfpNativeTrackingUrls", "Lcom/tinder/match/sponsoredmessage/InsertSponsoredMessagesTrackingUrls;", "(Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/message/MessageRepository;Lcom/tinder/data/user/CurrentUserProvider;Lcom/tinder/match/sponsoredmessage/InsertSponsoredMessagesTrackingUrls;)V", "execute", "Lrx/Single;", "ad", "messageAdMatchFromMessageAd", "messageAdTypeFromTinderAdType", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "adType", "Lcom/tinder/ads/TinderAdType;", "messageFromMessageAd", "Lcom/tinder/domain/message/TextMessage;", "matchId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Use domain version of CreateMessageAdMatch", replaceWith = @ReplaceWith(expression = "init", imports = {"CreateMessageAdMatch"}))
/* renamed from: com.tinder.match.d.a */
public final class C3942a implements SingleUseCase<MessageAd, MessageAdMatch> {
    /* renamed from: a */
    private final MatchRepository f12417a;
    /* renamed from: b */
    private final MessageRepository f12418b;
    /* renamed from: c */
    private final CurrentUserProvider f12419c;
    /* renamed from: d */
    private final C12082a f12420d;

    public /* synthetic */ Single execute(Object obj) {
        return m15029a((MessageAd) obj);
    }

    @Inject
    public C3942a(@NotNull MatchRepository matchRepository, @NotNull MessageRepository messageRepository, @NotNull CurrentUserProvider currentUserProvider, @NotNull C12082a c12082a) {
        C2668g.m10309b(matchRepository, "matchRepository");
        C2668g.m10309b(messageRepository, "messageRepository");
        C2668g.m10309b(currentUserProvider, "currentUserProvider");
        C2668g.m10309b(c12082a, "insertDfpNativeTrackingUrls");
        this.f12417a = matchRepository;
        this.f12418b = messageRepository;
        this.f12419c = currentUserProvider;
        this.f12420d = c12082a;
    }

    @NotNull
    /* renamed from: a */
    public Single<MessageAdMatch> m15029a(@NotNull MessageAd messageAd) {
        C2668g.m10309b(messageAd, "ad");
        Object a = Single.a(new a$a(this, messageAd)).a(new a$b(this, messageAd));
        C2668g.m10305a(a, "Single.fromCallable { me…h }\n                    }");
        return a;
    }

    /* renamed from: b */
    private final MessageAdMatch m15026b(MessageAd messageAd) {
        NativeCustomTemplateAd nativeCustomTemplateAd = messageAd.nativeCustomTemplateAd();
        DateTime a = DateTime.m18605a();
        String id = messageAd.id();
        C2668g.m10305a((Object) a, "now");
        Attribution attribution = Attribution.SPONSORED_AD;
        Object customTemplateId = nativeCustomTemplateAd.getCustomTemplateId();
        C2668g.m10305a(customTemplateId, "nativeAd.customTemplateId");
        return new MessageAdMatch(id, a, a, attribution, false, false, customTemplateId, messageAd.getTitle(), messageAd.getLogo(), messageAd.getBody(), messageAd.getClickthroughUrl(), messageAd.getClickthroughText(), messageAd.getEndDate(), m15021a(messageAd.getAdType()), null, 16384, null);
    }

    /* renamed from: a */
    private final TextMessage m15024a(MessageAd messageAd, String str) {
        Object a = DateTime.m18605a();
        String id = messageAd.id();
        ProfileUser profileUser = this.f12419c.get();
        if (profileUser == null) {
            C2668g.m10304a();
        }
        Object id2 = profileUser.id();
        C2668g.m10305a(id2, "currentUserProvider.get()!!.id()");
        String id3 = messageAd.id();
        C2668g.m10305a(a, "timestamp");
        return new TextMessage(null, id, str, id2, id3, messageAd.getBody(), a, false, false, DeliveryStatus.SUCCESS, 1, null);
    }

    /* renamed from: a */
    private final Type m15021a(TinderAdType tinderAdType) {
        if (C9852b.f32633a[tinderAdType.ordinal()] == 1) {
            return Type.SPONSORED;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No Message Type associated with AdType ");
        stringBuilder.append(tinderAdType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
