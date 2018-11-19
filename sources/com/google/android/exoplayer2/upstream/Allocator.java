package com.google.android.exoplayer2.upstream;

public interface Allocator {
    C2278a allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(C2278a c2278a);

    void release(C2278a[] c2278aArr);

    void trim();
}
