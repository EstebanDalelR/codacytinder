package android.support.text.emoji;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0561l;
import android.text.style.ReplacementSpan;

@RequiresApi(19)
/* renamed from: android.support.text.emoji.b */
public abstract class C0293b extends ReplacementSpan {
    /* renamed from: a */
    private final FontMetricsInt f1040a = new FontMetricsInt();
    /* renamed from: b */
    private final EmojiMetadata f1041b;
    /* renamed from: c */
    private short f1042c = (short) -1;
    /* renamed from: d */
    private short f1043d = (short) -1;
    /* renamed from: e */
    private float f1044e = 1.0f;

    @RestrictTo({Scope.LIBRARY_GROUP})
    C0293b(@NonNull EmojiMetadata emojiMetadata) {
        C0561l.m2062a((Object) emojiMetadata, (Object) "metadata cannot be null");
        this.f1041b = emojiMetadata;
    }

    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1040a);
        this.f1044e = (((float) Math.abs(this.f1040a.descent - this.f1040a.ascent)) * 1065353216) / ((float) this.f1041b.m1082c());
        this.f1043d = (short) ((int) (((float) this.f1041b.m1082c()) * this.f1044e));
        this.f1042c = (short) ((int) (((float) this.f1041b.m1081b()) * this.f1044e));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.f1040a.ascent;
            fontMetricsInt.descent = this.f1040a.descent;
            fontMetricsInt.top = this.f1040a.top;
            fontMetricsInt.bottom = this.f1040a.bottom;
        }
        return this.f1042c;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    final EmojiMetadata m1109a() {
        return this.f1041b;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: b */
    final int m1110b() {
        return this.f1042c;
    }
}
