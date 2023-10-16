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

package es.bsc.inb.ga4gh.beacon.model.v200.variations;

import es.bsc.inb.ga4gh.beacon.model.v200.common.OntologyTerm;
import java.io.Serializable;
import java.util.List;

/**
 * // draft-4
 * 
 * @author Dmitry Repchevsky
 * 
 * @param <K> OntologyTerm implementation class
 * @param <L> PhenoClinicEffect implementation class
 */

public interface CaseLevelVariant<K extends OntologyTerm, L extends PhenoClinicEffect> 
        extends Serializable {

    String getId();
    void setId(String id);
    
    String getIndividualId();
    void setIndividualId(String individualId);
    
    String getBiosampleId();
    void setBiosampleId(String biosampleId);
    
    String getAnalysisId();
    void setAnalysisId(String analysisId);

    String getRunId();
    void setRunId(String runId);

    K getZigosity();
    void setZigosity(K zigosity);
    
    K getAlleleOrigin();
    void setAlleleOrigin(K alleleOrigin);
    
    List<L> getClinicalInterpretations();
    void setClinicalInterpretations(List<L> clinicalInterpretations);

    List<L> getPhenotypicEffects();
    void setPhenotypicEffects(List<L> phenotypicEffects);    
}
