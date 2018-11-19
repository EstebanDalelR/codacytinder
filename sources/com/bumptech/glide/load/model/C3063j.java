package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.DataFetcher;

/* renamed from: com.bumptech.glide.load.model.j */
public class C3063j<T> implements ModelLoader<Integer, T> {
    /* renamed from: a */
    private final ModelLoader<Uri, T> f9523a;
    /* renamed from: b */
    private final Resources f9524b;

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m12010a((Integer) obj, i, i2);
    }

    public C3063j(Context context, ModelLoader<Uri, T> modelLoader) {
        this(context.getResources(), (ModelLoader) modelLoader);
    }

    public C3063j(Resources resources, ModelLoader<Uri, T> modelLoader) {
        this.f9524b = resources;
        this.f9523a = modelLoader;
    }

    /* renamed from: a */
    public DataFetcher<T> m12010a(Integer num, int i, int i2) {
        Object parse;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.resource://");
            stringBuilder.append(this.f9524b.getResourcePackageName(num.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.f9524b.getResourceTypeName(num.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.f9524b.getResourceEntryName(num.intValue()));
            parse = Uri.parse(stringBuilder.toString());
        } catch (Throwable e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Received invalid resource id: ");
                stringBuilder2.append(num);
                Log.w("ResourceLoader", stringBuilder2.toString(), e);
            }
            parse = null;
        }
        if (parse != null) {
            return this.f9523a.getResourceFetcher(parse, i, i2);
        }
        return null;
    }
}
