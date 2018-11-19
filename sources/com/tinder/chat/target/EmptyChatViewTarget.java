package com.tinder.chat.target;

import com.tinder.domain.match.model.Match;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&¨\u0006\u001b"}, d2 = {"Lcom/tinder/chat/target/EmptyChatViewTarget;", "", "hideSuggestionMessage", "", "hideTimestamp", "showAvatar", "match", "Lcom/tinder/domain/match/model/Match;", "urls", "", "", "showCoreMatchTitle", "name", "showISuperLikeThem", "showMatchFromBoost", "showMatchFromFastMatch", "showMatchFromPlaces", "placeName", "showMatchFromTopPicks", "showMyGroupTitle", "showSuggestionMessage", "showTheirGroupTitle", "groupName", "showTheySuperLikeMe", "showTimestamp", "time", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface EmptyChatViewTarget {
    void hideSuggestionMessage();

    void hideTimestamp();

    void showAvatar(@NotNull Match match, @NotNull List<String> list);

    void showCoreMatchTitle(@NotNull String str);

    void showISuperLikeThem(@NotNull String str);

    void showMatchFromBoost(@NotNull String str);

    void showMatchFromFastMatch(@NotNull String str);

    void showMatchFromPlaces(@NotNull String str);

    void showMatchFromTopPicks(@NotNull String str);

    void showMyGroupTitle();

    void showSuggestionMessage();

    void showTheirGroupTitle(@NotNull String str);

    void showTheySuperLikeMe(@NotNull String str);

    void showTimestamp(long j);
}
