package com.tinder.match.dialog;

import com.tinder.analytics.chat.Origin;
import com.tinder.itsamatch.ItsAMatchDialogModel.Attribution;
import java.util.List;

public interface ItsAMatchDialogTarget {
    void goToChat(Origin origin, String str, Attribution attribution);

    void goToMatchProfile(String str, String str2);

    void goToMyProfile();

    void hideMatchAttribution();

    void setMatchAvatar(List<String> list);

    void setMatchName(Attribution attribution, String str, String str2);

    void setMyAvatar(List<String> list);

    void showFastMatchAttribution();

    void showNoUserError();

    void showPlacesAttribution(String str);

    void showShareMatches(long j);

    void showTopPicksAttribution();
}
