package com.zkejid.constructor.javasdk.concurrent.impl;

import com.zkejid.constructor.core.api.v1.ConstructionException;
import com.zkejid.constructor.core.api.v1.ConstructorPart;
import com.zkejid.constructor.javasdk.concurrent.api.v1.Executors;

import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class SdkExecutors implements Executors, ConstructorPart {

    @Override
    public Set<Class<?>> getInterfacesNecessary() {
        return Collections.emptySet();
    }

    @Override
    public Set<Class<?>> getInterfacesProvided() {
        return Collections.singleton(Executors.class);
    }

    @Override
    public Object getImplementation(Class<?> aClass) {
        if (Executors.class.equals(aClass)) {
            return this;
        } else {
            throw new ConstructionException("Unexpected " + aClass);
        }
    }

    @Override
    public void putImplementation(Class<?> aClass, Object ... o) {
        throw new ConstructionException("Module doesn't have dependencies");
    }

    @Override
    public void verifyNecessaryInterfaces() throws ConstructionException {
        // No-op
    }

    @Override
    public ExecutorService newFixedThreadPool(int nThreads) {
        return java.util.concurrent.Executors.newFixedThreadPool(nThreads);
    }

    @Override
    public ExecutorService newWorkStealingPool(int parallelism) {
        return java.util.concurrent.Executors.newWorkStealingPool(parallelism);
    }

    @Override
    public ExecutorService newWorkStealingPool() {
        return java.util.concurrent.Executors.newWorkStealingPool();
    }

    @Override
    public ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory) {
        return java.util.concurrent.Executors.newFixedThreadPool(nThreads, threadFactory);
    }

    @Override
    public ExecutorService newSingleThreadExecutor() {
        return java.util.concurrent.Executors.newSingleThreadExecutor();
    }

    @Override
    public ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(threadFactory);
    }

    @Override
    public ExecutorService newCachedThreadPool() {
        return java.util.concurrent.Executors.newCachedThreadPool();
    }

    @Override
    public ExecutorService newCachedThreadPool(ThreadFactory threadFactory) {
        return java.util.concurrent.Executors.newCachedThreadPool(threadFactory);
    }

    @Override
    public ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    }

    @Override
    public ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(threadFactory);
    }

    @Override
    public ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
        return java.util.concurrent.Executors.newScheduledThreadPool(corePoolSize);
    }

    @Override
    public ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory) {
        return java.util.concurrent.Executors.newScheduledThreadPool(corePoolSize, threadFactory);
    }

    @Override
    public ExecutorService unconfigurableExecutorService(ExecutorService executor) {
        return java.util.concurrent.Executors.unconfigurableExecutorService(executor);
    }

    @Override
    public ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor) {
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(executor);
    }

    @Override
    public ThreadFactory defaultThreadFactory() {
        return java.util.concurrent.Executors.defaultThreadFactory();
    }

    @Override
    public ThreadFactory privilegedThreadFactory() {
        return java.util.concurrent.Executors.privilegedThreadFactory();
    }

    @Override
    public <T> Callable<T> callable(Runnable task, T result) {
        return java.util.concurrent.Executors.callable(task, result);
    }

    @Override
    public Callable<Object> callable(Runnable task) {
        return java.util.concurrent.Executors.callable(task);
    }

    @Override
    public Callable<Object> callable(PrivilegedAction<?> action) {
        return java.util.concurrent.Executors.callable(action);
    }

    @Override
    public Callable<Object> callable(PrivilegedExceptionAction<?> action) {
        return java.util.concurrent.Executors.callable(action);
    }

    @Override
    public <T> Callable<T> privilegedCallable(Callable<T> callable) {
        return java.util.concurrent.Executors.privilegedCallable(callable);
    }

    @Override
    public <T> Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> callable) {
        return java.util.concurrent.Executors.privilegedCallableUsingCurrentClassLoader(callable);
    }

}
