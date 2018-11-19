package com.tinder.chat.target;

import com.tinder.domain.message.Gif;
import java.util.List;

public interface ChatInputBoxTarget {
    void bindTooltipTextNoMatchName();

    void bindTooltipTextWithMatchName(String str);

    void hideBitmojiIcon();

    void hideGifSearch();

    void hideReactionsControl();

    void initializeBitmojiKeyboardObservers();

    void showBitmojiIcon();

    void showBitmojiTooltip();

    void showGifSearch();

    void showGifs(List<Gif> list);
}
