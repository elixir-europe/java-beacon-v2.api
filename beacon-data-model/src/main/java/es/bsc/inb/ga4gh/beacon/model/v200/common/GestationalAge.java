/**
 * *****************************************************************************
 * Copyright (C) 2026 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
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

package es.bsc.inb.ga4gh.beacon.model.v200.common;

import java.io.Serializable;

/**
 * Gestational age (or menstrual age) is the time elapsed between the first day of
 * the last normal menstrual period and the day of delivery. The first day of 
 * the last menstrual period occurs approximately 2 weeks before ovulation and 
 * approximately 3 weeks before implantation of the blastocyst. 
 * Because most women know when their last period began but not when ovulation occurred, 
 * this definition traditionally has been used when estimating the expected date of delivery. 
 * In contrast, chronological age (or postnatal age) is the time elapsed after birth. 
 * Provenance: Phenopackets v2
 * 
 * @author Dmitry Repchevsky
 */

public interface GestationalAge extends TimeElement, Serializable {
    
    /**
     * Get days beyond the completed weeks.
     * 
     * @return days beyond the completed weeks, if available.
     */
    Integer getDays();
    
    /**
     * Get completed weeks of gestation according to the above definition.
     * 
     * @return weeks of gestation.
     */
    Integer getWeeks();
}
