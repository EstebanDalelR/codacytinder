package kotlin.reflect.jvm.internal.pcollections;

final class IntTree<V> {
    static final IntTree<Object> EMPTYNODE = new IntTree();
    private final long key;
    private final IntTree<V> left;
    private final IntTree<V> right;
    private final int size;
    private final V value;

    private IntTree() {
        this.size = 0;
        this.key = 0;
        this.value = null;
        this.left = null;
        this.right = null;
    }

    private IntTree(long j, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        this.key = j;
        this.value = v;
        this.left = intTree;
        this.right = intTree2;
        this.size = (intTree.size + 1) + intTree2.size;
    }

    private IntTree<V> withKey(long j) {
        if (this.size != 0) {
            if (j != this.key) {
                return new IntTree(j, this.value, this.left, this.right);
            }
        }
        return this;
    }

    V get(long j) {
        if (this.size == 0) {
            return null;
        }
        if (j < this.key) {
            return this.left.get(j - this.key);
        }
        if (j > this.key) {
            return this.right.get(j - this.key);
        }
        return this.value;
    }

    IntTree<V> plus(long j, V v) {
        if (this.size == 0) {
            return new IntTree(j, v, this, this);
        }
        if (j < this.key) {
            return rebalanced(this.left.plus(j - this.key, v), this.right);
        }
        if (j > this.key) {
            return rebalanced(this.left, this.right.plus(j - this.key, v));
        }
        if (v == this.value) {
            return this;
        }
        return new IntTree(j, v, this.left, this.right);
    }

    IntTree<V> minus(long j) {
        if (this.size == 0) {
            return this;
        }
        if (j < this.key) {
            return rebalanced(this.left.minus(j - this.key), this.right);
        }
        if (j > this.key) {
            return rebalanced(this.left, this.right.minus(j - this.key));
        }
        if (this.left.size == null) {
            return this.right.withKey(this.right.key + this.key);
        }
        if (this.right.size == null) {
            return this.left.withKey(this.left.key + this.key);
        }
        long minKey = this.right.minKey() + this.key;
        j = this.right.get(minKey - this.key);
        IntTree minus = this.right.minus(minKey - this.key);
        return rebalanced(minKey, j, this.left.withKey((this.left.key + this.key) - minKey), minus.withKey((minus.key + this.key) - minKey));
    }

    private long minKey() {
        if (this.left.size == 0) {
            return this.key;
        }
        return this.left.minKey() + this.key;
    }

    private IntTree<V> rebalanced(IntTree<V> intTree, IntTree<V> intTree2) {
        if (intTree == this.left && intTree2 == this.right) {
            return this;
        }
        return rebalanced(this.key, this.value, intTree, intTree2);
    }

    private static <V> IntTree<V> rebalanced(long j, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        IntTree<V> intTree3 = intTree;
        IntTree<V> intTree4 = intTree2;
        if (intTree3.size + intTree4.size > 1) {
            IntTree intTree5;
            if (intTree3.size >= intTree4.size * 5) {
                IntTree intTree6 = intTree3.left;
                intTree5 = intTree3.right;
                if (intTree5.size < intTree6.size * 2) {
                    return new IntTree(intTree3.key + j, intTree3.value, intTree6, new IntTree(-intTree3.key, v, intTree5.withKey(intTree5.key + intTree3.key), intTree4));
                }
                IntTree intTree7 = intTree5.left;
                IntTree intTree8 = intTree5.right;
                long j2 = (intTree5.key + intTree3.key) + j;
                return new IntTree(j2, intTree5.value, new IntTree(-intTree5.key, intTree3.value, intTree6, intTree7.withKey(intTree7.key + intTree5.key)), new IntTree((-intTree3.key) - intTree5.key, v, intTree8.withKey((intTree8.key + intTree5.key) + intTree3.key), intTree4));
            } else if (intTree4.size >= intTree3.size * 5) {
                IntTree intTree9 = intTree4.left;
                IntTree intTree10 = intTree4.right;
                if (intTree9.size < intTree10.size * 2) {
                    long j3 = intTree4.key + j;
                    return new IntTree(j3, intTree4.value, new IntTree(-intTree4.key, v, intTree3, intTree9.withKey(intTree9.key + intTree4.key)), intTree10);
                }
                intTree5 = intTree9.left;
                IntTree intTree11 = intTree9.right;
                long j4 = (intTree9.key + intTree4.key) + j;
                return new IntTree(j4, intTree9.value, new IntTree((-intTree4.key) - intTree9.key, v, intTree3, intTree5.withKey((intTree5.key + intTree9.key) + intTree4.key)), new IntTree(-intTree9.key, intTree4.value, intTree11.withKey(intTree11.key + intTree9.key), intTree10));
            }
        }
        return new IntTree(j, v, intTree3, intTree4);
    }
}
