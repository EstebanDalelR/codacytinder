package com.google.zxing;

import com.google.zxing.common.C5665b;
import java.util.Map;

public interface Writer {
    C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException;

    C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException;
}
