package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;

public class UnrecognizedInputFormatException extends ParserException {
    /* renamed from: a */
    public final Uri f11357a;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str);
        this.f11357a = uri;
    }
}
