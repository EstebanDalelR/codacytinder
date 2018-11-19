package com.tinder.recs.view.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/recs/view/exception/UnexpectedImageIndexOnPhotoChangeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "index", "", "photoCountProfile", "photoCountUserRecCard", "isRecUserIdAndProfileUserIdEqual", "", "(IIIZ)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class UnexpectedImageIndexOnPhotoChangeException extends RuntimeException {
    public UnexpectedImageIndexOnPhotoChangeException(int i, int i2, int i3, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected: index=");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append("photoCountProfile=");
        stringBuilder.append(i2);
        stringBuilder.append(", ");
        stringBuilder.append("photoCountUserRecCard=");
        stringBuilder.append(i3);
        stringBuilder.append(", ");
        stringBuilder.append("isRecUserIdAndProfileUserIdEqual=");
        stringBuilder.append(z);
        super(stringBuilder.toString());
    }
}
