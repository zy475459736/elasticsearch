/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.security.action.privilege;

import org.elasticsearch.action.ActionRequest;
import org.elasticsearch.action.ActionRequestValidationException;

/**
 * Request to retrieve built-in (cluster/index) privileges.
 */
public final class GetBuiltinPrivilegesRequest extends ActionRequest {

    public GetBuiltinPrivilegesRequest() {
    }

    @Override
    public ActionRequestValidationException validate() {
        return null;
    }
}
