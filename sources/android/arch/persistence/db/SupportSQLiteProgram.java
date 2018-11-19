package android.arch.persistence.db;

import android.annotation.TargetApi;

@TargetApi(19)
public interface SupportSQLiteProgram extends AutoCloseable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);

    void clearBindings();
}
