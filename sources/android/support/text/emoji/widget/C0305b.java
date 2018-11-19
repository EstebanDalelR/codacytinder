package android.support.text.emoji.widget;

import android.os.Build.VERSION;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0561l;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: android.support.text.emoji.widget.b */
public final class C0305b {
    /* renamed from: a */
    private final C0304a f1056a;
    /* renamed from: b */
    private int f1057b = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    /* renamed from: c */
    private int f1058c = 0;

    /* renamed from: android.support.text.emoji.widget.b$a */
    private static class C0304a {
        /* renamed from: a */
        KeyListener mo300a(@NonNull KeyListener keyListener) {
            return keyListener;
        }

        /* renamed from: a */
        InputConnection mo301a(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection;
        }

        /* renamed from: a */
        void mo302a(int i) {
        }

        /* renamed from: b */
        void mo303b(int i) {
        }

        private C0304a() {
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.text.emoji.widget.b$b */
    private static class C2791b extends C0304a {
        /* renamed from: a */
        private final EditText f8840a;
        /* renamed from: b */
        private final C0313h f8841b = new C0313h(this.f8840a);

        C2791b(@NonNull EditText editText) {
            super();
            this.f8840a = editText;
            this.f8840a.addTextChangedListener(this.f8841b);
            this.f8840a.setEditableFactory(C0306c.m1149a());
        }

        /* renamed from: a */
        void mo302a(int i) {
            this.f8841b.m1161a(i);
        }

        /* renamed from: b */
        void mo303b(int i) {
            this.f8841b.m1162b(i);
        }

        /* renamed from: a */
        KeyListener mo300a(@NonNull KeyListener keyListener) {
            if (keyListener instanceof C0309f) {
                return keyListener;
            }
            return new C0309f(keyListener);
        }

        /* renamed from: a */
        InputConnection mo301a(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            if (inputConnection instanceof C0307d) {
                return inputConnection;
            }
            return new C0307d(this.f8840a, inputConnection, editorInfo);
        }
    }

    public C0305b(@NonNull EditText editText) {
        C0561l.m2062a((Object) editText, (Object) "editText cannot be null");
        this.f1056a = VERSION.SDK_INT >= 19 ? new C2791b(editText) : new C0304a();
    }

    /* renamed from: a */
    public void m1146a(@IntRange(from = 0) int i) {
        C0561l.m2060a(i, "maxEmojiCount should be greater than 0");
        this.f1057b = i;
        this.f1056a.mo302a(i);
    }

    /* renamed from: a */
    public int m1143a() {
        return this.f1057b;
    }

    @NonNull
    /* renamed from: a */
    public KeyListener m1144a(@NonNull KeyListener keyListener) {
        C0561l.m2062a((Object) keyListener, (Object) "keyListener cannot be null");
        return this.f1056a.mo300a(keyListener);
    }

    @Nullable
    /* renamed from: a */
    public InputConnection m1145a(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return inputConnection == null ? null : this.f1056a.mo301a(inputConnection, editorInfo);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: b */
    void m1148b(int i) {
        this.f1058c = i;
        this.f1056a.mo303b(i);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: b */
    int m1147b() {
        return this.f1058c;
    }
}
