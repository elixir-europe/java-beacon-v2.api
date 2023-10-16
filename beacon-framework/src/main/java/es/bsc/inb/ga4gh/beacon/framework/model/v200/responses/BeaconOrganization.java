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

import jakarta.json.JsonObject;

/**
 * @author Dmitry Repchevsky
 */

public class BeaconOrganization {
    
    private String id;
    private String name;
    private String description;
    private String address;
    private String welcome_url;
    private String contact_url;
    private String logo_url;
    private JsonObject info;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWelcomeUrl() {
        return welcome_url;
    }

    public void setWelcomeUrl(String welcome_url) {
        this.welcome_url = welcome_url;
    }
    
    public String getContactUrl() {
        return contact_url;
    }

    public void setContactUrl(String contact_url) {
        this.contact_url = contact_url;
    }

    public String getLogoUrl() {
        return logo_url;
    }

    public void setLogoUrl(String logo_url) {
        this.logo_url = logo_url;
    }

    public JsonObject getInfo() {
        return info;
    }

    public void setInfo(JsonObject info) {
        this.info = info;
    }
}
