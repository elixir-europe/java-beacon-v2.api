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
 * GA4GH Beacon API Specification - Analysis endpoints
 * 
 * @author Dmitry Repchevsky
 */

public interface AnalysesInterface {

    /**
     * Get a list of bioinformatics analyses.
     * 
     * @param requested_schema
     * @param skip
     * @param limit
     * @param include_responses
     * @param filters
     * 
     * @return 
     */
    BeaconResultsetsResponse getAnalyses(
            String requested_schema, Integer skip, Integer limit, 
            String include_responses, List<BeaconQueryFilterGroupInterface> filters);

    /**
     * Get a list of bioinformatics analyses.
     * 
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postAnalyses(BeaconRequestBody request);
    
    /**
     * Get details about one bioinformatics analysis, identified by its (unique) 'id'
     * 
     * @param id
     * @return 
     */
    BeaconResultsetsResponse getOneAnalysis(String id);
    
    /**
     * Get details about one bioinformatics analysis, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneAnalysisRequest(String id, BeaconRequestBody request);

    /**
     * Get the list of variants instances for one bioinformatics analysis, identified by its (unique) 'id'
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneAnalysisGenomicVariants(
            String id, String requested_schema, Integer skip, Integer limit);
    
    /**
     * Get the list of variants instances for one bioinformatics analysis, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneAnalysisGenomicVariantsRequest(String id, BeaconRequestBody request);
}
