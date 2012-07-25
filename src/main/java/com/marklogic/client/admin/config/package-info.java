/**
 * The package provides classes and interfaces that support query options and query operations
 * such as {@link com.marklogic.client.query.QueryManager}.search().
 */
/*
 * Copyright 2012 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@javax.xml.bind.annotation.XmlSchema (               
    xmlns = { 
            @javax.xml.bind.annotation.XmlNs(prefix = "search", 
                     namespaceURI="http://marklogic.com/appservices/search")
           },    
    elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED        
)
package com.marklogic.client.admin.config;