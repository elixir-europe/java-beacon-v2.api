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
 *****************************************************************************
 */

package es.bsc.inb.ga4gh.beacon.model.v200.variations;

import es.bsc.inb.ga4gh.vrs.model.Location;

/**
 * @author Dmitry Repchevsky
 * 
 * @param <K> Location implementation class
 */

public interface LegacyVariation<K extends Location> extends BeaconVariation {
    
    String getAlternateBases();
    void setAlternateBases(String alternateBases);
    
    K getLocation();
    void setLocation(K location);
    
    String getReferenceBases();
    void setReferenceBases(String referenceBases);

    String getVariantType();
    void setVariantType(String variantType);
}
