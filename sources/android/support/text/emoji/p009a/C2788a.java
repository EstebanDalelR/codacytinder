package android.support.text.emoji.p009a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.text.emoji.C0299d;
import android.support.text.emoji.EmojiCompat.C0282c;
import android.support.text.emoji.EmojiCompat.C0285f;
import android.support.text.emoji.EmojiCompat.MetadataRepoLoader;
import android.support.v4.util.C0561l;

/* renamed from: android.support.text.emoji.a.a */
public class C2788a extends C0282c {

    @RequiresApi(19)
    /* renamed from: android.support.text.emoji.a.a$b */
    private static class C0291b implements Runnable {
        /* renamed from: a */
        private final C0285f f1033a;
        /* renamed from: b */
        private final Context f1034b;

        private C0291b(Context context, C0285f c0285f) {
            this.f1034b = context;
            this.f1033a = c0285f;
        }

        public void run() {
            try {
                this.f1033a.mo289a(C0299d.m1129a(this.f1034b.getAssets(), "NotoColorEmojiCompat.ttf"));
            } catch (Throwable th) {
                this.f1033a.mo290a(th);
            }
        }
    }

    /* renamed from: android.support.text.emoji.a.a$a */
    private static class C2787a implements MetadataRepoLoader {
        /* renamed from: a */
        private final Context f8834a;

        private C2787a(@NonNull Context context) {
            this.f8834a = context.getApplicationContext();
        }

        @RequiresApi(19)
        public void load(@NonNull C0285f c0285f) {
            C0561l.m2062a((Object) c0285f, (Object) "loaderCallback cannot be null");
            c0285f = new Thread(new C0291b(this.f8834a, c0285f));
            c0285f.setDaemon(false);
            c0285f.start();
        }
    }

    public C2788a(@NonNull Context context) {
        super(new C2787a(context));
    }
}
