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

package es.bsc.inb.ga4gh.beacon.framework.rest;

import es.bsc.inb.ga4gh.beacon.framework.RunsInterface;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconQueryFilter;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconRequestBody;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconFilteringTermsResponse;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconResultsetsResponse;
import java.util.concurrent.ExecutorService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.container.AsyncResponse;
import jakarta.ws.rs.container.Suspended;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 */

@Path("/runs")
public interface RunsEndpointInterface 
        extends RunsInterface, AsyncEndpointInterface {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    default void getRuns(
            @QueryParam("requestedSchema") String requested_schema,
            @QueryParam("skip") Integer skip,
            @QueryParam("limit") Integer limit,
            @QueryParam("includeResultsetResponses") String include_responses,
            @QueryParam("filters") List<BeaconQueryFilter> filters,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = getRuns(requested_schema, 
                            skip, limit, include_responses, filters);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = getRuns(requested_schema, 
                        skip, limit, include_responses, filters);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        } 
    }
        
    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    default void postRunsRequest(
            BeaconRequestBody request,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = postRunsRequest(request);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = postRunsRequest(request);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    default void getOneRun(
            @PathParam("id") String id,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = getOneRun(id);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = getOneRun(id);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }
    }

    @POST
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    default void postOneRun(
            @PathParam("id") String id,
            BeaconRequestBody request,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = postOneRun(id, request);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = postOneRun(id, request);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }
    }

    @GET
    @Path("/{id}/g_variants")
    @Produces(MediaType.APPLICATION_JSON)    
    default void getOneRunGenomicVariants(
            @PathParam("id") String id,
            @QueryParam("requestedSchema") String requested_schema,
            @QueryParam("skip") Integer skip,
            @QueryParam("limit") Integer limit,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = 
                            getOneRunGenomicVariants(id, requested_schema, skip, limit);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = 
                        getOneRunGenomicVariants(id, requested_schema, skip, limit);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }        
    }
    
    @POST
    @Path("/{id}/g_variants")
    @Produces(MediaType.APPLICATION_JSON)
    default void postOneRunGenomicVariantsRequest(
            @PathParam("id") String id,
            BeaconRequestBody request,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = 
                            postOneRunGenomicVariantsRequest(id, request);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = 
                        postOneRunGenomicVariantsRequest(id, request);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }        
    }

    @GET
    @Path("/{id}/analyses")
    @Produces(MediaType.APPLICATION_JSON)    
    default void getOneRunAnalyses(
            @PathParam("id") String id,
            @QueryParam("requestedSchema") String requested_schema,
            @QueryParam("skip") Integer skip,
            @QueryParam("limit") Integer limit,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = 
                            getOneRunAnalyses(id, requested_schema, skip, limit);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = 
                        getOneRunAnalyses(id, requested_schema, skip, limit);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }        
    }
    
    @POST
    @Path("/{id}/analyses")
    @Produces(MediaType.APPLICATION_JSON)
    default void postOneRunAnalysesRequest(
            @PathParam("id") String id,
            BeaconRequestBody request,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconResultsetsResponse response = 
                            postOneRunAnalysesRequest(id, request);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconResultsetsResponse response = 
                        postOneRunAnalysesRequest(id, request);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }        
    }
    
    @GET
    @Path("/filtering_terms")
    @Produces(MediaType.APPLICATION_JSON)
    default void getRunsFilteringTerms(
            @QueryParam("skip") Integer skip,
            @QueryParam("limit") Integer limit,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconFilteringTermsResponse response = 
                            getRunsFilteringTerms(skip, limit);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconFilteringTermsResponse response = 
                        getRunsFilteringTerms(skip, limit);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }
    }
    
    @POST
    @Path("/filtering_terms")
    @Produces(MediaType.APPLICATION_JSON)
    default void postRunsFilteringTermsRequest(
            BeaconRequestBody request,
            @Suspended AsyncResponse asyncResponse) {

        final ExecutorService executor = getExecutorService();
        if (executor != null) {
            executor.submit(() -> {
                try {
                    final BeaconFilteringTermsResponse response = 
                            postRunsFilteringTermsRequest(request);
                    asyncResponse.resume(response);
                } catch (Exception ex) {
                    asyncResponse.resume(ex);
                }
            });
        } else {
            try {
                final BeaconFilteringTermsResponse response = 
                        postRunsFilteringTermsRequest(request);
                asyncResponse.resume(response);
            } catch (Exception ex) {
                asyncResponse.resume(ex);
            }
        }
    }
}
