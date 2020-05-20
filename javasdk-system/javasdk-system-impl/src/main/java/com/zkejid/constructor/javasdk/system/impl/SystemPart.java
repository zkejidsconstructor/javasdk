package com.zkejid.constructor.javasdk.system.impl;

import com.zkejid.constructor.core.api.v1.ConstructionException;
import com.zkejid.constructor.core.api.v1.ConstructorPart;
import com.zkejid.constructor.javasdk.system.api.v1.System;

import java.util.Collections;
import java.util.Set;

public class SystemPart implements ConstructorPart {
    @Override
    public Set<Class<?>> getInterfacesNecessary() {
        return Collections.emptySet();
    }

    @Override
    public Set<Class<?>> getInterfacesProvided() {
        return Collections.singleton(System.class);
    }

    @Override
    public Object getImplementation(Class<?> aClass) {
        return new SdkSystem();
    }

    @Override
    public void putImplementation(Class<?> aClass, Object ... o) {
        // No-op
    }

    @Override
    public void verifyNecessaryInterfaces() throws ConstructionException {
        // No-op
    }
}
