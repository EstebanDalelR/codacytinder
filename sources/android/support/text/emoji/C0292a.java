package android.support.text.emoji;

import android.os.Build.VERSION;
import android.support.annotation.AnyThread;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.C0299d.C0298a;
import android.support.text.emoji.EmojiCompat.C0286g;
import android.support.text.emoji.widget.C0316j;
import android.support.v4.graphics.C0444b;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;

@AnyThread
@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.a */
final class C0292a {
    /* renamed from: a */
    private final C0286g f1035a;
    /* renamed from: b */
    private final C0299d f1036b;
    /* renamed from: c */
    private C0288b f1037c = new C0288b();
    /* renamed from: d */
    private final boolean f1038d;
    /* renamed from: e */
    private final int[] f1039e;

    /* renamed from: android.support.text.emoji.a$a */
    private static final class C0287a {
        /* renamed from: c */
        private static int m1089c(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i >= 0) {
                if (length >= i) {
                    if (i2 < 0) {
                        return -1;
                    }
                    Object obj;
                    loop0:
                    while (true) {
                        obj = null;
                        while (i2 != 0) {
                            i--;
                            if (i < 0) {
                                break loop0;
                            }
                            char charAt = charSequence.charAt(i);
                            if (obj != null) {
                                if (!Character.isHighSurrogate(charAt)) {
                                    return -1;
                                }
                                i2--;
                            } else if (!Character.isSurrogate(charAt)) {
                                i2--;
                            } else if (Character.isHighSurrogate(charAt)) {
                                return -1;
                            } else {
                                obj = 1;
                            }
                        }
                        return i;
                    }
                    return obj != null ? -1 : 0;
                }
            }
            return -1;
        }

