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

package es.bsc.inb.ga4gh.beacon.model.v200.common;

import es.bsc.inb.ga4gh.beacon.model.v200.biosample.Evidence;
import es.bsc.inb.ga4gh.beacon.model.v200.biosample.TimeElement;
import java.io.Serializable;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 * 
 * @param <K> OntologyTerm implementation class
 * @param <L> TimeElement implementation class
 * @param <M> Evidence implementation class
 */

public interface PhenotypicFeature
        <K extends OntologyTerm, L extends TimeElement,
        M extends Evidence> extends Serializable {

    /**
     * Get term denoting the phenotypic feature, preferably using a value from Human Phenotype Ontology (HPO).
     * 
     * @return 
     */
    K getFeatureType();
    void setFeatureType(K featureType);

    Boolean getExcluded();
    void setExcluded(Boolean excluded);

    List<K> getModifiers();
    void setModifiers(List<K> modifiers);

    L getOnset();
    void setOnset(L onset);

    L getResolution();
    void setResolution(L resolution);

    M getEvidence();
    void setEvidence(M evidence);
    
    K getSeverityLevel();
    void setSeverityLevel(K severityLevel);
    
    String getNotes();
    void setNotes(String notes);

}
