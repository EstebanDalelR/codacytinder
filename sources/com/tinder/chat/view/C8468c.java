package com.tinder.chat.view;

import android.app.Activity;
import android.content.Intent;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.messageads.activity.MessageAdMatchProfileActivity;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.activities.MatchProfileActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/ChatAvatarIntentFactory;", "", "()V", "createAvatarIntentFor", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "match", "Lcom/tinder/domain/match/model/Match;", "createAvatarIntentForCoreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "createAvatarIntentForPlacesMatch", "Lcom/tinder/domain/match/model/PlacesMatch;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.c */
public final class C8468c {
    @NotNull
    /* renamed from: a */
    public final Intent m36226a(@NotNull Activity activity, @NotNull Match match) {
        C2668g.b(activity, "activity");
        C2668g.b(match, "match");
        if (match instanceof CoreMatch) {
            return m36224a(activity, (CoreMatch) match);
        }
        if (match instanceof MessageAdMatch) {
            return MessageAdMatchProfileActivity.f45423d.m40715a(activity, match.getId());
        }
        if (match instanceof PlacesMatch) {
            return m36225a(activity, (PlacesMatch) match);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    private final Intent m36224a(Activity activity, CoreMatch coreMatch) {
        activity = MatchProfileActivity.a(activity, coreMatch.getPerson().id(), coreMatch.getId(), ProfileScreenSource.CHAT);
        C2668g.a(activity, "MatchProfileActivity.new…ProfileScreenSource.CHAT)");
        return activity;
    }

    /* renamed from: a */
    private final Intent m36225a(Activity activity, PlacesMatch placesMatch) {
        activity = MatchProfileActivity.a(activity, placesMatch.getPerson().id(), placesMatch.getId(), ProfileScreenSource.CHAT);
        C2668g.a(activity, "MatchProfileActivity.new…ProfileScreenSource.CHAT)");
        return activity;
    }
}
