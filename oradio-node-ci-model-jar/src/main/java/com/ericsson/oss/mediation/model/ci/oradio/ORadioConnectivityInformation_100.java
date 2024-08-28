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

import com.ericsson.mediation.model.ci.ConnectivityInformation_100;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventHandling;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.ReadBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;


@EModel(description = "This MO encapsulates all the connectivity attributes for the ORadio based nodes.", name = "ORadioConnectivityInformation", namespace = "ORADIO_MED", version = "1.0.0")
@PrimaryTypeDefinition
@Hierarchical(parentMoTypeUrn = "")
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_DELEGATE)
@PrimaryTypeChangeEventHandling(onCreatePo = {PrimaryTypeChangeEventBehavior.NAMES, PrimaryTypeChangeEventBehavior.VALUES}, onDeletePo = {PrimaryTypeChangeEventBehavior.NAMES,
        PrimaryTypeChangeEventBehavior.VALUES})
public class ORadioConnectivityInformation_100 extends ConnectivityInformation_100 {

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The unique key identifying this particular MO", mandatory = true, immutable = true, key = true)
    @NotNull
    private String ORadioConnectivityInformationId;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "String uniquely identifying the O-RU with combination of Serial number/Product number/Vendor code. Must match the FQDN value set on the O-RU certificate", mandatory = true, immutable = true)
    @NotNull
    private String FQDN;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Transport protocol provided by node", mandatory = false)
    @DefaultValue(value = "TLS")
    private TransportProtocolType_100 transportProtocol;

}
