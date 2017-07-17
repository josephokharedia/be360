package com.airstyl.be360.core;

/*
 * Copyright (c) 2017, Airstyl and/or its affiliates. All rights reserved.
 * AIRSTYL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Created by Joseph Okharedia on 2017-07-17.
 */

import com.airstyl.be360.spi.UITemplate;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("response")
public class UIResponse {

    private UITemplate template;

}
