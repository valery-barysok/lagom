/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package com.lightbend.lagom.javadsl.api.deser;

import com.lightbend.lagom.javadsl.api.transport.TransportErrorCode;
import com.lightbend.lagom.javadsl.api.transport.TransportException;

/**
 * Thrown when an error was encountered during serialization.
 */
public class SerializationException extends TransportException {
    public static final TransportErrorCode ERROR_CODE = TransportErrorCode.InternalServerError;

    public SerializationException(String message) {
        super(ERROR_CODE, message);
    }

    public SerializationException(Throwable cause) {
        super(ERROR_CODE, cause);
    }

    public SerializationException(TransportErrorCode errorCode, ExceptionMessage exceptionMessage) {
        super(errorCode, exceptionMessage);
    }
}
