package com.google.protobuf;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.nio.ByteBuffer;

final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor = (UnsafeProcessor.isAvailable() ? new UnsafeProcessor() : new SafeProcessor());

    static abstract class Processor {
        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == null;
        }

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == null;
        }

        final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i, byteBuffer, i2, i3);
            } else {
                return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
            r6 = this;
            if (r7 == 0) goto L_0x0089;
        L_0x0002:
            if (r9 < r10) goto L_0x0005;
        L_0x0004:
            return r7;
        L_0x0005:
            r0 = (byte) r7;
            r1 = -32;
            r2 = -1;
            r3 = -65;
            if (r0 >= r1) goto L_0x001a;
        L_0x000d:
            r7 = -62;
            if (r0 < r7) goto L_0x0019;
        L_0x0011:
            r7 = r9 + 1;
            r9 = r8.get(r9);
            if (r9 <= r3) goto L_0x008a;
        L_0x0019:
            return r2;
        L_0x001a:
            r4 = -16;
            if (r0 >= r4) goto L_0x004b;
        L_0x001e:
            r7 = r7 >> 8;
            r7 = r7 ^ r2;
            r7 = (byte) r7;
            if (r7 != 0) goto L_0x0034;
        L_0x0024:
            r7 = r9 + 1;
            r9 = r8.get(r9);
            if (r7 < r10) goto L_0x0031;
        L_0x002c:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r9);
            return r7;
        L_0x0031:
            r5 = r9;
            r9 = r7;
            r7 = r5;
        L_0x0034:
            if (r7 > r3) goto L_0x004a;
        L_0x0036:
            r4 = -96;
            if (r0 != r1) goto L_0x003c;
        L_0x003a:
            if (r7 < r4) goto L_0x004a;
        L_0x003c:
            r1 = -19;
            if (r0 != r1) goto L_0x0042;
        L_0x0040:
            if (r7 >= r4) goto L_0x004a;
        L_0x0042:
            r7 = r9 + 1;
            r9 = r8.get(r9);
            if (r9 <= r3) goto L_0x008a;
        L_0x004a:
            return r2;
        L_0x004b:
            r1 = r7 >> 8;
            r1 = r1 ^ r2;
            r1 = (byte) r1;
            r4 = 0;
            if (r1 != 0) goto L_0x005f;
        L_0x0052:
            r7 = r9 + 1;
            r1 = r8.get(r9);
            if (r7 < r10) goto L_0x0063;
        L_0x005a:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1);
            return r7;
        L_0x005f:
            r7 = r7 >> 16;
            r4 = (byte) r7;
            r7 = r9;
        L_0x0063:
            if (r4 != 0) goto L_0x0073;
        L_0x0065:
            r9 = r7 + 1;
            r4 = r8.get(r7);
            if (r9 < r10) goto L_0x0072;
        L_0x006d:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1, r4);
            return r7;
        L_0x0072:
            r7 = r9;
        L_0x0073:
            if (r1 > r3) goto L_0x0088;
        L_0x0075:
            r9 = r0 << 28;
            r1 = r1 + 112;
            r9 = r9 + r1;
            r9 = r9 >> 30;
            if (r9 != 0) goto L_0x0088;
        L_0x007e:
            if (r4 > r3) goto L_0x0088;
        L_0x0080:
            r9 = r7 + 1;
            r7 = r8.get(r7);
            if (r7 <= r3) goto L_0x0089;
        L_0x0088:
            return r2;
        L_0x0089:
            r7 = r9;
        L_0x008a:
            r7 = partialIsValidUtf8(r8, r7, r10);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            i += Utf8.estimateConsecutiveAscii(byteBuffer, i, i2);
            while (i < i2) {
                int i3 = i + 1;
                i = byteBuffer.get(i);
                if (i < 0) {
                    if (i < -32) {
                        if (i3 >= i2) {
                            return i;
                        }
                        if (i >= -62) {
                            if (byteBuffer.get(i3) <= -65) {
                                i3++;
                            }
                        }
                        return -1;
                    } else if (i < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.incompleteStateFor(byteBuffer, i, i3, i2 - i3);
                        }
                        int i4 = i3 + 1;
                        r0 = byteBuffer.get(i3);
                        if (r0 <= (byte) -65 && ((i != -32 || r0 >= (byte) -96) && (i != -19 || r0 < (byte) -96))) {
                            if (byteBuffer.get(i4) <= -65) {
                                i = i4 + 1;
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.incompleteStateFor(byteBuffer, i, i3, i2 - i3);
                    } else {
                        int i5 = i3 + 1;
                        r0 = byteBuffer.get(i3);
                        if (r0 <= (byte) -65 && (((i << 28) + (r0 + 112)) >> 30) == 0) {
                            i = i5 + 1;
                            if (byteBuffer.get(i5) <= (byte) -65) {
                                i3 = i + 1;
                                if (byteBuffer.get(i) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return null;
        }

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(java.lang.CharSequence r8, java.nio.ByteBuffer r9) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r7 = this;
            r0 = r8.length();
            r1 = r9.position();
            r2 = 0;
        L_0x0009:
            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r2 >= r0) goto L_0x001c;
        L_0x000d:
            r4 = r8.charAt(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            if (r4 >= r3) goto L_0x001c;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x0013:
            r3 = r1 + r2;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r4 = (byte) r4;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r9.put(r3, r4);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r2 = r2 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            goto L_0x0009;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x001c:
            if (r2 != r0) goto L_0x0024;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x001e:
            r0 = r1 + r2;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r9.position(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            return;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x0024:
            r1 = r1 + r2;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x0025:
            if (r2 >= r0) goto L_0x00c2;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x0027:
            r4 = r8.charAt(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            if (r4 >= r3) goto L_0x0033;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x002d:
            r4 = (byte) r4;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r9.put(r1, r4);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            goto L_0x00bc;
        L_0x0033:
            r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
            if (r4 >= r5) goto L_0x004e;
        L_0x0037:
            r5 = r1 + 1;
            r6 = r4 >>> 6;
            r6 = r6 | 192;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x004b }
            r1 = r4 & 63;	 Catch:{ IndexOutOfBoundsException -> 0x004b }
            r1 = r1 | r3;	 Catch:{ IndexOutOfBoundsException -> 0x004b }
            r1 = (byte) r1;	 Catch:{ IndexOutOfBoundsException -> 0x004b }
            r9.put(r5, r1);	 Catch:{ IndexOutOfBoundsException -> 0x004b }
            r1 = r5;
            goto L_0x00bc;
        L_0x004b:
            r1 = r5;
            goto L_0x00c6;
        L_0x004e:
            r5 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
            if (r4 < r5) goto L_0x00a0;
        L_0x0053:
            r5 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
            if (r5 >= r4) goto L_0x0059;
        L_0x0058:
            goto L_0x00a0;
        L_0x0059:
            r5 = r2 + 1;
            if (r5 == r0) goto L_0x009a;
        L_0x005d:
            r2 = r8.charAt(r5);	 Catch:{ IndexOutOfBoundsException -> 0x0098 }
            r6 = java.lang.Character.isSurrogatePair(r4, r2);	 Catch:{ IndexOutOfBoundsException -> 0x0098 }
            if (r6 != 0) goto L_0x0069;	 Catch:{ IndexOutOfBoundsException -> 0x0098 }
        L_0x0067:
            r2 = r5;	 Catch:{ IndexOutOfBoundsException -> 0x0098 }
            goto L_0x009a;	 Catch:{ IndexOutOfBoundsException -> 0x0098 }
        L_0x0069:
            r2 = java.lang.Character.toCodePoint(r4, r2);	 Catch:{ IndexOutOfBoundsException -> 0x0098 }
            r4 = r1 + 1;
            r6 = r2 >>> 18;
            r6 = r6 | 240;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r1 = r4 + 1;
            r6 = r2 >>> 12;
            r6 = r6 & 63;
            r6 = r6 | r3;
            r6 = (byte) r6;
            r9.put(r4, r6);	 Catch:{ IndexOutOfBoundsException -> 0x0098 }
            r4 = r1 + 1;
            r6 = r2 >>> 6;
            r6 = r6 & 63;
            r6 = r6 | r3;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r1 = r2 & 63;	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r1 = r1 | r3;	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r1 = (byte) r1;	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r9.put(r4, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r1 = r4;
            r2 = r5;
            goto L_0x00bc;
        L_0x0097:
            r1 = r4;
        L_0x0098:
            r2 = r5;
            goto L_0x00c6;
        L_0x009a:
            r3 = new com.google.protobuf.Utf8$UnpairedSurrogateException;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r3.<init>(r2, r0);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            throw r3;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x00a0:
            r5 = r1 + 1;
            r6 = r4 >>> 12;
            r6 = r6 | 224;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x004b }
            r1 = r5 + 1;
            r6 = r4 >>> 6;
            r6 = r6 & 63;
            r6 = r6 | r3;
            r6 = (byte) r6;
            r9.put(r5, r6);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r4 = r4 & 63;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r4 = r4 | r3;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r4 = (byte) r4;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r9.put(r1, r4);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x00bc:
            r2 = r2 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            r1 = r1 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            goto L_0x0025;	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
        L_0x00c2:
            r9.position(r1);	 Catch:{ IndexOutOfBoundsException -> 0x00c6 }
            return;
        L_0x00c6:
            r0 = r9.position();
            r9 = r9.position();
            r1 = r1 - r9;
            r1 = r1 + 1;
            r9 = java.lang.Math.max(r2, r1);
            r0 = r0 + r9;
            r9 = new java.lang.ArrayIndexOutOfBoundsException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r3 = "Failed writing ";
            r1.append(r3);
            r8 = r8.charAt(r2);
            r1.append(r8);
            r8 = " at index ";
            r1.append(r8);
            r1.append(r0);
            r8 = r1.toString();
            r9.<init>(r8);
            throw r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.encodeUtf8Default(java.lang.CharSequence, java.nio.ByteBuffer):void");
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unpaired surrogate at index ");
            stringBuilder.append(i);
            stringBuilder.append(" of ");
            stringBuilder.append(i2);
            super(stringBuilder.toString());
        }
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
            r6 = this;
            if (r7 == 0) goto L_0x007d;
        L_0x0002:
            if (r9 < r10) goto L_0x0005;
        L_0x0004:
            return r7;
        L_0x0005:
            r0 = (byte) r7;
            r1 = -32;
            r2 = -1;
            r3 = -65;
            if (r0 >= r1) goto L_0x0018;
        L_0x000d:
            r7 = -62;
            if (r0 < r7) goto L_0x0017;
        L_0x0011:
            r7 = r9 + 1;
            r9 = r8[r9];
            if (r9 <= r3) goto L_0x007e;
        L_0x0017:
            return r2;
        L_0x0018:
            r4 = -16;
            if (r0 >= r4) goto L_0x0045;
        L_0x001c:
            r7 = r7 >> 8;
            r7 = r7 ^ r2;
            r7 = (byte) r7;
            if (r7 != 0) goto L_0x0030;
        L_0x0022:
            r7 = r9 + 1;
            r9 = r8[r9];
            if (r7 < r10) goto L_0x002d;
        L_0x0028:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r9);
            return r7;
        L_0x002d:
            r5 = r9;
            r9 = r7;
            r7 = r5;
        L_0x0030:
            if (r7 > r3) goto L_0x0044;
        L_0x0032:
            r4 = -96;
            if (r0 != r1) goto L_0x0038;
        L_0x0036:
            if (r7 < r4) goto L_0x0044;
        L_0x0038:
            r1 = -19;
            if (r0 != r1) goto L_0x003e;
        L_0x003c:
            if (r7 >= r4) goto L_0x0044;
        L_0x003e:
            r7 = r9 + 1;
            r9 = r8[r9];
            if (r9 <= r3) goto L_0x007e;
        L_0x0044:
            return r2;
        L_0x0045:
            r1 = r7 >> 8;
            r1 = r1 ^ r2;
            r1 = (byte) r1;
            r4 = 0;
            if (r1 != 0) goto L_0x0057;
        L_0x004c:
            r7 = r9 + 1;
            r1 = r8[r9];
            if (r7 < r10) goto L_0x005b;
        L_0x0052:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1);
            return r7;
        L_0x0057:
            r7 = r7 >> 16;
            r4 = (byte) r7;
            r7 = r9;
        L_0x005b:
            if (r4 != 0) goto L_0x0069;
        L_0x005d:
            r9 = r7 + 1;
            r4 = r8[r7];
            if (r9 < r10) goto L_0x0068;
        L_0x0063:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1, r4);
            return r7;
        L_0x0068:
            r7 = r9;
        L_0x0069:
            if (r1 > r3) goto L_0x007c;
        L_0x006b:
            r9 = r0 << 28;
            r1 = r1 + 112;
            r9 = r9 + r1;
            r9 = r9 >> 30;
            if (r9 != 0) goto L_0x007c;
        L_0x0074:
            if (r4 > r3) goto L_0x007c;
        L_0x0076:
            r9 = r7 + 1;
            r7 = r8[r7];
            if (r7 <= r3) goto L_0x007d;
        L_0x007c:
            return r2;
        L_0x007d:
            r7 = r9;
        L_0x007e:
            r7 = partialIsValidUtf8(r8, r7, r10);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int length = charSequence.length();
            i2 += i;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3 + i;
                if (i4 >= i2) {
                    break;
                }
                char charAt = charSequence.charAt(i3);
                if (charAt >= '') {
                    break;
                }
                bArr[i4] = (byte) charAt;
                i3++;
            }
            if (i3 == length) {
                return i + length;
            }
            i += i3;
            while (i3 < length) {
                int i5;
                char charAt2 = charSequence.charAt(i3);
                if (charAt2 < '' && i < i2) {
                    i5 = i + 1;
                    bArr[i] = (byte) charAt2;
                } else if (charAt2 < 'ࠀ' && i <= i2 - 2) {
                    i5 = i + 1;
                    bArr[i] = (byte) ((charAt2 >>> 6) | 960);
                    i = i5 + 1;
                    bArr[i5] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    i3++;
                } else if ((charAt2 < '?' || '?' < charAt2) && i <= i2 - 3) {
                    i5 = i + 1;
                    bArr[i] = (byte) ((charAt2 >>> 12) | 480);
                    i = i5 + 1;
                    bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    i5 = i + 1;
                    bArr[i] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                } else if (i <= i2 - 4) {
                    i5 = i3 + 1;
                    if (i5 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i5);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            i3 = Character.toCodePoint(charAt2, charAt3);
                            i4 = i + 1;
                            bArr[i] = (byte) ((i3 >>> 18) | 240);
                            i = i4 + 1;
                            bArr[i4] = (byte) (((i3 >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                            i4 = i + 1;
                            bArr[i] = (byte) (((i3 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                            i = i4 + 1;
                            bArr[i4] = (byte) ((i3 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                            i3 = i5;
                            i3++;
                        } else {
                            i3 = i5;
                        }
                    }
                    throw new UnpairedSurrogateException(i3 - 1, length);
                } else {
                    if ('?' <= charAt2 && charAt2 <= '?') {
                        bArr = i3 + 1;
                        if (bArr == charSequence.length() || Character.isSurrogatePair(charAt2, charSequence.charAt(bArr)) == null) {
                            throw new UnpairedSurrogateException(i3, length);
                        }
                    }
                    bArr = new StringBuilder();
                    bArr.append("Failed writing ");
                    bArr.append(charAt2);
                    bArr.append(" at index ");
                    bArr.append(i);
                    throw new ArrayIndexOutOfBoundsException(bArr.toString());
                }
                i = i5;
                i3++;
            }
            return i;
        }

        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= (byte) 0) {
                i++;
            }
            if (i >= i2) {
                return null;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                i = bArr[i];
                if (i < 0) {
                    if (i < -32) {
                        if (i3 >= i2) {
                            return i;
                        }
                        if (i >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > (byte) -65) {
                            }
                        }
                        return -1;
                    } else if (i < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.incompleteStateFor(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        r0 = bArr[i3];
                        if (r0 <= (byte) -65 && ((i != -32 || r0 >= (byte) -96) && (i != -19 || r0 < (byte) -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > (byte) -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.incompleteStateFor(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        r0 = bArr[i3];
                        if (r0 <= (byte) -65 && (((i << 28) + (r0 + 112)) >> 30) == 0) {
                            i = i5 + 1;
                            if (bArr[i5] <= (byte) -65) {
                                i3 = i + 1;
                                if (bArr[i] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return null;
        }
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
            r11 = this;
            r0 = r14 | r15;
            r1 = r13.length;
            r1 = r1 - r15;
            r0 = r0 | r1;
            r1 = 0;
            if (r0 >= 0) goto L_0x002c;
        L_0x0008:
            r12 = new java.lang.ArrayIndexOutOfBoundsException;
            r0 = "Array length=%d, index=%d, limit=%d";
            r2 = 3;
            r2 = new java.lang.Object[r2];
            r13 = r13.length;
            r13 = java.lang.Integer.valueOf(r13);
            r2[r1] = r13;
            r13 = 1;
            r14 = java.lang.Integer.valueOf(r14);
            r2[r13] = r14;
            r13 = 2;
            r14 = java.lang.Integer.valueOf(r15);
            r2[r13] = r14;
            r13 = java.lang.String.format(r0, r2);
            r12.<init>(r13);
            throw r12;
        L_0x002c:
            r2 = (long) r14;
            r14 = (long) r15;
            if (r12 == 0) goto L_0x00c5;
        L_0x0030:
            r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
            if (r0 < 0) goto L_0x0035;
        L_0x0034:
            return r12;
        L_0x0035:
            r0 = (byte) r12;
            r4 = -32;
            r5 = -1;
            r6 = -65;
            r7 = 1;
            if (r0 >= r4) goto L_0x0050;
        L_0x003f:
            r12 = -62;
            if (r0 < r12) goto L_0x004f;
        L_0x0043:
            r0 = r2 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            if (r12 <= r6) goto L_0x004c;
        L_0x004b:
            goto L_0x004f;
        L_0x004c:
            r2 = r0;
            goto L_0x00c5;
        L_0x004f:
            return r5;
        L_0x0050:
            r9 = -16;
            if (r0 >= r9) goto L_0x0082;
        L_0x0054:
            r12 = r12 >> 8;
            r12 = r12 ^ r5;
            r12 = (byte) r12;
            if (r12 != 0) goto L_0x0069;
        L_0x005a:
            r9 = r2 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1));
            if (r1 < 0) goto L_0x006a;
        L_0x0064:
            r12 = com.google.protobuf.Utf8.incompleteStateFor(r0, r12);
            return r12;
        L_0x0069:
            r9 = r2;
        L_0x006a:
            if (r12 > r6) goto L_0x0081;
        L_0x006c:
            r1 = -96;
            if (r0 != r4) goto L_0x0072;
        L_0x0070:
            if (r12 < r1) goto L_0x0081;
        L_0x0072:
            r2 = -19;
            if (r0 != r2) goto L_0x0078;
        L_0x0076:
            if (r12 >= r1) goto L_0x0081;
        L_0x0078:
            r12 = 0;
            r2 = r9 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r9);
            if (r12 <= r6) goto L_0x00c5;
        L_0x0081:
            return r5;
        L_0x0082:
            r4 = r12 >> 8;
            r4 = r4 ^ r5;
            r4 = (byte) r4;
            if (r4 != 0) goto L_0x0097;
        L_0x0088:
            r9 = r2 + r7;
            r4 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1));
            if (r12 < 0) goto L_0x009b;
        L_0x0092:
            r12 = com.google.protobuf.Utf8.incompleteStateFor(r0, r4);
            return r12;
        L_0x0097:
            r12 = r12 >> 16;
            r1 = (byte) r12;
            r9 = r2;
        L_0x009b:
            if (r1 != 0) goto L_0x00ae;
        L_0x009d:
            r1 = r9 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r9);
            r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1));
            if (r3 < 0) goto L_0x00ac;
        L_0x00a7:
            r12 = com.google.protobuf.Utf8.incompleteStateFor(r0, r4, r12);
            return r12;
        L_0x00ac:
            r9 = r1;
            goto L_0x00af;
        L_0x00ae:
            r12 = r1;
        L_0x00af:
            if (r4 > r6) goto L_0x00c4;
        L_0x00b1:
            r0 = r0 << 28;
            r4 = r4 + 112;
            r0 = r0 + r4;
            r0 = r0 >> 30;
            if (r0 != 0) goto L_0x00c4;
        L_0x00ba:
            if (r12 > r6) goto L_0x00c4;
        L_0x00bc:
            r2 = r9 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r9);
            if (r12 <= r6) goto L_0x00c5;
        L_0x00c4:
            return r5;
        L_0x00c5:
            r12 = 0;
            r0 = r14 - r2;
            r12 = (int) r0;
            r12 = partialIsValidUtf8(r13, r2, r12);
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
            r10 = this;
            r0 = r13 | r14;
            r1 = r12.limit();
            r1 = r1 - r14;
            r0 = r0 | r1;
            r1 = 0;
            if (r0 >= 0) goto L_0x0032;
        L_0x000b:
            r11 = new java.lang.ArrayIndexOutOfBoundsException;
            r0 = "buffer limit=%d, index=%d, limit=%d";
            r2 = 3;
            r2 = new java.lang.Object[r2];
            r12 = r12.limit();
            r12 = java.lang.Integer.valueOf(r12);
            r2[r1] = r12;
            r12 = 1;
            r13 = java.lang.Integer.valueOf(r13);
            r2[r12] = r13;
            r12 = 2;
            r13 = java.lang.Integer.valueOf(r14);
            r2[r12] = r13;
            r12 = java.lang.String.format(r0, r2);
            r11.<init>(r12);
            throw r11;
        L_0x0032:
            r2 = com.google.protobuf.UnsafeUtil.addressOffset(r12);
            r4 = (long) r13;
            r6 = r2 + r4;
            r14 = r14 - r13;
            r12 = (long) r14;
            r2 = r6 + r12;
            if (r11 == 0) goto L_0x00cf;
        L_0x003f:
            r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r12 < 0) goto L_0x0044;
        L_0x0043:
            return r11;
        L_0x0044:
            r12 = (byte) r11;
            r13 = -32;
            r14 = -1;
            r0 = -65;
            r4 = 1;
            if (r12 >= r13) goto L_0x005b;
        L_0x004e:
            r11 = -62;
            if (r12 < r11) goto L_0x005a;
        L_0x0052:
            r11 = r6 + r4;
            r13 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r13 <= r0) goto L_0x00d0;
        L_0x005a:
            return r14;
        L_0x005b:
            r8 = -16;
            if (r12 >= r8) goto L_0x008d;
        L_0x005f:
            r11 = r11 >> 8;
            r11 = r11 ^ r14;
            r11 = (byte) r11;
            if (r11 != 0) goto L_0x0075;
        L_0x0065:
            r8 = r6 + r4;
            r11 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
            if (r1 < 0) goto L_0x0074;
        L_0x006f:
            r11 = com.google.protobuf.Utf8.incompleteStateFor(r12, r11);
            return r11;
        L_0x0074:
            r6 = r8;
        L_0x0075:
            if (r11 > r0) goto L_0x008c;
        L_0x0077:
            r1 = -96;
            if (r12 != r13) goto L_0x007d;
        L_0x007b:
            if (r11 < r1) goto L_0x008c;
        L_0x007d:
            r13 = -19;
            if (r12 != r13) goto L_0x0083;
        L_0x0081:
            if (r11 >= r1) goto L_0x008c;
        L_0x0083:
            r11 = 0;
            r11 = r6 + r4;
            r13 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r13 <= r0) goto L_0x00d0;
        L_0x008c:
            return r14;
        L_0x008d:
            r13 = r11 >> 8;
            r13 = r13 ^ r14;
            r13 = (byte) r13;
            if (r13 != 0) goto L_0x00a4;
        L_0x0093:
            r8 = r6 + r4;
            r13 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
            if (r11 < 0) goto L_0x00a2;
        L_0x009d:
            r11 = com.google.protobuf.Utf8.incompleteStateFor(r12, r13);
            return r11;
        L_0x00a2:
            r6 = r8;
            goto L_0x00a7;
        L_0x00a4:
            r11 = r11 >> 16;
            r1 = (byte) r11;
        L_0x00a7:
            if (r1 != 0) goto L_0x00b9;
        L_0x00a9:
            r8 = r6 + r4;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
            if (r11 < 0) goto L_0x00b8;
        L_0x00b3:
            r11 = com.google.protobuf.Utf8.incompleteStateFor(r12, r13, r1);
            return r11;
        L_0x00b8:
            r6 = r8;
        L_0x00b9:
            if (r13 > r0) goto L_0x00ce;
        L_0x00bb:
            r11 = r12 << 28;
            r13 = r13 + 112;
            r11 = r11 + r13;
            r11 = r11 >> 30;
            if (r11 != 0) goto L_0x00ce;
        L_0x00c4:
            if (r1 > r0) goto L_0x00ce;
        L_0x00c6:
            r11 = r6 + r4;
            r13 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r13 <= r0) goto L_0x00d0;
        L_0x00ce:
            return r14;
        L_0x00cf:
            r11 = r6;
        L_0x00d0:
            r13 = 0;
            r13 = r2 - r11;
            r13 = (int) r13;
            r11 = partialIsValidUtf8(r11, r13);
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            CharSequence charSequence2 = charSequence;
            byte[] bArr2 = bArr;
            int i3 = i;
            int i4 = i2;
            long j = (long) i3;
            long j2 = j + ((long) i4);
            int length = charSequence.length();
            if (length <= i4) {
                if (bArr2.length - i4 >= i3) {
                    char charAt;
                    long j3;
                    i3 = 0;
                    while (i3 < length) {
                        charAt = charSequence2.charAt(i3);
                        if (charAt >= '') {
                            break;
                        }
                        j3 = j + 1;
                        UnsafeUtil.putByte(bArr2, j, (byte) charAt);
                        i3++;
                        j = j3;
                    }
                    if (i3 == length) {
                        return (int) j;
                    }
                    while (i3 < length) {
                        charAt = charSequence2.charAt(i3);
                        if (charAt < '' && j < j2) {
                            j3 = j + 1;
                            UnsafeUtil.putByte(bArr2, j, (byte) charAt);
                        } else if (charAt < 'ࠀ' && j <= j2 - 2) {
                            j3 = j + 1;
                            UnsafeUtil.putByte(bArr2, j, (byte) ((charAt >>> 6) | 960));
                            j = j3 + 1;
                            UnsafeUtil.putByte(bArr2, j3, (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                            i3++;
                        } else if ((charAt < '?' || '?' < charAt) && j <= j2 - 3) {
                            j3 = j + 1;
                            UnsafeUtil.putByte(bArr2, j, (byte) ((charAt >>> 12) | 480));
                            j = j3 + 1;
                            UnsafeUtil.putByte(bArr2, j3, (byte) (((charAt >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                            j3 = j + 1;
                            UnsafeUtil.putByte(bArr2, j, (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                        } else if (j <= j2 - 4) {
                            int i5 = i3 + 1;
                            if (i5 != length) {
                                char charAt2 = charSequence2.charAt(i5);
                                if (Character.isSurrogatePair(charAt, charAt2)) {
                                    i3 = Character.toCodePoint(charAt, charAt2);
                                    long j4 = j + 1;
                                    UnsafeUtil.putByte(bArr2, j, (byte) ((i3 >>> 18) | 240));
                                    j = j4 + 1;
                                    UnsafeUtil.putByte(bArr2, j4, (byte) (((i3 >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                    j4 = j + 1;
                                    UnsafeUtil.putByte(bArr2, j, (byte) (((i3 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                    j = j4 + 1;
                                    UnsafeUtil.putByte(bArr2, j4, (byte) ((i3 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                    i3 = i5;
                                    i3++;
                                }
                            } else {
                                i5 = i3;
                            }
                            throw new UnpairedSurrogateException(i5 - 1, length);
                        } else {
                            if ('?' <= charAt && charAt <= '?') {
                                int i6 = i3 + 1;
                                if (i6 == length || !Character.isSurrogatePair(charAt, charSequence2.charAt(i6))) {
                                    throw new UnpairedSurrogateException(i3, length);
                                }
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Failed writing ");
                            stringBuilder.append(charAt);
                            stringBuilder.append(" at index ");
                            stringBuilder.append(j);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                        j = j3;
                        i3++;
                    }
                    return (int) j;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Failed writing ");
            stringBuilder2.append(charSequence2.charAt(length - 1));
            stringBuilder2.append(" at index ");
            stringBuilder2.append(i3 + i4);
            throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
        }

        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            CharSequence charSequence2 = charSequence;
            ByteBuffer byteBuffer2 = byteBuffer;
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long position = addressOffset + ((long) byteBuffer.position());
            long limit = addressOffset + ((long) byteBuffer.limit());
            int length = charSequence.length();
            if (((long) length) > limit - position) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed writing ");
                stringBuilder.append(charSequence2.charAt(length - 1));
                stringBuilder.append(" at index ");
                stringBuilder.append(byteBuffer.limit());
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            int i = 0;
            while (true) {
                char c = '';
                long j = 1;
                if (i >= length) {
                    break;
                }
                char charAt = charSequence2.charAt(i);
                if (charAt >= '') {
                    break;
                }
                long j2 = position + 1;
                UnsafeUtil.putByte(position, (byte) charAt);
                i++;
                position = j2;
            }
            if (i == length) {
                byteBuffer2.position((int) (position - addressOffset));
                return;
            }
            while (i < length) {
                long j3;
                long j4;
                charAt = charSequence2.charAt(i);
                if (charAt < c && position < limit) {
                    j2 = position + j;
                    UnsafeUtil.putByte(position, (byte) charAt);
                    position = j;
                    j3 = j2;
                } else if (charAt < 'ࠀ' && position <= limit - 2) {
                    j2 = position + j;
                    UnsafeUtil.putByte(position, (byte) ((charAt >>> 6) | 960));
                    position = j2 + j;
                    UnsafeUtil.putByte(j2, (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    j3 = position;
                    position = j;
                    i++;
                    c = '';
                    j4 = position;
                    position = j3;
                    j = j4;
                } else if ((charAt < '?' || '?' < charAt) && position <= limit - 3) {
                    j2 = position + j;
                    UnsafeUtil.putByte(position, (byte) ((charAt >>> 12) | 480));
                    position = j2 + j;
                    UnsafeUtil.putByte(j2, (byte) (((charAt >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    long j5 = position + 1;
                    UnsafeUtil.putByte(position, (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    j3 = j5;
                    position = 1;
                } else if (position <= limit - 4) {
                    int i2 = i + 1;
                    if (i2 != length) {
                        char charAt2 = charSequence2.charAt(i2);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            i = Character.toCodePoint(charAt, charAt2);
                            long j6 = position + 1;
                            UnsafeUtil.putByte(position, (byte) ((i >>> 18) | 240));
                            position = j6 + 1;
                            UnsafeUtil.putByte(j6, (byte) (((i >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                            j2 = position + 1;
                            UnsafeUtil.putByte(position, (byte) (((i >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                            position = 1;
                            j3 = j2 + 1;
                            UnsafeUtil.putByte(j2, (byte) ((i & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                            i = i2;
                            i++;
                            c = '';
                            j4 = position;
                            position = j3;
                            j = j4;
                        } else {
                            i = i2;
                        }
                    }
                    throw new UnpairedSurrogateException(i - 1, length);
                } else {
                    if ('?' <= charAt && charAt <= '?') {
                        int i3 = i + 1;
                        if (i3 == length || !Character.isSurrogatePair(charAt, charSequence2.charAt(i3))) {
                            throw new UnpairedSurrogateException(i, length);
                        }
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Failed writing ");
                    stringBuilder2.append(charAt);
                    stringBuilder2.append(" at index ");
                    stringBuilder2.append(position);
                    throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
                }
                i++;
                c = '';
                j4 = position;
                position = j3;
                j = j4;
            }
            byteBuffer2.position((int) (position - addressOffset));
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = j + 1;
                if (UnsafeUtil.getByte(bArr, j) < null) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            long j2 = j;
            j = i2;
            while (j > null) {
                long j3 = j2 + 1;
                if (UnsafeUtil.getByte(j2) < (byte) 0) {
                    return i2 - j;
                }
                j--;
                j2 = j3;
            }
            j = i - i2;
            while (j >= 8 && (UnsafeUtil.getLong(j2) & Utf8.ASCII_MASK_LONG) == 0) {
                j -= 8;
                j2 += 8;
            }
            return i - j;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int partialIsValidUtf8(byte[] r8, long r9, int r11) {
            /*
            r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11);
            r11 = r11 - r0;
            r0 = (long) r0;
            r2 = r9 + r0;
        L_0x0008:
            r9 = 0;
            r10 = 0;
        L_0x000a:
            r0 = 1;
            if (r11 <= 0) goto L_0x001b;
        L_0x000e:
            r4 = r2 + r0;
            r10 = com.google.protobuf.UnsafeUtil.getByte(r8, r2);
            if (r10 < 0) goto L_0x001a;
        L_0x0016:
            r11 = r11 + -1;
            r2 = r4;
            goto L_0x000a;
        L_0x001a:
            r2 = r4;
        L_0x001b:
            if (r11 != 0) goto L_0x001e;
        L_0x001d:
            return r9;
        L_0x001e:
            r11 = r11 + -1;
            r9 = -32;
            r4 = -65;
            r5 = -1;
            if (r10 >= r9) goto L_0x003c;
        L_0x0027:
            if (r11 != 0) goto L_0x002a;
        L_0x0029:
            return r10;
        L_0x002a:
            r11 = r11 + -1;
            r9 = -62;
            if (r10 < r9) goto L_0x003b;
        L_0x0030:
            r9 = r2 + r0;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r8, r2);
            if (r0 <= r4) goto L_0x0039;
        L_0x0038:
            goto L_0x003b;
        L_0x0039:
            r2 = r9;
            goto L_0x0008;
        L_0x003b:
            return r5;
        L_0x003c:
            r6 = -16;
            if (r10 >= r6) goto L_0x0068;
        L_0x0040:
            r6 = 2;
            if (r11 >= r6) goto L_0x0048;
        L_0x0043:
            r8 = unsafeIncompleteStateFor(r8, r10, r2, r11);
            return r8;
        L_0x0048:
            r11 = r11 + -2;
            r6 = r2 + r0;
            r2 = com.google.protobuf.UnsafeUtil.getByte(r8, r2);
            if (r2 > r4) goto L_0x0067;
        L_0x0052:
            r3 = -96;
            if (r10 != r9) goto L_0x0058;
        L_0x0056:
            if (r2 < r3) goto L_0x0067;
        L_0x0058:
            r9 = -19;
            if (r10 != r9) goto L_0x005e;
        L_0x005c:
            if (r2 >= r3) goto L_0x0067;
        L_0x005e:
            r9 = 0;
            r9 = r6 + r0;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r8, r6);
            if (r0 <= r4) goto L_0x0039;
        L_0x0067:
            return r5;
        L_0x0068:
            r9 = 3;
            if (r11 >= r9) goto L_0x0070;
        L_0x006b:
            r8 = unsafeIncompleteStateFor(r8, r10, r2, r11);
            return r8;
        L_0x0070:
            r11 = r11 + -3;
            r6 = r2 + r0;
            r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r2);
            if (r9 > r4) goto L_0x0093;
        L_0x007a:
            r10 = r10 << 28;
            r9 = r9 + 112;
            r10 = r10 + r9;
            r9 = r10 >> 30;
            if (r9 != 0) goto L_0x0093;
        L_0x0083:
            r9 = r6 + r0;
            r2 = com.google.protobuf.UnsafeUtil.getByte(r8, r6);
            if (r2 > r4) goto L_0x0093;
        L_0x008b:
            r2 = r9 + r0;
            r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9);
            if (r9 <= r4) goto L_0x0008;
        L_0x0093:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int partialIsValidUtf8(long r8, int r10) {
            /*
            r0 = unsafeEstimateConsecutiveAscii(r8, r10);
            r1 = (long) r0;
            r3 = r8 + r1;
            r10 = r10 - r0;
        L_0x0008:
            r8 = 0;
            r9 = 0;
        L_0x000a:
            r0 = 1;
            if (r10 <= 0) goto L_0x001b;
        L_0x000e:
            r5 = r3 + r0;
            r9 = com.google.protobuf.UnsafeUtil.getByte(r3);
            if (r9 < 0) goto L_0x001a;
        L_0x0016:
            r10 = r10 + -1;
            r3 = r5;
            goto L_0x000a;
        L_0x001a:
            r3 = r5;
        L_0x001b:
            if (r10 != 0) goto L_0x001e;
        L_0x001d:
            return r8;
        L_0x001e:
            r10 = r10 + -1;
            r8 = -32;
            r2 = -65;
            r5 = -1;
            if (r9 >= r8) goto L_0x003c;
        L_0x0027:
            if (r10 != 0) goto L_0x002a;
        L_0x0029:
            return r9;
        L_0x002a:
            r10 = r10 + -1;
            r8 = -62;
            if (r9 < r8) goto L_0x003b;
        L_0x0030:
            r8 = r3 + r0;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r3);
            if (r0 <= r2) goto L_0x0039;
        L_0x0038:
            goto L_0x003b;
        L_0x0039:
            r3 = r8;
            goto L_0x0008;
        L_0x003b:
            return r5;
        L_0x003c:
            r6 = -16;
            if (r9 >= r6) goto L_0x0068;
        L_0x0040:
            r6 = 2;
            if (r10 >= r6) goto L_0x0048;
        L_0x0043:
            r8 = unsafeIncompleteStateFor(r3, r9, r10);
            return r8;
        L_0x0048:
            r10 = r10 + -2;
            r6 = r3 + r0;
            r3 = com.google.protobuf.UnsafeUtil.getByte(r3);
            if (r3 > r2) goto L_0x0067;
        L_0x0052:
            r4 = -96;
            if (r9 != r8) goto L_0x0058;
        L_0x0056:
            if (r3 < r4) goto L_0x0067;
        L_0x0058:
            r8 = -19;
            if (r9 != r8) goto L_0x005e;
        L_0x005c:
            if (r3 >= r4) goto L_0x0067;
        L_0x005e:
            r8 = 0;
            r8 = r6 + r0;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r0 <= r2) goto L_0x0039;
        L_0x0067:
            return r5;
        L_0x0068:
            r8 = 3;
            if (r10 >= r8) goto L_0x0070;
        L_0x006b:
            r8 = unsafeIncompleteStateFor(r3, r9, r10);
            return r8;
        L_0x0070:
            r10 = r10 + -3;
            r6 = r3 + r0;
            r8 = com.google.protobuf.UnsafeUtil.getByte(r3);
            if (r8 > r2) goto L_0x0093;
        L_0x007a:
            r9 = r9 << 28;
            r8 = r8 + 112;
            r9 = r9 + r8;
            r8 = r9 >> 30;
            if (r8 != 0) goto L_0x0093;
        L_0x0083:
            r8 = r6 + r0;
            r3 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r3 > r2) goto L_0x0093;
        L_0x008b:
            r3 = r8 + r0;
            r8 = com.google.protobuf.UnsafeUtil.getByte(r8);
            if (r8 <= r2) goto L_0x0008;
        L_0x0093:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            switch (i2) {
                case 0:
                    return Utf8.incompleteStateFor(i);
                case 1:
                    return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
                case 2:
                    return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j), (int) UnsafeUtil.getByte(bArr, j + 1));
                default:
                    throw new AssertionError();
            }
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            switch (i2) {
                case 0:
                    return Utf8.incompleteStateFor(i);
                case 1:
                    return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j));
                case 2:
                    return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j), (int) UnsafeUtil.getByte(j + 1));
                default:
                    throw new AssertionError();
            }
        }
    }

    private static int incompleteStateFor(int i) {
        return i > -12 ? -1 : i;
    }

    private static int incompleteStateFor(int i, int i2) {
        if (i <= -12) {
            if (i2 <= -65) {
                return i ^ (i2 << 8);
            }
        }
        return -1;
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65) {
            if (i3 <= -65) {
                return (i ^ (i2 << 8)) ^ (i3 << 16);
            }
        }
        return -1;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }

    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return incompleteStateFor(i3);
            case 1:
                return incompleteStateFor(i3, bArr[i]);
            case 2:
                return incompleteStateFor(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    private static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i2, int i3) {
        switch (i3) {
            case 0:
                return incompleteStateFor(i);
            case 1:
                return incompleteStateFor(i, byteBuffer.get(i2));
            case 2:
                return incompleteStateFor(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
            default:
                throw new AssertionError();
        }
    }

    static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < '') {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt >= 'ࠀ') {
                i2 += encodedLengthGeneral(charSequence, i);
                break;
            }
            i2 += (127 - charAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(((long) i2) + 4294967296L);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 'ࠀ') {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if ('?' <= charAt && charAt <= '?') {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    private static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
        i2 -= 7;
        int i3 = i;
        while (i3 < i2 && (byteBuffer.getLong(i3) & ASCII_MASK_LONG) == 0) {
            i3 += 8;
        }
        return i3 - i;
    }

    private Utf8() {
    }
}
