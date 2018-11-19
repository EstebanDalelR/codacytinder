package android.support.text.emoji;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.text.TextPaint;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.f */
public final class C2790f extends C0293b {
    /* renamed from: a */
    private static Paint f8839a;

    public C2790f(EmojiMetadata emojiMetadata) {
        super(emojiMetadata);
    }

    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        if (EmojiCompat.m1053a().m1074c() != null) {
            canvas.drawRect(f, (float) i3, f + ((float) m1110b()), (float) i5, C2790f.m10859c());
        }
        m1109a().m1079a(canvas, f, (float) i4, paint);
    }

    /* renamed from: c */
    private static Paint m10859c() {
        if (f8839a == null) {
            f8839a = new TextPaint();
            f8839a.setColor(EmojiCompat.m1053a().m1075d());
            f8839a.setStyle(Style.FILL);
        }
        return f8839a;
    }
}
