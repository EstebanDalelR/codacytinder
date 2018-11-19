package org.michaelevans.aftermath;

import android.content.Intent;

public interface IAftermathDelegate<T> {
    void onActivityResult(T t, int i, int i2, Intent intent);

    void onRequestPermissionsResult(T t, int i, String[] strArr, int[] iArr);
}
