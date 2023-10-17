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

package es.bsc.inb.ga4gh.beacon.framework.model.v200;

import es.bsc.inb.ga4gh.beacon.framework.model.v200.requests.BeaconRequestParameters;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbException;
import jakarta.json.bind.serializer.DeserializationContext;
import jakarta.json.bind.serializer.JsonbDeserializer;
import jakarta.json.stream.JsonParser;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dmitry Repchevsky
 */

public class RequestParametersDeserializer implements JsonbDeserializer<BeaconRequestParameters> {

    private static final Jsonb JSONB = JsonbBuilder.create();

    @Override
    public BeaconRequestParameters deserialize(JsonParser parser, DeserializationContext dc, Type type) {
        final JsonValue value = parser.getValue();
        if (value != null && value.getValueType() == JsonValue.ValueType.OBJECT) {
            final JsonObject obj = value.asJsonObject();
            if (!obj.isEmpty()) {
                try {
                    return JSONB.fromJson(value.toString(), GenomicVariationsRequestParameters.class);
//                    return dc.deserialize(GenomicVariationsRequestParameters.class, 
//                            Json.createParserFactory(Collections.EMPTY_MAP).createParser(obj));
                } catch(JsonbException ex) {
                    Logger.getLogger(RequestParametersDeserializer.class.getName()).log(
                            Level.INFO, ex.getMessage());
                }
            }
        }
        return null;
    }
    
}
