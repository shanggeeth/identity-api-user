/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.rest.api.user.association.v1.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.rest.api.user.association.v1.dto.BulkAssociationOperationResponseDTO;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ApiModel(description = "")
public class BulkFederatedAssociationResponseDTO {

    @Valid 
    private List<BulkAssociationOperationResponseDTO> operations = new ArrayList<BulkAssociationOperationResponseDTO>();

    /**
    **/
    @ApiModelProperty(value = "")
    @JsonProperty("operations")
    public List<BulkAssociationOperationResponseDTO> getOperations() {
        return operations;
    }
    public void setOperations(List<BulkAssociationOperationResponseDTO> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class BulkFederatedAssociationResponseDTO {\n");
        
        sb.append("    operations: ").append(operations).append("\n");
        
        sb.append("}\n");
        return sb.toString();
    }
}
