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

import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconError;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.BeaconErrorResponse;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import java.net.HttpURLConnection;

/**
 * Provider that automatically generates BeaconErrorResponse response
 * catching WebApplicationException exceptions thrown from by the endpoints.
 * 
 * @author Dmitry Repchevsky
 */

@Provider
public class BeaconErrorResponseProvider implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception ex) {

        if (ex instanceof WebApplicationException) {
            final WebApplicationException wex = (WebApplicationException)ex;
            final Response response = wex.getResponse();

            final Object entity = response.getEntity();
            if (entity instanceof BeaconErrorResponse) {
                // if exception already has the BeaconErrorResponse - just proxy it
                return response;
            }

            BeaconErrorResponse error_response = new BeaconErrorResponse();
            BeaconError error = new BeaconError();
            error.setErrorCode(response.getStatus());
            error.setErrorMessage(ex.getMessage());

            error_response.setBeaconError(error);

            return Response.status(response.getStatus()).entity(error_response).build();
        }
        BeaconErrorResponse error_response = new BeaconErrorResponse();
        BeaconError error = new BeaconError();

        error.setErrorCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
        error.setErrorMessage(ex.getMessage());

        error_response.setBeaconError(error);

        return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error_response).build();
    }
}
