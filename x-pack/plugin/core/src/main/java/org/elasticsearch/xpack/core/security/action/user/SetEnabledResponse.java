/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.security.action.user;

import org.elasticsearch.action.ActionResponse;
import org.elasticsearch.common.io.stream.StreamOutput;

import java.io.IOException;

/**
 * Empty response for a {@link SetEnabledRequest}
 */
public class SetEnabledResponse extends ActionResponse {
    @Override
    public void writeTo(StreamOutput out) throws IOException {}
}
