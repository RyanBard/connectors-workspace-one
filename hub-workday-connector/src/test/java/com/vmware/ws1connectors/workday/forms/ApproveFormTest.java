/*
 * Project Workday Connector
 * (c) 2019-2020 VMware, Inc. All rights reserved.
 * SPDX-License-Identifier: BSD-2-Clause
 */
package com.vmware.ws1connectors.workday.forms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApproveFormTest {

    private static final String COMMENT = "comment";

    private ApproveForm approveForm;

    @BeforeEach public void setup() {
        approveForm = new ApproveForm(COMMENT);
    }

    @Test public void returnsComment() {
        assertThat(approveForm.getComment()).isEqualTo(COMMENT);
    }
}
