package com.google.zxing.multi;

import com.google.zxing.C5659b;
import com.google.zxing.C5674f;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Map;

public interface MultipleBarcodeReader {
    C5674f[] decodeMultiple(C5659b c5659b) throws NotFoundException;

    C5674f[] decodeMultiple(C5659b c5659b, Map<DecodeHintType, ?> map) throws NotFoundException;
}
