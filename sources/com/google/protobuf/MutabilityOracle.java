package com.google.protobuf;

interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new C69701();

    /* renamed from: com.google.protobuf.MutabilityOracle$1 */
    static class C69701 implements MutabilityOracle {
        C69701() {
        }

        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    }

    void ensureMutable();
}
