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
package de.grobmeier.jjson.utils;

import junit.framework.TestCase;

import org.junit.Test;


public class JSONAnnotationEncoderTest {
    @Test
    public void testSimpleClass() throws Exception {
    	String expected = 
    		"{\"value1\":1,\"value2\":\"blub\",\"value3\":2,\"value5\":3,\"value4\":" +
    		"\"fasel\",\"intArray\":,\"value6\":true,\"value7\":false,\"test\":" +
    		"{\"mys\":\"bla\",\"mylist\":[\"entry1\",\"entry2\",\"entry3\",\"entry4\",\"entry5\"]," +
    		"\"map\":{\"key1\":{\"innerfield\":\"innerfield_1\"}," +
    		"\"key3\":{\"innerfield\":\"innerfield_3\"}," +
    		"\"key2\":{\"innerfield\":\"innerfield_2\"}}}}";
        AnnotatedTestClass c = new AnnotatedTestClass();
        JSONAnnotationEncoder encoder = new JSONAnnotationEncoder();
        String json = encoder.encode(c);
        TestCase.assertEquals(expected, json);
    }
}
