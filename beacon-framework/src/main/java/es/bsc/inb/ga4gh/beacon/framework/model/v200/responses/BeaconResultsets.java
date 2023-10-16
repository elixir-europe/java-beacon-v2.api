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

import jakarta.json.bind.annotation.JsonbProperty;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 * 
 * @param <T> concrete resultsets entry type.
 */

public class BeaconResultsets<T> {
    
    private String schema;
    private List<BeaconResultset<T>> result_sets;
    
    @JsonbProperty("$schema")
    public String getSchema() {
        return schema;
    }
    
    @JsonbProperty("$schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public List<BeaconResultset<T>> getResultSets() {
        return result_sets;
    }
    
    public void setResultSets(List<BeaconResultset<T>> result_sets) {
        this.result_sets = result_sets;
    }

}
