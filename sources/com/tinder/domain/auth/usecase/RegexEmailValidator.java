package com.tinder.domain.auth.usecase;

import android.support.annotation.Nullable;
import com.tinder.common.utils.C8578a;
import java.util.regex.Pattern;

public class RegexEmailValidator {
    private static final Pattern VALIDATION_PATTERN = Pattern.compile("[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

    public boolean isValid(@Nullable String str) {
        return (C8578a.m36596a(str) || VALIDATION_PATTERN.matcher(str).matches() == null) ? null : true;
    }
}
