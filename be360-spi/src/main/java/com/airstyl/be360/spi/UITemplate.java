package com.airstyl.be360.spi;

/*
 * Copyright (c) 2017, Airstyl and/or its affiliates. All rights reserved.
 * AIRSTYL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Created by Joseph Okharedia on 2017-07-17.
 */

public abstract class UITemplate {

    public abstract static class BUILDER<T>{
        public abstract T build();
    }
}
