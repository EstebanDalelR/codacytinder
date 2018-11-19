package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public static final LazyStringList EMPTY = new LazyStringArrayList().getUnmodifiableView();
    private final List<Object> list;

    public LazyStringArrayList() {
        this.list = new ArrayList();
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.list = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8;
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i, toStringUtf8);
            }
            return toStringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        toStringUtf8 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(i, toStringUtf8);
        }
        return toStringUtf8;
    }

    public int size() {
        return this.list.size();
    }

    public String set(int i, String str) {
        return asString(this.list.set(i, str));
    }

    public void add(int i, String str) {
        this.list.add(i, str);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        i = this.list.addAll(i, collection);
        this.modCount++;
        return i;
    }

    public String remove(int i) {
        i = this.list.remove(i);
        this.modCount++;
        return asString(i);
    }

    public void clear() {
        this.list.clear();
        this.modCount++;
    }

    public void add(ByteString byteString) {
        this.list.add(byteString);
        this.modCount++;
    }

    public ByteString getByteString(int i) {
        ByteString byteString = this.list.get(i);
        ByteString asByteString = asByteString(byteString);
        if (asByteString != byteString) {
            this.list.set(i, asByteString);
        }
        return asByteString;
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    private static ByteString asByteString(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.copyFromUtf8((String) obj);
        }
        return ByteString.copyFrom((byte[]) obj);
    }

    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    public LazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }
}
