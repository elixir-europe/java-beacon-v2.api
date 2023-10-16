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

import java.util.List;

/**
 * @author Dmitry Repchevsky
 */

public class BeaconSecurityAttributes {

    private String default_granularity;
    private List<String> security_levels;
    
    public String getDefaultGranularity() {
        return default_granularity;
    }
    
    public void setDefaultGranularity(String default_granularity) {
        this.default_granularity = default_granularity;
    }
    
    public List<String> getSecurityLevels() {
        return security_levels;
    }
    
    public void setSecurityLevels(List<String> security_levels) {
        this.security_levels = security_levels;
    }
}
