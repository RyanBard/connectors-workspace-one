/*
 * Project Service Now Connector
 * (c) 2019-2020 VMware, Inc. All rights reserved.
 * SPDX-License-Identifier: BSD-2-Clause
 */

package com.vmware.ws1connectors.servicenow.catalog.category.api.response.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Result {
    @JsonProperty("sys_id")
    private String sysId;
    @JsonProperty("desktop_image")
    private String desktopImage;
    @JsonProperty("has_categories")
    private boolean hasCategories;
    @JsonProperty("description")
    private String description;
    @JsonProperty("categories")
    private List<CategoriesItem> categories;
    @JsonProperty("title")
    private String title;
    @JsonProperty("has_items")
    private boolean hasItems;
}