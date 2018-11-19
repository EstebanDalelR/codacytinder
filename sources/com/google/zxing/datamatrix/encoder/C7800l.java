package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.l */
final class C7800l extends C6997c {
    /* renamed from: a */
    public int mo7367a() {
        return 2;
    }

    C7800l() {
    }

    /* renamed from: a */
    int mo7368a(char c, StringBuilder stringBuilder) {
        if (c == ' ') {
            stringBuilder.append('\u0003');
            return 1;
        } else if (c >= '0' && c <= '9') {
            stringBuilder.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            stringBuilder.append((char) ((c - 'a') + 14));
            return 1;
        } else if (c >= '\u0000' && c <= '\u001f') {
            stringBuilder.append('\u0000');
            stringBuilder.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) ((c - '[') + 22));
            return 2;
        } else if (c == '`') {
            stringBuilder.append('\u0002');
            stringBuilder.append((char) (c - '`'));
            return 2;
        } else if (c >= 'A' && c <= 'Z') {
            stringBuilder.append('\u0002');
            stringBuilder.append((char) ((c - 'A') + '\u0001'));
            return 2;
        } else if (c >= '{' && c <= '') {
            stringBuilder.append('\u0002');
            stringBuilder.append((char) ((c - '{') + 27));
            return 2;
        } else if (c >= '') {
            stringBuilder.append("\u0001\u001e");
            return mo7368a((char) (c - ''), stringBuilder) + '\u0002';
        } else {
            C5671j.m24820c(c);
            return '￿';
        }
    }
}
