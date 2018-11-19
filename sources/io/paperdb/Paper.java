package io.paperdb;

import android.content.Context;
import com.esotericsoftware.kryo.Serializer;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Paper {
    static final String DEFAULT_DB_NAME = "io.paperdb";
    static final String TAG = "paperdb";
    private static final ConcurrentHashMap<String, Book> mBookMap = new ConcurrentHashMap();
    private static Context mContext;
    private static final HashMap<Class, Serializer> mCustomSerializers = new HashMap();

    public static void init(Context context) {
        mContext = context.getApplicationContext();
    }

    public static Book book(String str) {
        if (!str.equals("io.paperdb")) {
            return getBook(str);
        }
        throw new PaperDbException("io.paperdb name is reserved for default library name");
    }

    public static Book book() {
        return getBook("io.paperdb");
    }

    private static Book getBook(String str) {
        if (mContext == null) {
            throw new PaperDbException("Paper.init is not called");
        }
        Book book;
        synchronized (mBookMap) {
            book = (Book) mBookMap.get(str);
            if (book == null) {
                book = new Book(mContext, str, mCustomSerializers);
                mBookMap.put(str, book);
            }
        }
        return book;
    }

    public static <T> Book put(String str, T t) {
        return book().write(str, t);
    }

    public static <T> T get(String str) {
        return book().read(str);
    }

    public static <T> T get(String str, T t) {
        return book().read(str, t);
    }

    public static boolean exist(String str) {
        return book().exist(str);
    }

    public static void delete(String str) {
        book().delete(str);
    }

    public static void clear(Context context) {
        init(context);
        book().destroy();
    }

    public static void setLogLevel(int i) {
        for (Entry value : mBookMap.entrySet()) {
            ((Book) value.getValue()).setLogLevel(i);
        }
    }

    public static <T> void addSerializer(Class<T> cls, Serializer<T> serializer) {
        if (!mCustomSerializers.containsKey(cls)) {
            mCustomSerializers.put(cls, serializer);
        }
    }
}
