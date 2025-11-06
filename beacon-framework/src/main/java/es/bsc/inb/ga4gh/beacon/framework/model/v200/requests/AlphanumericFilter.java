/**
 * *****************************************************************************
 * Copyright (C) 2024 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
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

package es.bsc.inb.ga4gh.beacon.framework.model.v200.requests;

/**
 * @author Dmitry Repchevsky
 */

public class AlphanumericFilter implements BeaconQueryFilter {

    private String id;
    private String operator;
    private String value;
    private String scope;

    public AlphanumericFilter() {}
    
    public AlphanumericFilter(String id, String operator, String value) {
        this.id = id;
        this.operator = operator;
        this.value = value;
    }
    
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
    public String getOperator() {
        return operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
    
    @Override
    public String toString() {
        return getId() + getOperator() + getValue();
    }
}
