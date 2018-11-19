package com.google.protobuf;

final class TextFormatEscaper {

    private interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder stringBuilder = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            byte byteAt = byteSequence.byteAt(i);
            if (byteAt == (byte) 34) {
                stringBuilder.append("\\\"");
            } else if (byteAt == (byte) 39) {
                stringBuilder.append("\\'");
            } else if (byteAt != (byte) 92) {
                switch (byteAt) {
                    case (byte) 7:
                        stringBuilder.append("\\a");
                        break;
                    case (byte) 8:
                        stringBuilder.append("\\b");
                        break;
                    case (byte) 9:
                        stringBuilder.append("\\t");
                        break;
                    case (byte) 10:
                        stringBuilder.append("\\n");
                        break;
                    case (byte) 11:
                        stringBuilder.append("\\v");
                        break;
                    case (byte) 12:
                        stringBuilder.append("\\f");
                        break;
                    case (byte) 13:
                        stringBuilder.append("\\r");
                        break;
                    default:
                        if (byteAt >= (byte) 32 && byteAt <= (byte) 126) {
                            stringBuilder.append((char) byteAt);
                            break;
                        }
                        stringBuilder.append('\\');
                        stringBuilder.append((char) (((byteAt >>> 6) & 3) + 48));
                        stringBuilder.append((char) (((byteAt >>> 3) & 7) + 48));
                        stringBuilder.append((char) ((byteAt & 7) + 48));
                        break;
                        break;
                }
            } else {
                stringBuilder.append("\\\\");
            }
        }
        return stringBuilder.toString();
    }

    static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() {
            public int size() {
                return byteString.size();
            }

            public byte byteAt(int i) {
                return byteString.byteAt(i);
            }
        });
    }

    static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() {
            public int size() {
                return bArr.length;
            }

            public byte byteAt(int i) {
                return bArr[i];
            }
        });
    }

    static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
