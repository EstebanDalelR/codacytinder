package com.tinder.onboarding.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/onboarding/model/OnboardingPermissions;", "", "isExtStorageReadPermissionGranted", "", "isGranted", "grantResults", "", "onboarding_release"}, k = 1, mv = {1, 1, 10})
public interface OnboardingPermissions {
    boolean isExtStorageReadPermissionGranted();

    boolean isGranted(@NotNull int[] iArr);
}
