package com.tinder.profile.activities;

import android.content.Intent;
import org.michaelevans.aftermath.IAftermathDelegate;

public class ProfileInstagramAuthActivity$$Aftermath<T extends ProfileInstagramAuthActivity> implements IAftermathDelegate<T> {
    public void onRequestPermissionsResult(T t, int i, String[] strArr, int[] iArr) {
    }

    public void onActivityResult(T t, int i, int i2, Intent intent) {
        if (i == 1) {
            t.onInstragramAuthResult(Integer.valueOf(i2), intent);
        }
    }
}
