package com.google.zxing;

import com.google.zxing.aztec.C6993a;
import com.google.zxing.common.C5665b;
import com.google.zxing.datamatrix.C6994a;
import com.google.zxing.oned.C7003p;
import com.google.zxing.oned.C7803b;
import com.google.zxing.oned.C7806e;
import com.google.zxing.oned.C7808g;
import com.google.zxing.oned.C7810m;
import com.google.zxing.oned.C8099i;
import com.google.zxing.oned.C8100j;
import com.google.zxing.oned.C8102w;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.pdf417.C7004a;
import com.google.zxing.qrcode.C7005a;
import java.util.Map;

/* renamed from: com.google.zxing.e */
public final class C7000e implements Writer {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return encode(str, barcodeFormat, i, i2, null);
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        C6993a c8100j;
        switch (barcodeFormat) {
            case EAN_8:
                c8100j = new C8100j();
                break;
            case UPC_E:
                c8100j = new C8102w();
                break;
            case EAN_13:
                c8100j = new C8099i();
                break;
            case UPC_A:
                c8100j = new C7003p();
                break;
            case QR_CODE:
                c8100j = new C7005a();
                break;
            case CODE_39:
                c8100j = new C7806e();
                break;
            case CODE_93:
                c8100j = new C7808g();
                break;
            case CODE_128:
                c8100j = new Code128Writer();
                break;
            case ITF:
                c8100j = new C7810m();
                break;
            case PDF_417:
                c8100j = new C7004a();
                break;
            case CODABAR:
                c8100j = new C7803b();
                break;
            case DATA_MATRIX:
                c8100j = new C6994a();
                break;
            case AZTEC:
                c8100j = new C6993a();
                break;
            default:
                i = new StringBuilder("No encoder available for format ");
                i.append(barcodeFormat);
                throw new IllegalArgumentException(i.toString());
        }
        return c8100j.encode(str, barcodeFormat, i, i2, map);
    }
}
