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

package es.bsc.inb.ga4gh.beacon.framework.model.v200.configuration;

import es.bsc.inb.ga4gh.beacon.framework.model.v200.responses.EntryTypeDefinition;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Map;


/**
 * @author Dmitry Repchevsky
 */

public class BeaconConfiguration {

    private String schema;
    private BeaconMaturityAttributes maturity_attributes;
    private BeaconSecurityAttributes security_attributes;
    private Integer max_page_size;
    private Map<String, EntryTypeDefinition> entry_types;
    
    @JsonbProperty("$schema")
    public String getSchema() {
        return schema;
    }
    
    @JsonbProperty("$schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }
    
    public BeaconMaturityAttributes getMaturityAttributes() {
        return maturity_attributes;
    }
    
    public void setMaturityAttributes(BeaconMaturityAttributes maturity_attributes) {
        this.maturity_attributes = maturity_attributes;
    }

    public BeaconSecurityAttributes getSecurityAttributes() {
        return security_attributes;
    }
    
    public void setSecurityAttributes(BeaconSecurityAttributes security_attributes) {
        this.security_attributes = security_attributes;
    }

    public Integer getMaxPageSize() {
        return max_page_size;
    }
    
    public void setMaxPageSize(Integer max_page_size) {
        this.max_page_size = max_page_size;
    }

    public Map<String, EntryTypeDefinition> getEntryTypes() {
        return entry_types;
    }
    
    public void setEntryTypes(Map<String, EntryTypeDefinition> entry_types) {
        this.entry_types = entry_types;
    }
}
