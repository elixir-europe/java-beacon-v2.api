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

package es.bsc.inb.ga4gh.beacon.model.v200.runs;

import es.bsc.inb.ga4gh.beacon.model.v200.common.OntologyTerm;
import jakarta.json.JsonObject;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Dmitry Repchevsky
 * 
 * @param <K> OntologyTerm implementation class
 */

public interface Run<K extends OntologyTerm> extends Serializable {
    
    String getId();
    void setId(String id);
    
    String getBiosampleId();
    void setBiosampleId(String biosampleId);
    
    String getIndividualId();
    void setIndividualId(String individualId);
    
    LocalDate getRunDate();
    void setRunDate(LocalDate runDate);
    
    K getLibrarySource();
    void setLibrarySource(K librarySource);
    
    String getLibrarySelection();
    void setLibrarySelection(String librarySelection);
    
    String getLibraryStrategy();
    void setLibraryStrategy(String libraryStrategy);
    
    String getLibraryLayout();
    void setLibraryLayout(String libraryLayout);
    
    String getPlatform();
    void setPlatform(String platform);
    
    K getPlatformModel();
    void setPlatformModel(K platformModel);

    JsonObject getInfo();
    void setInfo(JsonObject info);
    
}
