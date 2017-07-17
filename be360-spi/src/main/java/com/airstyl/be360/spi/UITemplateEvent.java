package com.airstyl.be360.spi;

/*
 * Copyright (c) 2017, Airstyl and/or its affiliates. All rights reserved.
 * AIRSTYL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Created by Joseph Okharedia on 2017-07-06.
 */
public class UITemplateEvent {

    private String id;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
