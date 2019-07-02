/*
 * Copyright © 2019 VMware, Inc. All Rights Reserved.
 * SPDX-License-Identifier: BSD-2-Clause
 */

package com.vmware.connector.hub.salesforce;

public class InvalidConfigParamException extends RuntimeException {
    public InvalidConfigParamException(String message) {
        super(message);
    }
}
