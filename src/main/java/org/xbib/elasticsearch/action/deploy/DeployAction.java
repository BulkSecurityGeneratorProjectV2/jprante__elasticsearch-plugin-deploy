/*
 * Copyright 2014 Jörg Prante
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xbib.elasticsearch.action.deploy;

import org.elasticsearch.action.Action;
import org.elasticsearch.client.ElasticsearchClient;

public class DeployAction extends Action<DeployRequest, DeployResponse, DeployRequestBuilder> {

    public static final DeployAction INSTANCE = new DeployAction();

    public static final String NAME = "org.xbib.elasticsearch.action.deploy";

    private DeployAction() {
        super(NAME);
    }

    @Override
    public DeployRequestBuilder newRequestBuilder(ElasticsearchClient client) {
        return new DeployRequestBuilder(client);
    }

    @Override
    public DeployResponse newResponse() {
        return new DeployResponse();
    }
}
