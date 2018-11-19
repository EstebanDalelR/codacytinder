package com.snapchat.kit.sdk.bitmoji.persistence;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.BitmojiScope;
import com.snapchat.kit.sdk.bitmoji.models.StickerPacks;
import java.io.File;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Named;

@BitmojiScope
public class StickerPacksCache {
    /* renamed from: a */
    private final ExecutorService f21614a;
    /* renamed from: b */
    private final File f21615b;
    /* renamed from: c */
    private final Gson f21616c;

    public interface StickerPacksReadCallback {
        @UiThread
        void onStickerPacksRead(@Nullable StickerPacks stickerPacks);
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache$a */
    private static class C5901a extends AsyncTask<Void, Void, StickerPacks> {
        /* renamed from: a */
        private final StickerPacksReadCallback f21608a;
        /* renamed from: b */
        private final File f21609b;
        /* renamed from: c */
        private final Gson f21610c;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m25462a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m25463a((StickerPacks) obj);
        }

        C5901a(StickerPacksReadCallback stickerPacksReadCallback, File file, Gson gson) {
            this.f21608a = stickerPacksReadCallback;
            this.f21609b = file;
            this.f21610c = gson;
        }

        /* renamed from: a */
        protected com.snapchat.kit.sdk.bitmoji.models.StickerPacks m25462a(java.lang.Void... r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r3 = new java.io.FileReader;	 Catch:{ Exception -> 0x0015 }
            r0 = r2.f21609b;	 Catch:{ Exception -> 0x0015 }
            r3.<init>(r0);	 Catch:{ Exception -> 0x0015 }
            r0 = r2.f21610c;	 Catch:{ Exception -> 0x0015 }
            r1 = com.snapchat.kit.sdk.bitmoji.models.StickerPacks.class;	 Catch:{ Exception -> 0x0015 }
            r0 = r0.fromJson(r3, r1);	 Catch:{ Exception -> 0x0015 }
            r0 = (com.snapchat.kit.sdk.bitmoji.models.StickerPacks) r0;	 Catch:{ Exception -> 0x0015 }
            com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache.m25466b(r3);	 Catch:{ Exception -> 0x0015 }
            return r0;
        L_0x0015:
            r3 = 0;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache.a.a(java.lang.Void[]):com.snapchat.kit.sdk.bitmoji.models.StickerPacks");
        }

        /* renamed from: a */
        protected void m25463a(StickerPacks stickerPacks) {
            this.f21608a.onStickerPacksRead(stickerPacks);
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache$b */
    private static class C5902b extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        private final StickerPacks f21611a;
        /* renamed from: b */
        private final File f21612b;
        /* renamed from: c */
        private final Gson f21613c;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m25464a((Void[]) objArr);
        }

        C5902b(StickerPacks stickerPacks, File file, Gson gson) {
            this.f21611a = stickerPacks;
            this.f21612b = file;
            this.f21613c = gson;
        }

        /* renamed from: a */
        protected java.lang.Void m25464a(java.lang.Void... r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r3 = new java.io.FileWriter;	 Catch:{ Exception -> 0x0011 }
            r0 = r2.f21612b;	 Catch:{ Exception -> 0x0011 }
            r3.<init>(r0);	 Catch:{ Exception -> 0x0011 }
            r0 = r2.f21613c;	 Catch:{ Exception -> 0x0011 }
            r1 = r2.f21611a;	 Catch:{ Exception -> 0x0011 }
            r0.toJson(r1, r3);	 Catch:{ Exception -> 0x0011 }
            com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache.m25466b(r3);	 Catch:{ Exception -> 0x0011 }
        L_0x0011:
            r3 = 0;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache.b.a(java.lang.Void[]):java.lang.Void");
        }
    }

    @Inject
    StickerPacksCache(ExecutorService executorService, @Named("bitmoji-cache") File file, Gson gson) {
        this.f21614a = executorService;
        this.f21615b = file;
        this.f21616c = gson;
    }

    /* renamed from: a */
    public void m25468a(StickerPacksReadCallback stickerPacksReadCallback) {
        new C5901a(stickerPacksReadCallback, new File(this.f21615b, "sticker-packs.json"), this.f21616c).executeOnExecutor(this.f21614a, new Void[0]);
    }

    /* renamed from: a */
    public void m25467a(StickerPacks stickerPacks) {
        new C5902b(stickerPacks, new File(this.f21615b, "sticker-packs.json"), this.f21616c).executeOnExecutor(this.f21614a, new Void[0]);
    }

    /* renamed from: b */
    private static void m25466b(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0.close();	 Catch:{ IOException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache.b(java.io.Closeable):void");
    }
}
