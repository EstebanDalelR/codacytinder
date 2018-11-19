package io.branch.referral;

import com.tinder.api.ManagerWebServices;

/* renamed from: io.branch.referral.b */
class C15579b {
    /* renamed from: a */
    public static int f48191a = 1048833;
    /* renamed from: b */
    public static int f48192b = 1048834;
    /* renamed from: c */
    public static int f48193c = 1048835;

    C15579b() {
    }

    /* renamed from: a */
    public String m58319a(byte[] bArr) {
        int i;
        int b = (m58322b(bArr, 16) * 4) + 36;
        int b2 = m58322b(bArr, 12);
        for (i = b2; i < bArr.length - 4; i += 4) {
            if (m58322b(bArr, i) == f48192b) {
                b2 = i;
                break;
            }
        }
        while (b2 < bArr.length) {
            i = m58322b(bArr, b2);
            if (i != f48192b) {
                if (i != f48193c) {
                    bArr = f48191a;
                    break;
                }
                b2 += 24;
            } else {
                i = m58322b(bArr, b2 + 28);
                b2 += 36;
                for (int i2 = 0; i2 < i; i2++) {
                    int b3 = m58322b(bArr, b2 + 4);
                    int b4 = m58322b(bArr, b2 + 8);
                    int b5 = m58322b(bArr, b2 + 16);
                    b2 += 20;
                    if (m58321a(bArr, 36, b, b3).equals("scheme")) {
                        String a;
                        if (b4 != -1) {
                            a = m58321a(bArr, 36, b, b4);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("resourceID 0x");
                            stringBuilder.append(Integer.toHexString(b5));
                            a = stringBuilder.toString();
                        }
                        if (m58318a(a)) {
                            return a;
                        }
                    }
                }
                continue;
            }
        }
        return "bnc_no_value";
    }

    /* renamed from: a */
    private boolean m58318a(String str) {
        return (str == null || str.equals("http") || str.equals("https") || str.equals("geo") || str.equals("*") || str.equals("package") || str.equals("sms") || str.equals("smsto") || str.equals("mms") || str.equals("mmsto") || str.equals("tel") || str.equals("voicemail") || str.equals(ManagerWebServices.PARAM_FILE) || str.equals("content") || str.equals("mailto") != null) ? null : true;
    }

    /* renamed from: a */
    public String m58321a(byte[] bArr, int i, int i2, int i3) {
        if (i3 < 0) {
            return null;
        }
        return m58320a(bArr, i2 + m58322b(bArr, i + (i3 * 4)));
    }

    /* renamed from: a */
    public String m58320a(byte[] bArr, int i) {
        int i2 = ((bArr[i + 1] << 8) & 65280) | (bArr[i] & 255);
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[(i + 2) + (i3 * 2)];
        }
        return new String(bArr2);
    }

    /* renamed from: b */
    public int m58322b(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((((bArr[i + 3] << 24) & -16777216) | ((bArr[i + 2] << 16) & 16711680)) | ((bArr[i + 1] << 8) & 65280));
    }
}
