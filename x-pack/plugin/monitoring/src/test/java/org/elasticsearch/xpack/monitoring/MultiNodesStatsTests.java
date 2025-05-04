/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */
package org.elasticsearch.xpack.monitoring;

import org.elasticsearch.test.ESIntegTestCase.ClusterScope;
import org.elasticsearch.test.ESIntegTestCase.Scope;
import org.elasticsearch.xpack.monitoring.test.MonitoringIntegTestCase;

@ClusterScope(scope = Scope.TEST, numDataNodes = 0, numClientNodes = 0)
public class MultiNodesStatsTests extends MonitoringIntegTestCase {}
