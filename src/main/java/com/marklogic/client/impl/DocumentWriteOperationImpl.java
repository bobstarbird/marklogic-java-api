/*
 * Copyright 2012-2014 MarkLogic Corporation
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
package com.marklogic.client.impl;

import com.marklogic.client.document.DocumentWriteOperation;
import com.marklogic.client.document.DocumentWriteOperation.OperationType;
import com.marklogic.client.io.marker.AbstractWriteHandle;
import com.marklogic.client.io.marker.DocumentMetadataWriteHandle;

public class DocumentWriteOperationImpl implements DocumentWriteOperation {
	private OperationType operationType;
	private String uri;
	private DocumentMetadataWriteHandle metadata;
	private AbstractWriteHandle content;

	public DocumentWriteOperationImpl(OperationType type, String uri, 
		DocumentMetadataWriteHandle metadata, AbstractWriteHandle content)
	{
		this.operationType = type;
		this.uri = uri;
		this.metadata = metadata;
		this.content = content;
	}

    public OperationType getOperationType() {
		return operationType;
	}

    public String getUri() {
		return uri;
	}

    public DocumentMetadataWriteHandle getMetadata() {
		return metadata;
	}

    public AbstractWriteHandle getContent() {
		return content;
	}
}
