package com.tinder.recs.view.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/view/exception/UnexpectedImageIndexException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "index", "", "size", "(II)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class UnexpectedImageIndexException extends RuntimeException {
    public UnexpectedImageIndexException(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected: index = ");
        stringBuilder.append(i);
        stringBuilder.append(" but list size = ");
        stringBuilder.append(i2);
        super(stringBuilder.toString());
    }
}
