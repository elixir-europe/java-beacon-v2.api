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

package es.bsc.inb.ga4gh.beacon.model.v200.cohort;

import es.bsc.inb.ga4gh.beacon.model.v200.common.Disease;
import es.bsc.inb.ga4gh.beacon.model.v200.common.OntologyTerm;
import es.bsc.inb.ga4gh.beacon.model.v200.common.PhenotypicFeature;
import es.bsc.inb.ga4gh.beacon.model.v200.common.AgeRange;
import java.io.Serializable;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 * 
 * @param <K> OntologyTerm implementation class
 * @param <L> Disease implementation class
 * @param <M> PhenotypicFeature implementation class
 * @param <N> AgeRange implementation class
 */

public interface CohortCriteria
        <K extends OntologyTerm, L extends Disease, 
        M extends PhenotypicFeature, N extends AgeRange> extends Serializable {
    
    List<K> getLocations();
    void setLocations(List<K> locations);
    
    List<K> getGenders();
    void setGenders(List<K> genders);    

    List<K> getEthnicities();
    void setEthnicities(List<K> ethnicities);
    
    List<L> getDiseaseConditions();
    void setDiseaseConditions(List<L> diseaseConditions);
    
    List<M> getPhenotypicConditions();
    void setPhenotypicConditions(List<M> phenotypicConditions);
    
    N getAgeRange();
    void setAgeRange(N ageRange);
}
