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

package es.bsc.inb.ga4gh.beacon.framework;

import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconQueryFilter;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconFilteringTermsResponse;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconRequestBody;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconResultsetsResponse;
import java.util.List;

/**
 * GA4GH Beacon API Specification - Individuals Endpoints.
 * 
 * @author Dmitry Repchevsky
 */

public interface IndividualsInterface {
    
    /**
     * Get a list of individuals.
     * 
     * @param requested_schema
     * @param skip
     * @param limit
     * @param include_responses
     * @param filters
     * @return 
     */
    BeaconResultsetsResponse getIndividuals(
            String requested_schema, Integer skip, Integer limit, 
            String include_responses, List<BeaconQueryFilter> filters);

    /**
     * Get a list of individuals.
     * 
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postIndividualsRequest(BeaconRequestBody request);
    
    /**
     * Get details about one individual, identified by its (unique) 'id'.
     * 
     * @param id
     * @return 
     */
    BeaconResultsetsResponse getOneIndividual(String id);
    
    /**
     * Get details about one individual, identified by its (unique) 'id'.
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneIndividualRequest(String id, BeaconRequestBody request);

    /**
     * Get the genomic variants list from one individual, identified by its (unique) 'id'.
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneIndividualGenomicVariants(
            String id, String requested_schema, Integer skip, Integer limit);

    /**
     * Get the genomic variants list from one individual, identified by its (unique) 'id'.
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneIndividualGenomicVariantsRequest(
            String id, BeaconRequestBody request);
    
    /**
     * Get the biosamples list from one individual, identified by its (unique) 'id'.
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getOneIndividualBiosamples(
            String id, String requested_schema, Integer skip, Integer limit);

    /**
     * Get the biosamples list from one individual, identified by its (unique) 'id'.
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneIndividualBiosamplesRequest(
            String id, BeaconRequestBody request);

    /**
     * Get the list of filtering terms that could be used with individuals.
     * 
     * @param skip
     * @param limit
     * @return 
     */
    BeaconFilteringTermsResponse getIndividualsFilteringTerms(Integer skip, Integer limit);
    
    /**
     * Get the list of filtering terms that could be used with individuals.
     * 
     * @param request
     * @return 
     */
    BeaconFilteringTermsResponse postIndividualsFilteringTermsRequest(BeaconRequestBody request);

}
