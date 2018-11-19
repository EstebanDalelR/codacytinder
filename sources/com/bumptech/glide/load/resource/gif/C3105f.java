package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.Priority;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;

/* renamed from: com.bumptech.glide.load.resource.gif.f */
class C3105f implements ModelLoader<GifDecoder, GifDecoder> {

    /* renamed from: com.bumptech.glide.load.resource.gif.f$a */
    private static class C3104a implements DataFetcher<GifDecoder> {
        /* renamed from: a */
        private final GifDecoder f9614a;

        public void cancel() {
        }

        public void cleanup() {
        }

        public /* synthetic */ Object loadData(Priority priority) throws Exception {
            return m12065a(priority);
        }

        public C3104a(GifDecoder gifDecoder) {
            this.f9614a = gifDecoder;
        }

        /* renamed from: a */
        public GifDecoder m12065a(Priority priority) {
            return this.f9614a;
        }

        public String getId() {
            return String.valueOf(this.f9614a.m3455d());
        }
    }

    C3105f() {
    }

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m12066a((GifDecoder) obj, i, i2);
    }

    /* renamed from: a */
    public DataFetcher<GifDecoder> m12066a(GifDecoder gifDecoder, int i, int i2) {
        return new C3104a(gifDecoder);
    }
}
