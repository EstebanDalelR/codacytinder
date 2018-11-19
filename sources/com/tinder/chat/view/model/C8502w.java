package com.tinder.chat.view.model;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeSchool;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.domain.feed.UnknownActivityEvent;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.feed.p341b.C11695a;
import com.tinder.p204d.p205a.C8609a;
import com.tinder.utils.C15368s;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJJ\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\f\u0010#\u001a\u00020\f*\u00020$H\u0002J\f\u0010%\u001a\u00020&*\u00020$H\u0002J\f\u0010%\u001a\u00020&*\u00020'H\u0002J\f\u0010%\u001a\u00020&*\u00020(H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/tinder/chat/view/model/MessageViewModelMapper;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "loopsExperimentUtility", "Lcom/tinder/loop/experiment/LoopsExperimentUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;Lcom/tinder/loop/experiment/LoopsExperimentUtility;)V", "defaultAvatarCircleQuality", "Lcom/tinder/domain/common/model/Photo$Quality;", "isActivityMessagesEnabled", "", "isBitmojiEnabled", "isGrandGesturesEnabled", "isLoopsEnabled", "isProfileChangeBioEnabled", "isProfileChangeSchoolEnabled", "isProfileChangeWorkEnabled", "isSpotifyEnabled", "fromMessage", "Lcom/tinder/chat/view/model/ChatItem;", "message", "Lcom/tinder/domain/message/Message;", "collapsedMessages", "", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "matchPhotos", "Lcom/tinder/domain/common/model/Photo;", "senderName", "", "matchId", "isActivityEventSupported", "Lcom/tinder/domain/message/ActivityMessage;", "toTextMessage", "Lcom/tinder/domain/message/TextMessage;", "Lcom/tinder/domain/message/ImageMessage;", "Lcom/tinder/domain/message/ReactionMessage;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.w */
public final class C8502w {
    /* renamed from: a */
    private final boolean f30213a;
    /* renamed from: b */
    private final boolean f30214b;
    /* renamed from: c */
    private final boolean f30215c;
    /* renamed from: d */
    private final boolean f30216d;
    /* renamed from: e */
    private final boolean f30217e;
    /* renamed from: f */
    private final boolean f30218f;
    /* renamed from: g */
    private final boolean f30219g;
    /* renamed from: h */
    private final boolean f30220h;
    /* renamed from: i */
    private final Quality f30221i = Quality.M;

