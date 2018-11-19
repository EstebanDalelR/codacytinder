package com.crashlytics.android.core;

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Sha1FileIdStrategy implements FileIdStrategy {
    Sha1FileIdStrategy() {
    }

    public String createId(File file) throws IOException {
        return getFileSHA(file.getPath());
    }

    private static String getFileSHA(String str) throws IOException {
        Closeable closeable = null;
        try {
            Closeable bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                str = CommonUtils.b(bufferedInputStream);
                CommonUtils.a(bufferedInputStream);
                return str;
            } catch (Throwable th) {
                str = th;
                closeable = bufferedInputStream;
                CommonUtils.a(closeable);
                throw str;
            }
        } catch (Throwable th2) {
            str = th2;
            CommonUtils.a(closeable);
            throw str;
        }
    }
}
