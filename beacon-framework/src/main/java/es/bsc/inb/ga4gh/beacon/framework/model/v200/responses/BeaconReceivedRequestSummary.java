/**
 * *****************************************************************************
 * Copyright (C) 2023 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
 * and Barcelona Supercomputing Center (BSC)
 *
 * Modifications to the initial code base are copyright of their respective
 * authors, or their employers as appropriate.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 * *****************************************************************************
 */

package es.bsc.inb.ga4gh.beacon.framework.model.v200.responses;

import es.bsc.inb.ga4gh.beacon.framework.model.v200.common.Pagination;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.common.SchemaPerEntity;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconRequestParameters;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 */

public class BeaconReceivedRequestSummary {
    
    private String api_version;
    private List<SchemaPerEntity> requested_schemas;
    private List<String> filters;
    private BeaconRequestParameters request_parameters;
    private String include_resultset_responses;
    private Pagination pagination;
    private String requested_granularity;
    private Boolean test_mode;

    public String getApiVersion() {
        return api_version;
    }

    public void setApiVersion(String api_version) {
        this.api_version = api_version;
    }

    public List<SchemaPerEntity> getRequestedSchemas() {
        return requested_schemas;
    }

    public void setRequestedSchemas(List<SchemaPerEntity> requested_schemas) {
        this.requested_schemas = requested_schemas;
    }
    
    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    public BeaconRequestParameters getBeaconRequestParameters() {
        return request_parameters;
    }

    public void setBeaconRequestParameters(BeaconRequestParameters request_parameters) {
        this.request_parameters = request_parameters;
    }

    public String getIncludeResultsetResponses() {
        return include_resultset_responses;
    }

    public void setIncludeResultsetResponses(String include_resultset_responses) {
        this.include_resultset_responses = include_resultset_responses;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
    
    public String getRequestedGranularity() {
        return requested_granularity;
    }

    public void setRequestedGranularity(String requested_granularity) {
        this.requested_granularity = requested_granularity;
    }

    public Boolean getTestMode() {
        return test_mode;
    }
    
    public void setTestMode(Boolean test_mode) {
        this.test_mode = test_mode;
    }
}
