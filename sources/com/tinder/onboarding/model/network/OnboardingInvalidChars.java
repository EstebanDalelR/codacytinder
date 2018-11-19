package com.tinder.onboarding.model.network;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class OnboardingInvalidChars {
    @SerializedName("invalid_characters")
    List<String> invalidCharacters;

    public List<String> getInvalidCharacters() {
        return this.invalidCharacters;
    }
}
