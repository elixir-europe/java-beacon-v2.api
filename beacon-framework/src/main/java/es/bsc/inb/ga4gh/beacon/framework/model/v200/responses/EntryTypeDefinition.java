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

package es.bsc.inb.ga4gh.beacon.framework.model.v200.responses;

import es.bsc.inb.ga4gh.beacon.framework.model.v200.common.BasicElement;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.common.OntologyTerm;
import es.bsc.inb.ga4gh.beacon.framework.model.v200.common.SchemaReference;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.List;

/**
 * @author Dmitry Repchevsky
 */

public class EntryTypeDefinition {
    
    private String schema;
    private String id;
    private String name;
    private String description;
    private OntologyTerm ontologyTermForThisType;
    private String part_of_specification;
    private SchemaReference default_schema;
    private List<SchemaReference> additionally_supported_schemas;
    private BasicElement a_collection_of;
    private String filtering_terms;
    private Boolean non_filtered_queries_allowed;
    
    @JsonbProperty("$schema")
    public String getSchema() {
        return schema;
    }
    
    @JsonbProperty("$schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OntologyTerm getOntologyTermForThisType() {
        return ontologyTermForThisType;
    }

    public void setOntologyTermForThisType(OntologyTerm ontologyTermForThisType) {
        this.ontologyTermForThisType = ontologyTermForThisType;
    }
 
    public String getPartOfSpecification() {
        return part_of_specification;
    }

    public void setPartOfSpecification(String part_of_specification) {
        this.part_of_specification = part_of_specification;
    }

    public SchemaReference getDefaultSchema() {
        return default_schema;
    }

    public void setDefaultSchema(SchemaReference default_schema) {
        this.default_schema = default_schema;
    }
    
    public List<SchemaReference> getAdditionallySupportedSchemas() {
        return additionally_supported_schemas;
    }

    public void setAdditionallySupportedSchemas(List<SchemaReference> additionally_supported_schemas) {
        this.additionally_supported_schemas = additionally_supported_schemas;
    }
    
    public BasicElement getACollectionOf() {
        return a_collection_of;
    }
    
    public void getACollectionOf(BasicElement a_collection_of) {
        this.a_collection_of = a_collection_of;
    }
    
    public String getFilteringTerms() {
        return filtering_terms;
    }

    public void setFilteringTerms(String filtering_terms) {
        this.filtering_terms = filtering_terms;
    }

    public Boolean getNonFilteredQueriesAllowed() {
        return non_filtered_queries_allowed;
    }

    public void setNonFilteredQueriesAllowed(Boolean non_filtered_queries_allowed) {
        this.non_filtered_queries_allowed = non_filtered_queries_allowed;
    }

}
