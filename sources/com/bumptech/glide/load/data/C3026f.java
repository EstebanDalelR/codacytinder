package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.f */
public abstract class C3026f<T> implements DataFetcher<T> {
    /* renamed from: a */
    private final Uri f9430a;
    /* renamed from: b */
    private final Context f9431b;
    /* renamed from: c */
    private T f9432c;

    /* renamed from: a */
    protected abstract void mo3182a(T t) throws IOException;

    /* renamed from: b */
    protected abstract T mo3183b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public void cancel() {
    }

    public C3026f(Context context, Uri uri) {
        this.f9431b = context.getApplicationContext();
        this.f9430a = uri;
    }

    public final T loadData(Priority priority) throws Exception {
        this.f9432c = mo3183b(this.f9430a, this.f9431b.getContentResolver());
        return this.f9432c;
    }

    public void cleanup() {
        if (this.f9432c != null) {
            try {
                mo3182a(this.f9432c);
            } catch (Throwable e) {
                if (Log.isLoggable("LocalUriFetcher", 2)) {
                    Log.v("LocalUriFetcher", "failed to close data", e);
                }
            }
        }
    }

    public String getId() {
        return this.f9430a.toString();
    }
}
