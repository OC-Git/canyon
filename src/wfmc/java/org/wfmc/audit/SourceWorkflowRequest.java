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
 *
 *
 * @author Antony Lodge
 */
public abstract class SourceWorkflowRequest extends SourceWorkflow {
    static final long serialVersionUID = 8704300546211443411L;

    private String targetState;
    private String targetProcessDefinitionId;

    public SourceWorkflowRequest() {
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
     */
    public SourceWorkflowRequest(CWADPrefix cwadPrefix, String messageId,
        short extensionNumber, String extensionType,
        String sourceConversationId, String targetConversationId,
        String sourceActivityDefinitionBusinessName,
        String targetProcessInstanceId,
        String targetProcessDefinitionBusinessName, String targetNodeId,
        String targetUserId, String targetRoleId) {

        super(cwadPrefix, messageId, extensionNumber, extensionType,
            sourceConversationId, targetConversationId,
            sourceActivityDefinitionBusinessName, targetProcessInstanceId,
            targetProcessDefinitionBusinessName, targetNodeId, targetUserId,
            targetRoleId);
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
     * @param targetState
     * @param targetProcessDefinitionId
     */
    public SourceWorkflowRequest(CWADPrefix cwadPrefix, String messageId,
        short extensionNumber, String extensionType,
        String sourceConversationId, String targetConversationId,
        String sourceActivityDefinitionBusinessName,
        String targetProcessInstanceId,
        String targetProcessDefinitionBusinessName, String targetNodeId,
        String targetUserId, String targetRoleId,
        String targetState, String targetProcessDefinitionId) {

        super(cwadPrefix, messageId, extensionNumber, extensionType,
            sourceConversationId, targetConversationId,
            sourceActivityDefinitionBusinessName, targetProcessInstanceId,
            targetProcessDefinitionBusinessName, targetNodeId, targetUserId,
            targetRoleId);

        this.targetState = targetState;
        this.targetProcessDefinitionId = targetProcessDefinitionId;
    }

    /**
     *
     * @return as supplied to the target Workflow Engine
     */
    public String getTargetProcessDefinitionId() {
        return targetProcessDefinitionId;
    }

    /**
     *
     * @param targetProcessDefinitionId  as supplied to the target Workflow
     *        Engine
     */
    public void setTargetProcessDefinitionId(
        String targetProcessDefinitionId) {

        this.targetProcessDefinitionId = targetProcessDefinitionId;
    }

    /**
     *
     * @return State of new process instance
     */
    public String getTargetState() {
        return targetState;
    }

    /**
     *
     * @param targetState State of new process instance
     */
    public void setTargetState(String targetState) {
        this.targetState = targetState;
    }

    public String toString() {
        return "SourceWorkflowRequest@" + System.identityHashCode(this) + "[" +
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
            ", targetState=" + targetState +
            ", extensionNumber=" + getExtensionNumber() +
            ", extensionType='" + getExtensionType() + "'" +
            ", sourceConversationId='" + getSourceConversationId() + "'" +
            ", targetConversationId='" + getTargetConversationId() + "'" +
            "]";
    }
}