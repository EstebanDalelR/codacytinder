package java8.util.stream;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.concurrent.ForkJoinPool;
import java8.util.function.IntFunction;
import java8.util.stream.Sink.ChainedReference;

final class DistinctOps {

    static final class KeysAndNullSet<E> extends AbstractSet<E> {
        /* renamed from: a */
        final Set<E> f48888a;
        /* renamed from: b */
        final int f48889b;

        /* renamed from: java8.util.stream.DistinctOps$KeysAndNullSet$1 */
        class C157741 implements Iterator<E> {
            /* renamed from: a */
            boolean f48885a = null;
            /* renamed from: b */
            final Iterator<E> f48886b = this.f48887c.f48888a.iterator();
            /* renamed from: c */
            final /* synthetic */ KeysAndNullSet f48887c;

            C157741(KeysAndNullSet keysAndNullSet) {
                this.f48887c = keysAndNullSet;
            }

            public boolean hasNext() {
                if (this.f48885a) {
                    return this.f48886b.hasNext();
                }
                return true;
            }

            public E next() {
                if (this.f48885a) {
                    return this.f48886b.next();
                }
                this.f48885a = true;
                return null;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        KeysAndNullSet(Set<E> set, int i) {
            this.f48888a = set;
            this.f48889b = i + 1;
        }

        public Iterator<E> iterator() {
            return new C157741(this);
        }

        public int size() {
            return this.f48889b;
        }
    }

    private DistinctOps() {
    }

    /* renamed from: a */
    static <T> ReferencePipeline<T, T> m59561a(AbstractPipeline<?, T, ?> abstractPipeline) {
        return new StatefulOp<T, T>(abstractPipeline, StreamShape.REFERENCE, StreamOpFlag.IS_DISTINCT | StreamOpFlag.NOT_SIZED) {
            /* renamed from: b */
            <P_IN> Node<T> m68256b(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
                return Nodes.m59619a((Collection) ReduceOps.m59665a(DistinctOps$1$$Lambda$1.m63963a(), DistinctOps$1$$Lambda$2.m63964a(), DistinctOps$1$$Lambda$3.m63965a()).mo12989b(pipelineHelper, spliterator));
            }

            /* renamed from: a */
            <P_IN> Node<T> mo14013a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<T[]> intFunction) {
                if (StreamOpFlag.DISTINCT.isKnown(pipelineHelper.mo12969c())) {
                    return pipelineHelper.mo12962a(spliterator, false, intFunction);
                }
                if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c()) != null) {
                    return m68256b(pipelineHelper, spliterator);
                }
                Collection keysAndNullSet;
                intFunction = new AtomicBoolean(false);
                ConcurrentMap concurrentHashMap = new ConcurrentHashMap(512, 0.75f, ForkJoinPool.m59246b() + 1);
                ForEachOps.m59566a(DistinctOps$1$$Lambda$4.m63966a(intFunction, concurrentHashMap), false).mo12989b(pipelineHelper, spliterator);
                pipelineHelper = concurrentHashMap.keySet();
                if (intFunction.get() != null) {
                    spliterator = pipelineHelper.size();
                    if (spliterator >= 127) {
                        keysAndNullSet = new KeysAndNullSet(pipelineHelper, spliterator);
                    } else {
                        keysAndNullSet = new HashSet(Math.max(((int) (((float) (spliterator + 1)) / 1061158912)) + 1, 16));
                        keysAndNullSet.addAll(pipelineHelper);
                        keysAndNullSet.add(null);
                    }
                } else {
                    keysAndNullSet = pipelineHelper;
                }
                return Nodes.m59619a(keysAndNullSet);
            }

            /* renamed from: b */
            private static /* synthetic */ void m68252b(AtomicBoolean atomicBoolean, ConcurrentMap concurrentMap, Object obj) {
                if (obj == null) {
                    atomicBoolean.set(true);
                } else {
                    concurrentMap.putIfAbsent(obj, Boolean.TRUE);
                }
            }

            /* renamed from: a */
            <P_IN> Spliterator<T> mo14145a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.DISTINCT.isKnown(pipelineHelper.mo12969c())) {
                    return pipelineHelper.mo12966b(spliterator);
                }
                if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return m68256b(pipelineHelper, spliterator).y_();
                }
                return new DistinctSpliterator(pipelineHelper.mo12966b(spliterator));
            }

            /* renamed from: a */
            Sink<T> mo14011a(int i, Sink<T> sink) {
                Objects.m59115b(sink);
                if (StreamOpFlag.DISTINCT.isKnown(i)) {
                    return sink;
                }
                return StreamOpFlag.SORTED.isKnown(i) != 0 ? new ChainedReference<T, T>(this, sink) {
                    /* renamed from: a */
                    boolean f59226a;
                    /* renamed from: b */
                    T f59227b;
                    /* renamed from: c */
                    final /* synthetic */ C192011 f59228c;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.f59226a = 0;
                        this.f59227b = 0;
                        this.d.mo13608a(-1);
                    }

                    public void z_() {
                        this.f59226a = false;
                        this.f59227b = null;
                        this.d.z_();
                    }

                    public void accept(T t) {
                        if (t == null) {
                            if (this.f59226a == null) {
                                this.f59226a = true;
                                t = this.d;
                                this.f59227b = null;
                                t.accept(null);
                            }
                        } else if (this.f59227b == null || !t.equals(this.f59227b)) {
                            Sink sink = this.d;
                            this.f59227b = t;
                            sink.accept(t);
                        }
                    }
                } : new ChainedReference<T, T>(this, sink) {
                    /* renamed from: a */
                    Set<T> f59229a;
                    /* renamed from: b */
                    final /* synthetic */ C192011 f59230b;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.f59229a = new HashSet();
                        this.d.mo13608a(-1);
                    }

                    public void z_() {
                        this.f59229a = null;
                        this.d.z_();
                    }

                    public void accept(T t) {
                        if (!this.f59229a.contains(t)) {
                            this.f59229a.add(t);
                            this.d.accept(t);
                        }
                    }
                };
            }
        };
    }
}