        /* renamed from: d */
        private static int m1090d(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i >= 0) {
                if (length >= i) {
                    if (i2 < 0) {
                        return -1;
                    }
                    Object obj;
                    loop0:
                    while (true) {
                        obj = null;
                        while (i2 != 0) {
                            if (i >= length) {
                                break loop0;
                            }
                            char charAt = charSequence.charAt(i);
                            if (obj != null) {
                                if (!Character.isLowSurrogate(charAt)) {
                                    return -1;
                                }
                                i2--;
                                i++;
                            } else if (!Character.isSurrogate(charAt)) {
                                i2--;
                                i++;
                            } else if (Character.isLowSurrogate(charAt)) {
                                return -1;
                            } else {
                                i++;
                                obj = 1;
                            }
                        }
                        return i;
                    }
                    return obj != null ? -1 : length;
                }
            }
            return -1;
        }
    }

    @AnyThread
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.support.text.emoji.a$b */
    public static class C0288b {
        /* renamed from: a */
        private static final ThreadLocal<StringBuilder> f1023a = new ThreadLocal();
        /* renamed from: b */
        private final TextPaint f1024b = new TextPaint();

        C0288b() {
            this.f1024b.setTextSize(10.0f);
        }

        /* renamed from: a */
        public boolean m1092a(CharSequence charSequence, int i, int i2) {
            StringBuilder a = C0288b.m1091a();
            a.setLength(0);
            while (i < i2) {
                a.append(charSequence.charAt(i));
                i++;
            }
            return C0444b.m1691a(this.f1024b, a.toString());
        }

        /* renamed from: a */
        private static StringBuilder m1091a() {
            if (f1023a.get() == null) {
                f1023a.set(new StringBuilder());
            }
            return (StringBuilder) f1023a.get();
        }
    }

    /* renamed from: android.support.text.emoji.a$c */
    static final class C0289c {
        /* renamed from: a */
        private int f1025a = 1;
        /* renamed from: b */
        private final C0298a f1026b;
        /* renamed from: c */
        private C0298a f1027c;
        /* renamed from: d */
        private C0298a f1028d;
        /* renamed from: e */
        private int f1029e;
        /* renamed from: f */
        private int f1030f;
        /* renamed from: g */
        private final boolean f1031g;
        /* renamed from: h */
        private final int[] f1032h;

        /* renamed from: b */
        private static boolean m1093b(int i) {
            return i == 65039;
        }

        /* renamed from: c */
        private static boolean m1094c(int i) {
            return i == 65038;
        }

        C0289c(C0298a c0298a, boolean z, int[] iArr) {
            this.f1026b = c0298a;
            this.f1027c = c0298a;
            this.f1031g = z;
            this.f1032h = iArr;
        }

        /* renamed from: a */
        int m1097a(int i) {
            C0298a a = this.f1027c.m1128a(i);
            int i2 = 3;
            if (this.f1025a != 2) {
                if (a == null) {
                    i2 = m1095d();
                    this.f1029e = i;
                    return i2;
                }
                this.f1025a = 2;
                this.f1027c = a;
                this.f1030f = 1;
            } else if (a != null) {
                this.f1027c = a;
                this.f1030f++;
            } else {
                if (C0289c.m1094c(i)) {
                    i2 = m1095d();
                } else if (!C0289c.m1093b(i)) {
                    if (this.f1027c.m1127a() == null) {
                        i2 = m1095d();
                    } else if (this.f1030f != 1) {
                        this.f1028d = this.f1027c;
                        m1095d();
                    } else if (m1096e()) {
                        this.f1028d = this.f1027c;
                        m1095d();
                    } else {
                        i2 = m1095d();
                    }
                }
                this.f1029e = i;
                return i2;
            }
            i2 = 2;
            this.f1029e = i;
            return i2;
        }

        /* renamed from: d */
        private int m1095d() {
            this.f1025a = 1;
            this.f1027c = this.f1026b;
            this.f1030f = 0;
            return 1;
        }

        /* renamed from: a */
        EmojiMetadata m1098a() {
            return this.f1028d.m1127a();
        }

        /* renamed from: b */
        EmojiMetadata m1099b() {
            return this.f1027c.m1127a();
        }

        /* renamed from: c */
        boolean m1100c() {
            if (this.f1025a == 2 && this.f1027c.m1127a() != null) {
                if (this.f1030f > 1) {
                    return true;
                }
                if (m1096e()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        private boolean m1096e() {
            if (this.f1027c.m1127a().m1085f() || C0289c.m1093b(this.f1029e)) {
                return true;
            }
            if (this.f1031g) {
                if (this.f1032h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f1032h, this.f1027c.m1127a().m1078a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m1102a(int i, int i2) {
        if (!(i == -1 || i2 == -1)) {
            if (i == i2) {
                return false;
            }
        }
        return true;
    }

    C0292a(@NonNull C0299d c0299d, @NonNull C0286g c0286g, boolean z, @Nullable int[] iArr) {
        this.f1035a = c0286g;
        this.f1036b = c0299d;
        this.f1038d = z;
        this.f1039e = iArr;
    }

    /* renamed from: a */
    CharSequence m1108a(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
        int i4;
        int i5;
        int codePointAt;
        int spanStart;
        C0289c c0289c;
        Spannable spannable;
        int i6;
        CharSequence spannableString;
        boolean z2 = charSequence instanceof C0316j;
        if (z2) {
            ((C0316j) charSequence).m1174a();
        }
        Spannable spannable2 = null;
        if (!z2) {
            try {
                if (charSequence instanceof Spannable) {
                }
                i4 = 0;
                if (spannable2 != null) {
                    C0293b[] c0293bArr = (C0293b[]) spannable2.getSpans(i, i2, C0293b.class);
                    if (c0293bArr != null && c0293bArr.length > 0) {
                        i5 = i2;
                        i2 = i;
                        for (Object obj : c0293bArr) {
                            spanStart = spannable2.getSpanStart(obj);
                            int spanEnd = spannable2.getSpanEnd(obj);
                            if (spanStart != i5) {
                                spannable2.removeSpan(obj);
                            }
                            i2 = Math.min(spanStart, i2);
                            i5 = Math.max(spanEnd, i5);
                        }
                        i = i2;
                        i2 = i5;
                    }
                }
                if (i != i2) {
                    if (i >= charSequence.length()) {
                        if (!(i3 == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED || spannable2 == null)) {
                            i3 -= ((C0293b[]) spannable2.getSpans(0, spannable2.length(), C0293b.class)).length;
                        }
                        c0289c = new C0289c(this.f1036b.m1134c(), this.f1038d, this.f1039e);
                        codePointAt = Character.codePointAt(charSequence, i);
                        spannable = spannable2;
                        while (true) {
                            i6 = i;
                            while (i < i2 && i4 < r13) {
                                switch (c0289c.m1097a(codePointAt)) {
                                    case 1:
                                        i6 += Character.charCount(Character.codePointAt(charSequence, i6));
                                        if (i6 < i2) {
                                            codePointAt = Character.codePointAt(charSequence, i6);
                                        }
                                        i = i6;
                                        break;
                                    case 2:
                                        i += Character.charCount(codePointAt);
                                        if (i >= i2) {
                                            break;
                                        }
                                        codePointAt = Character.codePointAt(charSequence, i);
                                        break;
                                    case 3:
                                        if (z || !m1107a(charSequence, i6, i, c0289c.m1098a())) {
                                            if (spannable == null) {
                                                spannable = new SpannableString(charSequence);
                                            }
                                            m1101a(spannable, c0289c.m1098a(), i6, i);
                                            i4++;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            if (c0289c.m1100c() != 0 && i4 < r13 && (z || m1107a(charSequence, i6, i, c0289c.m1099b()) == 0)) {
                                if (spannable == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                m1101a((Spannable) spannableString, c0289c.m1099b(), i6, i);
                            }
                            if (spannableString == null) {
                                spannableString = charSequence;
                            }
                            if (z2) {
                                ((C0316j) charSequence).m1175b();
                            }
                            return spannableString;
                        }
                    }
                }
                if (z2) {
                    ((C0316j) charSequence).m1175b();
                }
                return charSequence;
            } catch (Throwable th) {
                if (z2) {
                    ((C0316j) charSequence).m1175b();
                }
            }
        }
        spannable2 = (Spannable) charSequence;
        i4 = 0;
        if (spannable2 != null) {
            C0293b[] c0293bArr2 = (C0293b[]) spannable2.getSpans(i, i2, C0293b.class);
            i5 = i2;
            i2 = i;
            for (Object obj2 : c0293bArr2) {
                spanStart = spannable2.getSpanStart(obj2);
                int spanEnd2 = spannable2.getSpanEnd(obj2);
                if (spanStart != i5) {
                    spannable2.removeSpan(obj2);
                }
                i2 = Math.min(spanStart, i2);
                i5 = Math.max(spanEnd2, i5);
            }
            i = i2;
            i2 = i5;
        }
        if (i != i2) {
            if (i >= charSequence.length()) {
                i3 -= ((C0293b[]) spannable2.getSpans(0, spannable2.length(), C0293b.class)).length;
                c0289c = new C0289c(this.f1036b.m1134c(), this.f1038d, this.f1039e);
                codePointAt = Character.codePointAt(charSequence, i);
                spannable = spannable2;
                while (true) {
                    i6 = i;
                    while (i < i2) {
                        switch (c0289c.m1097a(codePointAt)) {
                            case 1:
                                i6 += Character.charCount(Character.codePointAt(charSequence, i6));
                                if (i6 < i2) {
                                    codePointAt = Character.codePointAt(charSequence, i6);
                                }
                                i = i6;
                                break;
                            case 2:
                                i += Character.charCount(codePointAt);
                                if (i >= i2) {
                                    codePointAt = Character.codePointAt(charSequence, i);
                                    break;
                                }
                                break;
                            case 3:
                                if (!z) {
                                    break;
                                }
                                if (spannable == null) {
                                    spannable = new SpannableString(charSequence);
                                }
                                m1101a(spannable, c0289c.m1098a(), i6, i);
                                i4++;
                            default:
                                break;
                        }
                    }
                    if (spannable == null) {
                        spannableString = new SpannableString(charSequence);
                    }
                    m1101a((Spannable) spannableString, c0289c.m1099b(), i6, i);
                    if (spannableString == null) {
                        spannableString = charSequence;
                    }
                    if (z2) {
                        ((C0316j) charSequence).m1175b();
                    }
                    return spannableString;
                }
            }
        }
        if (z2) {
            ((C0316j) charSequence).m1175b();
        }
        return charSequence;
    }

    /* renamed from: a */
    static boolean m1103a(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        i = i != 67 ? i != 112 ? 0 : C0292a.m1104a(editable, keyEvent, true) : C0292a.m1104a(editable, keyEvent, false);
        if (i == 0) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: a */
    private static boolean m1104a(Editable editable, KeyEvent keyEvent, boolean z) {
        if (C0292a.m1105a(keyEvent) != null) {
            return false;
        }
        keyEvent = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (C0292a.m1102a(keyEvent, selectionEnd)) {
            return false;
        }
        C0293b[] c0293bArr = (C0293b[]) editable.getSpans(keyEvent, selectionEnd, C0293b.class);
        if (c0293bArr != null && c0293bArr.length > 0) {
            int length = c0293bArr.length;
            int i = 0;
            while (i < length) {
                Object obj = c0293bArr[i];
                int spanStart = editable.getSpanStart(obj);
                int spanEnd = editable.getSpanEnd(obj);
                if (!(z && spanStart == keyEvent) && ((z || spanEnd != keyEvent) && (keyEvent <= spanStart || keyEvent >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1106a(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        if (editable != null) {
            if (inputConnection != null) {
                if (i >= 0) {
                    if (i2 >= 0) {
                        int selectionStart = Selection.getSelectionStart(editable);
                        int selectionEnd = Selection.getSelectionEnd(editable);
                        if (C0292a.m1102a(selectionStart, selectionEnd)) {
                            return false;
                        }
                        if (z) {
                            i = C0287a.m1089c(editable, selectionStart, Math.max(i, 0));
                            i2 = C0287a.m1090d(editable, selectionEnd, Math.max(i2, 0));
                            if (i == -1 || i2 == -1) {
                                return false;
                            }
                        }
                        i = Math.max(selectionStart - i, 0);
                        i2 = Math.min(selectionEnd + i2, editable.length());
                        C0293b[] c0293bArr = (C0293b[]) editable.getSpans(i, i2, C0293b.class);
                        if (c0293bArr == null || c0293bArr.length <= 0) {
                            return false;
                        }
                        selectionEnd = i2;
                        i2 = i;
                        for (Object obj : c0293bArr) {
                            int spanStart = editable.getSpanStart(obj);
                            int spanEnd = editable.getSpanEnd(obj);
                            i2 = Math.min(spanStart, i2);
                            selectionEnd = Math.max(spanEnd, selectionEnd);
                        }
                        i = Math.max(i2, 0);
                        i2 = Math.min(selectionEnd, editable.length());
                        inputConnection.beginBatchEdit();
                        editable.delete(i, i2);
                        inputConnection.endBatchEdit();
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m1105a(KeyEvent keyEvent) {
        return KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) ^ 1;
    }

    /* renamed from: a */
    private void m1101a(@NonNull Spannable spannable, EmojiMetadata emojiMetadata, int i, int i2) {
        spannable.setSpan(this.f1035a.m1052a(emojiMetadata), i, i2, 33);
    }

    /* renamed from: a */
    private boolean m1107a(CharSequence charSequence, int i, int i2, EmojiMetadata emojiMetadata) {
        boolean z = false;
        if (VERSION.SDK_INT < 23 && emojiMetadata.m1083d() > VERSION.SDK_INT) {
            return false;
        }
        if (emojiMetadata.m1084e() == 0) {
            emojiMetadata.m1080a(this.f1037c.m1092a(charSequence, i, i2));
        }
        if (emojiMetadata.m1084e() == 2) {
            z = true;
        }
        return z;
    }
}
