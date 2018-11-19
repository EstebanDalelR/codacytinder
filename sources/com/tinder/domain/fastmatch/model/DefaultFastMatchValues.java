package com.tinder.domain.fastmatch.model;

import com.tinder.domain.fastmatch.model.FastMatchStatus.Source;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/domain/fastmatch/model/DefaultFastMatchValues;", "", "()V", "BOOST_NEW_COUNT_FETCH_INTERVAL", "", "HAS_SEEN_TUTORIAL", "", "IS_ENABLED", "IS_RANGE", "NEW_COUNT_FETCH_INTERVAL", "NEW_COUNT_RANGE_THRESHOLD", "", "NOTIFICATION_OPTIONS", "", "getNOTIFICATION_OPTIONS", "()Ljava/util/List;", "NOTIFICATION_SELECTION", "POLLING_MODE", "Lcom/tinder/domain/fastmatch/model/PollingMode;", "getPOLLING_MODE", "()Lcom/tinder/domain/fastmatch/model/PollingMode;", "PREVIEW_IMAGE_BYTES", "", "getPREVIEW_IMAGE_BYTES", "()[B", "PREVIEW_IMAGE_TIMESTAMP", "PREVIEW_MIN_TIME_IN_MILLIS", "SOURCE", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus$Source;", "getSOURCE", "()Lcom/tinder/domain/fastmatch/model/FastMatchStatus$Source;", "UNDEFINED_COUNT", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DefaultFastMatchValues {
    public static final long BOOST_NEW_COUNT_FETCH_INTERVAL = 2000;
    public static final boolean HAS_SEEN_TUTORIAL = false;
    public static final DefaultFastMatchValues INSTANCE = new DefaultFastMatchValues();
    public static final boolean IS_ENABLED = false;
    public static final boolean IS_RANGE = false;
    public static final long NEW_COUNT_FETCH_INTERVAL = 20000;
    public static final int NEW_COUNT_RANGE_THRESHOLD = 0;
    @NotNull
    private static final List<Integer> NOTIFICATION_OPTIONS;
    public static final int NOTIFICATION_SELECTION = 1;
    @NotNull
    private static final PollingMode POLLING_MODE = PollingMode.NONE;
    @Nullable
    private static final byte[] PREVIEW_IMAGE_BYTES = null;
    public static final long PREVIEW_IMAGE_TIMESTAMP = 0;
    public static final long PREVIEW_MIN_TIME_IN_MILLIS = 180000;
    @NotNull
    private static final Source SOURCE = Source.COUNT;
    public static final int UNDEFINED_COUNT = 0;

    static {
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(10), Integer.valueOf(100)}));
        C2668g.a(unmodifiableList, "Collections.unmodifiable…rrays.asList(1, 10, 100))");
        NOTIFICATION_OPTIONS = unmodifiableList;
    }

    private DefaultFastMatchValues() {
    }

    @Nullable
    public final byte[] getPREVIEW_IMAGE_BYTES() {
        return PREVIEW_IMAGE_BYTES;
    }

    @NotNull
    public final List<Integer> getNOTIFICATION_OPTIONS() {
        return NOTIFICATION_OPTIONS;
    }

    @NotNull
    public final PollingMode getPOLLING_MODE() {
        return POLLING_MODE;
    }

    @NotNull
    public final Source getSOURCE() {
        return SOURCE;
    }
}
