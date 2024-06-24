/**
 * *****************************************************************************
 * Copyright (C) 2024 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
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
import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconRequestBody;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconFilteringTermsResponse;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconResultsetsResponse;
import java.util.List;

/**
 * GA4GH Beacon API Specification - Genomic Variations Endpoints.
 * 
 * @author Dmitry Repchevsky
 */

public interface GenomicVariationsInterface {
    
    /**
     * Get details about one genomic variation, identified by its (unique) 'id'.
     * 
     * @param requested_schema 
     *     Schema to be used to format the 'result' field in the response
     * @param skip
     * @param limit
     * @param include_responses
     * @param start
     * @param end
     * @param assembly_id
     * @param reference_name
     * @param reference_bases
     * @param alternate_bases
     * @param variant_min_length
     * @param variant_max_length
     * @param genomic_allele_short_form
     * @param gene_id
     * @param aminoacid_change
     * @param filters
     * @return 
     */
    BeaconResultsetsResponse getGenomicVariations(
            String requested_schema, Integer skip, Integer limit,
            String include_responses, long[] start, long[] end, String assembly_id,
            String reference_name, String reference_bases, String alternate_bases,
            Long variant_min_length, Long variant_max_length, String genomic_allele_short_form,
            String gene_id, String aminoacid_change, List<BeaconQueryFilter> filters,
            String filters_query);

    BeaconResultsetsResponse postGenomicVariationsRequest(BeaconRequestBody request);

    /**
     * Get details about one genomic variation, identified by its (unique) 'id'.
     * 
     * @param id
     * @return 
     */
    BeaconResultsetsResponse getOneGenomicVariation(String id);

    /**
     * Get details about one genomic variation, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postOneGenomicVariationRequest(String id, BeaconRequestBody request);
    
    /**
     * Get the biosamples list from one genomic variant, identified by its (unique) 'id'
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getBiosamples(
            String id, String requested_schema, Integer skip, Integer limit);
    
    /**
     * Get the biosamples list from one genomic variant, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postBiosamplesRequest(String id, BeaconRequestBody request);

    /**
     * Get the individuals list from one genomic variant, identified by its (unique) 'id'
     * 
     * @param id
     * @param requested_schema
     * @param skip
     * @param limit
     * @return 
     */
    BeaconResultsetsResponse getIndividuals(
            String id, String requested_schema, Integer skip, Integer limit);
    
    /**
     * Get the individuals list from one genomic variant, identified by its (unique) 'id'
     * 
     * @param id
     * @param request
     * @return 
     */
    BeaconResultsetsResponse postIndividualsRequest(String id, BeaconRequestBody request);

    /**
     * Get the list of filtering terms that could be used with genomic variations.
     * 
     * @param skip
     * @param limit
     * @return 
     */
    BeaconFilteringTermsResponse getGenomicVariationsFilteringTerms(Integer skip, Integer limit);
    
    /**
     * Get the list of filtering terms that could be used with genomic variations.
     * 
     * @param request
     * @return 
     */
    BeaconFilteringTermsResponse postGenomicVariationsFilteringTermsRequest(BeaconRequestBody request);

}
