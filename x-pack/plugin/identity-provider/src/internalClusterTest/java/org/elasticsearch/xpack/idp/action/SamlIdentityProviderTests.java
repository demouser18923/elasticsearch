/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.idp.action;

import org.elasticsearch.test.ESIntegTestCase;
import org.elasticsearch.xpack.idp.saml.support.SamlFactory;
import org.elasticsearch.xpack.idp.saml.test.IdentityProviderIntegTestCase;

@ESIntegTestCase.ClusterScope(scope = ESIntegTestCase.Scope.SUITE, numClientNodes = 0, numDataNodes = 0)
public class SamlIdentityProviderTests extends IdentityProviderIntegTestCase {

    private final SamlFactory samlFactory = new SamlFactory();
}
