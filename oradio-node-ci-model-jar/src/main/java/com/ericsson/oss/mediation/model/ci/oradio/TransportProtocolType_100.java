/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2024
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.mediation.model.ci.oradio;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;


@EModel(namespace = "ORADIO_MED", name = "TransportProtocolType", version = "1.0.0", description = "This represents the types of transport protocol for ORadio nodes")
@EdtDefinition
public enum TransportProtocolType_100 {

    @EdtMember(value = 1, description = "TLS protocol") TLS
}
