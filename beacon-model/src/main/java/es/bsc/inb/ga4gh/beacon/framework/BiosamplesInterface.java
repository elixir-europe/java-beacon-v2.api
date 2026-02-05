/**
 * *****************************************************************************
 * Copyright (C) 2026 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
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
 * GA4GH Beacon API Specification - Biosamples endpoints.
 * 
 * @author Dmitry Repchevsky
 */

public interface BiosamplesInterface {

    /**
     * Get a list of biosamples.
     * 
     * @param requested_schema
     * @param skip
     * @param limit
     * @param include_responses
     * @param filters
     * @return 
     */
    BeaconResultsetsResponse getBiosamples(
            String requested_schema, Integer skip, Integer limit, 
            String include_responses, List<BeaconQueryFilterGroupInterface> filters);

    /**
     * Get a list of biosamples.
     * 
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postBiosamplesRequest(BeaconRequestBody request);

    /**
     * Get details about one Biosample, identified by its (unique) 'id'.
     * 
     * @param id
     * @return 
     */
    BeaconResultsetsResponse getOneBiosample(String id);
    
    /**
     * Get details about one Biosample, identified by its (unique) 'id'.
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneBiosampleRequest(String id, BeaconRequestBody request);
    
    /**
     * Get the genomic variants list from one biosample, identified by its (unique) 'id'
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneBiosampleGenomicVariants(
            String id, String requested_schema, Integer skip, Integer limit);
    
    /**
     * Get the genomic variants list from one biosample, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneBiosampleGenomicVariantsRequest(
            String id, BeaconRequestBody request);
    
    /**
     * Get the analysis list from one biosample, identified by its (unique) 'id'
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneBiosampleAnalysis(
            String id, String requested_schema, Integer skip, Integer limit);
    
    /**
     * Get the analysis list from one biosample, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneBiosampleAnalysisRequest(String id, BeaconRequestBody request);
    
    /**
     * Get the runs list from one biosample, identified by its (unique) 'id'
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneBiosampleRuns(
            String id, String requested_schema, Integer skip, Integer limit);

    /**
     * Get the runs list from one biosample, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse getOneBiosampleRuns(String id, BeaconRequestBody request);
}
