package com.tinder.session.analytics;

import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.profile.model.AccountInformation;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import com.tinder.domain.settings.email.model.EmailSettings;
import com.tinder.etl.event.zu;
import com.tinder.purchase.domain.model.C14510e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u001b\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n2\u0015\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r2\u0015\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00102\u0015\u0010\u0011\u001a\u00110\u0012¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00132\u0015\u0010\u0014\u001a\u00110\u0015¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016¢\u0006\u0002\b\u0017"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/UserEvent;", "p1", "Lcom/tinder/domain/common/model/ProfileUser;", "Lkotlin/ParameterName;", "name", "me", "p2", "", "Lcom/tinder/purchase/domain/model/Offer;", "plusOffers", "p3", "Lcom/tinder/domain/profile/model/AccountInformation;", "accountInfo", "p4", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "emailSettings", "p5", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "placeSettings", "p6", "Lcom/tinder/domain/common/model/Instagram;", "instagram", "invoke"}, k = 3, mv = {1, 1, 10})
final class UserEventFactory$createEvent$1 extends FunctionReference implements Function6<ProfileUser, List<? extends C14510e>, AccountInformation, EmailSettings, PlacesSettings, Instagram, zu> {
    UserEventFactory$createEvent$1(C14834c c14834c) {
        super(6, c14834c);
    }

    public final String getName() {
        return "combine";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14834c.class);
    }

    public final String getSignature() {
        return "combine(Lcom/tinder/domain/common/model/ProfileUser;Ljava/util/List;Lcom/tinder/domain/profile/model/AccountInformation;Lcom/tinder/domain/settings/email/model/EmailSettings;Lcom/tinder/domain/profile/model/settings/PlacesSettings;Lcom/tinder/domain/common/model/Instagram;)Lcom/tinder/etl/event/UserEvent;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m68117a((ProfileUser) obj, (List) obj2, (AccountInformation) obj3, (EmailSettings) obj4, (PlacesSettings) obj5, (Instagram) obj6);
    }

    @NotNull
    /* renamed from: a */
    public final zu m68117a(@NotNull ProfileUser profileUser, @NotNull List<? extends C14510e> list, @NotNull AccountInformation accountInformation, @NotNull EmailSettings emailSettings, @NotNull PlacesSettings placesSettings, @NotNull Instagram instagram) {
        C2668g.b(profileUser, "p1");
        C2668g.b(list, "p2");
        C2668g.b(accountInformation, "p3");
        C2668g.b(emailSettings, "p4");
        C2668g.b(placesSettings, "p5");
        C2668g.b(instagram, "p6");
        return ((C14834c) this.receiver).m56196a(profileUser, list, accountInformation, emailSettings, placesSettings, instagram);
    }
}
