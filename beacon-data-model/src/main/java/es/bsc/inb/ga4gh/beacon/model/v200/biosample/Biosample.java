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

package es.bsc.inb.ga4gh.beacon.model.v200.biosample;

import es.bsc.inb.ga4gh.beacon.model.v200.common.PhenotypicFeature;
import es.bsc.inb.ga4gh.beacon.model.v200.common.OntologyTerm;
import jakarta.json.JsonObject;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 * 
 * @param <K> OntologyTerm implementation class
 * @param <L> Procedure implementation class
 * @param <M> PhenotypicFeature implementation class
 * @param <N> Measurement implementation class
 */

public interface Biosample<K extends OntologyTerm, L extends Procedure,
        M extends PhenotypicFeature, N extends Measurement> extends Serializable {

    /**
     * Get biosample identifier (external accession or internal ID).
     * 
     * @return biosample identifier
     */    
    String getId();
    void setId(String id);

    /**
     * Get the individual of the biosample.
     * 
     * @return individual id
     */    
    String getIndividualId();
    void setIndividualId(String individualId);

    /**
     * Get relevant info about the biosample that does not fit into any 
     * other field in the schema.
     * 
     * @return 
     */    
    String getNotes();
    void setNotes(String notes);

    /**
     * Ontology value from Experimental Factor Ontology (EFO) Material 
     * Sample ontology (OBI:0000747).Classification of the sample in abnormal 
     * sample (EFO:0009655) or reference sample (EFO:0009654).
     * 
     * @return 
     */    
    K getBiosampleStatus();
    void setBiosampleStatus(K biosampleStatus);

    /**
     * Get the date of biosample collection in the ISO8601 date format.
     * 
     * @return 
     */    
    LocalDate getCollectionDate();
    void getCollectionDate(LocalDate collectionDate);

    /**
     * Get the individual's age at the time of sample collection 
     * in the ISO8601 duration format `P[n]Y[n]M[n]DT[n]H[n]M[n]S`.
     * 
     * @return 
     */    
    String getCollectionMoment();
    void setCollectionMoment(String collectionMoment);

    /**
     * Category of sample origin.Value from Ontology for Biomedical Investigations (OBI)
     * material entity (BFO:0000040) ontology, e.g. 'specimen from organism' 
     * (OBI:0001479),'xenograft' (OBI:0100058), 'cell culture' (OBI:0001876).
     * 
     * @return 
     */
    K getSampleOriginType();
    void setSampleOriginType(K sampleOriginType);

    K getSampleOriginDetail();
    void setSampleOriginDetail(K sampleOriginDetail);

    L getObtentionProcedure();
    void setObtentionProcedure(L obtentionProcedure);
    
    K getTumorProgression();
    void setTumorProgression(K tumorProgression);

    K getTumorGrade();
    void setTumorGrade(K tumorGrade);
    
    K getPathologicalStage();
    void setPathologicalStage(K pathologicalStage);

    K getPathologicalTnmFinding();
    void setPathologicalTnmFinding(K pathologicalTnmFinding);
    
    K getHistologicalDiagnosis();
    void setHistologicalDiagnosis(K histologicalDiagnosis);
    
    K getDiagnosticMarkers();
    void setDiagnosticMarkers(K diagnosticMarkers);
    
    List<M> getPhenotypicFeatures();
    void setPhenotypicFeatures(List<M> phenotypicFeatures);

    List<N> getMeasurements();
    void setMeasurements(List<N> measurements);

    K getSampleProcessing();
    void setSampleProcessing(K sampleProcessing);
    
    K getSampleStorage();
    void setSampleStorage(K sampleStorage);
    
    JsonObject getInfo();
    void setInfo(JsonObject info);
}
