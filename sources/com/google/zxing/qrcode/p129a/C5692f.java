package com.google.zxing.qrcode.p129a;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.zxing.qrcode.decoder.C5695a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* renamed from: com.google.zxing.qrcode.a.f */
public final class C5692f {
    /* renamed from: a */
    private Mode f21087a;
    /* renamed from: b */
    private ErrorCorrectionLevel f21088b;
    /* renamed from: c */
    private C5695a f21089c;
    /* renamed from: d */
    private int f21090d = -1;
    /* renamed from: e */
    private C5687b f21091e;

    /* renamed from: b */
    public static boolean m24955b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C5687b m24956a() {
        return this.f21091e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        stringBuilder.append("<<\n");
        stringBuilder.append(" mode: ");
        stringBuilder.append(this.f21087a);
        stringBuilder.append("\n ecLevel: ");
        stringBuilder.append(this.f21088b);
        stringBuilder.append("\n version: ");
        stringBuilder.append(this.f21089c);
        stringBuilder.append("\n maskPattern: ");
        stringBuilder.append(this.f21090d);
        if (this.f21091e == null) {
            stringBuilder.append("\n matrix: null\n");
        } else {
            stringBuilder.append("\n matrix:\n");
            stringBuilder.append(this.f21091e);
        }
        stringBuilder.append(">>\n");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m24960a(Mode mode) {
        this.f21087a = mode;
    }

    /* renamed from: a */
    public void m24959a(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f21088b = errorCorrectionLevel;
    }

    /* renamed from: a */
    public void m24961a(C5695a c5695a) {
        this.f21089c = c5695a;
    }

    /* renamed from: a */
    public void m24957a(int i) {
        this.f21090d = i;
    }

    /* renamed from: a */
    public void m24958a(C5687b c5687b) {
        this.f21091e = c5687b;
    }
}
