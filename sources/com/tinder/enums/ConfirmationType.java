package com.tinder.enums;

import com.tinder.R;

public enum ConfirmationType {
    TAPPING_X(R.string.not_interested_title, R.string.not_interested_prompt_tap, R.string.not_interested),
    TAPPING_HEART(R.string.like_title, R.string.like_prompt_tap, R.string.like),
    DRAGGING_LEFT(R.string.not_interested_title, R.string.not_interested_prompt_drag, R.string.not_interested),
    DRAGGING_RIGHT(R.string.like_title, R.string.like_prompt_drag, R.string.like),
    SUPERLIKE(R.string.superlike_first_use_title, R.string.superlike_first_use_body, R.string.superlike_first_use_positive);
    
    private final int mIdAction;
    private final int mIdPrompt;
    private final int mIdTitle;

    private ConfirmationType(int i, int i2, int i3) {
        this.mIdTitle = i;
        this.mIdPrompt = i2;
        this.mIdAction = i3;
    }

    public int getIdTitle() {
        return this.mIdTitle;
    }

    public int getIdPrompt() {
        return this.mIdPrompt;
    }

    public int getIdAction() {
        return this.mIdAction;
    }
}
