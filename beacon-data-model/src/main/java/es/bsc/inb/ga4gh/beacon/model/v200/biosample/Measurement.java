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

import es.bsc.inb.ga4gh.beacon.model.v200.common.OntologyTerm;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Dmitry Repchevsky
 * 
 * @param <K> OntologyTerm implementation class
 * @param <L> MeasurementValue implementation class
 * @param <M> TimeElement implementation class
 * @param <N> Procedure implementation class
 */

public interface Measurement<K extends OntologyTerm, L extends MeasurementValue,
        M extends TimeElement, N extends Procedure> extends Serializable {
    
    K getAssayCode();
    void setAssayCode(K assayCode);

    L getMeasurementValue();
    void setMeasurementValue(L measurementValue);
    
    M getObservationMoment();
    void setObservationMoment(M observationMoment);
    
    LocalDate getDate();
    void setDate(LocalDate date);
    
    N getProcedure();
    void setProcedure(N procedure);
    
    String getNotes();
    void setNotes(String notes);
}
