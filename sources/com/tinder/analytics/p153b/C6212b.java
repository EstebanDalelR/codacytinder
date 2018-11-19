package com.tinder.analytics.p153b;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.p077b.C8524b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.tinder.analytics.b.b */
public final class C6212b {
    /* renamed from: a */
    private final Map<String, Set<String>> f22775a = m26840b();

    @NonNull
    /* renamed from: a */
    public Map<String, Set<String>> m26841a() {
        return this.f22775a;
    }

    @NonNull
    /* renamed from: b */
    private Map<String, Set<String>> m26840b() {
        Map hashMap = new HashMap();
        Set a = C8524b.a();
        hashMap.put("Recs.Rate", C8524b.b(new String[]{"like", "superLike", "fromMore", "listen", "LikesYouEligble"}));
        hashMap.put("Undo.Undo", C8524b.b(new String[]{"paywall"}));
        hashMap.put("BoostPaywall.View", C8524b.b(new String[]{"hasPlus", "timeRemaining", "boostPaywallVersion"}));
        hashMap.put("SuperLikePaywall.View", a);
        hashMap.put("Chat.SendMessage", C8524b.b(new String[]{"messageIndex", "fromPush", "messageType", "goingOutStatus", "goingOutLocation", "timeSinceGoingOutCreated", "timeLeftGoingOut"}));
        hashMap.put("SuperLikeRoadblock.View", a);
        hashMap.put("Roadblock.View", a);
        hashMap.put("UserInteraction.WhatsNew", C8524b.b(new String[]{"category", "subcategory"}));
        hashMap.put("Group.Create", C8524b.b(new String[]{"groupId"}));
        hashMap.put("Group.Match", C8524b.b(new String[]{"groupSize", "otherGroupSize"}));
        hashMap.put("Group.MuteNotifications", a);
        hashMap.put("Group.MuteNotifications", a);
        hashMap.put("Match.KeepPlaying", a);
        hashMap.put("Match.New", C8524b.b(new String[]{"didSuperLike", "superLike", "fromPush"}));
        hashMap.put("Boost.Start", a);
        hashMap.put("Chat.Block", C8524b.b(new String[]{"otherId"}));
        hashMap.put("Ad.View", C8524b.b(new String[]{"creativeId", "campaignId"}));
        hashMap.put("Profile.AddPhoto", C8524b.b(new String[]{ManagerWebServices.PARAM_FROM}));
        hashMap.put("Gold.Paywall", C8524b.b(new String[]{ManagerWebServices.PARAM_FROM}));
        hashMap.put("Gold.Purchase", C8524b.b(new String[]{ManagerWebServices.PARAM_FROM}));
        hashMap.put("Profile.ChangePhotoOrder", a);
        hashMap.put("Profile.ConnectAnthem", C8524b.b(new String[]{"songName"}));
        hashMap.put("Recs.Discovery", C8524b.b(new String[]{"discoveryOn"}));
        hashMap.put("Warning.View", C8524b.b(new String[]{ManagerWebServices.PARAM_BANNED, "warningLevel"}));
        hashMap.put("Profile.ChangeBio", C8524b.b(new String[]{"bioBlank"}));
        hashMap.put("GoingOut.SetStatus", C8524b.b(new String[]{"status", "position", "location", "locationId", "locationSource", "numStatusesSeen"}));
        hashMap.put("GoingOut.ChangeStatus", C8524b.b(new String[]{"status", "position", "location", "locationId", "locationSource", "numStatusesSeen", "timeSinceGoingOutCreated", "timeLeftGoingOut"}));
        hashMap.put("GoingOut.Expire", C8524b.b(new String[]{"timeSinceGoingOutCreated", "timeLeftGoingOut"}));
        hashMap.put("GoingOut.CancelSetStatus", C8524b.b(new String[]{"locationSet", "timeSinceGoingOutCreated", "timeLeftGoingOut"}));
        hashMap.put("GoingOut.CancelChangeStatus", C8524b.b(new String[]{"locationSet", "timeSinceGoingOutCreated", "timeLeftGoingOut", "statusChanged", "locationChanged"}));
        hashMap.put("GoingOut.SetLocation", C8524b.b(new String[]{"hasLocation", "timeSinceGoingOutCreated", "timeLeftGoingOut"}));
        hashMap.put("GoingOut.ClearLocation", C8524b.b(new String[]{"timeSinceGoingOutCreated", "timeLeftGoingOut"}));
        hashMap.put("GoingOut.SearchLocation", C8524b.b(new String[]{"query", "numResultsRetrieved"}));
        hashMap.put("GoingOut.SelectLocation", C8524b.b(new String[]{"query", "numResultsRetrieved", "position", "numResultsSeen", "location", "locationId", "locationSource"}));
        hashMap.put("GoingOut.CancelSelectLocation", a);
        hashMap.put("GoingOut.Selected", C8524b.b(new String[]{"position", "hasStatus", "hasLocation", "timeSinceGoingOutCreated", "timeLeftGoingOut", "source", "numMatchesInGoingOut"}));
        hashMap.put("GoingOut.StatusBubble", C8524b.b(new String[]{"source", "status"}));
        hashMap.put("GoingOut.QuickReply", C8524b.b(new String[]{"status"}));
        hashMap.put("GoingOut.QuickReplyEdit", C8524b.b(new String[]{"status"}));
        hashMap.put("Paywall.Discounted.View", a);
        hashMap.put("Paywall.Expired.View", a);
        hashMap.put("Paywall.View", a);
        hashMap.put("Gold.Cancel", a);
        hashMap.put("Superlikeable.Available", a);
        hashMap.put("Superlikeable.Used", a);
        return Collections.unmodifiableMap(hashMap);
    }
}
