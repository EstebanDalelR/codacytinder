package android.support.text.emoji;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.C0561l;
import android.util.SparseArray;
import androidx.text.emoji.flatbuffer.C2961b;
import java.io.IOException;

@AnyThread
@RequiresApi(19)
/* renamed from: android.support.text.emoji.d */
public final class C0299d {
    /* renamed from: a */
    private final C2961b f1049a;
    /* renamed from: b */
    private final char[] f1050b;
    /* renamed from: c */
    private final C0298a f1051c;
    /* renamed from: d */
    private final Typeface f1052d;

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.support.text.emoji.d$a */
    static class C0298a {
        /* renamed from: a */
        private final SparseArray<C0298a> f1047a;
        /* renamed from: b */
        private EmojiMetadata f1048b;

        private C0298a() {
            this(1);
        }

        private C0298a(int i) {
            this.f1047a = new SparseArray(i);
        }

        /* renamed from: a */
        C0298a m1128a(int i) {
            return this.f1047a == null ? 0 : (C0298a) this.f1047a.get(i);
        }

        /* renamed from: a */
        final EmojiMetadata m1127a() {
            return this.f1048b;
        }

        /* renamed from: a */
        private void m1125a(@NonNull EmojiMetadata emojiMetadata, int i, int i2) {
            C0298a a = m1128a(emojiMetadata.m1078a(i));
            if (a == null) {
                a = new C0298a();
                this.f1047a.put(emojiMetadata.m1078a(i), a);
            }
            if (i2 > i) {
                a.m1125a(emojiMetadata, i + 1, i2);
            } else {
                a.f1048b = emojiMetadata;
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    C0299d() {
        this.f1052d = null;
        this.f1049a = null;
        this.f1051c = new C0298a(1024);
        this.f1050b = new char[0];
    }

    private C0299d(@NonNull Typeface typeface, @NonNull C2961b c2961b) {
        this.f1052d = typeface;
        this.f1049a = c2961b;
        this.f1051c = new C0298a(1024);
        this.f1050b = new char[(this.f1049a.m11471b() * 2)];
        m1130a(this.f1049a);
    }

    /* renamed from: a */
    public static C0299d m1129a(@NonNull AssetManager assetManager, String str) throws IOException {
        return new C0299d(Typeface.createFromAsset(assetManager, str), C0296c.m1121a(assetManager, str));
    }

    /* renamed from: a */
    private void m1130a(C2961b c2961b) {
        c2961b = c2961b.m11471b();
        for (int i = 0; i < c2961b; i++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i);
            Character.toChars(emojiMetadata.m1077a(), this.f1050b, i * 2);
            m1132a(emojiMetadata);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    Typeface m1131a() {
        return this.f1052d;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: b */
    int m1133b() {
        return this.f1049a.m11468a();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: c */
    C0298a m1134c() {
        return this.f1051c;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public char[] m1135d() {
        return this.f1050b;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public C2961b m1136e() {
        return this.f1049a;
    }

    @VisibleForTesting
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    void m1132a(@NonNull EmojiMetadata emojiMetadata) {
        C0561l.m2062a((Object) emojiMetadata, (Object) "emoji metadata cannot be null");
        C0561l.m2063a(emojiMetadata.m1086g() > 0, (Object) "invalid metadata codepoint length");
        this.f1051c.m1125a(emojiMetadata, 0, emojiMetadata.m1086g() - 1);
    }
}
