package io.paperdb;

import android.content.Context;
import com.esotericsoftware.kryo.Serializer;
import java.util.HashMap;
import java.util.List;

public class Book {
    private final Storage mStorage;

    protected Book(Context context, String str, HashMap<Class, Serializer> hashMap) {
        this.mStorage = new DbStoragePlainFile(context.getApplicationContext(), str, hashMap);
    }

    public void destroy() {
        this.mStorage.destroy();
    }

    public <T> Book write(String str, T t) {
        if (t == null) {
            throw new PaperDbException("Paper doesn't support writing null root values");
        }
        this.mStorage.insert(str, t);
        return this;
    }

    public <T> T read(String str) {
        return read(str, null);
    }

    public <T> T read(String str, T t) {
        str = this.mStorage.select(str);
        return str == null ? t : str;
    }

    public boolean exist(String str) {
        return this.mStorage.exist(str);
    }

    public long lastModified(String str) {
        return this.mStorage.lastModified(str);
    }

    public void delete(String str) {
        this.mStorage.deleteIfExists(str);
    }

    public List<String> getAllKeys() {
        return this.mStorage.getAllKeys();
    }

    public void setLogLevel(int i) {
        this.mStorage.setLogLevel(i);
    }
}
