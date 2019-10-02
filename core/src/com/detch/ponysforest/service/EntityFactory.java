package com.detch.ponysforest.service;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;

public abstract class EntityFactory {

    PooledEngine engine;

    EntityFactory(PooledEngine engine) {
        this.engine = engine;
    }

    public abstract Entity createEntity();
}