    @Inject
    public C8502w(@NotNull AbTestUtility abTestUtility, @NotNull C11695a c11695a, @NotNull C8609a c8609a) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c11695a, "feedExperimentUtility");
        C2668g.b(c8609a, "loopsExperimentUtility");
        this.f30213a = abTestUtility.isGrandGesturesEnabled();
        this.f30214b = c11695a.m47522a();
        this.f30215c = abTestUtility.isSpotifyEnabled();
        this.f30216d = c8609a.m36730c();
        this.f30217e = c11695a.getProfileChangeBioEnabled();
        this.f30218f = c11695a.getProfileChangeWorkEnabled();
        this.f30219g = abTestUtility.isBitmojiEnabled();
        this.f30220h = c11695a.getProfileChangeSchoolEnabled();
    }

    @NotNull
    /* renamed from: a */
    public final ChatItem m36428a(@NotNull Message message, @NotNull List<? extends Message> list, @NotNull CurrentUser currentUser, @NotNull C8503z c8503z, @NotNull List<? extends Photo> list2, @NotNull String str, @NotNull String str2) {
        C8502w c8502w = this;
        Message message2 = message;
        C2668g.b(message2, "message");
        List<? extends Message> list3 = list;
        C2668g.b(list3, "collapsedMessages");
        CurrentUser currentUser2 = currentUser;
        C2668g.b(currentUser2, "currentUser");
        C8503z c8503z2 = c8503z;
        C2668g.b(c8503z2, "positionInfo");
        List<? extends Photo> list4 = list2;
        C2668g.b(list4, "matchPhotos");
        String str3 = str;
        C2668g.b(str3, "senderName");
        String str4 = str2;
        C2668g.b(str4, "matchId");
        Photo photo = (Photo) C19301m.g(list2);
        TextMessage textMessage;
        String id;
        if (message2 instanceof TextMessage) {
            textMessage = (TextMessage) message2;
            id = currentUser2.id();
            C2668g.a(id, "currentUser.id()");
            return new am(textMessage, id, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), C15368s.a(message2.getText()), str4);
        } else if (message2 instanceof GifMessage) {
            GifMessage gifMessage = (GifMessage) message2;
            id = currentUser2.id();
            C2668g.a(id, "currentUser.id()");
            return new C12748m(gifMessage, id, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), str4);
        } else if (message2 instanceof ImageMessage) {
            MessageViewModel c12749o;
            if (c8502w.f30219g) {
                ImageMessage imageMessage = (ImageMessage) message2;
                id = currentUser2.id();
                C2668g.a(id, "currentUser.id()");
                c12749o = new C12749o(imageMessage, id, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), str4);
            } else {
                textMessage = m36425a((ImageMessage) message2);
                id = currentUser2.id();
                C2668g.a(id, "currentUser.id()");
                c12749o = new am(textMessage, id, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), C15368s.a(message2.getText()), str4);
            }
            return c12749o;
        } else if (message2 instanceof ReactionMessage) {
            MessageViewModel agVar;
            if (c8502w.f30213a) {
                ReactionMessage reactionMessage = (ReactionMessage) message2;
                r6 = currentUser2.id();
                C2668g.a(r6, "currentUser.id()");
                agVar = new ag(reactionMessage, list3, r6, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), str4, str3);
            } else {
                textMessage = m36426a((ReactionMessage) message2);
                id = currentUser2.id();
                C2668g.a(id, "currentUser.id()");
                agVar = new am(textMessage, id, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), C15368s.a(message2.getText()), str4);
            }
            return agVar;
        } else if (message2 instanceof ActivityMessage) {
            MessageViewModel c12747i;
            if (c8502w.f30214b) {
                ActivityMessage activityMessage = (ActivityMessage) message2;
                if (m36427b(activityMessage)) {
                    List a;
                    r6 = currentUser2.id();
                    C2668g.a(r6, "currentUser.id()");
                    String urlByQuality = UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i);
                    if (C2668g.a(activityMessage.getActivityFeedItem().getUserInfo().getUserId(), currentUser2.id())) {
                        List photos = currentUser2.photos();
                        C2668g.a(photos, "currentUser.photos()");
                        a = C19301m.a(C19301m.f(photos));
                    } else {
                        a = list4;
                    }
                    c12747i = new C12747i(activityMessage, r6, c8503z2, urlByQuality, str4, a);
                    return c12747i;
                }
            }
            textMessage = m36424a((ActivityMessage) message2);
            id = currentUser2.id();
            C2668g.a(id, "currentUser.id()");
            c12747i = new am(textMessage, id, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), C15368s.a(message2.getText()), str4);
            return c12747i;
        } else if (message2 instanceof SystemMessage) {
            SystemMessage systemMessage = (SystemMessage) message2;
            id = currentUser2.id();
            C2668g.a(id, "currentUser.id()");
            return new al(systemMessage, id, c8503z2, UserPhotoExtKt.getUrlByQuality(photo, c8502w.f30221i), str4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final TextMessage m36426a(@NotNull ReactionMessage reactionMessage) {
        return new TextMessage(reactionMessage.getClientSequentialId(), reactionMessage.getId(), reactionMessage.getMatchId(), reactionMessage.getToId(), reactionMessage.getFromId(), reactionMessage.getText(), reactionMessage.getSentDate(), reactionMessage.isLiked(), reactionMessage.isSeen(), reactionMessage.getDeliveryStatus());
    }

    /* renamed from: a */
    private final TextMessage m36424a(@NotNull ActivityMessage activityMessage) {
        return new TextMessage(activityMessage.getClientSequentialId(), activityMessage.getId(), activityMessage.getMatchId(), activityMessage.getToId(), activityMessage.getFromId(), activityMessage.getText(), activityMessage.getSentDate(), activityMessage.isLiked(), activityMessage.isSeen(), activityMessage.getDeliveryStatus());
    }

    /* renamed from: a */
    private final TextMessage m36425a(@NotNull ImageMessage imageMessage) {
        return new TextMessage(imageMessage.getClientSequentialId(), imageMessage.getId(), imageMessage.getMatchId(), imageMessage.getToId(), imageMessage.getFromId(), imageMessage.getText(), imageMessage.getSentDate(), imageMessage.isLiked(), imageMessage.isSeen(), imageMessage.getDeliveryStatus());
    }

    /* renamed from: b */
    private final boolean m36427b(@NotNull ActivityMessage activityMessage) {
        activityMessage = activityMessage.getActivityFeedItem().getActivityEvent();
        if (activityMessage instanceof InstagramNewMedia) {
            return true;
        }
        if (activityMessage instanceof ProfileSpotifyTopArtist) {
            return this.f30215c;
        }
        if (activityMessage instanceof ProfileAddPhoto) {
            return true;
        }
        if (activityMessage instanceof InstagramConnect) {
            return true;
        }
        if (activityMessage instanceof ProfileChangeAnthem) {
            return this.f30215c;
        }
        if (activityMessage instanceof ActivityEventNewMatch) {
            return true;
        }
        if (activityMessage instanceof ProfileAddLoop) {
            return this.f30216d;
        }
        if (activityMessage instanceof ProfileChangeBio) {
            return this.f30217e;
        }
        if (activityMessage instanceof ProfileChangeWork) {
            return this.f30218f;
        }
        if (activityMessage instanceof ProfileChangeSchool) {
            return this.f30220h;
        }
        if ((activityMessage instanceof UnknownActivityEvent) != null) {
            C0001a.b((Throwable) new IllegalStateException("UnknownActivityEvent should not have made it the View Model mapping."));
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
