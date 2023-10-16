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

package es.bsc.inb.ga4gh.beacon.framework.model.v200.common;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Dmitry Repchevsky
 */

public class Pagination {
    
    private Integer skip;
    private Integer limit;
    
    @JsonbProperty("current_page")
    private String current_page;
    
    @JsonbProperty("next_page")
    private String next_page;
    
    @JsonbProperty("previous_page")
    private String previous_page;
    
    public Pagination() {}
    
    public Pagination(Integer skip, Integer limit) {
        this.skip = skip;
        this.limit = limit;
    }

    public Integer getSkip() {
        return skip;
    }
    
    public void setSkip(Integer skip) {
        this.skip = skip;
    }
    
    public Integer getLimit() {
        return limit;
    }
    
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getCurrentPage() {
        return current_page;
    }
    
    public void setCurrentPage(String current_page) {
        this.current_page = current_page;
    }

    public String getNextPage() {
        return next_page;
    }
    
    public void setNextPage(String next_page) {
        this.next_page = next_page;
    }

    public String getPreviousPage() {
        return previous_page;
    }
    
    public void setPreviousPage(String previous_page) {
        this.previous_page = previous_page;
    }
    
}
