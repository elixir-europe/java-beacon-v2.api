/**
 * *****************************************************************************
 * Copyright (C) 2025 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
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

package es.bsc.inb.ga4gh.beacon.framework;

import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconQueryFilterGroupInterface;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconRequestBody;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconResultsetsResponse;
import java.util.List;

/**
 * GA4GH Beacon API Specification - Runs Endpoints.
 * 
 * @author Dmitry Repchevsky
 */

public interface RunsInterface {

    /**
     * Get a list of sequencing runs.
     * 
     * @param requested_schema 
     *     schema to be used to format the 'result' field in the response
     * @param skip 
     *     number of pages to skip
     * @param limit 
     *     size of the page
     * @param include_responses
     * @param filters
     * 
     * @return 
     */
    BeaconResultsetsResponse getRuns(
            String requested_schema, Integer skip, Integer limit, 
            String include_responses, List<BeaconQueryFilterGroupInterface> filters);

    /**
     * Get a list of sequencing runs.
     * 
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postRunsRequest(BeaconRequestBody request);
    
    /**
     * Get details about one sequencing run, identified by its (unique) 'id'.
     * 
     * @param id
     * @return 
     */
    BeaconResultsetsResponse getOneRun(String id);
    
    /**
     * Get details about one sequencing run, identified by its (unique) 'id'.
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneRun(String id, BeaconRequestBody request);

    /**
     * Get the genomic variants list from one run, identified by its (unique) 'id'.
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneRunGenomicVariants(
            String id, String requested_schema, Integer skip, Integer limit);

    /**
     * Get the genomic variants list from one run, identified by its (unique) 'id'.
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneRunGenomicVariantsRequest(
            String id, BeaconRequestBody request);

    /**
     * Get the analysis list from one sequencing run, identified by its (unique) 'id'.
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneRunAnalyses(
            String id, String requested_schema, Integer skip, Integer limit);

    /**
     * Get the analysis list from one sequencing run, identified by its (unique) 'id'.
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneRunAnalysesRequest(
            String id, BeaconRequestBody request);

}
