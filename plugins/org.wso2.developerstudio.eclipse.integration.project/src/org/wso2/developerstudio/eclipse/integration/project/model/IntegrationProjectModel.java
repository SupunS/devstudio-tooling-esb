/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.integration.project.model;

import java.io.File;

import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class IntegrationProjectModel extends ProjectDataModel {
    private File integrationConfigLocation;

    public void setLocation(File location) {
        // TODO Auto-generated method stub
        super.setLocation(location);
    }

    public File getLocation() {
        // TODO Auto-generated method stub
        return super.getLocation();
    }

    public Object getModelPropertyValue(String key) {
        Object modelPropertyValue = super.getModelPropertyValue(key);
        if (key.equals("integrationConfig.location")) {
            modelPropertyValue = getIntegrationConfigLocation();
        }
        return modelPropertyValue;
    }

    public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
        boolean isUiControlUpdated = super.setModelPropertyValue(key, data);
        if ("integrationConfig.location".equals(key)) {
            setIntegrationConfigLocation(new File(data.toString()));
        }
        return isUiControlUpdated;
    }

    public void setIntegrationConfigLocation(File synapseConfigLocation) {
        this.integrationConfigLocation = synapseConfigLocation;
    }

    public File getIntegrationConfigLocation() {
        return integrationConfigLocation;
    }
}
