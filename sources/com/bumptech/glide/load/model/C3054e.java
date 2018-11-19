package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.e */
public class C3054e<A> implements ModelLoader<A, C1037f> {
    /* renamed from: a */
    private final ModelLoader<A, InputStream> f9514a;
    /* renamed from: b */
    private final ModelLoader<A, ParcelFileDescriptor> f9515b;

    /* renamed from: com.bumptech.glide.load.model.e$a */
    static class C3053a implements DataFetcher<C1037f> {
        /* renamed from: a */
        private final DataFetcher<InputStream> f9512a;
        /* renamed from: b */
        private final DataFetcher<ParcelFileDescriptor> f9513b;

        public /* synthetic */ Object loadData(Priority priority) throws Exception {
            return m12005a(priority);
        }

        public C3053a(DataFetcher<InputStream> dataFetcher, DataFetcher<ParcelFileDescriptor> dataFetcher2) {
            this.f9512a = dataFetcher;
            this.f9513b = dataFetcher2;
        }

        /* renamed from: a */
        public C1037f m12005a(Priority priority) throws Exception {
            InputStream inputStream;
            if (this.f9512a != null) {
                try {
                    inputStream = (InputStream) this.f9512a.loadData(priority);
                } catch (Throwable e) {
                    if (Log.isLoggable("IVML", 2)) {
                        Log.v("IVML", "Exception fetching input stream, trying ParcelFileDescriptor", e);
                    }
                    if (this.f9513b == null) {
                        throw e;
                    }
                }
                if (this.f9513b != null) {
                    try {
                        priority = (ParcelFileDescriptor) this.f9513b.loadData(priority);
                    } catch (Priority priority2) {
                        if (Log.isLoggable("IVML", 2)) {
                            Log.v("IVML", "Exception fetching ParcelFileDescriptor", priority2);
                        }
                        if (inputStream == null) {
                            throw priority2;
                        }
                    }
                    return new C1037f(inputStream, priority2);
                }
                priority2 = null;
                return new C1037f(inputStream, priority2);
            }
            inputStream = null;
            if (this.f9513b != null) {
                priority2 = (ParcelFileDescriptor) this.f9513b.loadData(priority2);
                return new C1037f(inputStream, priority2);
            }
            priority2 = null;
            return new C1037f(inputStream, priority2);
        }

        public void cleanup() {
            if (this.f9512a != null) {
                this.f9512a.cleanup();
            }
            if (this.f9513b != null) {
                this.f9513b.cleanup();
            }
        }

        public String getId() {
            if (this.f9512a != null) {
                return this.f9512a.getId();
            }
            return this.f9513b.getId();
        }

        public void cancel() {
            if (this.f9512a != null) {
                this.f9512a.cancel();
            }
            if (this.f9513b != null) {
                this.f9513b.cancel();
            }
        }
    }

    public C3054e(ModelLoader<A, InputStream> modelLoader, ModelLoader<A, ParcelFileDescriptor> modelLoader2) {
        if (modelLoader == null && modelLoader2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f9514a = modelLoader;
        this.f9515b = modelLoader2;
    }

    public DataFetcher<C1037f> getResourceFetcher(A a, int i, int i2) {
        DataFetcher resourceFetcher = this.f9514a != null ? this.f9514a.getResourceFetcher(a, i, i2) : null;
        a = this.f9515b != null ? this.f9515b.getResourceFetcher(a, i, i2) : null;
        if (resourceFetcher == null) {
            if (a == null) {
                return null;
            }
        }
        return new C3053a(resourceFetcher, a);
    }
}
