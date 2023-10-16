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

public class BeaconInfoResults {

    private String id;
    private String name;
    private String api_version;
    private String environment;
    private BeaconOrganization organization;
    private String description;
    private String version;
    private String welcome_url;
    private String alternative_url;
    private String create_date_time;
    private String update_date_time;
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

    public String getApiVersion() {
        return api_version;
    }
    
    public void setApiVersion(String api_version) {
        this.api_version = api_version;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    
    public BeaconOrganization getOrganization() {
        return organization;
    }

    public void setOrganization(BeaconOrganization organization) {
        this.organization = organization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getWelcomeUrl() {
        return welcome_url;
    }

    public void setWelcomeUrl(String welcome_url) {
        this.welcome_url = welcome_url;
    }
    
    public String getAlternativeUrl() {
        return alternative_url;
    }

    public void setAlternativeUrl(String alternative_url) {
        this.alternative_url = alternative_url;
    }
    
    public String getCreateDateTime() {
        return create_date_time;
    }

    public void setCreateDateTime(String create_date_time) {
        this.create_date_time = create_date_time;
    }

    public String getUpdateDateTime() {
        return update_date_time;
    }

    public void setUpdateDateTime(String update_date_time) {
        this.update_date_time = update_date_time;
    }
    
    public JsonObject getInfo() {
        return info;
    }

    public void setInfo(JsonObject info) {
        this.info = info;
    }
}
