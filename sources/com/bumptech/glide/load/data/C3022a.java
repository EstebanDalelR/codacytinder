package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.a */
public abstract class C3022a<T> implements DataFetcher<T> {
    /* renamed from: a */
    private final String f9419a;
    /* renamed from: b */
    private final AssetManager f9420b;
    /* renamed from: c */
    private T f9421c;

    /* renamed from: a */
    protected abstract T mo3180a(AssetManager assetManager, String str) throws IOException;

    /* renamed from: a */
    protected abstract void mo3181a(T t) throws IOException;

    public void cancel() {
    }

    public C3022a(AssetManager assetManager, String str) {
        this.f9420b = assetManager;
        this.f9419a = str;
    }

    public T loadData(Priority priority) throws Exception {
        this.f9421c = mo3180a(this.f9420b, this.f9419a);
        return this.f9421c;
    }

    public void cleanup() {
        if (this.f9421c != null) {
            try {
                mo3181a(this.f9421c);
            } catch (Throwable e) {
                if (Log.isLoggable("AssetUriFetcher", 2)) {
                    Log.v("AssetUriFetcher", "Failed to close data", e);
                }
            }
        }
    }

    public String getId() {
        return this.f9419a;
    }
}
