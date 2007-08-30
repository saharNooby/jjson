/*
 *  Copyright 2007 Christian Grobmeier 
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at 
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0 
 *  
 *  Unless required by applicable law or agreed to in writing, 
 *  software distributed under the License is distributed 
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 *  either express or implied. See the License for the specific 
 *  language governing permissions and limitations under the License.
 */
package de.grobmeier.jjson;

/**
 * 
 */
public class JSONNull implements JSONValue {
    
    public static final JSONNull NULL = new JSONNull();
    
    /**
     * 
     */
    public JSONNull() {
        // no values
    }
    
    /**
     * (non-Javadoc)
     * @see org.apache.commons.json.JSONValue#toJSON()
     */
    public String toJSON() {
        return "null";
    }
}