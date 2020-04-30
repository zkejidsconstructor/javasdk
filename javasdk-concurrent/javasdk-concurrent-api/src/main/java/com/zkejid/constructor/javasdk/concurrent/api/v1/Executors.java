package com.zkejid.constructor.javasdk.concurrent.api.v1;

import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/**
 * Delegate to static methods of {@link java.util.concurrent.Executors}.
 */
public interface Executors {

    /**
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    ExecutorService newFixedThreadPool(int nThreads);

    /**
     * @see java.util.concurrent.Executors#newWorkStealingPool(int)
     */
    ExecutorService newWorkStealingPool(int parallelism);

    /**
     * @see java.util.concurrent.Executors#newWorkStealingPool()
     */
    ExecutorService newWorkStealingPool();

    /**
     * @see java.util.concurrent.Executors#newFixedThreadPool(int, ThreadFactory)
     */
    ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory);

    /**
     * @see java.util.concurrent.Executors#newSingleThreadExecutor()
     */
    ExecutorService newSingleThreadExecutor();

    /**
     * @see java.util.concurrent.Executors#newSingleThreadExecutor(ThreadFactory)
     */
    ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory);

    /**
     * @see java.util.concurrent.Executors#newCachedThreadPool()
     */
    ExecutorService newCachedThreadPool();

    /**
     * @see java.util.concurrent.Executors#newCachedThreadPool(ThreadFactory)
     */
    ExecutorService newCachedThreadPool(ThreadFactory threadFactory);

    /**
     * @see java.util.concurrent.Executors#newSingleThreadScheduledExecutor()
     */
    ScheduledExecutorService newSingleThreadScheduledExecutor();

    /**
     * @see java.util.concurrent.Executors#newSingleThreadScheduledExecutor(ThreadFactory)
     */
    ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory);

    /**
     * @see java.util.concurrent.Executors#newScheduledThreadPool(int)
     */
    ScheduledExecutorService newScheduledThreadPool(int corePoolSize);

    /**
     * @see java.util.concurrent.Executors#newScheduledThreadPool(int, ThreadFactory)
     */
    ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory);

    /**
     * @see java.util.concurrent.Executors#unconfigurableExecutorService(ExecutorService)
     */
    ExecutorService unconfigurableExecutorService(ExecutorService executor);

    /**
     * @see java.util.concurrent.Executors#unconfigurableScheduledExecutorService(ScheduledExecutorService)
     */
    ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor);

    /**
     * @see java.util.concurrent.Executors#defaultThreadFactory()
     */
    ThreadFactory defaultThreadFactory();

    /**
     * @see java.util.concurrent.Executors#privilegedThreadFactory()
     */
    ThreadFactory privilegedThreadFactory();

    /**
     * @see java.util.concurrent.Executors#callable(Runnable, Object)
     */
    <T> Callable<T> callable(Runnable task, T result);

    /**
     * @see java.util.concurrent.Executors#callable(Runnable)
     */
    Callable<Object> callable(Runnable task);

    /**
     * @see java.util.concurrent.Executors#callable(PrivilegedAction)
     */
    Callable<Object> callable(final PrivilegedAction<?> action);

    /**
     * @see java.util.concurrent.Executors#callable(PrivilegedExceptionAction)
     */
    Callable<Object> callable(final PrivilegedExceptionAction<?> action);

    /**
     * @see java.util.concurrent.Executors#privilegedCallable(Callable)
     */
    <T> Callable<T> privilegedCallable(Callable<T> callable);

    /**
     * @see java.util.concurrent.Executors#privilegedCallableUsingCurrentClassLoader(Callable)
     */
    <T> Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> callable);

}
