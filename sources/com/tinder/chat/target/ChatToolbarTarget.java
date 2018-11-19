package com.tinder.chat.target;

import com.tinder.domain.match.model.Match;
import java.util.List;

public interface ChatToolbarTarget {
    void bindAvatar(List<String> list, String str);

    void bindMatch(Match match);

    void matchNotFound();
}
