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

package es.bsc.inb.ga4gh.beacon.model.v200.variations;

import java.io.Serializable;
import java.util.List;

/**
 * draft-4
 * 
 * @author Dmitry Repchevsky
 * 
 * @param <K> Position implementation class
 * @param <L> Identifiers implementation class
 * @param <M> MolecularAttributes implementation class
 * @param <N> CaseLevelVariant implementation class
 * @param <O> VariantLevelData implementation class
 * @param <P> PopulationsFrequencies implementation class
 * @param <Q> Variation implementation class
 */

public interface Variant<K extends Position, L extends Identifiers, 
        M extends MolecularAttributes, N extends CaseLevelVariant,
        O extends VariantLevelData, P extends PopulationFrequencies,
        Q extends BeaconVariation> extends Serializable {
    
    String getVariantInternalId();
    void setVariantInternalId(String variantInternalId);
    
    String getVariantType();
    void setVariantType(String variantType);
    
    String getReferenceBases();
    void setReferenceBases(String referenceBases);
    
    String getAlternateBases();
    void setAlternateBases(String alternateBases);
    
    K getPosition();
    void setPosition(K position);
    
    L getIdentifiers();
    void setIdentifiers(L identifiers);
    
    M getMolecularAttributes();
    void setMolecularAttributes(M molecularAttributes);
    
    List<N> getCaseLevelData();
    void setCaseLevelData(List<N> caseLevelData);
    
    O getVariantLevelData();
    void setVariantLevelData(O variantLevelData);
    
    Q getVariation();
    void setVariation(Q variation);
    
    List<P> getFrequencyInPopulations();
    void setFrequencyInPopulations(List<P> frequencyInPopulations);
    
}
