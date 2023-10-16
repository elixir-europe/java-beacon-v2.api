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

import es.bsc.inb.ga4gh.beacon.framework.model.v200.common.Handover;
import jakarta.json.JsonObject;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 */

public class BeaconResponse extends AbstractBeaconResponse {

    private BeaconResponseSummary response_summary;
    private List<Handover> beacon_handovers;
    private JsonObject info;
    
    public BeaconResponseSummary getResponseSummary() {
        return response_summary;
    }
    
    public void setResponseSummary(BeaconResponseSummary response_summary) {
        this.response_summary = response_summary;
    }

    public List<Handover> getBeaconHandovers() {
        return beacon_handovers;
    }
    
    public void setBeaconHandovers(List<Handover> beacon_handovers) {
        this.beacon_handovers = beacon_handovers;
    }

    public JsonObject getInfo() {
        return info;
    }

    public void setInfo(JsonObject info) {
        this.info = info;
    }
    
}
