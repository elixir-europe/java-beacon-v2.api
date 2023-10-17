/**
 * *****************************************************************************
 * Copyright (C) 2022 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
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

import es.bsc.inb.ga4gh.beacon.framework.v200.BeaconInterface;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconInfoResponse;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconMapResponse;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconEntryTypesResponse;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.configuration.ServiceConfiguration;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconFilteringTermsResponse;
import es.bsc.inb.ga4gh.service_info.model.v100.Service;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

/**
 * @author Dmitry Repchevsky
 */

@Path("/")
public interface BeaconEndpointInterface extends BeaconInterface {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    BeaconInfoResponse getBeaconInfoRoot(@QueryParam("requestedSchema") String requestedSchema);
    
    @GET
    @Path("/info")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    BeaconInfoResponse getBeaconInfo(@QueryParam("requestedSchema") String requestedSchema);
    
    @GET
    @Path("/service-info")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    Service getBeaconServiceInfo();
    
    @GET
    @Path("/configuration")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    ServiceConfiguration getBeaconConfiguration();

    @GET
    @Path("/map")
    @Produces(MediaType.APPLICATION_JSON)        
    @Override
    BeaconMapResponse getBeaconMap();

    @GET
    @Path("/entry_types")
    @Produces(MediaType.APPLICATION_JSON)        
    @Override
    BeaconEntryTypesResponse getEntryTypes();

    @GET
    @Path("/filtering_terms")
    @Produces(MediaType.APPLICATION_JSON)        
    @Override
    BeaconFilteringTermsResponse getFilteringTerms();
}
