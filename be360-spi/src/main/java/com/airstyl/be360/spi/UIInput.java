package com.airstyl.be360.spi;

/*
 * Copyright (c) 2017, Airstyl and/or its affiliates. All rights reserved.
 * AIRSTYL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Created by Joseph Okharedia on 2017-07-17.
 */

public class UIInput {

    private String label;
    private String value;

    public UIInput(String label, String value){
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "UIInput{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
