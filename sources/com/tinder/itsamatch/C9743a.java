package com.tinder.itsamatch;

import android.content.res.Resources;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import com.tinder.itsamatch.ItsAMatchDialogModel.Attribution;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import tinder.p501a.C19457a.C19456a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/itsamatch/ItsAMatchDialogViewModelMapper;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "mapAttribution", "Lcom/tinder/itsamatch/ItsAMatchDialogModel$Attribution;", "attribution", "Lcom/tinder/domain/match/model/Match$Attribution;", "matchAvatarUrls", "", "", "match", "Lcom/tinder/domain/match/model/Match;", "matchName", "messageMatchCta", "modelFromCurrentUserAndMatch", "Lcom/tinder/itsamatch/ItsAMatchDialogModel;", "user", "Lcom/tinder/domain/common/model/User;", "myAvatarUrls", "currentUser", "placeName", "itsamatch_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.itsamatch.a */
public final class C9743a {
    /* renamed from: a */
    private final Resources f32369a;

    @Inject
    public C9743a(@NotNull Resources resources) {
        C2668g.b(resources, "resources");
        this.f32369a = resources;
    }

    @NotNull
    /* renamed from: a */
    public final ItsAMatchDialogModel m40272a(@NotNull User user, @NotNull Match match) {
        C2668g.b(user, ManagerWebServices.PARAM_USER);
        C2668g.b(match, "match");
        String id = match.getId();
        String str = null;
        CoreMatch coreMatch = (CoreMatch) (!(match instanceof CoreMatch) ? null : match);
        if (coreMatch != null) {
            User person = coreMatch.getPerson();
            if (person != null) {
                str = person.id();
            }
        }
        return new ItsAMatchDialogModel(id, str, m40266a(match.getAttribution()), m40269b(match), m40267a(user), m40268a(match), m40270c(match), m40271d(match));
    }

    /* renamed from: a */
    private final List<String> m40267a(User user) {
        return C19301m.a(UserPhotoExtKt.avatarUrl(user, Quality.XL));
    }

    /* renamed from: a */
    private final List<String> m40268a(Match match) {
        if (match instanceof CoreMatch) {
            return C19301m.a(UserPhotoExtKt.avatarUrl(((CoreMatch) match).getPerson(), Quality.XL));
        }
        if (match instanceof MessageAdMatch) {
            return C19301m.a(((MessageAdMatch) match).getLogoUrl());
        }
        if (match instanceof PlacesMatch) {
            return C19301m.a(UserPhotoExtKt.avatarUrl(((PlacesMatch) match).getPerson(), Quality.XL));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    private final String m40269b(Match match) {
        if (match instanceof CoreMatch) {
            match = ((CoreMatch) match).getPerson().name();
            C2668g.a(match, "match.person.name()");
            return match;
        } else if (match instanceof MessageAdMatch) {
            return ((MessageAdMatch) match).getTitle();
        } else {
            if (match instanceof PlacesMatch) {
                match = ((PlacesMatch) match).getPerson().name();
                C2668g.a(match, "match.person.name()");
                return match;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    private final String m40270c(Match match) {
        if (match instanceof CoreMatch) {
            match = this.f32369a.getString(C19456a.its_a_match_dialog_send_message_cta);
            C2668g.a(match, "resources.getString(R.st…_dialog_send_message_cta)");
            return match;
        } else if (match instanceof MessageAdMatch) {
            match = this.f32369a.getString(C19456a.its_a_match_dialog_read_message_cta);
            C2668g.a(match, "resources.getString(R.st…_dialog_read_message_cta)");
            return match;
        } else if ((match instanceof PlacesMatch) != null) {
            match = this.f32369a.getString(C19456a.its_a_match_dialog_send_message_cta);
            C2668g.a(match, "resources.getString(R.st…_dialog_send_message_cta)");
            return match;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final Attribution m40266a(Match.Attribution attribution) {
        switch (C9744b.f32370a[attribution.ordinal()]) {
            case 1:
                return Attribution.BOOST;
            case 2:
                return Attribution.SUPER_LIKE_BY_ME;
            case 3:
                return Attribution.SUPER_LIKE_BY_THEM;
            case 4:
                return Attribution.FAST_MATCH;
            case 5:
                return Attribution.MESSAGE_AD;
            case 6:
                return Attribution.PLACES;
            case 7:
                return Attribution.TOP_PICKS;
            default:
                return Attribution.NONE;
        }
    }

    /* renamed from: d */
    private final String m40271d(Match match) {
        if (!(match instanceof PlacesMatch)) {
            match = null;
        }
        PlacesMatch placesMatch = (PlacesMatch) match;
        if (placesMatch == null) {
            return null;
        }
        match = placesMatch.getPlace();
        return match != null ? match.getName() : null;
    }
}
