/*--

 Copyright (C) 2002 Anthony Eden.
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions, and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions, and the disclaimer that follows
    these conditions in the documentation and/or other materials
    provided with the distribution.

 3. The names "OBE" and "Open Business Engine" must not be used to
 	endorse or promote products derived from this software without prior
 	written permission.  For written permission, please contact
 	me@anthonyeden.com.

 4. Products derived from this software may not be called "OBE" or
 	"Open Business Engine", nor may "OBE" or "Open Business Engine"
 	appear in their name, without prior written permission from
 	Anthony Eden (me@anthonyeden.com).

 In addition, I request (but do not require) that you include in the
 end-user documentation provided with the redistribution and/or in the
 software itself an acknowledgement equivalent to the following:
     "This product includes software developed by
      Anthony Eden (http://www.anthonyeden.com/)."

 THIS SOFTWARE IS PROVIdED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR ANY DIRECT,
 INDIRECT, INCIdENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.

 For more information on OBE, please see <http://www.openbusinessengine.org/>.

 */

package org.wfmc.audit;

/**
 * Section 8.7.6 of the WfMC interface 5 standard.
 * @author Antony Lodge
 */
public class SetAttributesTargetWorkflowResponse extends SourceWorkflow {
    static final long serialVersionUID = 7098100003535082231L;

    private String targetProcessDefinitionId;
    private String attributeName;
    private int attributeType;
    private int attributeLength;
    private String attributeValue;
    private int previousAttributeLength;
    private String previousAttributeValue;

    public SetAttributesTargetWorkflowResponse() {
    }

    /**
     *
     * @param cwadPrefix
     * @param messageId
     * @param extensionNumber
     * @param extensionType
     * @param sourceConversationId
     * @param targetConversationId
     * @param sourceActivityDefinitionBusinessName
     * @param targetProcessInstanceId
     * @param targetProcessDefinitionBusinessName
     * @param targetNodeId
     * @param targetUserId
     * @param targetRoleId
     * @param targetProcessDefinitionId
     * @param attributeName
     * @param attributeType
     * @param attributeLength
     * @param attributeValue
     * @param previousAttributeLength
     * @param previousAttributeValue
     */
    public SetAttributesTargetWorkflowResponse(CWADPrefix cwadPrefix,
        String messageId, short extensionNumber, String extensionType,
        String sourceConversationId, String targetConversationId,
        String sourceActivityDefinitionBusinessName,
        String targetProcessInstanceId,
        String targetProcessDefinitionBusinessName, String targetNodeId,
        String targetUserId, String targetRoleId,
        String targetProcessDefinitionId, String attributeName,
        int attributeType, int attributeLength, String attributeValue,
        int previousAttributeLength, String previousAttributeValue) {

        super(cwadPrefix, messageId, extensionNumber, extensionType,
            sourceConversationId, targetConversationId,
            sourceActivityDefinitionBusinessName, targetProcessInstanceId,
            targetProcessDefinitionBusinessName, targetNodeId, targetUserId,
            targetRoleId);

        this.targetProcessDefinitionId = targetProcessDefinitionId;
        this.attributeName = attributeName;
        this.attributeType = attributeType;
        this.attributeLength = attributeLength;
        this.attributeValue = attributeValue;
        this.previousAttributeLength = previousAttributeLength;
        this.previousAttributeValue = previousAttributeValue;
    }

    /**
     *
     * @return
     */
    public String getTargetProcessDefinitionId() {
        return targetProcessDefinitionId;
    }

    /**
     *
     * @param targetProcessDefinitionId
     */
    public void setTargetProcessDefinitionId(
        String targetProcessDefinitionId) {
        this.targetProcessDefinitionId = targetProcessDefinitionId;
    }

    /**
     *
     * @return Name of attribute requested
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     *
     * @param attributeName Name of attribute requested
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     *
     * @return Type of attribute requested
     */
    public int getAttributeType() {
        return attributeType;
    }

    /**
     *
     * @param attributeType Type of attribute requested
     */
    public void setAttributeType(int attributeType) {
        this.attributeType = attributeType;
    }

    /**
     *
     * @return
     */
    public int getAttributeLength() {
        return attributeLength;
    }

    /**
     *
     * @param attributeLength Length of requested attribute
     */
    public void setAttributeLength(int attributeLength) {
        this.attributeLength = attributeLength;
    }

    /**
     *
     * @return Length of requested attribute
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     *
     * @param attributeValue
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     *
     * @return
     */
    public int getPreviousAttributeLength() {
        return previousAttributeLength;
    }

    /**
     *
     * @param previousAttributeLength
     */
    public void setPreviousAttributeLength(int previousAttributeLength) {
        this.previousAttributeLength = previousAttributeLength;
    }

    /**
     *
     * @return
     */
    public String getPreviousAttributeValue() {
        return previousAttributeValue;
    }

    /**
     *
     * @param previousAttributeValue
     */
    public void setPreviousAttributeValue(String previousAttributeValue) {
        this.previousAttributeValue = previousAttributeValue;
    }

    public String toString() {
        return "SetAttributesTargetWorkflowResponse@" +
            System.identityHashCode(this) + "[" +
            " cwadPrefix=" + getCwadPrefix() +
            ", messageId=" + getMessageId() +
            ", sourceActivityDefinitionBusinessName='" +
            getSourceActivityDefinitionBusinessName() + "'" +
            ", targetProcessDefinitionId=" + targetProcessDefinitionId +
            ", targetProcessInstanceId=" + getTargetProcessInstanceId() +
            ", targetProcessDefinitionBusinessName='" +
            getTargetProcessDefinitionBusinessName() + "'" +
            ", targetNodeId=" + getTargetNodeId() +
            ", targetUserId=" + getTargetUserId() +
            ", targetRoleId=" + getTargetRoleId() +
            ", attributeName='" + attributeName + "'" +
            ", attributeType=" + attributeType +
            ", attributeLength=" + attributeLength +
            ", attributeValue='" + attributeValue + "'" +
            ", previousAttributeLength=" + previousAttributeLength +
            ", previousAttributeValue='" + previousAttributeValue + "'" +
            ", extensionNumber=" + getExtensionNumber() +
            ", extensionType='" + getExtensionType() + "'" +
            ", sourceConversationId='" + getSourceConversationId() + "'" +
            ", targetConversationId='" + getTargetConversationId() + "'" +
            "]";
    }
}