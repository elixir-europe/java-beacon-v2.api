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

package es.bsc.inb.ga4gh.beacon.framework.model.v200;

import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconRequestParameters;

/**
 * @author Dmitry Repchevsky
 */

public class GenomicVariationsRequestParameters extends BeaconRequestParameters {

    private String assembly_id;
    private String reference_name;
    private long[] start;
    private long[] end;
    private String reference_bases;
    private String alternate_bases;
    private String variant_type;
    private Long variant_min_length;
    private Long variant_max_length;
    private String mate_name;
    private String gene_id;
    private String aminoacid_change;
    private String genomic_allele_short_form;

    public String getAssemblyId() {
        return assembly_id;
    }
    
    public void setAssemblyId(String assembly_id) {
        this.assembly_id = assembly_id;
    }
    
    public String getReferenceName() {
        return reference_name;
    }
    
    public void setReferenceName(String reference_name) {
        this.reference_name = reference_name;
    }
    
    public long[] getStart() {
        return start;
    }
    
    public void setStart(long[] start) {
        this.start = start;
    }
    
    public long[] getEnd() {
        return end;
    }
    
    public void setEnd(long[] end) {
        this.end = end;
    }

    public String getReferenceBases() {
        return reference_bases;
    }
    
    public void setReferenceBases(String reference_bases) {
        this.reference_bases = reference_bases;
    }

    public String getAlternateBases() {
        return alternate_bases;
    }
    
    public void setAlternateBases(String alternate_bases) {
        this.alternate_bases = alternate_bases;
    }

    public String getVariantType() {
        return variant_type;
    }
    
    public void setVariantType(String variant_type) {
        this.variant_type = variant_type;
    }

    public Long getVariantMinLength() {
        return variant_min_length;
    }
    
    public void setVariantMinLength(Long variant_min_length) {
        this.variant_min_length = variant_min_length;
    }

    public Long getVariantMaxLength() {
        return variant_max_length;
    }
    
    public void setVariantMaxLength(Long variant_max_length) {
        this.variant_max_length = variant_max_length;
    }

    public String getMateName() {
        return mate_name;
    }
    
    public void setMateName(String mate_name) {
        this.mate_name = mate_name;
    }

    public String getGeneId() {
        return gene_id;
    }
    
    public void setGeneId(String gene_id) {
        this.gene_id = gene_id;
    }

    public String getAminoacidChange() {
        return aminoacid_change;
    }
    
    public void setAminoacidChange(String aminoacid_change) {
        this.aminoacid_change = aminoacid_change;
    }
    
    public String getGenomicAlleleShortForm() {
        return genomic_allele_short_form;
    }
    
    public void setGenomicAlleleShortForm(String genomic_allele_short_form) {
        this.genomic_allele_short_form = genomic_allele_short_form;
    }
}
