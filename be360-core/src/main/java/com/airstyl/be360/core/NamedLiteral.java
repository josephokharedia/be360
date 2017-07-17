package com.airstyl.be360.core;

/*
 * Copyright (c) 2017, Airstyl and/or its affiliates. All rights reserved.
 * AIRSTYL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Created by Joseph Okharedia on 2017-07-17.
 */

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Named;

public class NamedLiteral extends AnnotationLiteral<Named> implements Named {

    private String value;

    public NamedLiteral(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
