package com.google.zxing;

import java.util.Map;

public interface Reader {
    C5674f decode(C5659b c5659b) throws NotFoundException, ChecksumException, FormatException;

    C5674f decode(C5659b c5659b, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    void reset();
}
